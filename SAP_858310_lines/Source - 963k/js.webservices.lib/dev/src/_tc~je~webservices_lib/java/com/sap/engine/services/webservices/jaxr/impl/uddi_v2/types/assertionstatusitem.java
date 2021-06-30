﻿
package com.sap.engine.services.webservices.jaxr.impl.uddi_v2.types;


/**
 * Schema complex type representation (generated by SAP Schema to Java generator).
 * Represents schema complex type {urn:uddi-org:api_v2}assertionStatusItem
 */

public  class AssertionStatusItem extends com.sap.engine.services.webservices.jaxrpc.encoding.GeneratedComplexType {


  public java.lang.String _d_originalUri() {
    return "urn:uddi-org:api_v2";
  }

  public java.lang.String _d_originalLocalName() {
    return "assertionStatusItem";
  }

  private static com.sap.engine.services.webservices.jaxrpc.encoding.AttributeInfo[] ATTRIBUTEINFO;

  private synchronized static void initAttribs() {
    // Creating attribute fields
    if (ATTRIBUTEINFO != null) return;
    ATTRIBUTEINFO = new com.sap.engine.services.webservices.jaxrpc.encoding.AttributeInfo[1];
    ATTRIBUTEINFO[0] = new com.sap.engine.services.webservices.jaxrpc.encoding.AttributeInfo();
    // Attribute 0
    ATTRIBUTEINFO[0].fieldLocalName = "completionStatus";
    ATTRIBUTEINFO[0].fieldUri = "";
    ATTRIBUTEINFO[0].fieldJavaName = "CompletionStatus";
    ATTRIBUTEINFO[0].typeName = "string";
    ATTRIBUTEINFO[0].typeUri = "http://www.w3.org/2001/XMLSchema";
    ATTRIBUTEINFO[0].typeJavaName = "java.lang.String";
    ATTRIBUTEINFO[0].defaultValue = null;
    ATTRIBUTEINFO[0].required = true;
    ATTRIBUTEINFO[0].setterMethod = "setCompletionStatus";
    ATTRIBUTEINFO[0].getterMethod = "getCompletionStatus";
    ATTRIBUTEINFO[0].checkMethod = "hasCompletionStatus";
  }

  // Field information
  private static com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo[] FIELDINFO;

  private synchronized static void initFields() {
    // Creating fields
    if (FIELDINFO != null) return;
    FIELDINFO = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo[4];
    FIELDINFO[0] = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo();
    FIELDINFO[1] = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo();
    FIELDINFO[2] = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo();
    FIELDINFO[3] = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo();
    // Field 0
    FIELDINFO[0].defaultValue = null;
    FIELDINFO[0].fieldJavaName = "FromKey";
    FIELDINFO[0].fieldLocalName = "fromKey";
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
    FIELDINFO[0].typeLocalName = "businessKey";
    FIELDINFO[0].typeUri = "urn:uddi-org:api_v2";
    FIELDINFO[0].getterMethod = "getFromKey";
    FIELDINFO[0].setterMethod = "setFromKey";
    FIELDINFO[0].checkMethod = "hasFromKey";
    // Field 1
    FIELDINFO[1].defaultValue = null;
    FIELDINFO[1].fieldJavaName = "ToKey";
    FIELDINFO[1].fieldLocalName = "toKey";
    FIELDINFO[1].fieldModel = 1;
    FIELDINFO[1].fieldUri = "urn:uddi-org:api_v2";
    FIELDINFO[1].isSoapArray = false;
    FIELDINFO[1].maxOccurs = 1;
    FIELDINFO[1].minOccurs = 1;
    FIELDINFO[1].nillable = false;
    FIELDINFO[1].soapArrayDimensions = 0;
    FIELDINFO[1].soapArrayItemTypeJavaName = null;
    FIELDINFO[1].soapArrayItemTypeLocalName = null;
    FIELDINFO[1].soapArrayItemTypeUri = null;
    FIELDINFO[1].typeJavaName = "java.lang.String";
    FIELDINFO[1].typeLocalName = "businessKey";
    FIELDINFO[1].typeUri = "urn:uddi-org:api_v2";
    FIELDINFO[1].getterMethod = "getToKey";
    FIELDINFO[1].setterMethod = "setToKey";
    FIELDINFO[1].checkMethod = "hasToKey";
    // Field 2
    FIELDINFO[2].defaultValue = null;
    FIELDINFO[2].fieldJavaName = "KeyedReference";
    FIELDINFO[2].fieldLocalName = "keyedReference";
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
    FIELDINFO[2].typeJavaName = "com.sap.engine.services.webservices.jaxr.impl.uddi_v2.types.KeyedReference";
    FIELDINFO[2].typeLocalName = "keyedReference";
    FIELDINFO[2].typeUri = "urn:uddi-org:api_v2";
    FIELDINFO[2].getterMethod = "getKeyedReference";
    FIELDINFO[2].setterMethod = "setKeyedReference";
    FIELDINFO[2].checkMethod = "hasKeyedReference";
    // Field 3
    FIELDINFO[3].defaultValue = null;
    FIELDINFO[3].fieldJavaName = "KeysOwned";
    FIELDINFO[3].fieldLocalName = "keysOwned";
    FIELDINFO[3].fieldModel = 1;
    FIELDINFO[3].fieldUri = "urn:uddi-org:api_v2";
    FIELDINFO[3].isSoapArray = false;
    FIELDINFO[3].maxOccurs = 1;
    FIELDINFO[3].minOccurs = 1;
    FIELDINFO[3].nillable = false;
    FIELDINFO[3].soapArrayDimensions = 0;
    FIELDINFO[3].soapArrayItemTypeJavaName = null;
    FIELDINFO[3].soapArrayItemTypeLocalName = null;
    FIELDINFO[3].soapArrayItemTypeUri = null;
    FIELDINFO[3].typeJavaName = "com.sap.engine.services.webservices.jaxr.impl.uddi_v2.types.KeysOwned";
    FIELDINFO[3].typeLocalName = "keysOwned";
    FIELDINFO[3].typeUri = "urn:uddi-org:api_v2";
    FIELDINFO[3].getterMethod = "getKeysOwned";
    FIELDINFO[3].setterMethod = "setKeysOwned";
    FIELDINFO[3].checkMethod = "hasKeysOwned";
  }


  // Returns model Group Type
  public int _getModelType() {
    return 3;
  }

  // Attribute field
  private java.lang.String _a_CompletionStatus;
  private boolean _a_hasCompletionStatus;
  // set method
  public void setCompletionStatus(java.lang.String _CompletionStatus) {
    this._a_CompletionStatus = _CompletionStatus;
    this._a_hasCompletionStatus = true;
  }
  // clear method
  public void clearCompletionStatus(java.lang.String _CompletionStatus) {
    this._a_hasCompletionStatus = false;
  }
  // get method
  public java.lang.String getCompletionStatus() {
    return _a_CompletionStatus;
  }
  // has method
  public boolean hasCompletionStatus() {
    return _a_hasCompletionStatus;
  }

  // Element field
  private java.lang.String _f_FromKey;

  public void setFromKey(java.lang.String _FromKey) {
    this._f_FromKey = _FromKey;
  }

  public java.lang.String getFromKey() {
    return this._f_FromKey;
  }

  // Element field
  private java.lang.String _f_ToKey;

  public void setToKey(java.lang.String _ToKey) {
    this._f_ToKey = _ToKey;
  }

  public java.lang.String getToKey() {
    return this._f_ToKey;
  }

  // Element field
  private com.sap.engine.services.webservices.jaxr.impl.uddi_v2.types.KeyedReference _f_KeyedReference;

  public void setKeyedReference(com.sap.engine.services.webservices.jaxr.impl.uddi_v2.types.KeyedReference _KeyedReference) {
    this._f_KeyedReference = _KeyedReference;
  }

  public com.sap.engine.services.webservices.jaxr.impl.uddi_v2.types.KeyedReference getKeyedReference() {
    return this._f_KeyedReference;
  }

  // Element field
  private com.sap.engine.services.webservices.jaxr.impl.uddi_v2.types.KeysOwned _f_KeysOwned;

  public void setKeysOwned(com.sap.engine.services.webservices.jaxr.impl.uddi_v2.types.KeysOwned _KeysOwned) {
    this._f_KeysOwned = _KeysOwned;
  }

  public com.sap.engine.services.webservices.jaxr.impl.uddi_v2.types.KeysOwned getKeysOwned() {
    return this._f_KeysOwned;
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
