﻿/*
 * Generated by SAP SchemaToJava Generator NW05 on Mon May 29 10:14:51 EEST 2006
 * Copyright (c) 2002 by SAP Labs Sofia AG.
 * url: http://www.saplabs.bg
 * All rights reserved.
 */
package com.sap.sapcontrol.client.types.frm;

/**
 * Schema complexType Java representation.
 * Represents type {urn:SAPControl}J2EEEJBSession
 */
public  class J2EEEJBSessionSD extends com.sap.engine.services.webservices.jaxrpc.encoding.GeneratedComplexType {

  public java.lang.String _d_originalUri() {
    return "urn:SAPControl";
  }

  public java.lang.String _d_originalLocalName() {
    return "J2EEEJBSession";
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
    FIELDINFO = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo[15];
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
    FIELDINFO[10] = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo();
    FIELDINFO[11] = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo();
    FIELDINFO[12] = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo();
    FIELDINFO[13] = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo();
    FIELDINFO[14] = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo();
    // Field 0
    FIELDINFO[0].defaultValue = null;
    FIELDINFO[0].fieldJavaName = "IdHash";
    FIELDINFO[0].fieldLocalName = "IdHash";
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
    FIELDINFO[0].typeJavaName = "int";
    FIELDINFO[0].typeLocalName = "int";
    FIELDINFO[0].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[0].getterMethod = "getIdHash";
    FIELDINFO[0].setterMethod = "setIdHash";
    FIELDINFO[0].checkMethod = null;
    // Field 1
    FIELDINFO[1].defaultValue = null;
    FIELDINFO[1].fieldJavaName = "State";
    FIELDINFO[1].fieldLocalName = "state";
    FIELDINFO[1].fieldModel = 1;
    FIELDINFO[1].fieldUri = "";
    FIELDINFO[1].isSoapArray = false;
    FIELDINFO[1].maxOccurs = 1;
    FIELDINFO[1].minOccurs = 0;
    FIELDINFO[1].nillable = true;
    FIELDINFO[1].soapArrayDimensions = 0;
    FIELDINFO[1].soapArrayItemTypeJavaName = null;
    FIELDINFO[1].soapArrayItemTypeLocalName = null;
    FIELDINFO[1].soapArrayItemTypeUri = null;
    FIELDINFO[1].typeJavaName = "java.lang.String";
    FIELDINFO[1].typeLocalName = "string";
    FIELDINFO[1].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[1].getterMethod = "getState";
    FIELDINFO[1].setterMethod = "setState";
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
    FIELDINFO[3].fieldJavaName = "ActiveRequests";
    FIELDINFO[3].fieldLocalName = "activeRequests";
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
    FIELDINFO[3].getterMethod = "getActiveRequests";
    FIELDINFO[3].setterMethod = "setActiveRequests";
    FIELDINFO[3].checkMethod = null;
    // Field 4
    FIELDINFO[4].defaultValue = null;
    FIELDINFO[4].fieldJavaName = "TotalRequests";
    FIELDINFO[4].fieldLocalName = "totalRequests";
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
    FIELDINFO[4].getterMethod = "getTotalRequests";
    FIELDINFO[4].setterMethod = "setTotalRequests";
    FIELDINFO[4].checkMethod = null;
    // Field 5
    FIELDINFO[5].defaultValue = null;
    FIELDINFO[5].fieldJavaName = "BackingStore";
    FIELDINFO[5].fieldLocalName = "backingStore";
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
    FIELDINFO[5].getterMethod = "getBackingStore";
    FIELDINFO[5].setterMethod = "setBackingStore";
    FIELDINFO[5].checkMethod = null;
    // Field 6
    FIELDINFO[6].defaultValue = null;
    FIELDINFO[6].fieldJavaName = "Processname";
    FIELDINFO[6].fieldLocalName = "processname";
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
    FIELDINFO[6].getterMethod = "getProcessname";
    FIELDINFO[6].setterMethod = "setProcessname";
    FIELDINFO[6].checkMethod = null;
    // Field 7
    FIELDINFO[7].defaultValue = null;
    FIELDINFO[7].fieldJavaName = "StartTime";
    FIELDINFO[7].fieldLocalName = "startTime";
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
    FIELDINFO[7].getterMethod = "getStartTime";
    FIELDINFO[7].setterMethod = "setStartTime";
    FIELDINFO[7].checkMethod = null;
    // Field 8
    FIELDINFO[8].defaultValue = null;
    FIELDINFO[8].fieldJavaName = "UpdateTime";
    FIELDINFO[8].fieldLocalName = "updateTime";
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
    FIELDINFO[8].getterMethod = "getUpdateTime";
    FIELDINFO[8].setterMethod = "setUpdateTime";
    FIELDINFO[8].checkMethod = null;
    // Field 9
    FIELDINFO[9].defaultValue = null;
    FIELDINFO[9].fieldJavaName = "ResponseTime";
    FIELDINFO[9].fieldLocalName = "responseTime";
    FIELDINFO[9].fieldModel = 1;
    FIELDINFO[9].fieldUri = "";
    FIELDINFO[9].isSoapArray = false;
    FIELDINFO[9].maxOccurs = 1;
    FIELDINFO[9].minOccurs = 1;
    FIELDINFO[9].nillable = false;
    FIELDINFO[9].soapArrayDimensions = 0;
    FIELDINFO[9].soapArrayItemTypeJavaName = null;
    FIELDINFO[9].soapArrayItemTypeLocalName = null;
    FIELDINFO[9].soapArrayItemTypeUri = null;
    FIELDINFO[9].typeJavaName = "int";
    FIELDINFO[9].typeLocalName = "int";
    FIELDINFO[9].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[9].getterMethod = "getResponseTime";
    FIELDINFO[9].setterMethod = "setResponseTime";
    FIELDINFO[9].checkMethod = null;
    // Field 10
    FIELDINFO[10].defaultValue = null;
    FIELDINFO[10].fieldJavaName = "User";
    FIELDINFO[10].fieldLocalName = "user";
    FIELDINFO[10].fieldModel = 1;
    FIELDINFO[10].fieldUri = "";
    FIELDINFO[10].isSoapArray = false;
    FIELDINFO[10].maxOccurs = 1;
    FIELDINFO[10].minOccurs = 0;
    FIELDINFO[10].nillable = true;
    FIELDINFO[10].soapArrayDimensions = 0;
    FIELDINFO[10].soapArrayItemTypeJavaName = null;
    FIELDINFO[10].soapArrayItemTypeLocalName = null;
    FIELDINFO[10].soapArrayItemTypeUri = null;
    FIELDINFO[10].typeJavaName = "java.lang.String";
    FIELDINFO[10].typeLocalName = "string";
    FIELDINFO[10].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[10].getterMethod = "getUser";
    FIELDINFO[10].setterMethod = "setUser";
    FIELDINFO[10].checkMethod = null;
    // Field 11
    FIELDINFO[11].defaultValue = null;
    FIELDINFO[11].fieldJavaName = "Transaction";
    FIELDINFO[11].fieldLocalName = "transaction";
    FIELDINFO[11].fieldModel = 1;
    FIELDINFO[11].fieldUri = "";
    FIELDINFO[11].isSoapArray = false;
    FIELDINFO[11].maxOccurs = 1;
    FIELDINFO[11].minOccurs = 0;
    FIELDINFO[11].nillable = true;
    FIELDINFO[11].soapArrayDimensions = 0;
    FIELDINFO[11].soapArrayItemTypeJavaName = null;
    FIELDINFO[11].soapArrayItemTypeLocalName = null;
    FIELDINFO[11].soapArrayItemTypeUri = null;
    FIELDINFO[11].typeJavaName = "java.lang.String";
    FIELDINFO[11].typeLocalName = "string";
    FIELDINFO[11].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[11].getterMethod = "getTransaction";
    FIELDINFO[11].setterMethod = "setTransaction";
    FIELDINFO[11].checkMethod = null;
    // Field 12
    FIELDINFO[12].defaultValue = null;
    FIELDINFO[12].fieldJavaName = "Ejb";
    FIELDINFO[12].fieldLocalName = "ejb";
    FIELDINFO[12].fieldModel = 1;
    FIELDINFO[12].fieldUri = "";
    FIELDINFO[12].isSoapArray = false;
    FIELDINFO[12].maxOccurs = 1;
    FIELDINFO[12].minOccurs = 0;
    FIELDINFO[12].nillable = true;
    FIELDINFO[12].soapArrayDimensions = 0;
    FIELDINFO[12].soapArrayItemTypeJavaName = null;
    FIELDINFO[12].soapArrayItemTypeLocalName = null;
    FIELDINFO[12].soapArrayItemTypeUri = null;
    FIELDINFO[12].typeJavaName = "java.lang.String";
    FIELDINFO[12].typeLocalName = "string";
    FIELDINFO[12].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[12].getterMethod = "getEjb";
    FIELDINFO[12].setterMethod = "setEjb";
    FIELDINFO[12].checkMethod = null;
    // Field 13
    FIELDINFO[13].defaultValue = null;
    FIELDINFO[13].fieldJavaName = "Application";
    FIELDINFO[13].fieldLocalName = "application";
    FIELDINFO[13].fieldModel = 1;
    FIELDINFO[13].fieldUri = "";
    FIELDINFO[13].isSoapArray = false;
    FIELDINFO[13].maxOccurs = 1;
    FIELDINFO[13].minOccurs = 0;
    FIELDINFO[13].nillable = true;
    FIELDINFO[13].soapArrayDimensions = 0;
    FIELDINFO[13].soapArrayItemTypeJavaName = null;
    FIELDINFO[13].soapArrayItemTypeLocalName = null;
    FIELDINFO[13].soapArrayItemTypeUri = null;
    FIELDINFO[13].typeJavaName = "java.lang.String";
    FIELDINFO[13].typeLocalName = "string";
    FIELDINFO[13].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[13].getterMethod = "getApplication";
    FIELDINFO[13].setterMethod = "setApplication";
    FIELDINFO[13].checkMethod = null;
    // Field 14
    FIELDINFO[14].defaultValue = null;
    FIELDINFO[14].fieldJavaName = "Reference";
    FIELDINFO[14].fieldLocalName = "reference";
    FIELDINFO[14].fieldModel = 1;
    FIELDINFO[14].fieldUri = "";
    FIELDINFO[14].isSoapArray = false;
    FIELDINFO[14].maxOccurs = 1;
    FIELDINFO[14].minOccurs = 0;
    FIELDINFO[14].nillable = true;
    FIELDINFO[14].soapArrayDimensions = 0;
    FIELDINFO[14].soapArrayItemTypeJavaName = null;
    FIELDINFO[14].soapArrayItemTypeLocalName = null;
    FIELDINFO[14].soapArrayItemTypeUri = null;
    FIELDINFO[14].typeJavaName = "java.lang.String";
    FIELDINFO[14].typeLocalName = "string";
    FIELDINFO[14].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[14].getterMethod = "getReference";
    FIELDINFO[14].setterMethod = "setReference";
    FIELDINFO[14].checkMethod = null;
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
