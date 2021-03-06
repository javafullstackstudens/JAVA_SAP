/*
 * Generated by SAP SchemaToJava Generator NW05 on Thu Nov 30 13:49:03 EET 2006
 * Copyright (c) 2002 by SAP Labs Sofia AG.
 * url: http://www.saplabs.bg
 * All rights reserved.
 */
package com.sap.engine.services.webservices.espbase.configuration.p_set;

/**
 * Enumeration Java representation.
 * Represents type {http://xml.sap.com/2006/11/esi/conf/feat/}cardinalityType
 */
public class CardinalityType implements java.io.Serializable {

  private static final long serialVersionUID = 4041499233695597925L;

  public static final java.lang.String _Enum1N = "1..N";
  public static final java.lang.String _Enum0N = "0..N";
  public static final java.lang.String _Enum11 = "1..1";
  public static final java.lang.String _Enum01 = "0..1";
  public static final java.lang.String _Enum00 = "0..0";
  public static final java.lang.String _UNKNOWN = "UNKNOWN";

  public static final CardinalityType Enum1N = new CardinalityType(_Enum1N);
  public static final CardinalityType Enum0N = new CardinalityType(_Enum0N);
  public static final CardinalityType Enum11 = new CardinalityType(_Enum11);
  public static final CardinalityType Enum01 = new CardinalityType(_Enum01);
  public static final CardinalityType Enum00 = new CardinalityType(_Enum00);
  public static final CardinalityType UNKNOWN = new CardinalityType(_UNKNOWN);

  //  Enumeration Content
  protected java.lang.String _value;

  public CardinalityType(java.lang.String _value) {
    if (_Enum1N.equals(_value)) {
      this._value = _value;
      return;
    }
    if (_Enum0N.equals(_value)) {
      this._value = _value;
      return;
    }
    if (_Enum11.equals(_value)) {
      this._value = _value;
      return;
    }
    if (_Enum01.equals(_value)) {
      this._value = _value;
      return;
    }
    if (_Enum00.equals(_value)) {
      this._value = _value;
      return;
    }
    if (_UNKNOWN.equals(_value)) {
      this._value = _value;
      return;
    }
    throw new IllegalArgumentException("Invalid Enumeration value ["+_value+"] passed.");
  }

  public java.lang.String getValue() {
    return _value;
  }

  public static CardinalityType fromValue(java.lang.String value) {
    if (_Enum1N.equals(value)) {
      return Enum1N;
    }
    if (_Enum0N.equals(value)) {
      return Enum0N;
    }
    if (_Enum11.equals(value)) {
      return Enum11;
    }
    if (_Enum01.equals(value)) {
      return Enum01;
    }
    if (_Enum00.equals(value)) {
      return Enum00;
    }
    if (_UNKNOWN.equals(value)) {
      return UNKNOWN;
    }
    throw new IllegalArgumentException("Invalid Enumeration value ["+value+"] passed.");
  }

  public static CardinalityType fromString(String value) {
    if ("1..N".equals(value)) {
      return Enum1N;
    }
    if ("0..N".equals(value)) {
      return Enum0N;
    }
    if ("1..1".equals(value)) {
      return Enum11;
    }
    if ("0..1".equals(value)) {
      return Enum01;
    }
    if ("0..0".equals(value)) {
      return Enum00;
    }
    if ("UNKNOWN".equals(value)) {
      return UNKNOWN;
    }
    throw new IllegalArgumentException("Invalid Enumeration value ["+value+"] passed.");
  }

  public java.lang.String toString() {
    if (_Enum1N.equals(_value)) {
      return "1..N";
    }
    if (_Enum0N.equals(_value)) {
      return "0..N";
    }
    if (_Enum11.equals(_value)) {
      return "1..1";
    }
    if (_Enum01.equals(_value)) {
      return "0..1";
    }
    if (_Enum00.equals(_value)) {
      return "0..0";
    }
    if (_UNKNOWN.equals(_value)) {
      return "UNKNOWN";
    }
    return java.lang.String.valueOf(_value);
  }

  public boolean equals(java.lang.Object obj) {
    if (obj != null) {
      if (obj instanceof CardinalityType) {
        if (_value.equals(((CardinalityType)obj)._value)) {
          return true;
        }
      }
    }
    return false;
  }

  public int hashCode() {
    return this._value.hashCode();
  }

}
