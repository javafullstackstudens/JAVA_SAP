/*
 * Generated by SAP SchemaToJava Generator NW05 on Mon May 29 10:14:51 EEST 2006
 * Copyright (c) 2002 by SAP Labs Sofia AG.
 * url: http://www.saplabs.bg
 * All rights reserved.
 */
package com.sap.sapcontrol.client.types.frm;

/**
 * Schema complexType Java representation.
 * Represents type {urn:SAPControl}J2EESharedTableInfo
 */
public  class J2EESharedTableInfoSD extends com.sap.engine.services.webservices.jaxrpc.encoding.GeneratedComplexType {

  public java.lang.String _d_originalUri() {
    return "urn:SAPControl";
  }

  public java.lang.String _d_originalLocalName() {
    return "J2EESharedTableInfo";
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
    FIELDINFO = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo[5];
    FIELDINFO[0] = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo();
    FIELDINFO[1] = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo();
    FIELDINFO[2] = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo();
    FIELDINFO[3] = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo();
    FIELDINFO[4] = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo();
    // Field 0
    FIELDINFO[0].defaultValue = null;
    FIELDINFO[0].fieldJavaName = "Table";
    FIELDINFO[0].fieldLocalName = "table";
    FIELDINFO[0].fieldModel = 1;
    FIELDINFO[0].fieldUri = "";
    FIELDINFO[0].isSoapArray = false;
    FIELDINFO[0].maxOccurs = 1;
    FIELDINFO[0].minOccurs = 0;
    FIELDINFO[0].nillable = true;
    FIELDINFO[0].soapArrayDimensions = 0;
    FIELDINFO[0].soapArrayItemTypeJavaName = null;
    FIELDINFO[0].soapArrayItemTypeLocalName = null;
    FIELDINFO[0].soapArrayItemTypeUri = null;
    FIELDINFO[0].typeJavaName = "java.lang.String";
    FIELDINFO[0].typeLocalName = "string";
    FIELDINFO[0].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[0].getterMethod = "getTable";
    FIELDINFO[0].setterMethod = "setTable";
    FIELDINFO[0].checkMethod = null;
    // Field 1
    FIELDINFO[1].defaultValue = null;
    FIELDINFO[1].fieldJavaName = "Used";
    FIELDINFO[1].fieldLocalName = "used";
    FIELDINFO[1].fieldModel = 1;
    FIELDINFO[1].fieldUri = "";
    FIELDINFO[1].isSoapArray = false;
    FIELDINFO[1].maxOccurs = 1;
    FIELDINFO[1].minOccurs = 1;
    FIELDINFO[1].nillable = false;
    FIELDINFO[1].soapArrayDimensions = 0;
    FIELDINFO[1].soapArrayItemTypeJavaName = null;
    FIELDINFO[1].soapArrayItemTypeLocalName = null;
    FIELDINFO[1].soapArrayItemTypeUri = null;
    FIELDINFO[1].typeJavaName = "int";
    FIELDINFO[1].typeLocalName = "int";
    FIELDINFO[1].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[1].getterMethod = "getUsed";
    FIELDINFO[1].setterMethod = "setUsed";
    FIELDINFO[1].checkMethod = null;
    // Field 2
    FIELDINFO[2].defaultValue = null;
    FIELDINFO[2].fieldJavaName = "Peak";
    FIELDINFO[2].fieldLocalName = "peak";
    FIELDINFO[2].fieldModel = 1;
    FIELDINFO[2].fieldUri = "";
    FIELDINFO[2].isSoapArray = false;
    FIELDINFO[2].maxOccurs = 1;
    FIELDINFO[2].minOccurs = 1;
    FIELDINFO[2].nillable = false;
    FIELDINFO[2].soapArrayDimensions = 0;
    FIELDINFO[2].soapArrayItemTypeJavaName = null;
    FIELDINFO[2].soapArrayItemTypeLocalName = null;
    FIELDINFO[2].soapArrayItemTypeUri = null;
    FIELDINFO[2].typeJavaName = "int";
    FIELDINFO[2].typeLocalName = "int";
    FIELDINFO[2].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[2].getterMethod = "getPeak";
    FIELDINFO[2].setterMethod = "setPeak";
    FIELDINFO[2].checkMethod = null;
    // Field 3
    FIELDINFO[3].defaultValue = null;
    FIELDINFO[3].fieldJavaName = "Limit";
    FIELDINFO[3].fieldLocalName = "limit";
    FIELDINFO[3].fieldModel = 1;
    FIELDINFO[3].fieldUri = "";
    FIELDINFO[3].isSoapArray = false;
    FIELDINFO[3].maxOccurs = 1;
    FIELDINFO[3].minOccurs = 1;
    FIELDINFO[3].nillable = false;
    FIELDINFO[3].soapArrayDimensions = 0;
    FIELDINFO[3].soapArrayItemTypeJavaName = null;
    FIELDINFO[3].soapArrayItemTypeLocalName = null;
    FIELDINFO[3].soapArrayItemTypeUri = null;
    FIELDINFO[3].typeJavaName = "int";
    FIELDINFO[3].typeLocalName = "int";
    FIELDINFO[3].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[3].getterMethod = "getLimit";
    FIELDINFO[3].setterMethod = "setLimit";
    FIELDINFO[3].checkMethod = null;
    // Field 4
    FIELDINFO[4].defaultValue = null;
    FIELDINFO[4].fieldJavaName = "Dispstatus";
    FIELDINFO[4].fieldLocalName = "dispstatus";
    FIELDINFO[4].fieldModel = 1;
    FIELDINFO[4].fieldUri = "";
    FIELDINFO[4].isSoapArray = false;
    FIELDINFO[4].maxOccurs = 1;
    FIELDINFO[4].minOccurs = 1;
    FIELDINFO[4].nillable = false;
    FIELDINFO[4].soapArrayDimensions = 0;
    FIELDINFO[4].soapArrayItemTypeJavaName = null;
    FIELDINFO[4].soapArrayItemTypeLocalName = null;
    FIELDINFO[4].soapArrayItemTypeUri = null;
    FIELDINFO[4].typeJavaName = "com.sap.sapcontrol.client.types.STATECOLOR";
    FIELDINFO[4].typeLocalName = "STATE-COLOR";
    FIELDINFO[4].typeUri = "urn:SAPControl";
    FIELDINFO[4].getterMethod = "getDispstatus";
    FIELDINFO[4].setterMethod = "setDispstatus";
    FIELDINFO[4].checkMethod = null;
  }


  // Returns model Group Type
  public int _getModelType() {
    return 3;
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
