/*
 * Generated by SAP SchemaToJava Generator NW05 on Mon May 29 10:14:51 EEST 2006
 * Copyright (c) 2002 by SAP Labs Sofia AG.
 * url: http://www.saplabs.bg
 * All rights reserved.
 */
package com.sap.sapcontrol.client.types.frm;

/**
 * Schema complexType Java representation.
 * Represents type {urn:SAPControl}GCInfo2
 */
public  class GCInfo2SD extends com.sap.engine.services.webservices.jaxrpc.encoding.GeneratedComplexType {

  public java.lang.String _d_originalUri() {
    return "urn:SAPControl";
  }

  public java.lang.String _d_originalLocalName() {
    return "GCInfo2";
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
    FIELDINFO = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo[16];
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
    FIELDINFO[15] = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo();
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
    FIELDINFO[1].fieldJavaName = "Type";
    FIELDINFO[1].fieldLocalName = "type";
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
    FIELDINFO[1].getterMethod = "getType";
    FIELDINFO[1].setterMethod = "setType";
    FIELDINFO[1].checkMethod = null;
    // Field 2
    FIELDINFO[2].defaultValue = null;
    FIELDINFO[2].fieldJavaName = "Reason";
    FIELDINFO[2].fieldLocalName = "reason";
    FIELDINFO[2].fieldModel = 1;
    FIELDINFO[2].fieldUri = "";
    FIELDINFO[2].isSoapArray = false;
    FIELDINFO[2].maxOccurs = 1;
    FIELDINFO[2].minOccurs = 0;
    FIELDINFO[2].nillable = true;
    FIELDINFO[2].soapArrayDimensions = 0;
    FIELDINFO[2].soapArrayItemTypeJavaName = null;
    FIELDINFO[2].soapArrayItemTypeLocalName = null;
    FIELDINFO[2].soapArrayItemTypeUri = null;
    FIELDINFO[2].typeJavaName = "java.lang.String";
    FIELDINFO[2].typeLocalName = "string";
    FIELDINFO[2].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[2].getterMethod = "getReason";
    FIELDINFO[2].setterMethod = "setReason";
    FIELDINFO[2].checkMethod = null;
    // Field 3
    FIELDINFO[3].defaultValue = null;
    FIELDINFO[3].fieldJavaName = "StartTime";
    FIELDINFO[3].fieldLocalName = "startTime";
    FIELDINFO[3].fieldModel = 1;
    FIELDINFO[3].fieldUri = "";
    FIELDINFO[3].isSoapArray = false;
    FIELDINFO[3].maxOccurs = 1;
    FIELDINFO[3].minOccurs = 0;
    FIELDINFO[3].nillable = true;
    FIELDINFO[3].soapArrayDimensions = 0;
    FIELDINFO[3].soapArrayItemTypeJavaName = null;
    FIELDINFO[3].soapArrayItemTypeLocalName = null;
    FIELDINFO[3].soapArrayItemTypeUri = null;
    FIELDINFO[3].typeJavaName = "java.lang.String";
    FIELDINFO[3].typeLocalName = "string";
    FIELDINFO[3].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[3].getterMethod = "getStartTime";
    FIELDINFO[3].setterMethod = "setStartTime";
    FIELDINFO[3].checkMethod = null;
    // Field 4
    FIELDINFO[4].defaultValue = null;
    FIELDINFO[4].fieldJavaName = "Duration";
    FIELDINFO[4].fieldLocalName = "duration";
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
    FIELDINFO[4].getterMethod = "getDuration";
    FIELDINFO[4].setterMethod = "setDuration";
    FIELDINFO[4].checkMethod = null;
    // Field 5
    FIELDINFO[5].defaultValue = null;
    FIELDINFO[5].fieldJavaName = "CpuTime";
    FIELDINFO[5].fieldLocalName = "cpuTime";
    FIELDINFO[5].fieldModel = 1;
    FIELDINFO[5].fieldUri = "";
    FIELDINFO[5].isSoapArray = false;
    FIELDINFO[5].maxOccurs = 1;
    FIELDINFO[5].minOccurs = 1;
    FIELDINFO[5].nillable = false;
    FIELDINFO[5].soapArrayDimensions = 0;
    FIELDINFO[5].soapArrayItemTypeJavaName = null;
    FIELDINFO[5].soapArrayItemTypeLocalName = null;
    FIELDINFO[5].soapArrayItemTypeUri = null;
    FIELDINFO[5].typeJavaName = "int";
    FIELDINFO[5].typeLocalName = "int";
    FIELDINFO[5].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[5].getterMethod = "getCpuTime";
    FIELDINFO[5].setterMethod = "setCpuTime";
    FIELDINFO[5].checkMethod = null;
    // Field 6
    FIELDINFO[6].defaultValue = null;
    FIELDINFO[6].fieldJavaName = "ObjBytesBefore";
    FIELDINFO[6].fieldLocalName = "objBytesBefore";
    FIELDINFO[6].fieldModel = 1;
    FIELDINFO[6].fieldUri = "";
    FIELDINFO[6].isSoapArray = false;
    FIELDINFO[6].maxOccurs = 1;
    FIELDINFO[6].minOccurs = 1;
    FIELDINFO[6].nillable = false;
    FIELDINFO[6].soapArrayDimensions = 0;
    FIELDINFO[6].soapArrayItemTypeJavaName = null;
    FIELDINFO[6].soapArrayItemTypeLocalName = null;
    FIELDINFO[6].soapArrayItemTypeUri = null;
    FIELDINFO[6].typeJavaName = "long";
    FIELDINFO[6].typeLocalName = "long";
    FIELDINFO[6].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[6].getterMethod = "getObjBytesBefore";
    FIELDINFO[6].setterMethod = "setObjBytesBefore";
    FIELDINFO[6].checkMethod = null;
    // Field 7
    FIELDINFO[7].defaultValue = null;
    FIELDINFO[7].fieldJavaName = "ObjBytesAfter";
    FIELDINFO[7].fieldLocalName = "objBytesAfter";
    FIELDINFO[7].fieldModel = 1;
    FIELDINFO[7].fieldUri = "";
    FIELDINFO[7].isSoapArray = false;
    FIELDINFO[7].maxOccurs = 1;
    FIELDINFO[7].minOccurs = 1;
    FIELDINFO[7].nillable = false;
    FIELDINFO[7].soapArrayDimensions = 0;
    FIELDINFO[7].soapArrayItemTypeJavaName = null;
    FIELDINFO[7].soapArrayItemTypeLocalName = null;
    FIELDINFO[7].soapArrayItemTypeUri = null;
    FIELDINFO[7].typeJavaName = "long";
    FIELDINFO[7].typeLocalName = "long";
    FIELDINFO[7].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[7].getterMethod = "getObjBytesAfter";
    FIELDINFO[7].setterMethod = "setObjBytesAfter";
    FIELDINFO[7].checkMethod = null;
    // Field 8
    FIELDINFO[8].defaultValue = null;
    FIELDINFO[8].fieldJavaName = "ObjBytesFreed";
    FIELDINFO[8].fieldLocalName = "objBytesFreed";
    FIELDINFO[8].fieldModel = 1;
    FIELDINFO[8].fieldUri = "";
    FIELDINFO[8].isSoapArray = false;
    FIELDINFO[8].maxOccurs = 1;
    FIELDINFO[8].minOccurs = 1;
    FIELDINFO[8].nillable = false;
    FIELDINFO[8].soapArrayDimensions = 0;
    FIELDINFO[8].soapArrayItemTypeJavaName = null;
    FIELDINFO[8].soapArrayItemTypeLocalName = null;
    FIELDINFO[8].soapArrayItemTypeUri = null;
    FIELDINFO[8].typeJavaName = "long";
    FIELDINFO[8].typeLocalName = "long";
    FIELDINFO[8].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[8].getterMethod = "getObjBytesFreed";
    FIELDINFO[8].setterMethod = "setObjBytesFreed";
    FIELDINFO[8].checkMethod = null;
    // Field 9
    FIELDINFO[9].defaultValue = null;
    FIELDINFO[9].fieldJavaName = "ClsBytesBefore";
    FIELDINFO[9].fieldLocalName = "clsBytesBefore";
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
    FIELDINFO[9].typeJavaName = "long";
    FIELDINFO[9].typeLocalName = "long";
    FIELDINFO[9].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[9].getterMethod = "getClsBytesBefore";
    FIELDINFO[9].setterMethod = "setClsBytesBefore";
    FIELDINFO[9].checkMethod = null;
    // Field 10
    FIELDINFO[10].defaultValue = null;
    FIELDINFO[10].fieldJavaName = "ClsBytesAfter";
    FIELDINFO[10].fieldLocalName = "clsBytesAfter";
    FIELDINFO[10].fieldModel = 1;
    FIELDINFO[10].fieldUri = "";
    FIELDINFO[10].isSoapArray = false;
    FIELDINFO[10].maxOccurs = 1;
    FIELDINFO[10].minOccurs = 1;
    FIELDINFO[10].nillable = false;
    FIELDINFO[10].soapArrayDimensions = 0;
    FIELDINFO[10].soapArrayItemTypeJavaName = null;
    FIELDINFO[10].soapArrayItemTypeLocalName = null;
    FIELDINFO[10].soapArrayItemTypeUri = null;
    FIELDINFO[10].typeJavaName = "long";
    FIELDINFO[10].typeLocalName = "long";
    FIELDINFO[10].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[10].getterMethod = "getClsBytesAfter";
    FIELDINFO[10].setterMethod = "setClsBytesAfter";
    FIELDINFO[10].checkMethod = null;
    // Field 11
    FIELDINFO[11].defaultValue = null;
    FIELDINFO[11].fieldJavaName = "ClsBytesFreed";
    FIELDINFO[11].fieldLocalName = "clsBytesFreed";
    FIELDINFO[11].fieldModel = 1;
    FIELDINFO[11].fieldUri = "";
    FIELDINFO[11].isSoapArray = false;
    FIELDINFO[11].maxOccurs = 1;
    FIELDINFO[11].minOccurs = 1;
    FIELDINFO[11].nillable = false;
    FIELDINFO[11].soapArrayDimensions = 0;
    FIELDINFO[11].soapArrayItemTypeJavaName = null;
    FIELDINFO[11].soapArrayItemTypeLocalName = null;
    FIELDINFO[11].soapArrayItemTypeUri = null;
    FIELDINFO[11].typeJavaName = "long";
    FIELDINFO[11].typeLocalName = "long";
    FIELDINFO[11].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[11].getterMethod = "getClsBytesFreed";
    FIELDINFO[11].setterMethod = "setClsBytesFreed";
    FIELDINFO[11].checkMethod = null;
    // Field 12
    FIELDINFO[12].defaultValue = null;
    FIELDINFO[12].fieldJavaName = "HeapSize";
    FIELDINFO[12].fieldLocalName = "heapSize";
    FIELDINFO[12].fieldModel = 1;
    FIELDINFO[12].fieldUri = "";
    FIELDINFO[12].isSoapArray = false;
    FIELDINFO[12].maxOccurs = 1;
    FIELDINFO[12].minOccurs = 1;
    FIELDINFO[12].nillable = false;
    FIELDINFO[12].soapArrayDimensions = 0;
    FIELDINFO[12].soapArrayItemTypeJavaName = null;
    FIELDINFO[12].soapArrayItemTypeLocalName = null;
    FIELDINFO[12].soapArrayItemTypeUri = null;
    FIELDINFO[12].typeJavaName = "long";
    FIELDINFO[12].typeLocalName = "long";
    FIELDINFO[12].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[12].getterMethod = "getHeapSize";
    FIELDINFO[12].setterMethod = "setHeapSize";
    FIELDINFO[12].checkMethod = null;
    // Field 13
    FIELDINFO[13].defaultValue = null;
    FIELDINFO[13].fieldJavaName = "UnloadedClasses";
    FIELDINFO[13].fieldLocalName = "unloadedClasses";
    FIELDINFO[13].fieldModel = 1;
    FIELDINFO[13].fieldUri = "";
    FIELDINFO[13].isSoapArray = false;
    FIELDINFO[13].maxOccurs = 1;
    FIELDINFO[13].minOccurs = 1;
    FIELDINFO[13].nillable = false;
    FIELDINFO[13].soapArrayDimensions = 0;
    FIELDINFO[13].soapArrayItemTypeJavaName = null;
    FIELDINFO[13].soapArrayItemTypeLocalName = null;
    FIELDINFO[13].soapArrayItemTypeUri = null;
    FIELDINFO[13].typeJavaName = "int";
    FIELDINFO[13].typeLocalName = "int";
    FIELDINFO[13].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[13].getterMethod = "getUnloadedClasses";
    FIELDINFO[13].setterMethod = "setUnloadedClasses";
    FIELDINFO[13].checkMethod = null;
    // Field 14
    FIELDINFO[14].defaultValue = null;
    FIELDINFO[14].fieldJavaName = "PageFaults";
    FIELDINFO[14].fieldLocalName = "pageFaults";
    FIELDINFO[14].fieldModel = 1;
    FIELDINFO[14].fieldUri = "";
    FIELDINFO[14].isSoapArray = false;
    FIELDINFO[14].maxOccurs = 1;
    FIELDINFO[14].minOccurs = 1;
    FIELDINFO[14].nillable = false;
    FIELDINFO[14].soapArrayDimensions = 0;
    FIELDINFO[14].soapArrayItemTypeJavaName = null;
    FIELDINFO[14].soapArrayItemTypeLocalName = null;
    FIELDINFO[14].soapArrayItemTypeUri = null;
    FIELDINFO[14].typeJavaName = "long";
    FIELDINFO[14].typeLocalName = "long";
    FIELDINFO[14].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[14].getterMethod = "getPageFaults";
    FIELDINFO[14].setterMethod = "setPageFaults";
    FIELDINFO[14].checkMethod = null;
    // Field 15
    FIELDINFO[15].defaultValue = null;
    FIELDINFO[15].fieldJavaName = "Dispstatus";
    FIELDINFO[15].fieldLocalName = "dispstatus";
    FIELDINFO[15].fieldModel = 1;
    FIELDINFO[15].fieldUri = "";
    FIELDINFO[15].isSoapArray = false;
    FIELDINFO[15].maxOccurs = 1;
    FIELDINFO[15].minOccurs = 1;
    FIELDINFO[15].nillable = false;
    FIELDINFO[15].soapArrayDimensions = 0;
    FIELDINFO[15].soapArrayItemTypeJavaName = null;
    FIELDINFO[15].soapArrayItemTypeLocalName = null;
    FIELDINFO[15].soapArrayItemTypeUri = null;
    FIELDINFO[15].typeJavaName = "com.sap.sapcontrol.client.types.STATECOLOR";
    FIELDINFO[15].typeLocalName = "STATE-COLOR";
    FIELDINFO[15].typeUri = "urn:SAPControl";
    FIELDINFO[15].getterMethod = "getDispstatus";
    FIELDINFO[15].setterMethod = "setDispstatus";
    FIELDINFO[15].checkMethod = null;
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
