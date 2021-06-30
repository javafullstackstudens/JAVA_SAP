﻿/*
 * Generated by SAP SchemaToJava Generator NW05 on Tue Oct 23 15:26:07 EEST 2007
 * Copyright (c) 2002 by SAP Labs Sofia AG.
 * url: http://www.saplabs.bg
 * All rights reserved.
 */
package com.sap.engine.services.webservices.espbase.configuration.p_set;

/**
 * Schema complexType Java representation.
 * Represents type {http://xml.sap.com/2006/11/esi/conf/feat/}subjectType
 */
public  class SubjectType implements java.io.Serializable,com.sap.engine.services.webservices.jaxrpc.encoding.IdenticObject {

  private static final long serialVersionUID = 9012951644730192590L;

  // Attribute field for attribute {}name
  private java.lang.String _a_Name;
  /**
   * Set method for attribute {}name
   */
  public void setName(java.lang.String _Name) {
    this._a_Name = _Name;
  }
  /**
   * Get method for attribute {}name
   */
  public java.lang.String getName() {
    return _a_Name;
  }

  // Element field for element {http://xml.sap.com/2006/11/esi/conf/feat/}displayName
  private java.lang.String _f_DisplayName;
  /**
   * Set method for element {http://xml.sap.com/2006/11/esi/conf/feat/}displayName
   */
  public void setDisplayName(java.lang.String _DisplayName) {
    this._f_DisplayName = _DisplayName;
  }
  /**
   * Get method for element {http://xml.sap.com/2006/11/esi/conf/feat/}displayName
   */
  public java.lang.String getDisplayName() {
    return this._f_DisplayName;
  }

  // Element field for element {http://xml.sap.com/2006/11/esi/conf/feat/}description
  private java.lang.String _f_Description;
  /**
   * Set method for element {http://xml.sap.com/2006/11/esi/conf/feat/}description
   */
  public void setDescription(java.lang.String _Description) {
    this._f_Description = _Description;
  }
  /**
   * Get method for element {http://xml.sap.com/2006/11/esi/conf/feat/}description
   */
  public java.lang.String getDescription() {
    return this._f_Description;
  }

  // Element field for element {http://xml.sap.com/2006/11/esi/conf/feat/}feature
  private java.util.ArrayList _f_Feature = new java.util.ArrayList();
  /**
   * Set method for element {http://xml.sap.com/2006/11/esi/conf/feat/}feature
   */
  public void setFeature(com.sap.engine.services.webservices.espbase.configuration.p_set.FeatureType[] _Feature) {
    this._f_Feature.clear();
    if (_Feature != null) {
      for (int i=0; i<_Feature.length; i++) {
        if (_Feature[i] != null)
          this._f_Feature.add(_Feature[i]);
      }
    }
  }
  /**
   * Get method for element {http://xml.sap.com/2006/11/esi/conf/feat/}feature
   */
  public com.sap.engine.services.webservices.espbase.configuration.p_set.FeatureType[] getFeature() {
    com.sap.engine.services.webservices.espbase.configuration.p_set.FeatureType[] result = new com.sap.engine.services.webservices.espbase.configuration.p_set.FeatureType[_f_Feature.size()];
    _f_Feature.toArray(result);
    return result;
  }

  /**
   * Equals method implementation.
   */
  public boolean equals(Object object) {
    if (object == null) return false;
    if (!(object instanceof SubjectType)) return false;
    SubjectType typed = (SubjectType) object;
    if (this._a_Name != null) {
      if (typed._a_Name == null) return false;
      if (!this._a_Name.equals(typed._a_Name)) return false;
    } else {
      if (typed._a_Name != null) return false;
    }
    if (this._f_DisplayName != null) {
      if (typed._f_DisplayName == null) return false;
      if (!this._f_DisplayName.equals(typed._f_DisplayName)) return false;
    } else {
      if (typed._f_DisplayName != null) return false;
    }
    if (this._f_Description != null) {
      if (typed._f_Description == null) return false;
      if (!this._f_Description.equals(typed._f_Description)) return false;
    } else {
      if (typed._f_Description != null) return false;
    }
    com.sap.engine.services.webservices.espbase.configuration.p_set.FeatureType[] _f_Feature1 = this.getFeature();
    com.sap.engine.services.webservices.espbase.configuration.p_set.FeatureType[] _f_Feature2 = typed.getFeature();
    if (_f_Feature1 != null) {
      if (_f_Feature2 == null) return false;
      if (_f_Feature1.length != _f_Feature2.length) return false;
      for (int i1 = 0; i1 < _f_Feature1.length ; i1++) {
        if (_f_Feature1[i1] != null) {
          if (_f_Feature2[i1] == null) return false;
          if (!_f_Feature1[i1].equals(_f_Feature2[i1])) return false;
        } else {
          if (_f_Feature2[i1] != null) return false;
        }
      }
    } else {
      if (_f_Feature2 != null) return false;
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
    if (this._f_DisplayName != null) {
      result+= this._f_DisplayName.hashCode();
    }
    if (this._f_Description != null) {
      result+= this._f_Description.hashCode();
    }
    com.sap.engine.services.webservices.espbase.configuration.p_set.FeatureType[] _f_Feature1 = this.getFeature();
    if (_f_Feature1 != null) {
      for (int i1 = 0; i1 < _f_Feature1.length ; i1++) {
        if (_f_Feature1[i1] != null) {
          result+= _f_Feature1[i1].hashCode();
        }
      }
    }
    return result;
  }

  public java.lang.String get__ID() {
    return java.lang.String.valueOf(super.hashCode());
  }
  
  public void addFeature(com.sap.engine.services.webservices.espbase.configuration.p_set.FeatureType _Feature) {
    if (_Feature != null) {
      this._f_Feature.add(_Feature);
    }
  }
  
  /**
   * Clones this instance, with exception of the features.
   */
  public SubjectType shadowCopy() {
    SubjectType _new = new SubjectType();
    _new.setDescription(this.getDescription());
    _new.setDisplayName(this.getDisplayName());
    _new.setName(this.getName());
    return _new;
  }
  /**
   * Returns feature with 'name' equal to <code>ns</code>, or null if such feature is not found.
   */
  public FeatureType getFeatureByNS(String ns) {
    for(int i = 0; i < this._f_Feature.size(); i++) {
      FeatureType f = (FeatureType) this._f_Feature.get(i);
      if (f.getName().equals(ns)) {
        return f;
      }
    }
    return null;
  }
}