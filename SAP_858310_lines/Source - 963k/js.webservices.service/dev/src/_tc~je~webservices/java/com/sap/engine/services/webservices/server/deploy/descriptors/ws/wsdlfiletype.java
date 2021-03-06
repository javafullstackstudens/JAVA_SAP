/*
 * Generated by SAP SchemaToJava Generator NW05 on Fri Jun 01 12:58:39 EEST 2007
 * Copyright (c) 2002 by SAP Labs Sofia AG.
 * url: http://www.saplabs.bg
 * All rights reserved.
 */
package com.sap.engine.services.webservices.server.deploy.descriptors.ws;

/**
 * Schema complexType Java representation.
 * Represents type {http://www.sap.com/webas/710/ws/webservices-j2ee-engine-descriptor}wsdl-fileType
 */
public  class WsdlFileType implements java.io.Serializable {

  private static final long serialVersionUID = 6864066607210518660L;

  // Element field for element {}wsdl
  private java.util.ArrayList _f_Wsdl = new java.util.ArrayList();
  /**
   * Set method for element {}wsdl
   */
  public void setWsdl(com.sap.engine.services.webservices.server.deploy.descriptors.ws.WsdlType[] _Wsdl) {
    this._f_Wsdl.clear();
    if (_Wsdl != null) {
      for (int i=0; i<_Wsdl.length; i++) {
        if (_Wsdl[i] != null)
          this._f_Wsdl.add(_Wsdl[i]);
      }
    }
  }
  /**
   * Get method for element {}wsdl
   */
  public com.sap.engine.services.webservices.server.deploy.descriptors.ws.WsdlType[] getWsdl() {
    com.sap.engine.services.webservices.server.deploy.descriptors.ws.WsdlType[] result = new com.sap.engine.services.webservices.server.deploy.descriptors.ws.WsdlType[_f_Wsdl.size()];
    _f_Wsdl.toArray(result);
    return result;
  }

  // Element field for element {}uri-mapping-file
  private java.lang.String _f_UriMappingFile;
  /**
   * Set method for element {}uri-mapping-file
   */
  public void setUriMappingFile(java.lang.String _UriMappingFile) {
    this._f_UriMappingFile = _UriMappingFile;
  }
  /**
   * Get method for element {}uri-mapping-file
   */
  public java.lang.String getUriMappingFile() {
    return this._f_UriMappingFile;
  }

  public void addWsdl(com.sap.engine.services.webservices.server.deploy.descriptors.ws.WsdlType _Wsdl) {
    this._f_Wsdl.add(_Wsdl);
  }
  
  // Element field for element {}wsdl-publication
  private java.util.ArrayList _f_WsdlPublication = new java.util.ArrayList();
  /**
   * Set method for element {}wsdl-publication
   */
  public void setWsdlPublication(java.lang.String[] _WsdlPublication) {
    this._f_WsdlPublication.clear();
    if (_WsdlPublication != null) {
      for (int i=0; i<_WsdlPublication.length; i++) {
        if (_WsdlPublication[i] != null)
          this._f_WsdlPublication.add(_WsdlPublication[i]);
      }
    }
  }
  /**
   * Get method for element {}wsdl-publication
   */
  public java.lang.String[] getWsdlPublication() {
    java.lang.String[] result = new java.lang.String[_f_WsdlPublication.size()];
    _f_WsdlPublication.toArray(result);
    return result;
  }

  /**
   * Equals method implementation.
   */
  public boolean equals(Object object) {
    if (object == null) return false;
    if (!(object instanceof WsdlFileType)) return false;
    WsdlFileType typed = (WsdlFileType) object;
    com.sap.engine.services.webservices.server.deploy.descriptors.ws.WsdlType[] _f_Wsdl1 = this.getWsdl();
    com.sap.engine.services.webservices.server.deploy.descriptors.ws.WsdlType[] _f_Wsdl2 = typed.getWsdl();
    if (_f_Wsdl1 != null) {
      if (_f_Wsdl2 == null) return false;
      if (_f_Wsdl1.length != _f_Wsdl2.length) return false;
      for (int i1 = 0; i1 < _f_Wsdl1.length ; i1++) {
        if (_f_Wsdl1[i1] != null) {
          if (_f_Wsdl2[i1] == null) return false;
          if (!_f_Wsdl1[i1].equals(_f_Wsdl2[i1])) return false;
        } else {
          if (_f_Wsdl2[i1] != null) return false;
        }
      }
    } else {
      if (_f_Wsdl2 != null) return false;
    }
    if (this._f_UriMappingFile != null) {
      if (typed._f_UriMappingFile == null) return false;
      if (!this._f_UriMappingFile.equals(typed._f_UriMappingFile)) return false;
    } else {
      if (typed._f_UriMappingFile != null) return false;
    }
    java.lang.String[] _f_WsdlPublication1 = this.getWsdlPublication();
    java.lang.String[] _f_WsdlPublication2 = typed.getWsdlPublication();
    if (_f_WsdlPublication1 != null) {
      if (_f_WsdlPublication2 == null) return false;
      if (_f_WsdlPublication1.length != _f_WsdlPublication2.length) return false;
      for (int i1 = 0; i1 < _f_WsdlPublication1.length ; i1++) {
        if (_f_WsdlPublication1[i1] != null) {
          if (_f_WsdlPublication2[i1] == null) return false;
          if (!_f_WsdlPublication1[i1].equals(_f_WsdlPublication2[i1])) return false;
        } else {
          if (_f_WsdlPublication2[i1] != null) return false;
        }
      }
    } else {
      if (_f_WsdlPublication2 != null) return false;
    }
    return true;
  }

  /**
   * Hashcode method implementation.
   */
  public int hashCode() {
    int result = 0;
    com.sap.engine.services.webservices.server.deploy.descriptors.ws.WsdlType[] _f_Wsdl1 = this.getWsdl();
    if (_f_Wsdl1 != null) {
      for (int i1 = 0; i1 < _f_Wsdl1.length ; i1++) {
        if (_f_Wsdl1[i1] != null) {
          result+= _f_Wsdl1[i1].hashCode();
        }
      }
    }
    if (this._f_UriMappingFile != null) {
      result+= this._f_UriMappingFile.hashCode();
    }
    java.lang.String[] _f_WsdlPublication1 = this.getWsdlPublication();
    if (_f_WsdlPublication1 != null) {
      for (int i1 = 0; i1 < _f_WsdlPublication1.length ; i1++) {
        if (_f_WsdlPublication1[i1] != null) {
          result+= _f_WsdlPublication1[i1].hashCode();
        }
      }
    }
    return result;
  }
}
