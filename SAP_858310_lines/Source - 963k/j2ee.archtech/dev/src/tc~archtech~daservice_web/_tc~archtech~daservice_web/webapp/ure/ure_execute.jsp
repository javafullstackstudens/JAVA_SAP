<%@ page errorPage="ure_error.jsp" import="com.sap.archtech.daservice.admin.*,java.net.*" %>

<%
String archivepath = request.getParameter("archivepath");
String user = (String) session.getAttribute("SessionUser");
String authorization = (String) session.getAttribute("AuthRequHead");
if (authorization == null)
	authorization = "";  
URL url = new URL(request.getScheme() + "://localhost:" + request.getServerPort() + AdminMaster.DASPATH);
UnpackResources ure = new UnpackResources(url, authorization, archivepath, user);
String responsecode = ure.execute();
%>

<jsp:forward page="ure_result.jsp">
  <jsp:param name="responsecode" value="<%=responsecode%>" />
  <jsp:param name="archivepath" value="<%=archivepath%>" />  
</jsp:forward>




