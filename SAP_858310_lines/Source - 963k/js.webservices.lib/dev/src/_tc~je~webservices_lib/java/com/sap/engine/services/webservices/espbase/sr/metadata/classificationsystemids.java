﻿/*
 * Generated by SAP SchemaToJava Generator NW05 on Tue Jun 12 14:57:45 EEST 2007
 * Copyright (c) 2002 by SAP Labs Sofia AG.
 * url: http://www.saplabs.bg
 * All rights reserved.
 */
package com.sap.engine.services.webservices.espbase.sr.metadata;

/**
 * Schema complexType Java representation.
 * Represents type {http://www.sap.com/webas/2006/11/sr/metadata}ClassificationSystemIds
 */
public  class ClassificationSystemIds implements java.io.Serializable {

  private static final long serialVersionUID = 3319780061198681033L;

  // Element field for element {http://www.sap.com/webas/2006/11/sr/metadata}qname
  private java.util.ArrayList _f_Qname = new java.util.ArrayList();
  /**
   * Set method for element {http://www.sap.com/webas/2006/11/sr/metadata}qname
   */
  public void setQname(javax.xml.namespace.QName[] _Qname) {
    this._f_Qname.clear();
    if (_Qname != null) {
      for (int i=0; i<_Qname.length; i++) {
        if (_Qname[i] != null)
          this._f_Qname.add(_Qname[i]);
      }
    }
  }
  /**
   * Get method for element {http://www.sap.com/webas/2006/11/sr/metadata}qname
   */
  public javax.xml.namespace.QName[] getQname() {
    javax.xml.namespace.QName[] result = new javax.xml.namespace.QName[_f_Qname.size()];
    _f_Qname.toArray(result);
    return result;
  }

  /**
   * Equals method implementation.
   */
  public boolean equals(Object object) {
    if (object == null) return false;
    if (!(object instanceof ClassificationSystemIds)) return false;
    ClassificationSystemIds typed = (ClassificationSystemIds) object;
    javax.xml.namespace.QName[] _f_Qname1 = this.getQname();
    javax.xml.namespace.QName[] _f_Qname2 = typed.getQname();
    if (_f_Qname1 != null) {
      if (_f_Qname2 == null) return false;
      if (_f_Qname1.length != _f_Qname2.length) return false;
      for (int i1 = 0; i1 < _f_Qname1.length ; i1++) {
        if (_f_Qname1[i1] != null) {
          if (_f_Qname2[i1] == null) return false;
          if (!_f_Qname1[i1].equals(_f_Qname2[i1])) return false;
        } else {
          if (_f_Qname2[i1] != null) return false;
        }
      }
    } else {
      if (_f_Qname2 != null) return false;
    }
    return true;
  }

  /**
   * Hashcode method implementation.
   */
  public int hashCode() {
    int result = 0;
    javax.xml.namespace.QName[] _f_Qname1 = this.getQname();
    if (_f_Qname1 != null) {
      for (int i1 = 0; i1 < _f_Qname1.length ; i1++) {
        if (_f_Qname1[i1] != null) {
          result+= _f_Qname1[i1].hashCode();
        }
      }
    }
    return result;
  }
}
