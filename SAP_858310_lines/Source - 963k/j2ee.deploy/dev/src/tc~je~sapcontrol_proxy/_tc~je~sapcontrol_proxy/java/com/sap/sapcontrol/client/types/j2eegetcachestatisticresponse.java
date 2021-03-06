/*
 * Generated by SAP SchemaToJava Generator NW05 on Mon May 29 10:14:50 EEST 2006
 * Copyright (c) 2002 by SAP Labs Sofia AG.
 * url: http://www.saplabs.bg
 * All rights reserved.
 */
package com.sap.sapcontrol.client.types;

/**
 * Schema complexType Java representation.
 * Represents type of namespace {urn:SAPControl} anonymous with xpath [/definitions/types/schema/element[66]/complexType]
 */
public  class J2EEGetCacheStatisticResponse implements java.io.Serializable {

  // Element field for element {}cache
  private com.sap.sapcontrol.client.types.ArrayOfJ2EECache _f_Cache;
  /**
   * Set method for element {}cache
   */
  public void setCache(com.sap.sapcontrol.client.types.ArrayOfJ2EECache _Cache) {
    this._f_Cache = _Cache;
  }
  /**
   * Get method for element {}cache
   */
  public com.sap.sapcontrol.client.types.ArrayOfJ2EECache getCache() {
    return this._f_Cache;
  }

  /**
   * Equals method implementation.
   */
  public boolean equals(Object object) {
    if (object == null) return false;
    if (!(object instanceof J2EEGetCacheStatisticResponse)) return false;
    J2EEGetCacheStatisticResponse typed = (J2EEGetCacheStatisticResponse) object;
    if (this._f_Cache != null) {
      if (typed._f_Cache == null) return false;
      if (!this._f_Cache.equals(typed._f_Cache)) return false;
    } else {
      if (typed._f_Cache != null) return false;
    }
    return true;
  }

  /**
   * Hashcode method implementation.
   */
  public int hashCode() {
    int result = 0;
    if (this._f_Cache != null) {
      result+= this._f_Cache.hashCode();
    }
    return result;
  }
}
