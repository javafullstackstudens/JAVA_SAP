
package com.sap.engine.services.webservices.jaxr.impl.uddi_v2.types;


/**
 * Schema complex type representation (generated by SAP Schema to Java generator).
 * Represents schema complex type {urn:uddi-org:api_v2}businessInfo
 */

public  class BusinessInfo extends com.sap.engine.services.webservices.jaxrpc.encoding.GeneratedComplexType {


  public java.lang.String _d_originalUri() {
    return "urn:uddi-org:api_v2";
  }

  public java.lang.String _d_originalLocalName() {
    return "businessInfo";
  }

  private static com.sap.engine.services.webservices.jaxrpc.encoding.AttributeInfo[] ATTRIBUTEINFO;

  private synchronized static void initAttribs() {
    // Creating attribute fields
    if (ATTRIBUTEINFO != null) return;
    ATTRIBUTEINFO = new com.sap.engine.services.webservices.jaxrpc.encoding.AttributeInfo[1];
    ATTRIBUTEINFO[0] = new com.sap.engine.services.webservices.jaxrpc.encoding.AttributeInfo();
    // Attribute 0
    ATTRIBUTEINFO[0].fieldLocalName = "businessKey";
    ATTRIBUTEINFO[0].fieldUri = "";
    ATTRIBUTEINFO[0].fieldJavaName = "BusinessKey";
    ATTRIBUTEINFO[0].typeName = "businessKey";
    ATTRIBUTEINFO[0].typeUri = "urn:uddi-org:api_v2";
    ATTRIBUTEINFO[0].typeJavaName = "java.lang.String";
    ATTRIBUTEINFO[0].defaultValue = null;
    ATTRIBUTEINFO[0].required = true;
    ATTRIBUTEINFO[0].setterMethod = "setBusinessKey";
    ATTRIBUTEINFO[0].getterMethod = "getBusinessKey";
    ATTRIBUTEINFO[0].checkMethod = "hasBusinessKey";
  }

  // Field information
  private static com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo[] FIELDINFO;

  private synchronized static void initFields() {
    // Creating fields
    if (FIELDINFO != null) return;
    FIELDINFO = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo[3];
    FIELDINFO[0] = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo();
    FIELDINFO[1] = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo();
    FIELDINFO[2] = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo();
    // Field 0
    FIELDINFO[0].defaultValue = null;
    FIELDINFO[0].fieldJavaName = "Name";
    FIELDINFO[0].fieldLocalName = "name";
    FIELDINFO[0].fieldModel = 1;
    FIELDINFO[0].fieldUri = "urn:uddi-org:api_v2";
    FIELDINFO[0].isSoapArray = false;
    FIELDINFO[0].maxOccurs = 2147483647;
    FIELDINFO[0].minOccurs = 1;
    FIELDINFO[0].nillable = false;
    FIELDINFO[0].soapArrayDimensions = 0;
    FIELDINFO[0].soapArrayItemTypeJavaName = null;
    FIELDINFO[0].soapArrayItemTypeLocalName = null;
    FIELDINFO[0].soapArrayItemTypeUri = null;
    FIELDINFO[0].typeJavaName = "com.sap.engine.services.webservices.jaxr.impl.uddi_v2.types.Name";
    FIELDINFO[0].typeLocalName = "name";
    FIELDINFO[0].typeUri = "urn:uddi-org:api_v2";
    FIELDINFO[0].getterMethod = "getName";
    FIELDINFO[0].setterMethod = "setName";
    FIELDINFO[0].checkMethod = "hasName";
    // Field 1
    FIELDINFO[1].defaultValue = null;
    FIELDINFO[1].fieldJavaName = "Description";
    FIELDINFO[1].fieldLocalName = "description";
    FIELDINFO[1].fieldModel = 1;
    FIELDINFO[1].fieldUri = "urn:uddi-org:api_v2";
    FIELDINFO[1].isSoapArray = false;
    FIELDINFO[1].maxOccurs = 2147483647;
    FIELDINFO[1].minOccurs = 0;
    FIELDINFO[1].nillable = false;
    FIELDINFO[1].soapArrayDimensions = 0;
    FIELDINFO[1].soapArrayItemTypeJavaName = null;
    FIELDINFO[1].soapArrayItemTypeLocalName = null;
    FIELDINFO[1].soapArrayItemTypeUri = null;
    FIELDINFO[1].typeJavaName = "com.sap.engine.services.webservices.jaxr.impl.uddi_v2.types.Description";
    FIELDINFO[1].typeLocalName = "description";
    FIELDINFO[1].typeUri = "urn:uddi-org:api_v2";
    FIELDINFO[1].getterMethod = "getDescription";
    FIELDINFO[1].setterMethod = "setDescription";
    FIELDINFO[1].checkMethod = "hasDescription";
    // Field 2
    FIELDINFO[2].defaultValue = null;
    FIELDINFO[2].fieldJavaName = "ServiceInfos";
    FIELDINFO[2].fieldLocalName = "serviceInfos";
    FIELDINFO[2].fieldModel = 1;
    FIELDINFO[2].fieldUri = "urn:uddi-org:api_v2";
    FIELDINFO[2].isSoapArray = false;
    FIELDINFO[2].maxOccurs = 1;
    FIELDINFO[2].minOccurs = 1;
    FIELDINFO[2].nillable = false;
    FIELDINFO[2].soapArrayDimensions = 0;
    FIELDINFO[2].soapArrayItemTypeJavaName = null;
    FIELDINFO[2].soapArrayItemTypeLocalName = null;
    FIELDINFO[2].soapArrayItemTypeUri = null;
    FIELDINFO[2].typeJavaName = "com.sap.engine.services.webservices.jaxr.impl.uddi_v2.types.ServiceInfo[]";
    FIELDINFO[2].typeLocalName = "serviceInfos";
    FIELDINFO[2].typeUri = "urn:uddi-org:api_v2";
    FIELDINFO[2].getterMethod = "getServiceInfos";
    FIELDINFO[2].setterMethod = "setServiceInfos";
    FIELDINFO[2].checkMethod = "hasServiceInfos";
  }


  // Returns model Group Type
  public int _getModelType() {
    return 3;
  }

  // Attribute field
  private java.lang.String _a_BusinessKey;
  private boolean _a_hasBusinessKey;
  // set method
  public void setBusinessKey(java.lang.String _BusinessKey) {
    this._a_BusinessKey = _BusinessKey;
    this._a_hasBusinessKey = true;
  }
  // clear method
  public void clearBusinessKey(java.lang.String _BusinessKey) {
    this._a_hasBusinessKey = false;
  }
  // get method
  public java.lang.String getBusinessKey() {
    return _a_BusinessKey;
  }
  // has method
  public boolean hasBusinessKey() {
    return _a_hasBusinessKey;
  }

  // Element field
  private com.sap.engine.services.webservices.jaxr.impl.uddi_v2.types.Name[] _f_Name = new com.sap.engine.services.webservices.jaxr.impl.uddi_v2.types.Name[0];
  public void setName(com.sap.engine.services.webservices.jaxr.impl.uddi_v2.types.Name[] _Name) {
    this._f_Name = _Name;
  }
  public com.sap.engine.services.webservices.jaxr.impl.uddi_v2.types.Name[] getName() {
    return _f_Name;
  }

  // Element field
  private com.sap.engine.services.webservices.jaxr.impl.uddi_v2.types.Description[] _f_Description = new com.sap.engine.services.webservices.jaxr.impl.uddi_v2.types.Description[0];
  public void setDescription(com.sap.engine.services.webservices.jaxr.impl.uddi_v2.types.Description[] _Description) {
    this._f_Description = _Description;
  }
  public com.sap.engine.services.webservices.jaxr.impl.uddi_v2.types.Description[] getDescription() {
    return _f_Description;
  }

  // Element field
  private com.sap.engine.services.webservices.jaxr.impl.uddi_v2.types.ServiceInfo[] _f_ServiceInfos;

  public void setServiceInfos(com.sap.engine.services.webservices.jaxr.impl.uddi_v2.types.ServiceInfo[] _ServiceInfos) {
    this._f_ServiceInfos = _ServiceInfos;
  }

  public com.sap.engine.services.webservices.jaxr.impl.uddi_v2.types.ServiceInfo[] getServiceInfos() {
    return this._f_ServiceInfos;
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
