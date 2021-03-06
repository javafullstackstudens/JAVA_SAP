/*
 * Generated by SAP SchemaToJava Generator NW05 on Thu May 12 14:13:36 EEST 2005
 * Copyright (c) 2002 by SAP Labs Sofia AG.
 * url: http://www.saplabs.bg
 * All rights reserved.
 */
package com.sap.engine.services.webservices.espbase.configuration;

/**
 * Schema complexType Java representation.
 * Represents type {http://www.sap.com/webas/710/ws/configuration-descriptor}InterfaceDefinition
 */
public  class InterfaceDefinition implements java.io.Serializable,java.lang.Cloneable {

  // Attribute field for attribute {}id
  private java.lang.String _a_Id;
  /**
   * Set method for attribute {}id
   */
  public void setId(java.lang.String _Id) {
    this._a_Id = _Id;
  }
  /**
   * Get method for attribute {}id
   */
  public java.lang.String getId() {
    return _a_Id;
  }

  // Attribute field for attribute {}interface-mapping-id
  private java.lang.String _a_InterfaceMappingId;
  /**
   * Set method for attribute {}interface-mapping-id
   */
  public void setInterfaceMappingId(java.lang.String _InterfaceMappingId) {
    this._a_InterfaceMappingId = _InterfaceMappingId;
  }
  /**
   * Get method for attribute {}interface-mapping-id
   */
  public java.lang.String getInterfaceMappingId() {
    return _a_InterfaceMappingId;
  }

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

  // Attribute field for attribute {}type
  private int _a_Type;
  /**
   * Set method for attribute {}type
   */
  public void setType(int _Type) {
    this._a_Type = _Type;
  }
  /**
   * Get method for attribute {}type
   */
  public int getType() {
    return _a_Type;
  }

  // Element field for element {}Variant
  private java.util.ArrayList _f_Variant = new java.util.ArrayList();
  /**
   * Set method for element {}Variant
   */
  public void setVariant(com.sap.engine.services.webservices.espbase.configuration.Variant[] _Variant) {
    this._f_Variant.clear();
    if (_Variant != null) {
      for (int i=0; i<_Variant.length; i++) {
        if (_Variant[i] != null)
          this._f_Variant.add(_Variant[i]);
      }
    }
  }
  /**
   * Get method for element {}Variant
   */
  public com.sap.engine.services.webservices.espbase.configuration.Variant[] getVariant() {
    com.sap.engine.services.webservices.espbase.configuration.Variant[] result = new com.sap.engine.services.webservices.espbase.configuration.Variant[_f_Variant.size()];
    _f_Variant.toArray(result);
    return result;
  }

  /**
   * Equals method implementation.
   */
  public boolean equals(Object object) {
    if (object == null) return false;
    if (!(object instanceof InterfaceDefinition)) return false;
    InterfaceDefinition typed = (InterfaceDefinition) object;
    if (this._a_Id != null) {
      if (typed._a_Id == null) return false;
      if (!this._a_Id.equals(typed._a_Id)) return false;
    } else {
      if (typed._a_Id != null) return false;
    }
    if (this._a_InterfaceMappingId != null) {
      if (typed._a_InterfaceMappingId == null) return false;
      if (!this._a_InterfaceMappingId.equals(typed._a_InterfaceMappingId)) return false;
    } else {
      if (typed._a_InterfaceMappingId != null) return false;
    }
    if (this._a_Name != null) {
      if (typed._a_Name == null) return false;
      if (!this._a_Name.equals(typed._a_Name)) return false;
    } else {
      if (typed._a_Name != null) return false;
    }
    if (this._a_Type != typed._a_Type) return false;
    com.sap.engine.services.webservices.espbase.configuration.Variant[] _f_Variant1 = this.getVariant();
    com.sap.engine.services.webservices.espbase.configuration.Variant[] _f_Variant2 = typed.getVariant();
    if (_f_Variant1 != null) {
      if (_f_Variant2 == null) return false;
      if (_f_Variant1.length != _f_Variant2.length) return false;
      for (int i1 = 0; i1 < _f_Variant1.length ; i1++) {
        if (_f_Variant1[i1] != null) {
          if (_f_Variant2[i1] == null) return false;
          if (!_f_Variant1[i1].equals(_f_Variant2[i1])) return false;
        } else {
          if (_f_Variant2[i1] != null) return false;
        }
      }
    } else {
      if (_f_Variant2 != null) return false;
    }
    return true;
  }

  /**
   * Hashcode method implementation.
   */
  public int hashCode() {
    int result = 0;
    if (this._a_Id != null) {
      result+= this._a_Id.hashCode();
    }
    if (this._a_InterfaceMappingId != null) {
      result+= this._a_InterfaceMappingId.hashCode();
    }
    if (this._a_Name != null) {
      result+= this._a_Name.hashCode();
    }
    result+= (int) this._a_Type;
    com.sap.engine.services.webservices.espbase.configuration.Variant[] _f_Variant1 = this.getVariant();
    if (_f_Variant1 != null) {
      for (int i1 = 0; i1 < _f_Variant1.length ; i1++) {
        if (_f_Variant1[i1] != null) {
          result+= _f_Variant1[i1].hashCode();
        }
      }
    }
    return result;
  }
}
