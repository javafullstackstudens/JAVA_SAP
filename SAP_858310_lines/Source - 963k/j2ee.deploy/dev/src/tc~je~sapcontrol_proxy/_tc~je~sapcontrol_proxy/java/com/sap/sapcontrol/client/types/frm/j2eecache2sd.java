﻿/*
 * Generated by SAP SchemaToJava Generator NW05 on Mon May 29 10:14:51 EEST 2006
 * Copyright (c) 2002 by SAP Labs Sofia AG.
 * url: http://www.saplabs.bg
 * All rights reserved.
 */
package com.sap.sapcontrol.client.types.frm;

/**
 * Schema complexType Java representation.
 * Represents type {urn:SAPControl}J2EECache2
 */
public  class J2EECache2SD extends com.sap.engine.services.webservices.jaxrpc.encoding.GeneratedComplexType {

  public java.lang.String _d_originalUri() {
    return "urn:SAPControl";
  }

  public java.lang.String _d_originalLocalName() {
    return "J2EECache2";
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
    FIELDINFO = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo[19];
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
    FIELDINFO[16] = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo();
    FIELDINFO[17] = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo();
    FIELDINFO[18] = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo();
    // Field 0
    FIELDINFO[0].defaultValue = null;
    FIELDINFO[0].fieldJavaName = "Description";
    FIELDINFO[0].fieldLocalName = "description";
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
    FIELDINFO[0].getterMethod = "getDescription";
    FIELDINFO[0].setterMethod = "setDescription";
    FIELDINFO[0].checkMethod = null;
    // Field 1
    FIELDINFO[1].defaultValue = null;
    FIELDINFO[1].fieldJavaName = "Owner";
    FIELDINFO[1].fieldLocalName = "owner";
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
    FIELDINFO[1].getterMethod = "getOwner";
    FIELDINFO[1].setterMethod = "setOwner";
    FIELDINFO[1].checkMethod = null;
    // Field 2
    FIELDINFO[2].defaultValue = null;
    FIELDINFO[2].fieldJavaName = "Processname";
    FIELDINFO[2].fieldLocalName = "processname";
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
    FIELDINFO[2].getterMethod = "getProcessname";
    FIELDINFO[2].setterMethod = "setProcessname";
    FIELDINFO[2].checkMethod = null;
    // Field 3
    FIELDINFO[3].defaultValue = null;
    FIELDINFO[3].fieldJavaName = "Type";
    FIELDINFO[3].fieldLocalName = "type";
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
    FIELDINFO[3].getterMethod = "getType";
    FIELDINFO[3].setterMethod = "setType";
    FIELDINFO[3].checkMethod = null;
    // Field 4
    FIELDINFO[4].defaultValue = null;
    FIELDINFO[4].fieldJavaName = "Size";
    FIELDINFO[4].fieldLocalName = "size";
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
    FIELDINFO[4].typeJavaName = "long";
    FIELDINFO[4].typeLocalName = "long";
    FIELDINFO[4].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[4].getterMethod = "getSize";
    FIELDINFO[4].setterMethod = "setSize";
    FIELDINFO[4].checkMethod = null;
    // Field 5
    FIELDINFO[5].defaultValue = null;
    FIELDINFO[5].fieldJavaName = "AttrSize";
    FIELDINFO[5].fieldLocalName = "attrSize";
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
    FIELDINFO[5].typeJavaName = "long";
    FIELDINFO[5].typeLocalName = "long";
    FIELDINFO[5].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[5].getterMethod = "getAttrSize";
    FIELDINFO[5].setterMethod = "setAttrSize";
    FIELDINFO[5].checkMethod = null;
    // Field 6
    FIELDINFO[6].defaultValue = null;
    FIELDINFO[6].fieldJavaName = "KeysSize";
    FIELDINFO[6].fieldLocalName = "keysSize";
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
    FIELDINFO[6].getterMethod = "getKeysSize";
    FIELDINFO[6].setterMethod = "setKeysSize";
    FIELDINFO[6].checkMethod = null;
    // Field 7
    FIELDINFO[7].defaultValue = null;
    FIELDINFO[7].fieldJavaName = "CachedObjects";
    FIELDINFO[7].fieldLocalName = "cachedObjects";
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
    FIELDINFO[7].typeJavaName = "int";
    FIELDINFO[7].typeLocalName = "int";
    FIELDINFO[7].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[7].getterMethod = "getCachedObjects";
    FIELDINFO[7].setterMethod = "setCachedObjects";
    FIELDINFO[7].checkMethod = null;
    // Field 8
    FIELDINFO[8].defaultValue = null;
    FIELDINFO[8].fieldJavaName = "UsedObjects";
    FIELDINFO[8].fieldLocalName = "usedObjects";
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
    FIELDINFO[8].typeJavaName = "int";
    FIELDINFO[8].typeLocalName = "int";
    FIELDINFO[8].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[8].getterMethod = "getUsedObjects";
    FIELDINFO[8].setterMethod = "setUsedObjects";
    FIELDINFO[8].checkMethod = null;
    // Field 9
    FIELDINFO[9].defaultValue = null;
    FIELDINFO[9].fieldJavaName = "Puts";
    FIELDINFO[9].fieldLocalName = "puts";
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
    FIELDINFO[9].getterMethod = "getPuts";
    FIELDINFO[9].setterMethod = "setPuts";
    FIELDINFO[9].checkMethod = null;
    // Field 10
    FIELDINFO[10].defaultValue = null;
    FIELDINFO[10].fieldJavaName = "Gets";
    FIELDINFO[10].fieldLocalName = "gets";
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
    FIELDINFO[10].typeJavaName = "int";
    FIELDINFO[10].typeLocalName = "int";
    FIELDINFO[10].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[10].getterMethod = "getGets";
    FIELDINFO[10].setterMethod = "setGets";
    FIELDINFO[10].checkMethod = null;
    // Field 11
    FIELDINFO[11].defaultValue = null;
    FIELDINFO[11].fieldJavaName = "Hits";
    FIELDINFO[11].fieldLocalName = "hits";
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
    FIELDINFO[11].typeJavaName = "int";
    FIELDINFO[11].typeLocalName = "int";
    FIELDINFO[11].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[11].getterMethod = "getHits";
    FIELDINFO[11].setterMethod = "setHits";
    FIELDINFO[11].checkMethod = null;
    // Field 12
    FIELDINFO[12].defaultValue = null;
    FIELDINFO[12].fieldJavaName = "Changes";
    FIELDINFO[12].fieldLocalName = "changes";
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
    FIELDINFO[12].typeJavaName = "int";
    FIELDINFO[12].typeLocalName = "int";
    FIELDINFO[12].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[12].getterMethod = "getChanges";
    FIELDINFO[12].setterMethod = "setChanges";
    FIELDINFO[12].checkMethod = null;
    // Field 13
    FIELDINFO[13].defaultValue = null;
    FIELDINFO[13].fieldJavaName = "Removes";
    FIELDINFO[13].fieldLocalName = "removes";
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
    FIELDINFO[13].getterMethod = "getRemoves";
    FIELDINFO[13].setterMethod = "setRemoves";
    FIELDINFO[13].checkMethod = null;
    // Field 14
    FIELDINFO[14].defaultValue = null;
    FIELDINFO[14].fieldJavaName = "Evictions";
    FIELDINFO[14].fieldLocalName = "evictions";
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
    FIELDINFO[14].typeJavaName = "int";
    FIELDINFO[14].typeLocalName = "int";
    FIELDINFO[14].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[14].getterMethod = "getEvictions";
    FIELDINFO[14].setterMethod = "setEvictions";
    FIELDINFO[14].checkMethod = null;
    // Field 15
    FIELDINFO[15].defaultValue = null;
    FIELDINFO[15].fieldJavaName = "InstanceInvalidations";
    FIELDINFO[15].fieldLocalName = "instanceInvalidations";
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
    FIELDINFO[15].typeJavaName = "int";
    FIELDINFO[15].typeLocalName = "int";
    FIELDINFO[15].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[15].getterMethod = "getInstanceInvalidations";
    FIELDINFO[15].setterMethod = "setInstanceInvalidations";
    FIELDINFO[15].checkMethod = null;
    // Field 16
    FIELDINFO[16].defaultValue = null;
    FIELDINFO[16].fieldJavaName = "ClusterInvalidations";
    FIELDINFO[16].fieldLocalName = "clusterInvalidations";
    FIELDINFO[16].fieldModel = 1;
    FIELDINFO[16].fieldUri = "";
    FIELDINFO[16].isSoapArray = false;
    FIELDINFO[16].maxOccurs = 1;
    FIELDINFO[16].minOccurs = 1;
    FIELDINFO[16].nillable = false;
    FIELDINFO[16].soapArrayDimensions = 0;
    FIELDINFO[16].soapArrayItemTypeJavaName = null;
    FIELDINFO[16].soapArrayItemTypeLocalName = null;
    FIELDINFO[16].soapArrayItemTypeUri = null;
    FIELDINFO[16].typeJavaName = "int";
    FIELDINFO[16].typeLocalName = "int";
    FIELDINFO[16].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[16].getterMethod = "getClusterInvalidations";
    FIELDINFO[16].setterMethod = "setClusterInvalidations";
    FIELDINFO[16].checkMethod = null;
    // Field 17
    FIELDINFO[17].defaultValue = null;
    FIELDINFO[17].fieldJavaName = "UpdateTime";
    FIELDINFO[17].fieldLocalName = "updateTime";
    FIELDINFO[17].fieldModel = 1;
    FIELDINFO[17].fieldUri = "";
    FIELDINFO[17].isSoapArray = false;
    FIELDINFO[17].maxOccurs = 1;
    FIELDINFO[17].minOccurs = 0;
    FIELDINFO[17].nillable = true;
    FIELDINFO[17].soapArrayDimensions = 0;
    FIELDINFO[17].soapArrayItemTypeJavaName = null;
    FIELDINFO[17].soapArrayItemTypeLocalName = null;
    FIELDINFO[17].soapArrayItemTypeUri = null;
    FIELDINFO[17].typeJavaName = "java.lang.String";
    FIELDINFO[17].typeLocalName = "string";
    FIELDINFO[17].typeUri = "http://www.w3.org/2001/XMLSchema";
    FIELDINFO[17].getterMethod = "getUpdateTime";
    FIELDINFO[17].setterMethod = "setUpdateTime";
    FIELDINFO[17].checkMethod = null;
    // Field 18
    FIELDINFO[18].defaultValue = null;
    FIELDINFO[18].fieldJavaName = "Dispstatus";
    FIELDINFO[18].fieldLocalName = "dispstatus";
    FIELDINFO[18].fieldModel = 1;
    FIELDINFO[18].fieldUri = "";
    FIELDINFO[18].isSoapArray = false;
    FIELDINFO[18].maxOccurs = 1;
    FIELDINFO[18].minOccurs = 1;
    FIELDINFO[18].nillable = false;
    FIELDINFO[18].soapArrayDimensions = 0;
    FIELDINFO[18].soapArrayItemTypeJavaName = null;
    FIELDINFO[18].soapArrayItemTypeLocalName = null;
    FIELDINFO[18].soapArrayItemTypeUri = null;
    FIELDINFO[18].typeJavaName = "com.sap.sapcontrol.client.types.STATECOLOR";
    FIELDINFO[18].typeLocalName = "STATE-COLOR";
    FIELDINFO[18].typeUri = "urn:SAPControl";
    FIELDINFO[18].getterMethod = "getDispstatus";
    FIELDINFO[18].setterMethod = "setDispstatus";
    FIELDINFO[18].checkMethod = null;
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
