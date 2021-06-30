﻿/*
 * Generated by SAP SchemaToJava Generator NW05 on Mon May 29 10:14:50 EEST 2006
 * Copyright (c) 2002 by SAP Labs Sofia AG.
 * url: http://www.saplabs.bg
 * All rights reserved.
 */
package com.sap.sapcontrol.client.types;

/**
 * Schema complexType Java representation.
 * Represents type of namespace {urn:SAPControl} anonymous with xpath [/definitions/types/schema/element[28]/complexType]
 */
public  class ReadDeveloperTraceResponse implements java.io.Serializable {

  // Element field for element {}name
  private java.lang.String _f_Name;
  /**
   * Set method for element {}name
   */
  public void setName(java.lang.String _Name) {
    this._f_Name = _Name;
  }
  /**
   * Get method for element {}name
   */
  public java.lang.String getName() {
    return this._f_Name;
  }

  // Element field for element {}lines
  private com.sap.sapcontrol.client.types.ArrayOfString _f_Lines;
  /**
   * Set method for element {}lines
   */
  public void setLines(com.sap.sapcontrol.client.types.ArrayOfString _Lines) {
    this._f_Lines = _Lines;
  }
  /**
   * Get method for element {}lines
   */
  public com.sap.sapcontrol.client.types.ArrayOfString getLines() {
    return this._f_Lines;
  }

  /**
   * Equals method implementation.
   */
  public boolean equals(Object object) {
    if (object == null) return false;
    if (!(object instanceof ReadDeveloperTraceResponse)) return false;
    ReadDeveloperTraceResponse typed = (ReadDeveloperTraceResponse) object;
    if (this._f_Name != null) {
      if (typed._f_Name == null) return false;
      if (!this._f_Name.equals(typed._f_Name)) return false;
    } else {
      if (typed._f_Name != null) return false;
    }
    if (this._f_Lines != null) {
      if (typed._f_Lines == null) return false;
      if (!this._f_Lines.equals(typed._f_Lines)) return false;
    } else {
      if (typed._f_Lines != null) return false;
    }
    return true;
  }

  /**
   * Hashcode method implementation.
   */
  public int hashCode() {
    int result = 0;
    if (this._f_Name != null) {
      result+= this._f_Name.hashCode();
    }
    if (this._f_Lines != null) {
      result+= this._f_Lines.hashCode();
    }
    return result;
  }
}