/*
 * Generated by SAP SchemaToJava Generator NW05 on Mon May 29 10:14:50 EEST 2006
 * Copyright (c) 2002 by SAP Labs Sofia AG.
 * url: http://www.saplabs.bg
 * All rights reserved.
 */
package com.sap.sapcontrol.client.types;

/**
 * Schema complexType Java representation.
 * Represents type {urn:SAPControl}InstanceProperty
 */
public  class InstanceProperty implements java.io.Serializable {

  // Element field for element {}property
  private java.lang.String _f_Property;
  /**
   * Set method for element {}property
   */
  public void setProperty(java.lang.String _Property) {
    this._f_Property = _Property;
  }
  /**
   * Get method for element {}property
   */
  public java.lang.String getProperty() {
    return this._f_Property;
  }

  // Element field for element {}propertytype
  private java.lang.String _f_Propertytype;
  /**
   * Set method for element {}propertytype
   */
  public void setPropertytype(java.lang.String _Propertytype) {
    this._f_Propertytype = _Propertytype;
  }
  /**
   * Get method for element {}propertytype
   */
  public java.lang.String getPropertytype() {
    return this._f_Propertytype;
  }

  // Element field for element {}value
  private java.lang.String _f_Value;
  /**
   * Set method for element {}value
   */
  public void setValue(java.lang.String _Value) {
    this._f_Value = _Value;
  }
  /**
   * Get method for element {}value
   */
  public java.lang.String getValue() {
    return this._f_Value;
  }

  /**
   * Equals method implementation.
   */
  public boolean equals(Object object) {
    if (object == null) return false;
    if (!(object instanceof InstanceProperty)) return false;
    InstanceProperty typed = (InstanceProperty) object;
    if (this._f_Property != null) {
      if (typed._f_Property == null) return false;
      if (!this._f_Property.equals(typed._f_Property)) return false;
    } else {
      if (typed._f_Property != null) return false;
    }
    if (this._f_Propertytype != null) {
      if (typed._f_Propertytype == null) return false;
      if (!this._f_Propertytype.equals(typed._f_Propertytype)) return false;
    } else {
      if (typed._f_Propertytype != null) return false;
    }
    if (this._f_Value != null) {
      if (typed._f_Value == null) return false;
      if (!this._f_Value.equals(typed._f_Value)) return false;
    } else {
      if (typed._f_Value != null) return false;
    }
    return true;
  }

  /**
   * Hashcode method implementation.
   */
  public int hashCode() {
    int result = 0;
    if (this._f_Property != null) {
      result+= this._f_Property.hashCode();
    }
    if (this._f_Propertytype != null) {
      result+= this._f_Propertytype.hashCode();
    }
    if (this._f_Value != null) {
      result+= this._f_Value.hashCode();
    }
    return result;
  }
}
