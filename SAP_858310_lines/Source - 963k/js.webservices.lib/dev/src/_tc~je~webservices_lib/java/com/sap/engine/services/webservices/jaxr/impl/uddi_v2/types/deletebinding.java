﻿
package com.sap.engine.services.webservices.jaxr.impl.uddi_v2.types;


/**
 * Schema complex type representation (generated by SAP Schema to Java generator).
 * Represents schema complex type {urn:uddi-org:api_v2}delete_binding
 */

public  class DeleteBinding extends com.sap.engine.services.webservices.jaxrpc.encoding.GeneratedComplexType {


  public java.lang.String _d_originalUri() {
    return "urn:uddi-org:api_v2";
  }

  public java.lang.String _d_originalLocalName() {
    return "delete_binding";
  }

  private static com.sap.engine.services.webservices.jaxrpc.encoding.AttributeInfo[] ATTRIBUTEINFO;

  private synchronized static void initAttribs() {
    // Creating attribute fields
    if (ATTRIBUTEINFO != null) return;
    ATTRIBUTEINFO = new com.sap.engine.services.webservices.jaxrpc.encoding.AttributeInfo[1];
    ATTRIBUTEINFO[0] = new com.sap.engine.services.webservices.jaxrpc.encoding.AttributeInfo();
    // Attribute 0
    ATTRIBUTEINFO[0].fieldLocalName = "generic";
    ATTRIBUTEINFO[0].fieldUri = "";
    ATTRIBUTEINFO[0].fieldJavaName = "Generic";
    ATTRIBUTEINFO[0].typeName = "string";
    ATTRIBUTEINFO[0].typeUri = "http://www.w3.org/2001/XMLSchema";
    ATTRIBUTEINFO[0].typeJavaName = "java.lang.String";
    ATTRIBUTEINFO[0].defaultValue = null;
    ATTRIBUTEINFO[0].required = true;
    ATTRIBUTEINFO[0].setterMethod = "setGeneric";
    ATTRIBUTEINFO[0].getterMethod = "getGeneric";
    ATTRIBUTEINFO[0].checkMethod = "hasGeneric";
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
    FIELDINFO[0].fieldJavaName = "AuthInfo";
    FIELDINFO[0].fieldLocalName = "authInfo";
    FIELDINFO[0].fieldModel = 1;
    FIELDINFO[0].fieldUri = "urn:uddi-org:api_v2";
    FIELDINFO[0].isSoapArray = false;
    FIELDINFO[0].maxOccurs = 1;
    FIELDINFO[0].minOccurs = 1;
    FIELDINFO[0].nillable = false;
    FIELDINFO[0].soapArrayDimensions = 0;
    FIELDINFO[0].soapArrayItemTypeJavaName = null;
    FIELDINFO[0].soapArrayItemTypeLocalName = null;
    FIELDINFO[0].soapArrayItemTypeUri = null;
    FIELDINFO[0].typeJavaName = "java.lang.String";
    FIELDINFO[0].typeLocalName = "string";
    FIELDINFO[0].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[0].getterMethod = "getAuthInfo";
    FIELDINFO[0].setterMethod = "setAuthInfo";
    FIELDINFO[0].checkMethod = "hasAuthInfo";
    // Field 1
    FIELDINFO[1].defaultValue = null;
    FIELDINFO[1].fieldJavaName = "BindingKey";
    FIELDINFO[1].fieldLocalName = "bindingKey";
    FIELDINFO[1].fieldModel = 1;
    FIELDINFO[1].fieldUri = "urn:uddi-org:api_v2";
    FIELDINFO[1].isSoapArray = false;
    FIELDINFO[1].maxOccurs = 2147483647;
    FIELDINFO[1].minOccurs = 1;
    FIELDINFO[1].nillable = false;
    FIELDINFO[1].soapArrayDimensions = 0;
    FIELDINFO[1].soapArrayItemTypeJavaName = null;
    FIELDINFO[1].soapArrayItemTypeLocalName = null;
    FIELDINFO[1].soapArrayItemTypeUri = null;
    FIELDINFO[1].typeJavaName = "java.lang.String";
    FIELDINFO[1].typeLocalName = "bindingKey";
    FIELDINFO[1].typeUri = "urn:uddi-org:api_v2";
    FIELDINFO[1].getterMethod = "getBindingKey";
    FIELDINFO[1].setterMethod = "setBindingKey";
    FIELDINFO[1].checkMethod = "hasBindingKey";
  }


  // Returns model Group Type
  public int _getModelType() {
    return 3;
  }

  // Attribute field
  private java.lang.String _a_Generic;
  private boolean _a_hasGeneric;
  // set method
  public void setGeneric(java.lang.String _Generic) {
    this._a_Generic = _Generic;
    this._a_hasGeneric = true;
  }
  // clear method
  public void clearGeneric(java.lang.String _Generic) {
    this._a_hasGeneric = false;
  }
  // get method
  public java.lang.String getGeneric() {
    return _a_Generic;
  }
  // has method
  public boolean hasGeneric() {
    return _a_hasGeneric;
  }

  // Element field
  private java.lang.String _f_AuthInfo;

  public void setAuthInfo(java.lang.String _AuthInfo) {
    this._f_AuthInfo = _AuthInfo;
  }

  public java.lang.String getAuthInfo() {
    return this._f_AuthInfo;
  }

  // Element field
  private java.lang.String[] _f_BindingKey = new java.lang.String[0];
  public void setBindingKey(java.lang.String[] _BindingKey) {
    this._f_BindingKey = _BindingKey;
  }
  public java.lang.String[] getBindingKey() {
    return _f_BindingKey;
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
