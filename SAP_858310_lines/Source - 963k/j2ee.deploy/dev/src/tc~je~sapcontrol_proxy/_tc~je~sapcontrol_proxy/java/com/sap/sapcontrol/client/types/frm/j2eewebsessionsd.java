/*
 * Generated by SAP SchemaToJava Generator NW05 on Mon May 29 10:14:51 EEST 2006
 * Copyright (c) 2002 by SAP Labs Sofia AG.
 * url: http://www.saplabs.bg
 * All rights reserved.
 */
package com.sap.sapcontrol.client.types.frm;

/**
 * Schema complexType Java representation.
 * Represents type {urn:SAPControl}J2EEWebSession
 */
public  class J2EEWebSessionSD extends com.sap.engine.services.webservices.jaxrpc.encoding.GeneratedComplexType {

  public java.lang.String _d_originalUri() {
    return "urn:SAPControl";
  }

  public java.lang.String _d_originalLocalName() {
    return "J2EEWebSession";
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
    FIELDINFO = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo[10];
    FIELDINFO[0] = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo();
    FIELDINFO[1] = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo();
    FIELDINFO[2] = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo();
    FIELDINFO[3] = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo();
    FIELDINFO[4] = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo();
    FIELDINFO[5] = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo();
    FIELDINFO[6] = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo();
    FIELDINFO[7] = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo();
    FIELDINFO[8] = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo();
    FIELDINFO[9] = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo();
    // Field 0
    FIELDINFO[0].defaultValue = null;
    FIELDINFO[0].fieldJavaName = "Processname";
    FIELDINFO[0].fieldLocalName = "processname";
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
    FIELDINFO[0].getterMethod = "getProcessname";
    FIELDINFO[0].setterMethod = "setProcessname";
    FIELDINFO[0].checkMethod = null;
    // Field 1
    FIELDINFO[1].defaultValue = null;
    FIELDINFO[1].fieldJavaName = "IdHash";
    FIELDINFO[1].fieldLocalName = "IdHash";
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
    FIELDINFO[1].getterMethod = "getIdHash";
    FIELDINFO[1].setterMethod = "setIdHash";
    FIELDINFO[1].checkMethod = null;
    // Field 2
    FIELDINFO[2].defaultValue = null;
    FIELDINFO[2].fieldJavaName = "Size";
    FIELDINFO[2].fieldLocalName = "size";
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
    FIELDINFO[2].getterMethod = "getSize";
    FIELDINFO[2].setterMethod = "setSize";
    FIELDINFO[2].checkMethod = null;
    // Field 3
    FIELDINFO[3].defaultValue = null;
    FIELDINFO[3].fieldJavaName = "Timeout";
    FIELDINFO[3].fieldLocalName = "timeout";
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
    FIELDINFO[3].getterMethod = "getTimeout";
    FIELDINFO[3].setterMethod = "setTimeout";
    FIELDINFO[3].checkMethod = null;
    // Field 4
    FIELDINFO[4].defaultValue = null;
    FIELDINFO[4].fieldJavaName = "ActiveRequests";
    FIELDINFO[4].fieldLocalName = "activeRequests";
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
    FIELDINFO[4].typeJavaName = "int";
    FIELDINFO[4].typeLocalName = "int";
    FIELDINFO[4].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[4].getterMethod = "getActiveRequests";
    FIELDINFO[4].setterMethod = "setActiveRequests";
    FIELDINFO[4].checkMethod = null;
    // Field 5
    FIELDINFO[5].defaultValue = null;
    FIELDINFO[5].fieldJavaName = "StartTime";
    FIELDINFO[5].fieldLocalName = "startTime";
    FIELDINFO[5].fieldModel = 1;
    FIELDINFO[5].fieldUri = "";
    FIELDINFO[5].isSoapArray = false;
    FIELDINFO[5].maxOccurs = 1;
    FIELDINFO[5].minOccurs = 0;
    FIELDINFO[5].nillable = true;
    FIELDINFO[5].soapArrayDimensions = 0;
    FIELDINFO[5].soapArrayItemTypeJavaName = null;
    FIELDINFO[5].soapArrayItemTypeLocalName = null;
    FIELDINFO[5].soapArrayItemTypeUri = null;
    FIELDINFO[5].typeJavaName = "java.lang.String";
    FIELDINFO[5].typeLocalName = "string";
    FIELDINFO[5].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[5].getterMethod = "getStartTime";
    FIELDINFO[5].setterMethod = "setStartTime";
    FIELDINFO[5].checkMethod = null;
    // Field 6
    FIELDINFO[6].defaultValue = null;
    FIELDINFO[6].fieldJavaName = "UpdateTime";
    FIELDINFO[6].fieldLocalName = "updateTime";
    FIELDINFO[6].fieldModel = 1;
    FIELDINFO[6].fieldUri = "";
    FIELDINFO[6].isSoapArray = false;
    FIELDINFO[6].maxOccurs = 1;
    FIELDINFO[6].minOccurs = 0;
    FIELDINFO[6].nillable = true;
    FIELDINFO[6].soapArrayDimensions = 0;
    FIELDINFO[6].soapArrayItemTypeJavaName = null;
    FIELDINFO[6].soapArrayItemTypeLocalName = null;
    FIELDINFO[6].soapArrayItemTypeUri = null;
    FIELDINFO[6].typeJavaName = "java.lang.String";
    FIELDINFO[6].typeLocalName = "string";
    FIELDINFO[6].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[6].getterMethod = "getUpdateTime";
    FIELDINFO[6].setterMethod = "setUpdateTime";
    FIELDINFO[6].checkMethod = null;
    // Field 7
    FIELDINFO[7].defaultValue = null;
    FIELDINFO[7].fieldJavaName = "State";
    FIELDINFO[7].fieldLocalName = "state";
    FIELDINFO[7].fieldModel = 1;
    FIELDINFO[7].fieldUri = "";
    FIELDINFO[7].isSoapArray = false;
    FIELDINFO[7].maxOccurs = 1;
    FIELDINFO[7].minOccurs = 0;
    FIELDINFO[7].nillable = true;
    FIELDINFO[7].soapArrayDimensions = 0;
    FIELDINFO[7].soapArrayItemTypeJavaName = null;
    FIELDINFO[7].soapArrayItemTypeLocalName = null;
    FIELDINFO[7].soapArrayItemTypeUri = null;
    FIELDINFO[7].typeJavaName = "java.lang.String";
    FIELDINFO[7].typeLocalName = "string";
    FIELDINFO[7].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[7].getterMethod = "getState";
    FIELDINFO[7].setterMethod = "setState";
    FIELDINFO[7].checkMethod = null;
    // Field 8
    FIELDINFO[8].defaultValue = null;
    FIELDINFO[8].fieldJavaName = "BackingStore";
    FIELDINFO[8].fieldLocalName = "backingStore";
    FIELDINFO[8].fieldModel = 1;
    FIELDINFO[8].fieldUri = "";
    FIELDINFO[8].isSoapArray = false;
    FIELDINFO[8].maxOccurs = 1;
    FIELDINFO[8].minOccurs = 0;
    FIELDINFO[8].nillable = true;
    FIELDINFO[8].soapArrayDimensions = 0;
    FIELDINFO[8].soapArrayItemTypeJavaName = null;
    FIELDINFO[8].soapArrayItemTypeLocalName = null;
    FIELDINFO[8].soapArrayItemTypeUri = null;
    FIELDINFO[8].typeJavaName = "java.lang.String";
    FIELDINFO[8].typeLocalName = "string";
    FIELDINFO[8].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[8].getterMethod = "getBackingStore";
    FIELDINFO[8].setterMethod = "setBackingStore";
    FIELDINFO[8].checkMethod = null;
    // Field 9
    FIELDINFO[9].defaultValue = null;
    FIELDINFO[9].fieldJavaName = "User";
    FIELDINFO[9].fieldLocalName = "user";
    FIELDINFO[9].fieldModel = 1;
    FIELDINFO[9].fieldUri = "";
    FIELDINFO[9].isSoapArray = false;
    FIELDINFO[9].maxOccurs = 1;
    FIELDINFO[9].minOccurs = 0;
    FIELDINFO[9].nillable = true;
    FIELDINFO[9].soapArrayDimensions = 0;
    FIELDINFO[9].soapArrayItemTypeJavaName = null;
    FIELDINFO[9].soapArrayItemTypeLocalName = null;
    FIELDINFO[9].soapArrayItemTypeUri = null;
    FIELDINFO[9].typeJavaName = "java.lang.String";
    FIELDINFO[9].typeLocalName = "string";
    FIELDINFO[9].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[9].getterMethod = "getUser";
    FIELDINFO[9].setterMethod = "setUser";
    FIELDINFO[9].checkMethod = null;
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
