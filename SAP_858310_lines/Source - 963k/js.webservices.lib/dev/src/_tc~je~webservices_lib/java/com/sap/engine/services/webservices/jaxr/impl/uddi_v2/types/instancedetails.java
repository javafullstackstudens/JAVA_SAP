
package com.sap.engine.services.webservices.jaxr.impl.uddi_v2.types;


/**
 * Schema complex type representation (generated by SAP Schema to Java generator).
 * Represents schema complex type {urn:uddi-org:api_v2}instanceDetails
 */

public  class InstanceDetails extends com.sap.engine.services.webservices.jaxrpc.encoding.GeneratedComplexType {


  public java.lang.String _d_originalUri() {
    return "urn:uddi-org:api_v2";
  }

  public java.lang.String _d_originalLocalName() {
    return "instanceDetails";
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
    FIELDINFO = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo[3];
    FIELDINFO[0] = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo();
    FIELDINFO[1] = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo();
    FIELDINFO[2] = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo();
    // Field 0
    FIELDINFO[0].defaultValue = null;
    FIELDINFO[0].fieldJavaName = "Description";
    FIELDINFO[0].fieldLocalName = "description";
    FIELDINFO[0].fieldModel = 1;
    FIELDINFO[0].fieldUri = "urn:uddi-org:api_v2";
    FIELDINFO[0].isSoapArray = false;
    FIELDINFO[0].maxOccurs = 2147483647;
    FIELDINFO[0].minOccurs = 0;
    FIELDINFO[0].nillable = false;
    FIELDINFO[0].soapArrayDimensions = 0;
    FIELDINFO[0].soapArrayItemTypeJavaName = null;
    FIELDINFO[0].soapArrayItemTypeLocalName = null;
    FIELDINFO[0].soapArrayItemTypeUri = null;
    FIELDINFO[0].typeJavaName = "com.sap.engine.services.webservices.jaxr.impl.uddi_v2.types.Description";
    FIELDINFO[0].typeLocalName = "description";
    FIELDINFO[0].typeUri = "urn:uddi-org:api_v2";
    FIELDINFO[0].getterMethod = "getDescription";
    FIELDINFO[0].setterMethod = "setDescription";
    FIELDINFO[0].checkMethod = "hasDescription";
    // Field 1
    FIELDINFO[1].defaultValue = null;
    FIELDINFO[1].fieldJavaName = "OverviewDoc";
    FIELDINFO[1].fieldLocalName = "overviewDoc";
    FIELDINFO[1].fieldModel = 1;
    FIELDINFO[1].fieldUri = "urn:uddi-org:api_v2";
    FIELDINFO[1].isSoapArray = false;
    FIELDINFO[1].maxOccurs = 1;
    FIELDINFO[1].minOccurs = 0;
    FIELDINFO[1].nillable = false;
    FIELDINFO[1].soapArrayDimensions = 0;
    FIELDINFO[1].soapArrayItemTypeJavaName = null;
    FIELDINFO[1].soapArrayItemTypeLocalName = null;
    FIELDINFO[1].soapArrayItemTypeUri = null;
    FIELDINFO[1].typeJavaName = "com.sap.engine.services.webservices.jaxr.impl.uddi_v2.types.OverviewDoc";
    FIELDINFO[1].typeLocalName = "overviewDoc";
    FIELDINFO[1].typeUri = "urn:uddi-org:api_v2";
    FIELDINFO[1].getterMethod = "getOverviewDoc";
    FIELDINFO[1].setterMethod = "setOverviewDoc";
    FIELDINFO[1].checkMethod = "hasOverviewDoc";
    // Field 2
    FIELDINFO[2].defaultValue = null;
    FIELDINFO[2].fieldJavaName = "InstanceParms";
    FIELDINFO[2].fieldLocalName = "instanceParms";
    FIELDINFO[2].fieldModel = 1;
    FIELDINFO[2].fieldUri = "urn:uddi-org:api_v2";
    FIELDINFO[2].isSoapArray = false;
    FIELDINFO[2].maxOccurs = 1;
    FIELDINFO[2].minOccurs = 0;
    FIELDINFO[2].nillable = false;
    FIELDINFO[2].soapArrayDimensions = 0;
    FIELDINFO[2].soapArrayItemTypeJavaName = null;
    FIELDINFO[2].soapArrayItemTypeLocalName = null;
    FIELDINFO[2].soapArrayItemTypeUri = null;
    FIELDINFO[2].typeJavaName = "java.lang.String";
    FIELDINFO[2].typeLocalName = "string";
    FIELDINFO[2].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[2].getterMethod = "getInstanceParms";
    FIELDINFO[2].setterMethod = "setInstanceParms";
    FIELDINFO[2].checkMethod = "hasInstanceParms";
  }


  // Returns model Group Type
  public int _getModelType() {
    return 3;
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
  private com.sap.engine.services.webservices.jaxr.impl.uddi_v2.types.OverviewDoc _f_OverviewDoc;

  private boolean _f_hasOverviewDoc;
  public void setOverviewDoc(com.sap.engine.services.webservices.jaxr.impl.uddi_v2.types.OverviewDoc _OverviewDoc) {
    this._f_OverviewDoc = _OverviewDoc;
    this._f_hasOverviewDoc = true;
  }
  public com.sap.engine.services.webservices.jaxr.impl.uddi_v2.types.OverviewDoc getOverviewDoc() {
    return this._f_OverviewDoc;
  }
  public boolean hasOverviewDoc() {
    return this._f_hasOverviewDoc;
  }
  public void clearOverviewDoc() {
    this._f_hasOverviewDoc = false;
  }

  // Element field
  private java.lang.String _f_InstanceParms;

  private boolean _f_hasInstanceParms;
  public void setInstanceParms(java.lang.String _InstanceParms) {
    this._f_InstanceParms = _InstanceParms;
    this._f_hasInstanceParms = true;
  }
  public java.lang.String getInstanceParms() {
    return this._f_InstanceParms;
  }
  public boolean hasInstanceParms() {
    return this._f_hasInstanceParms;
  }
  public void clearInstanceParms() {
    this._f_hasInstanceParms = false;
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
