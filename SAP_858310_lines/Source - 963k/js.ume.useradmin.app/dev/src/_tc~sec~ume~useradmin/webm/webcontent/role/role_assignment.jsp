<%@ taglib uri="UM" prefix="UM" %>
<%@ page import="com.sap.security.core.role.*" %>
<%@ page import="com.sap.security.core.role.imp.*" %>
<%@ page import="com.sap.security.core.*" %>
<%@ page import="com.sap.security.core.admin.util" %>
<%@ page import="com.sap.security.core.admin.role.*" %>
<%@ page import="com.sap.security.api.*"%>
<%@ page import="java.util.Iterator" %>
<%@ include file="/proxy.txt" %>

<jsp:useBean id="info" class="com.sap.security.core.util.InfoBean" scope='request'/>
<jsp:useBean id="error" class="com.sap.security.core.util.ErrorBean" scope="request"/>

<%com.sap.security.core.admin.role.RoleAdminMessagesBean roleAdminMessages = (com.sap.security.core.admin.role.RoleAdminMessagesBean) proxy.getSessionAttribute("roleAdminMessages");%>
<%com.sap.security.core.admin.role.RoleAdminLocaleBean roleAdminLocale = (com.sap.security.core.admin.role.RoleAdminLocaleBean) proxy.getSessionAttribute("roleAdminLocale");%>

<% 
int length = 0;
int colspan = 7;
int totalItems = 0;
int currentPage = 0;
int totalPages = 0;
Integer[] itemPerPageOptions = null;
int currentItemPerPage = 0;
IPrincipal[] assignedMembers = null;
ListBean   list = (ListBean) proxy.getRequestAttribute(ListBean.beanId);
if (null != list)
{
	java.util.Vector temp = list.getObjsOnCurrentPage();
	if((null != temp) && (!temp.isEmpty()))
	{
		assignedMembers = HelperClass.getPrincipals(temp);
		length = temp.size();
		totalItems = list.getTotalItems();
		currentPage = list.getCurrentPage();
		totalPages = list.getTotalPages();
		itemPerPageOptions = list.getItemPerPageOptions();
		currentItemPerPage = list.getCurrentItemPerPage();
   	}
}

String rolenamesReport = (String) HelperClass.getAttr(proxy,"rolenamesReport");
String roleIDs = (String) HelperClass.getAttr(proxy,"roleIDs");
String roleDescription = (String) HelperClass.getAttr(proxy,"roleDescription");
String principal = (String)HelperClass.getAttr(proxy,"principal");
principal = principal.toLowerCase();

// Default: principal is user
if ("".equals(principal)) principal = "user";
boolean useUserAsPrincipal = true;
String assign_members = roleAdminLocale.get("ASSIGN_USERS");
String assign_members_group_add = roleAdminLocale.get("ASSIGN_USERS_ADD");
String assigned_members = roleAdminLocale.get("ASSIGNED_USERS_ROLE"); 
String add_users = roleAdminLocale.get("ADD_USERS");
String search_members = roleAdminLocale.get("SEARCH_ASSIGNED_USERS");

if ("group".equals(principal))
{
    useUserAsPrincipal = false;
	assign_members = roleAdminLocale.get("ASSIGN_GROUPS");
	assign_members_group_add = roleAdminLocale.get("ASSIGN_ROLES_GROUP_ADD");
	assigned_members = roleAdminLocale.get("ASSIGNED_GROUPS_ROLE"); 
	add_users = roleAdminLocale.get("ADD_GROUPS"); 
	search_members = roleAdminLocale.get("SEARCH_ASSIGNED_GROUPS");
}

if ("MultiRole".equals(roleDescription))
{ 
	if (useUserAsPrincipal)
		roleDescription = roleAdminLocale.get("MULTI_USER_ROLE_ASSIGNMENT");
	else
		roleDescription = roleAdminLocale.get("MULTI_GROUP_ROLE_ASSIGNMENT");
}

String memberSF = (String)HelperClass.getAttr(proxy, "memberSF");
%>

<%if (!inPortal) {%> <html>
<head>
<title><%=roleAdminLocale.get("ROLE_MANAGEMENT")%></title>
<script language="JavaScript" src="<%=webpath%>js/util-role.js"></script>
<script language="JavaScript" src="<%=webpath%>js/basic.js"></script>
<script language="JavaScript" src="<%=webpath%>js/roleList.js"></SCRIPT>
<script language="JavaScript">
function setCmd(value)
{
  document.frmRoleInfo.cmd.value = value;
}

function onRemoveReq(value,message1,message2)
{
	document.frmRoleInfo.cmd.value = value;
	var selected = setReq(value);
	if(selected == 0)
	{
		alert(message1);
		return false;
	}
	if(confirm(message2) == true)
	{
		return true;
	}
	else
	{
		return false;
	}
}

function setReq(value)
{
	document.frmRoleInfo.cmd.value = value;

	var msg = "";
	var selected = 0;
	var checkboxGrp = document.frmRoleInfo.userIDs;
	var valChecked;
	document.frmRoleInfo.uncheckedItems.value = msg;

	if(checkboxGrp == null)
	{
		return 0;	
	}
	if(checkboxGrp.length == null)
	{
		if (checkboxGrp.checked == true)
		{
			valChecked = 1;
			selected = 1;
		}
		else
		{
			valChecked = 0;
			msg = msg + checkboxGrp.value + ",";
		}
	}
	else
	{
		for (var i=0; i<checkboxGrp.length; i++)
		{
			if (checkboxGrp[i].checked == true)
			{
				valChecked = 1;
				selected = 1;
			}
			else
			{
				valChecked = 0;
				msg = msg + checkboxGrp[i].value + ",";
			}
		}
	}
	// you can put the content of msg into a hidden text field
	document.frmRoleInfo.uncheckedItems.value = msg;
	return selected;
}

function checkbox_select_all()
{
	var checkboxGrp = document.frmRoleInfo.userIDs;
	if(checkboxGrp.length == null)
	{
			checkboxGrp.checked = true;

	}
	else
	{
		for (var i=0; i<checkboxGrp.length; i++)
		{
			checkboxGrp[i].checked = true;
		}
	}
}

function checkbox_deselect_all()
{
	var checkboxGrp = document.frmRoleInfo.userIDs;
	if(checkboxGrp.length == null)
	{
			checkboxGrp.checked = false;
	}
	else
	{
		for (var i=0; i<checkboxGrp.length; i++)
		{
			checkboxGrp[i].checked = false;
		}
	}
}

function toggleSelection()
{
	if (document.frmRoleInfo.userIDs == null) 
	{
		return false;
	}
	if(document.frmRoleInfo.toggle.value == "")
	{

		checkbox_select_all();
		document.frmRoleInfo.toggle.value = "selected";
	}
	else
	{
		checkbox_deselect_all();
		document.frmRoleInfo.toggle.value = "";
	}
	return false;
}

function doUserSearch(command) 
{
        var frm = document.forms["frmRoleInfo"];
        frm.action = "<%=userAdminAlias%>";
        inputTag1 = document.createElement("input");
        inputTag1.setAttribute("name","<%=UserAdminLogic.searchUsersAction%>");
        inputTag1.setAttribute("type", "hidden");
        inputTag1.setAttribute("value", "");
        frm.appendChild(inputTag1);
        inputTag2 = document.createElement("input");
        inputTag2.setAttribute("name","<%=UserAdminLogic.servletName%>");
        inputTag2.setAttribute("type", "hidden");
        inputTag2.setAttribute("value", "<%=RoleAdminServlet.alias%>");
        frm.appendChild(inputTag2);
        
    	frm.cmd.value = command;
        frm.submit();
}

function doMemberSearch()
{
	if ((document.frmRoleInfo.cmd.value == null) || (document.frmRoleInfo.cmd.value == ""))
		document.frmRoleInfo.cmd.value = 'role-assignment';
}
</script>
</head> <%}%>
<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<form name="frmRoleInfo" onSubmit="doMemberSearch()" method="post">
	<%@ include file="/contextspecific_includes_top.txt" %>
   	<!-- start Section Header -->
   	<table cellpadding="0" cellspacing="0" border="0" width="99%" align="center">
		<tr class="SEC_TB_TD"><td class="SEC_TB_TD"><%=assign_members%></td></tr>
   	</table>
   	<!-- End Section Header -->
   	<table cellpadding="0" cellspacing="0" border="0"><tr><td><IMG height="5" src="<%=webpath%>layout/sp.gif" width="1" border="0" alt=""></td></tr></table>

	<!-- Start Section Description -->
	<table align="center" cellpadding="0" cellspacing="0" width="99%" border="0">
	    <tr><td width="100%" class="TBLO_XXS_L"><%=assign_members_group_add%></td></tr>
	</table>
	<table cellpadding="0" cellspacing="0" border="0"><tr><td><IMG height="8" src="<%=webpath%>layout/sp.gif" width="1" border="0" alt=""></td></tr></table>

   	<!-- Start Info Msg-->
   	<% if ( info.isInfo() ) { %>
   		<table align="center" cellpadding="0" cellspacing="0" width="99%" border="0">
   		<tr><td width="100%" class="TX_CFM_XSB">
   		    <img src="<%=webpath%>layout/ico12_msg_success.gif" width="12" height="12" border="0" />&nbsp;<UM:encode><%=roleAdminMessages.print(info.getMessage())%></UM:encode>
   		</td></tr>
   		</table>
   	<% } %>
   	<!-- End Info Msg -->
   	<!-- Start Error Msg-->
   	<% if ( error.isError() ) { %>
   		<table align="center" cellpadding="0" cellspacing="0" width="99%" border="0">
   		  <tr><td width="100%" class="TX_ERROR_XSB">
   		    <img src="<%=webpath%>layout/ico12_msg_error.gif" width="12" height="12" border="0" />&nbsp;<UM:encode><%=roleAdminMessages.print(error.getMessage())%></UM:encode>
   		  </td></tr>
   		</table>
   	<% } %>
   	<!-- End Error Msg -->

	<table cellpadding="2" cellspacing="0" border="0" width="100%" id="h0">
		<tr><td colspan="2"><IMG height="2" src="<%=webpath%>layout/sp.gif" width="1" border="0" alt=""></td></tr>
     	<tr>
			<td class="TBLO_XXS_R" width="25%"><%=roleAdminLocale.get("ROLE_NAME")%></td>
			<td class="TX_XXS"><UM:encode><%=rolenamesReport%></UM:encode></td>
		</tr>
		<tr>
			<td class="TBLO_XXS_R" width="25%" valign="top"><%=roleAdminLocale.get("DESCRIPTION")%>&nbsp;</td>
			<td class="TX_XXS" ><UM:encode><%=roleDescription%></UM:encode></td>
		</tr>
 		<tr><td colspan="2"><IMG height="12" src="<%=webpath%>layout/sp.gif" width="1" border="0" alt=""></td></tr>
 	</table>

    <!--  Member Search ..... -->
	<table cellpadding="2" cellspacing="0" border="0" width="100%" id="h0">
 	  	<tr>
   			<td class="TBLO_XXS_R" width="25%" nowrap><LABEL FOR="Search"><%=search_members%></LABEL></td>
   			<td class="TX_XXS" nowrap><input name="memberSF" type="text" size="20" style="width: 2in" value="<UM:encode><%=memberSF%></UM:encode>">&nbsp;
 				<input type="image" src="<%=webpath%>layout/search.gif" width="24" height="20" border="0" alt="<%=userAdminLocale.get("SEARCH")%>"
 				   	onClick="doMemberSearch()">&nbsp;&nbsp;&nbsp;&nbsp;
   			</td>
   		</tr>
 		<tr><td colspan="2"><IMG height="12" src="<%=webpath%>layout/sp.gif" width="1" border="0" alt=""></td></tr>
	</table>

	<table cellpadding="0" cellspacing="0" border="0" width="100%">
		<tr>
			<td class="TBLO_XS_L"><%=assigned_members%>&nbsp;</td>
			<td width="40%" align="right">
				<input type="image" src="<%=webpath%>layout/add.gif" width="24" height="20" border="0" 
					alt="<%=add_users%>"
			 		title="<%=add_users%>" 
				<% if( useUserAsPrincipal == true) { %>  			  
			 		onClick="doUserSearch('role-assignment-add-users')">&nbsp;&nbsp;&nbsp;&nbsp;
		        <% } else { %>   		          
			 		onClick="setCmd('role-assignment-search-groups')">&nbsp;&nbsp;&nbsp;&nbsp;
				<% } %>
		</tr>
	</table>

	<!-- Start Result Table-->
	<table cellpadding="0" cellspacing="0" border="0" CLASS="TBDATA_BDR_BG" width="98%">
	    <tr><td>
			<table cellpadding="1" cellspacing="1" border="0" width="100%">
				<% if ( length > 0 ) { %>
					<%@ include file="/role/role_pagenavigation.jsp"%>
				<% } %> 
				<tr>
			   		<td class="TBDATA_HEAD" nowrap><input type = image src="<%=webpath%>layout/mon_check.gif" width="13" height="13" border="0" alt="<%=roleAdminLocale.get("SELECTING")%>"
						onClick="return toggleSelection()"></td>
			   		<td scope="col" class="TBDATA_HEAD" nowrap width="1%"><img width="17" height="1" src="<%=webpath%>layout/sp.gif" alt="<%=roleAdminLocale.get("ACCOUNT_STATUS")%>"></td>
			   		<td scope="col" class="TBDATA_HEAD" nowrap><%=roleAdminLocale.get("NAME")%></td>
			   		<td scope="col" class="TBDATA_HEAD" nowrap><%=roleAdminLocale.get("DESCRIPTION_TABLE_HEADER")%></td>
				</tr>
		   	<%
			for (int j=0; j < length; j++)
		    {
				String displayName = assignedMembers [j].getDisplayName();
				String uid = assignedMembers [j].getUniqueID();
				String description = HelperClass.getPrincipalInfo(assignedMembers [j]);
				if (description == null) description = "";
				boolean isLocked = false;
				if (useUserAsPrincipal) 
				{
					IUserAccount[] uas = ((IUser) assignedMembers[j]).getUserAccounts();
					if (uas.length > 0)
						isLocked = uas[0].isLocked();
				} %>
				<tr class="<%= (j % 2 == 0) ? "TBDATA_CNT_ODD_BG":"TBDATA_CNT_EVEN_BG"%>">
			    	<td class="TBDATA_XXS_C" width="1%" nowrap><input type="checkbox" name=userIDs class="noborder" value="<%=util.URLEncoder(uid)%>"></td>
	        		<td class="TBDATA_XXS_C" nowrap>
	        		<% if ( !isLocked ) { %>
			    		<img src="<%=webpath%>layout/bulletgreen.gif" width="16" height="15" border="0" alt="<%=roleAdminLocale.get("ACTIVE")%>"></td>
        			<% } else { %>
          		    	<img src="<%=webpath%>layout/bulletwhite.gif" width="16" height="15" border="0" alt="<%=roleAdminLocale.get("DEACTIVATED")%>">
     				<% } %>
			    	<td scope="row" class="TBDATA_XS_L"><UM:encode><%=displayName%></UM:encode></td>
			    	<td class="TBDATA_XXS_L" nowrap><UM:encode><%=description%></UM:encode></td>
				</tr>
			<% } %>
		    	<tr class="TBDATA_CNT_ODD_BG">
					<td class="TBDATA_XXS_L" colspan="7"><input type="submit" name="Delete" value="<%=roleAdminLocale.get("REMOVE")%>" class="BTN_S"
					<% if ( useUserAsPrincipal ) { %>  			  
						onClick="return onRemoveReq('role-assignment-remove-users','<%=util.convertDbQuotationToSingle(roleAdminLocale.get("REMOVE_USER_ALERT"))%>','<%=util.convertDbQuotationToSingle(roleAdminLocale.get("REMOVE_USER_ROLE_ALERT"))%>')">
		        	<% } else { %>   		          
						onClick="return onRemoveReq('role-assignment-remove-users','<%=util.convertDbQuotationToSingle(roleAdminLocale.get("REMOVE_GROUP_ALERT"))%>','<%=util.convertDbQuotationToSingle(roleAdminLocale.get("REMOVE_GROUP_ROLE_ALERT"))%>')">
					<% } %>
			   		</td>
				</tr>
		    	<% if ( length > 0 ) { %>
					<%@ include file="/role/role_pagenavigation.jsp"%>
		    	<% } %> 
			</table>
		</td></tr>
	</table>
	<table cellpadding="0" cellspacing="0" border="0"><tr><td><IMG height="30" src="<%=webpath%>layout/sp.gif" width="1" border="0" alt=""></td></tr></table>

	<!-- Start Page Action Buttons -->
	<table width="98%" border="0" cellpadding="0" cellspacing="0">
		<tr>
			<td width="100%" align="left" class="TBLO_XXS_L" nowrap>
				<input class="BTN_LN" type="submit" name="cancel" value="&nbsp;<%=roleAdminLocale.get("DONE")%>&nbsp;"
					onClick="setReq('abort')">&nbsp;
			</td>
		</tr>
   	</table>

	<input type="hidden" name="rolenamesReport" value="<UM:encode><%=rolenamesReport%></UM:encode>">
	<input type="hidden" name="roleDescription" value="<UM:encode><%=roleDescription%></UM:encode>">
	<input type="hidden" name="roleIDs" value="<%=util.URLEncoder(roleIDs)%>">
	<input type="hidden" name="cmd" value="">
	<input type="hidden" name="toggle" value="">
	<input type="hidden" name="uncheckedItems">
	<input type="hidden" name="principal" value = "<UM:encode><%=principal%></UM:encode>">
</form>
<%@ include file="/contextspecific_includes_bottom.txt" %>
