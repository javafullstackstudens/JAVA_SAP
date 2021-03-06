/*
 * Generated by SAP SchemaToJava Generator NW05 on Mon May 29 10:14:50 EEST 2006
 * Copyright (c) 2002 by SAP Labs Sofia AG.
 * url: http://www.saplabs.bg
 * All rights reserved.
 */
package com.sap.sapcontrol.client.types;

/**
 * Schema complexType Java representation.
 * Represents type {urn:SAPControl}ArrayOfJ2EEThread
 */
public  class ArrayOfJ2EEThread implements java.io.Serializable {

  // Element field for element {}item
  private java.util.ArrayList _f_Item = new java.util.ArrayList();
  /**
   * Set method for element {}item
   */
  public void setItem(com.sap.sapcontrol.client.types.J2EEThread[] _Item) {
    this._f_Item.clear();
    if (_Item != null) {
      for (int i=0; i<_Item.length; i++) {
          this._f_Item.add(_Item[i]);
      }
    }
  }
  /**
   * Get method for element {}item
   */
  public com.sap.sapcontrol.client.types.J2EEThread[] getItem() {
    com.sap.sapcontrol.client.types.J2EEThread[] result = new com.sap.sapcontrol.client.types.J2EEThread[_f_Item.size()];
    _f_Item.toArray(result);
    return result;
  }

  /**
   * Equals method implementation.
   */
  public boolean equals(Object object) {
    if (object == null) return false;
    if (!(object instanceof ArrayOfJ2EEThread)) return false;
    ArrayOfJ2EEThread typed = (ArrayOfJ2EEThread) object;
    com.sap.sapcontrol.client.types.J2EEThread[] _f_Item1 = this.getItem();
    com.sap.sapcontrol.client.types.J2EEThread[] _f_Item2 = typed.getItem();
    if (_f_Item1 != null) {
      if (_f_Item2 == null) return false;
      if (_f_Item1.length != _f_Item2.length) return false;
      for (int i1 = 0; i1 < _f_Item1.length ; i1++) {
        if (_f_Item1[i1] != null) {
          if (_f_Item2[i1] == null) return false;
          if (!_f_Item1[i1].equals(_f_Item2[i1])) return false;
        } else {
          if (_f_Item2[i1] != null) return false;
        }
      }
    } else {
      if (_f_Item2 != null) return false;
    }
    return true;
  }

  /**
   * Hashcode method implementation.
   */
  public int hashCode() {
    int result = 0;
    com.sap.sapcontrol.client.types.J2EEThread[] _f_Item1 = this.getItem();
    if (_f_Item1 != null) {
      for (int i1 = 0; i1 < _f_Item1.length ; i1++) {
        if (_f_Item1[i1] != null) {
          result+= _f_Item1[i1].hashCode();
        }
      }
    }
    return result;
  }
}
