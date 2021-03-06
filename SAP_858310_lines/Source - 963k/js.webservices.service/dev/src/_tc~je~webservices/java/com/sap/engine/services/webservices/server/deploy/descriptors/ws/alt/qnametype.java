/*
 * Generated by SAP SchemaToJava Generator NW05 on Mon Dec 17 16:05:26 EET 2007
 * Copyright (c) 2002 by SAP Labs Sofia AG.
 * url: http://www.saplabs.bg
 * All rights reserved.
 */
package com.sap.engine.services.webservices.server.deploy.descriptors.ws.alt;

/**
 * Schema complexType Java representation.
 * Represents type {http://www.sap.com/webas/710/ws/webservices-j2ee-engine-alt-descriptor}qNameType
 */
public  class QNameType implements java.io.Serializable {

  private static final long serialVersionUID = -4069906401395706892L;

  // Attribute field for attribute {}namespace
  private java.lang.String _a_Namespace;
  /**
   * Set method for attribute {}namespace
   */
  public void setNamespace(java.lang.String _Namespace) {
    this._a_Namespace = _Namespace;
  }
  /**
   * Get method for attribute {}namespace
   */
  public java.lang.String getNamespace() {
    return _a_Namespace;
  }

  // Simple content field
  private java.lang.String _f__value;
  /**
   * Set method for simple content.
   */
  public void set_value(java.lang.String __value) {
    this._f__value = __value;
  }
  /**
   * Get method for simple content.
   */
  public java.lang.String get_value() {
    return this._f__value;
  }

  /**
   * Equals method implementation.
   */
  public boolean equals(Object object) {
    if (object == null) return false;
    if (!(object instanceof QNameType)) return false;
    QNameType typed = (QNameType) object;
    if (this._a_Namespace != null) {
      if (typed._a_Namespace == null) return false;
      if (!this._a_Namespace.equals(typed._a_Namespace)) return false;
    } else {
      if (typed._a_Namespace != null) return false;
    }
    if (this._f__value != null) {
      if (typed._f__value == null) return false;
      if (!this._f__value.equals(typed._f__value)) return false;
    } else {
      if (typed._f__value != null) return false;
    }
    return true;
  }

  /**
   * Hashcode method implementation.
   */
  public int hashCode() {
    int result = 0;
    if (this._a_Namespace != null) {
      result+= this._a_Namespace.hashCode();
    }
    if (this._f__value != null) {
      result+= this._f__value.hashCode();
    }
    return result;
  }
}
