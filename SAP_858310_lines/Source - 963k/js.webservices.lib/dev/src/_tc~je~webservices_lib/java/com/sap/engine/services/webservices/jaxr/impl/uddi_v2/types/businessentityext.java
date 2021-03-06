
package com.sap.engine.services.webservices.jaxr.impl.uddi_v2.types;


/**
 * Schema complex type representation (generated by SAP Schema to Java generator).
 * Represents schema complex type {urn:uddi-org:api_v2}businessEntityExt
 */

public  class BusinessEntityExt extends com.sap.engine.services.webservices.jaxrpc.encoding.GeneratedComplexType {


  public java.lang.String _d_originalUri() {
    return "urn:uddi-org:api_v2";
  }

  public java.lang.String _d_originalLocalName() {
    return "businessEntityExt";
  }

  private static com.sap.engine.services.webservices.jaxrpc.encoding.AttributeInfo[] ATTRIBUTEINFO;

  private synchronized static void initAttribs() {
    // Creating attribute fields
    if (ATTRIBUTEINFO != null) return;
    ATTRIBUTEINFO = new com.sap.engine.services.webservices.jaxrpc.encoding.AttributeInfo[0];
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
    FIELDINFO[0].fieldJavaName = "BusinessEntity";
    FIELDINFO[0].fieldLocalName = "businessEntity";
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
    FIELDINFO[0].typeJavaName = "com.sap.engine.services.webservices.jaxr.impl.uddi_v2.types.BusinessEntity";
    FIELDINFO[0].typeLocalName = "businessEntity";
    FIELDINFO[0].typeUri = "urn:uddi-org:api_v2";
    FIELDINFO[0].getterMethod = "getBusinessEntity";
    FIELDINFO[0].setterMethod = "setBusinessEntity";
    FIELDINFO[0].checkMethod = "hasBusinessEntity";
    // Field 1
    FIELDINFO[1].defaultValue = null;
    FIELDINFO[1].fieldJavaName = "_any";
    FIELDINFO[1].fieldLocalName = "";
    FIELDINFO[1].fieldModel = 5;
    FIELDINFO[1].fieldUri = "";
    FIELDINFO[1].isSoapArray = false;
    FIELDINFO[1].maxOccurs = 2147483647;
    FIELDINFO[1].minOccurs = 0;
    FIELDINFO[1].nillable = false;
    FIELDINFO[1].soapArrayDimensions = 0;
    FIELDINFO[1].soapArrayItemTypeJavaName = null;
    FIELDINFO[1].soapArrayItemTypeLocalName = null;
    FIELDINFO[1].soapArrayItemTypeUri = null;
    FIELDINFO[1].typeJavaName = "javax.xml.soap.SOAPElement";
    FIELDINFO[1].typeLocalName = "anyType";
    FIELDINFO[1].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[1].getterMethod = "get_any";
    FIELDINFO[1].setterMethod = "set_any";
    FIELDINFO[1].checkMethod = "has_any";
  }


  // Returns model Group Type
  public int _getModelType() {
    return 3;
  }

  // Element field
  private com.sap.engine.services.webservices.jaxr.impl.uddi_v2.types.BusinessEntity _f_BusinessEntity;

  public void setBusinessEntity(com.sap.engine.services.webservices.jaxr.impl.uddi_v2.types.BusinessEntity _BusinessEntity) {
    this._f_BusinessEntity = _BusinessEntity;
  }

  public com.sap.engine.services.webservices.jaxr.impl.uddi_v2.types.BusinessEntity getBusinessEntity() {
    return this._f_BusinessEntity;
  }

  // Wildcard 'any' field
  private javax.xml.soap.SOAPElement[] _f__any = new javax.xml.soap.SOAPElement[0];
  public void set_any(javax.xml.soap.SOAPElement[] __any) {
    this._f__any = __any;
  }
  public javax.xml.soap.SOAPElement[] get_any() {
    return _f__any;
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
