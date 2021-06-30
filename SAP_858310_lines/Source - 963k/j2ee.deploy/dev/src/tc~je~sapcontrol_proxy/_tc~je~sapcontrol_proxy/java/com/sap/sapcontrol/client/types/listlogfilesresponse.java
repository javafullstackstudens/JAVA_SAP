﻿/*
 * Generated by SAP SchemaToJava Generator NW05 on Mon May 29 10:14:50 EEST 2006
 * Copyright (c) 2002 by SAP Labs Sofia AG.
 * url: http://www.saplabs.bg
 * All rights reserved.
 */
package com.sap.sapcontrol.client.types;

/**
 * Schema complexType Java representation.
 * Represents type of namespace {urn:SAPControl} anonymous with xpath [/definitions/types/schema/element[44]/complexType]
 */
public  class ListLogFilesResponse implements java.io.Serializable {

  // Element field for element {}file
  private com.sap.sapcontrol.client.types.ArrayOfLogFile _f_File;
  /**
   * Set method for element {}file
   */
  public void setFile(com.sap.sapcontrol.client.types.ArrayOfLogFile _File) {
    this._f_File = _File;
  }
  /**
   * Get method for element {}file
   */
  public com.sap.sapcontrol.client.types.ArrayOfLogFile getFile() {
    return this._f_File;
  }

  /**
   * Equals method implementation.
   */
  public boolean equals(Object object) {
    if (object == null) return false;
    if (!(object instanceof ListLogFilesResponse)) return false;
    ListLogFilesResponse typed = (ListLogFilesResponse) object;
    if (this._f_File != null) {
      if (typed._f_File == null) return false;
      if (!this._f_File.equals(typed._f_File)) return false;
    } else {
      if (typed._f_File != null) return false;
    }
    return true;
  }

  /**
   * Hashcode method implementation.
   */
  public int hashCode() {
    int result = 0;
    if (this._f_File != null) {
      result+= this._f_File.hashCode();
    }
    return result;
  }
}
