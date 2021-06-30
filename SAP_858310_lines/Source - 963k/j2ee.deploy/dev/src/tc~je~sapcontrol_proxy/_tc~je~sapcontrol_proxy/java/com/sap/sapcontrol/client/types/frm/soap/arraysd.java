﻿/*
 * Generated by SAP SchemaToJava Generator NW05 on Mon May 29 10:14:51 EEST 2006
 * Copyright (c) 2002 by SAP Labs Sofia AG.
 * url: http://www.saplabs.bg
 * All rights reserved.
 */
package com.sap.sapcontrol.client.types.frm.soap;

/**
 * Schema complexType Java representation.
 * Represents type {http://schemas.xmlsoap.org/soap/encoding/}Array
 */
public  class ArraySD extends com.sap.engine.services.webservices.jaxrpc.encoding.GeneratedComplexType {

  public java.lang.String _d_originalUri() {
    return "http://schemas.xmlsoap.org/soap/encoding/";
  }

  public java.lang.String _d_originalLocalName() {
    return "Array";
  }

  private static com.sap.engine.services.webservices.jaxrpc.encoding.AttributeInfo[] ATTRIBUTEINFO;

  private synchronized static void initAttribs() {
    // Creating attribute fields
    if (ATTRIBUTEINFO != null) return;
    ATTRIBUTEINFO = new com.sap.engine.services.webservices.jaxrpc.encoding.AttributeInfo[4];
    ATTRIBUTEINFO[0] = new com.sap.engine.services.webservices.jaxrpc.encoding.AttributeInfo();
    ATTRIBUTEINFO[1] = new com.sap.engine.services.webservices.jaxrpc.encoding.AttributeInfo();
    ATTRIBUTEINFO[2] = new com.sap.engine.services.webservices.jaxrpc.encoding.AttributeInfo();
    ATTRIBUTEINFO[3] = new com.sap.engine.services.webservices.jaxrpc.encoding.AttributeInfo();
    // Attribute 0
    ATTRIBUTEINFO[0].fieldLocalName = "arrayType";
    ATTRIBUTEINFO[0].fieldUri = "http://schemas.xmlsoap.org/soap/encoding/";
    ATTRIBUTEINFO[0].fieldJavaName = "ArrayType";
    ATTRIBUTEINFO[0].typeName = "string";
    ATTRIBUTEINFO[0].typeUri = "http://www.w3.org/2001/XMLSchema";
    ATTRIBUTEINFO[0].typeJavaName = "java.lang.String";
    ATTRIBUTEINFO[0].defaultValue = null;
    ATTRIBUTEINFO[0].required = false;
    ATTRIBUTEINFO[0].setterMethod = "setArrayType";
    ATTRIBUTEINFO[0].getterMethod = "getArrayType";
    ATTRIBUTEINFO[0].checkMethod = null;
    // Attribute 1
    ATTRIBUTEINFO[1].fieldLocalName = "offset";
    ATTRIBUTEINFO[1].fieldUri = "http://schemas.xmlsoap.org/soap/encoding/";
    ATTRIBUTEINFO[1].fieldJavaName = "Offset";
    ATTRIBUTEINFO[1].typeName = "arrayCoordinate";
    ATTRIBUTEINFO[1].typeUri = "http://schemas.xmlsoap.org/soap/encoding/";
    ATTRIBUTEINFO[1].typeJavaName = "java.lang.String";
    ATTRIBUTEINFO[1].defaultValue = null;
    ATTRIBUTEINFO[1].required = false;
    ATTRIBUTEINFO[1].setterMethod = "setOffset";
    ATTRIBUTEINFO[1].getterMethod = "getOffset";
    ATTRIBUTEINFO[1].checkMethod = null;
    // Attribute 2
    ATTRIBUTEINFO[2].fieldLocalName = "id";
    ATTRIBUTEINFO[2].fieldUri = "http://schemas.xmlsoap.org/soap/encoding/";
    ATTRIBUTEINFO[2].fieldJavaName = "Id";
    ATTRIBUTEINFO[2].typeName = "ID";
    ATTRIBUTEINFO[2].typeUri = "http://www.w3.org/2001/XMLSchema";
    ATTRIBUTEINFO[2].typeJavaName = "java.lang.String";
    ATTRIBUTEINFO[2].defaultValue = null;
    ATTRIBUTEINFO[2].required = false;
    ATTRIBUTEINFO[2].setterMethod = "setId";
    ATTRIBUTEINFO[2].getterMethod = "getId";
    ATTRIBUTEINFO[2].checkMethod = null;
    // Attribute 3
    ATTRIBUTEINFO[3].fieldLocalName = "href";
    ATTRIBUTEINFO[3].fieldUri = "http://schemas.xmlsoap.org/soap/encoding/";
    ATTRIBUTEINFO[3].fieldJavaName = "Href";
    ATTRIBUTEINFO[3].typeName = "anyURI";
    ATTRIBUTEINFO[3].typeUri = "http://www.w3.org/2001/XMLSchema";
    ATTRIBUTEINFO[3].typeJavaName = "java.net.URI";
    ATTRIBUTEINFO[3].defaultValue = null;
    ATTRIBUTEINFO[3].required = false;
    ATTRIBUTEINFO[3].setterMethod = "setHref";
    ATTRIBUTEINFO[3].getterMethod = "getHref";
    ATTRIBUTEINFO[3].checkMethod = null;
  }

  // Field information
  private static com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo[] FIELDINFO;

  private synchronized static void initFields() {
    // Creating fields
    if (FIELDINFO != null) return;
    FIELDINFO = new com.sap.engine.services.webservices.jaxrpc.encoding.FieldInfo[0];
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
