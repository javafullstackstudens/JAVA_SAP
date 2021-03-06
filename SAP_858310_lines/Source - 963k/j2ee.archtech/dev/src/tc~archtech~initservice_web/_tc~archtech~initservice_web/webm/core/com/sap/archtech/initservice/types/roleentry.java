
package com.sap.archtech.initservice.types;


/**
 * Schema complex type representation (generated by SAP Schema to Java generator).
 * Represents schema complex type {}RoleEntry
 */

public  class RoleEntry extends com.sap.engine.services.webservices.jaxrpc.encoding.GeneratedComplexType {


  public java.lang.String _d_originalUri() {
    return "";
  }

  public java.lang.String _d_originalLocalName() {
    return "RoleEntry";
  }

  private static com.sap.engine.services.webservices.jaxrpc.encoding.AttributeInfo[] ATTRIBUTEINFO;

  private synchronized static void initAttribs() {
    // Creating attribute fields
    if (ATTRIBUTEINFO != null) return;
    ATTRIBUTEINFO = new com.sap.engine.services.webservices.jaxrpc.encoding.AttributeInfo[1];
    ATTRIBUTEINFO[0] = new com.sap.engine.services.webservices.jaxrpc.encoding.AttributeInfo();
    // Attribute 0
    ATTRIBUTEINFO[0].fieldLocalName = "NAME";
    ATTRIBUTEINFO[0].fieldUri = "";
    ATTRIBUTEINFO[0].fieldJavaName = "NAME";
    ATTRIBUTEINFO[0].typeName = "string";
    ATTRIBUTEINFO[0].typeUri = "http://www.w3.org/2001/XMLSchema";
    ATTRIBUTEINFO[0].typeJavaName = "java.lang.String";
    ATTRIBUTEINFO[0].defaultValue = null;
    ATTRIBUTEINFO[0].required = false;
    ATTRIBUTEINFO[0].setterMethod = "setNAME";
    ATTRIBUTEINFO[0].getterMethod = "getNAME";
    ATTRIBUTEINFO[0].checkMethod = "hasNAME";
  }

  // Field information
  private static com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo[] FIELDINFO;

  private synchronized static void initFields() {
    // Creating fields
    if (FIELDINFO != null) return;
    FIELDINFO = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo[2];
    FIELDINFO[0] = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo();
    FIELDINFO[1] = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo();
    // Field 0
    FIELDINFO[0].defaultValue = null;
    FIELDINFO[0].fieldJavaName = "DESCRIPTION";
    FIELDINFO[0].fieldLocalName = "DESCRIPTION";
    FIELDINFO[0].fieldModel = 1;
    FIELDINFO[0].fieldUri = "";
    FIELDINFO[0].isSoapArray = false;
    FIELDINFO[0].maxOccurs = 1;
    FIELDINFO[0].minOccurs = 1;
    FIELDINFO[0].nillable = false;
    FIELDINFO[0].soapArrayDimensions = 0;
    FIELDINFO[0].soapArrayItemTypeJavaName = null;
    FIELDINFO[0].soapArrayItemTypeLocalName = null;
    FIELDINFO[0].soapArrayItemTypeUri = null;
    FIELDINFO[0].typeJavaName = "com.sap.archtech.initservice.types.DescriptionEntry";
    FIELDINFO[0].typeLocalName = "DescriptionEntry";
    FIELDINFO[0].typeUri = "";
    FIELDINFO[0].getterMethod = "getDESCRIPTION";
    FIELDINFO[0].setterMethod = "setDESCRIPTION";
    FIELDINFO[0].checkMethod = "hasDESCRIPTION";
    // Field 1
    FIELDINFO[1].defaultValue = null;
    FIELDINFO[1].fieldJavaName = "ASSIGNEDACTION";
    FIELDINFO[1].fieldLocalName = "ASSIGNEDACTION";
    FIELDINFO[1].fieldModel = 1;
    FIELDINFO[1].fieldUri = "";
    FIELDINFO[1].isSoapArray = false;
    FIELDINFO[1].maxOccurs = 2147483647;
    FIELDINFO[1].minOccurs = 1;
    FIELDINFO[1].nillable = false;
    FIELDINFO[1].soapArrayDimensions = 0;
    FIELDINFO[1].soapArrayItemTypeJavaName = null;
    FIELDINFO[1].soapArrayItemTypeLocalName = null;
    FIELDINFO[1].soapArrayItemTypeUri = null;
    FIELDINFO[1].typeJavaName = "com.sap.archtech.initservice.types.AssignedActionEntry";
    FIELDINFO[1].typeLocalName = "AssignedActionEntry";
    FIELDINFO[1].typeUri = "";
    FIELDINFO[1].getterMethod = "getASSIGNEDACTION";
    FIELDINFO[1].setterMethod = "setASSIGNEDACTION";
    FIELDINFO[1].checkMethod = "hasASSIGNEDACTION";
  }


  // Returns model Group Type
  public int _getModelType() {
    return 3;
  }

  // Attribute field
  private java.lang.String _a_NAME;
  private boolean _a_hasNAME;
  // set method
  public void setNAME(java.lang.String _NAME) {
    this._a_NAME = _NAME;
    this._a_hasNAME = true;
  }
  // clear method
  public void clearNAME(java.lang.String _NAME) {
    this._a_hasNAME = false;
  }
  // get method
  public java.lang.String getNAME() {
    return _a_NAME;
  }
  // has method
  public boolean hasNAME() {
    return _a_hasNAME;
  }

  // Element field
  private com.sap.archtech.initservice.types.DescriptionEntry _f_DESCRIPTION;

  public void setDESCRIPTION(com.sap.archtech.initservice.types.DescriptionEntry _DESCRIPTION) {
    this._f_DESCRIPTION = _DESCRIPTION;
  }

  public com.sap.archtech.initservice.types.DescriptionEntry getDESCRIPTION() {
    return this._f_DESCRIPTION;
  }

  // Element field
  private com.sap.archtech.initservice.types.AssignedActionEntry[] _f_ASSIGNEDACTION = new com.sap.archtech.initservice.types.AssignedActionEntry[0];
  public void setASSIGNEDACTION(com.sap.archtech.initservice.types.AssignedActionEntry[] _ASSIGNEDACTION) {
    this._f_ASSIGNEDACTION = _ASSIGNEDACTION;
  }
  public com.sap.archtech.initservice.types.AssignedActionEntry[] getASSIGNEDACTION() {
    return _f_ASSIGNEDACTION;
  }

  private static boolean init = false;
  public synchronized com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo[] _getFields() {
    if (init == false) {
      com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo[] parent = super._getFields();
      FIELDINFO =  _insertFieldInfo(parent,FIELDINFO);
      init = true;
    }
    return FIELDINFO;
  }

  public int _getNumberOfFields() {
    return (FIELDINFO.length+super._getNumberOfFields());
  }

  public com.sap.engine.services.webservices.jaxrpc.encoding.AttributeInfo[] _getAttributes() {
    return ATTRIBUTEINFO;
  }

  public int _getNumberOfAttributes() {
    return ATTRIBUTEINFO.length;
  }

  static {
    initFields();
    initAttribs();
  }
}
