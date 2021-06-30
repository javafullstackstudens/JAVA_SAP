﻿/*
 * Generated by SAP SchemaToJava Generator NW05 on Tue Feb 22 14:02:04 EET 2005
 * Copyright (c) 2002 by SAP Labs Sofia AG.
 * url: http://www.saplabs.bg
 * All rights reserved.
 */
package com.sap.engine.services.webservices.espbase.configuration;

/**
 * Schema complexType Java representation.
 * Represents type {http://www.sap.com/webas/710/ws/configuration-descriptor}Variant
 */
public  class Variant implements java.io.Serializable,java.lang.Cloneable {

  // Attribute field for attribute {}Name
  private java.lang.String _a_Name;
  /**
   * Set method for attribute {}Name
   */
  public void setName(java.lang.String _Name) {
    this._a_Name = _Name;
  }
  /**
   * Get method for attribute {}Name
   */
  public java.lang.String getName() {
    return _a_Name;
  }

  // Element field for element {}InterfaceData
  private com.sap.engine.services.webservices.espbase.configuration.InterfaceData _f_InterfaceData;
  /**
   * Set method for element {}InterfaceData
   */
  public void setInterfaceData(com.sap.engine.services.webservices.espbase.configuration.InterfaceData _InterfaceData) {
    this._f_InterfaceData = _InterfaceData;
  }
  /**
   * Get method for element {}InterfaceData
   */
  public com.sap.engine.services.webservices.espbase.configuration.InterfaceData getInterfaceData() {
    return this._f_InterfaceData;
  }

  /**
   * Equals method implementation.
   */
  public boolean equals(Object object) {
    if (object == null) return false;
    if (!(object instanceof Variant)) return false;
    Variant typed = (Variant) object;
    if (this._a_Name != null) {
      if (typed._a_Name == null) return false;
      if (!this._a_Name.equals(typed._a_Name)) return false;
    } else {
      if (typed._a_Name != null) return false;
    }
    if (this._f_InterfaceData != null) {
      if (typed._f_InterfaceData == null) return false;
      if (!this._f_InterfaceData.equals(typed._f_InterfaceData)) return false;
    } else {
      if (typed._f_InterfaceData != null) return false;
    }
    return true;
  }

  /**
   * Hashcode method implementation.
   */
  public int hashCode() {
    int result = 0;
    if (this._a_Name != null) {
      result+= this._a_Name.hashCode();
    }
    if (this._f_InterfaceData != null) {
      result+= this._f_InterfaceData.hashCode();
    }
    return result;
  }
}