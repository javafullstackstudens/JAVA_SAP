﻿/*
 * Generated by SAP SchemaToJava Generator NW05 on Thu May 12 14:13:36 EEST 2005
 * Copyright (c) 2002 by SAP Labs Sofia AG.
 * url: http://www.saplabs.bg
 * All rights reserved.
 */
package com.sap.engine.services.webservices.espbase.configuration;


/**
 * Schema complexType Java representation.
 * Represents type {http://www.sap.com/webas/710/ws/configuration-descriptor}BindingData
 */
public  class BindingData extends com.sap.engine.services.webservices.espbase.configuration.Behaviour implements java.io.Serializable,java.lang.Cloneable {
  
  private boolean original = false;
  
  public void setOriginal(boolean flag) {
    this.original = flag;  
  }
  
  public boolean isOriginal() {
    return this.original;
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
  
  //Attribute field for attribute {}configuration-type
  private int _a_ConfigurationType = 0;
  /**
   * Set method for attribute {}configuration-type
   */
  public void setConfigurationType(int _ConfigurationType) {
    this._a_ConfigurationType = _ConfigurationType;
  }
  /**
   * Get method for attribute {}configuration-type
   */
  public int getConfigurationType() {
    return _a_ConfigurationType;
  }

  // Attribute field for attribute {}url
  private java.lang.String _a_Url;
  /**
   * Set method for attribute {}url
   */
  public void setUrl(java.lang.String _Url) {
    this._a_Url = _Url;
  }
  /**
   * Get method for attribute {}url
   */
  public java.lang.String getUrl() {
    return _a_Url;
  }

  // Attribute field for attribute {}active
  private boolean _a_Active = true;
  /**
   * Set method for attribute {}active
   */
  public void setActive(boolean _Active) {
    this._a_Active = _Active;
  }
  /**
   * Get method for attribute {}active
   */
  public boolean isActive() {
    return _a_Active;
  }

  // Attribute field for attribute {}binding-name
  private java.lang.String _a_BindingName;
  /**
   * Set method for attribute {}binding-name
   */
  public void setBindingName(java.lang.String _BindingName) {
    this._a_BindingName = _BindingName;
  }
  /**
   * Get method for attribute {}binding-name
   */
  public java.lang.String getBindingName() {
    return _a_BindingName;
  }

  // Attribute field for attribute {}binding-namespace
  private java.lang.String _a_BindingNamespace;
  /**
   * Set method for attribute {}binding-namespace
   */
  public void setBindingNamespace(java.lang.String _BindingNamespace) {
    this._a_BindingNamespace = _BindingNamespace;
  }
  /**
   * Get method for attribute {}binding-namespace
   */
  public java.lang.String getBindingNamespace() {
    return _a_BindingNamespace;
  }

  // Attribute field for attribute {}variant-name
  private java.lang.String _a_VariantName;
  /**
   * Set method for attribute {}variant-name
   */
  public void setVariantName(java.lang.String _VariantName) {
    this._a_VariantName = _VariantName;
  }
  /**
   * Get method for attribute {}variant-name
   */
  public java.lang.String getVariantName() {
    return _a_VariantName;
  }

  // Attribute field for attribute {}group-config-id
  private java.lang.String _a_GroupConfigId;
  /**
   * Set method for attribute {}group-config-id
   */
  public void setGroupConfigId(java.lang.String _GroupConfigId) {
    this._a_GroupConfigId = _GroupConfigId;
  }
  /**
   * Get method for attribute {}group-config-id
   */
  public java.lang.String getGroupConfigId() {
    return _a_GroupConfigId;
  }

  // Attribute field for attribute {}configuration-id
  private java.lang.String _a_ConfigurationId;
  /**
   * Set method for attribute {}configuration-id
   */
  public void setConfigurationId(java.lang.String _ConfigurationId) {
    this._a_ConfigurationId = _ConfigurationId;
  }
  /**
   * Get method for attribute {}configuration-id
   */
  public java.lang.String getConfigurationId() {
    //This logic is added manually. This is posed by an agreemed with Martijn de Boer, 
    //which states that this method will return the 'configuraiton-name' for NW04 (which is
    //the 'configuraiton-id' value) or bindingData@name in case of NY web services.
    //Since for NY web service, the 'configuration-id' attrib is not set in various tools (IDE, CFGBuilder, etc)
    //this method is modified to provide the necessary logic.
//    if (_a_ConfigurationId != null) {
      return _a_ConfigurationId;
//    } else {
//      return getBindingName();
//    }
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

  // Attribute field for attribute {}editable
  private boolean _a_Editable = true;
  /**
   * Set method for attribute {}editable
   */
  public void setEditable(boolean _Editable) {
    this._a_Editable = _Editable;
  }
  /**
   * Get method for attribute {}editable
   */
  public boolean isEditable() {
    return _a_Editable;
  }

  // Attribute field for attribute {}url-scheme
  private com.sap.engine.services.webservices.espbase.configuration.URLSchemeType _a_UrlScheme; //$JL-SER$
  /**
   * Set method for attribute {}url-scheme
   */
  public void setUrlScheme(com.sap.engine.services.webservices.espbase.configuration.URLSchemeType _UrlScheme) {
    this._a_UrlScheme = _UrlScheme;
  }
  /**
   * Get method for attribute {}url-scheme
   */
  public com.sap.engine.services.webservices.espbase.configuration.URLSchemeType getUrlScheme() {
    return _a_UrlScheme;
  }

  // Attribute field for attribute {}interface-id
  private java.lang.String _a_InterfaceId;
  /**
   * Set method for attribute {}interface-id
   */
  public void setInterfaceId(java.lang.String _InterfaceId) {
    this._a_InterfaceId = _InterfaceId;
  }
  /**
   * Get method for attribute {}interface-id
   */
  public java.lang.String getInterfaceId() {
    return _a_InterfaceId;
  }

  // Element field for element {}Operation
  private java.util.ArrayList _f_Operation = new java.util.ArrayList();
  /**
   * Set method for element {}Operation
   */
  public void setOperation(com.sap.engine.services.webservices.espbase.configuration.OperationData[] _Operation) {
    this._f_Operation.clear();
    if (_Operation != null) {
      for (int i=0; i<_Operation.length; i++) {
        if (_Operation[i] != null)
          this._f_Operation.add(_Operation[i]);
      }
    }
  }
  /**
   * If operation with name <code>opName</code> is missing creates, adds and returns the newly created operation.
   * Otherwise the already existing operation is returned.
   * @param opName name of the operation to be created.
   * @return
   */
  public OperationData createOperationIfMissing(String opName) {
    //check whether operation already exists
    for (int i = 0; i < _f_Operation.size(); i++) {
      OperationData opData = (OperationData) _f_Operation.get(i);
      if (opData.getName().equals(opName)) {
        return opData;
      }
    }
    //creates operation
    OperationData opData = new OperationData();
    opData.setName(opName);
    _f_Operation.add(opData);
    return opData;
  }
  /**
   * Get method for element {}Operation
   */
  public com.sap.engine.services.webservices.espbase.configuration.OperationData[] getOperation() {
    com.sap.engine.services.webservices.espbase.configuration.OperationData[] result = new com.sap.engine.services.webservices.espbase.configuration.OperationData[_f_Operation.size()];
    _f_Operation.toArray(result);
    return result;
  }

  // Element field for element {}UDDIEntity
  private java.util.ArrayList _f_UDDIEntity = new java.util.ArrayList();
  /**
   * Set method for element {}UDDIEntity
   */
  public void setUDDIEntity(com.sap.engine.services.webservices.espbase.configuration.UDDIEntity[] _UDDIEntity) {
    this._f_UDDIEntity.clear();
    if (_UDDIEntity != null) {
      for (int i=0; i<_UDDIEntity.length; i++) {
        if (_UDDIEntity[i] != null)
          this._f_UDDIEntity.add(_UDDIEntity[i]);
      }
    }
  }
  /**
   * Get method for element {}UDDIEntity
   */
  public com.sap.engine.services.webservices.espbase.configuration.UDDIEntity[] getUDDIEntity() {
    com.sap.engine.services.webservices.espbase.configuration.UDDIEntity[] result = new com.sap.engine.services.webservices.espbase.configuration.UDDIEntity[_f_UDDIEntity.size()];
    _f_UDDIEntity.toArray(result);
    return result;
  }

  // Element field for element {}ConfigValue
  private java.util.ArrayList _f_ConfigValue = new java.util.ArrayList();
  /**
   * Set method for element {}ConfigValue
   */
  public void setConfigValue(com.sap.engine.services.webservices.espbase.configuration.ConfigValueType[] _ConfigValue) {
    this._f_ConfigValue.clear();
    if (_ConfigValue != null) {
      for (int i=0; i<_ConfigValue.length; i++) {
        if (_ConfigValue[i] != null)
          this._f_ConfigValue.add(_ConfigValue[i]);
      }
    }
  }
  /**
   * Get method for element {}ConfigValue
   */
  public com.sap.engine.services.webservices.espbase.configuration.ConfigValueType[] getConfigValue() {
    com.sap.engine.services.webservices.espbase.configuration.ConfigValueType[] result = new com.sap.engine.services.webservices.espbase.configuration.ConfigValueType[_f_ConfigValue.size()];
    _f_ConfigValue.toArray(result);
    return result;
  }

  /**
   * Equals method implementation.
   */
  public boolean equals(Object object) {
    if (super.equals(object) == false) return false;
    if (object == null) return false;
    if (!(object instanceof BindingData)) return false;
    BindingData typed = (BindingData) object;
    if (this._a_Name != null) {
      if (typed._a_Name == null) return false;
      if (!this._a_Name.equals(typed._a_Name)) return false;
    } else {
      if (typed._a_Name != null) return false;
    }
    if (this._a_Url != null) {
      if (typed._a_Url == null) return false;
      if (!this._a_Url.equals(typed._a_Url)) return false;
    } else {
      if (typed._a_Url != null) return false;
    }
    if (this.original != typed.original) return false;
    if (this._a_Active != typed._a_Active) return false;
    if (this._a_BindingName != null) {
      if (typed._a_BindingName == null) return false;
      if (!this._a_BindingName.equals(typed._a_BindingName)) return false;
    } else {
      if (typed._a_BindingName != null) return false;
    }
    if (this._a_BindingNamespace != null) {
      if (typed._a_BindingNamespace == null) return false;
      if (!this._a_BindingNamespace.equals(typed._a_BindingNamespace)) return false;
    } else {
      if (typed._a_BindingNamespace != null) return false;
    }
    if (this._a_VariantName != null) {
      if (typed._a_VariantName == null) return false;
      if (!this._a_VariantName.equals(typed._a_VariantName)) return false;
    } else {
      if (typed._a_VariantName != null) return false;
    }
    if (this._a_GroupConfigId != null) {
      if (typed._a_GroupConfigId == null) return false;
      if (!this._a_GroupConfigId.equals(typed._a_GroupConfigId)) return false;
    } else {
      if (typed._a_GroupConfigId != null) return false;
    }
    if (this._a_ConfigurationId != null) {
      if (typed._a_ConfigurationId == null) return false;
      if (!this._a_ConfigurationId.equals(typed._a_ConfigurationId)) return false;
    } else {
      if (typed._a_ConfigurationId != null) return false;
    }
    if (this._a_InterfaceMappingId != null) {
      if (typed._a_InterfaceMappingId == null) return false;
      if (!this._a_InterfaceMappingId.equals(typed._a_InterfaceMappingId)) return false;
    } else {
      if (typed._a_InterfaceMappingId != null) return false;
    }
    if (this._a_Editable != typed._a_Editable) return false;
    if (this._a_UrlScheme != null) {
      if (typed._a_UrlScheme == null) return false;
      if (!this._a_UrlScheme.equals(typed._a_UrlScheme)) return false;
    } else {
      if (typed._a_UrlScheme != null) return false;
    }
    if (this._a_InterfaceId != null) {
      if (typed._a_InterfaceId == null) return false;
      if (!this._a_InterfaceId.equals(typed._a_InterfaceId)) return false;
    } else {
      if (typed._a_InterfaceId != null) return false;
    }
    com.sap.engine.services.webservices.espbase.configuration.OperationData[] _f_Operation1 = this.getOperation();
    com.sap.engine.services.webservices.espbase.configuration.OperationData[] _f_Operation2 = typed.getOperation();
    if (_f_Operation1 != null) {
      if (_f_Operation2 == null) return false;
      if (_f_Operation1.length != _f_Operation2.length) return false;
      for (int i1 = 0; i1 < _f_Operation1.length ; i1++) {
        if (_f_Operation1[i1] != null) {
          if (_f_Operation2[i1] == null) return false;
          if (!_f_Operation1[i1].equals(_f_Operation2[i1])) return false;
        } else {
          if (_f_Operation2[i1] != null) return false;
        }
      }
    } else {
      if (_f_Operation2 != null) return false;
    }
    com.sap.engine.services.webservices.espbase.configuration.UDDIEntity[] _f_UDDIEntity1 = this.getUDDIEntity();
    com.sap.engine.services.webservices.espbase.configuration.UDDIEntity[] _f_UDDIEntity2 = typed.getUDDIEntity();
    if (_f_UDDIEntity1 != null) {
      if (_f_UDDIEntity2 == null) return false;
      if (_f_UDDIEntity1.length != _f_UDDIEntity2.length) return false;
      for (int i1 = 0; i1 < _f_UDDIEntity1.length ; i1++) {
        if (_f_UDDIEntity1[i1] != null) {
          if (_f_UDDIEntity2[i1] == null) return false;
          if (!_f_UDDIEntity1[i1].equals(_f_UDDIEntity2[i1])) return false;
        } else {
          if (_f_UDDIEntity2[i1] != null) return false;
        }
      }
    } else {
      if (_f_UDDIEntity2 != null) return false;
    }
    com.sap.engine.services.webservices.espbase.configuration.ConfigValueType[] _f_ConfigValue1 = this.getConfigValue();
    com.sap.engine.services.webservices.espbase.configuration.ConfigValueType[] _f_ConfigValue2 = typed.getConfigValue();
    if (_f_ConfigValue1 != null) {
      if (_f_ConfigValue2 == null) return false;
      if (_f_ConfigValue1.length != _f_ConfigValue2.length) return false;
      for (int i1 = 0; i1 < _f_ConfigValue1.length ; i1++) {
        if (_f_ConfigValue1[i1] != null) {
          if (_f_ConfigValue2[i1] == null) return false;
          if (!_f_ConfigValue1[i1].equals(_f_ConfigValue2[i1])) return false;
        } else {
          if (_f_ConfigValue2[i1] != null) return false;
        }
      }
    } else {
      if (_f_ConfigValue2 != null) return false;
    }
    return true;
  }

  /**
   * Hashcode method implementation.
   */
  public int hashCode() {
    int result = super.hashCode();
    if (this._a_Name != null) {
      result+= this._a_Name.hashCode();
    }
    if (this._a_Url != null) {
      result+= this._a_Url.hashCode();
    }
    if (this.original) result += 1;
    if (this._a_Active) result += 1;
    if (this._a_BindingName != null) {
      result+= this._a_BindingName.hashCode();
    }
    if (this._a_BindingNamespace != null) {
      result+= this._a_BindingNamespace.hashCode();
    }
    if (this._a_VariantName != null) {
      result+= this._a_VariantName.hashCode();
    }
    if (this._a_GroupConfigId != null) {
      result+= this._a_GroupConfigId.hashCode();
    }
    if (this._a_ConfigurationId != null) {
      result+= this._a_ConfigurationId.hashCode();
    }
    if (this._a_InterfaceMappingId != null) {
      result+= this._a_InterfaceMappingId.hashCode();
    }
    if (this._a_Editable) result += 1;
    if (this._a_UrlScheme != null) {
      result+= this._a_UrlScheme.hashCode();
    }
    if (this._a_InterfaceId != null) {
      result+= this._a_InterfaceId.hashCode();
    }
    com.sap.engine.services.webservices.espbase.configuration.OperationData[] _f_Operation1 = this.getOperation();
    if (_f_Operation1 != null) {
      for (int i1 = 0; i1 < _f_Operation1.length ; i1++) {
        if (_f_Operation1[i1] != null) {
          result+= _f_Operation1[i1].hashCode();
        }
      }
    }
    com.sap.engine.services.webservices.espbase.configuration.UDDIEntity[] _f_UDDIEntity1 = this.getUDDIEntity();
    if (_f_UDDIEntity1 != null) {
      for (int i1 = 0; i1 < _f_UDDIEntity1.length ; i1++) {
        if (_f_UDDIEntity1[i1] != null) {
          result+= _f_UDDIEntity1[i1].hashCode();
        }
      }
    }
    com.sap.engine.services.webservices.espbase.configuration.ConfigValueType[] _f_ConfigValue1 = this.getConfigValue();
    if (_f_ConfigValue1 != null) {
      for (int i1 = 0; i1 < _f_ConfigValue1.length ; i1++) {
        if (_f_ConfigValue1[i1] != null) {
          result+= _f_ConfigValue1[i1].hashCode();
        }
      }
    }
    return result;
  }
  
  /**
   * @return OperationData with name equal to <code>opName</code>, or null if such operation is not found.
   */
  public OperationData getOperationData(String opName) {
    OperationData opD;
    for (int i = 0; i < this._f_Operation.size(); i++) {
      opD = (OperationData) _f_Operation.get(i);
      if (opD.getName().equals(opName)) {
        return opD;
      }
    }
    return null;
  }

  public BindingData makeCopyWithoutProperties() {
    BindingData newBd = new BindingData();
    newBd.setName(this.getName());
    newBd.setBindingName(this.getBindingName());
    newBd.setBindingNamespace(this.getBindingNamespace());
    newBd.setConfigurationId(this._a_ConfigurationId);
    newBd.setActive(this.isActive());
    newBd.setEditable(this.isEditable());
    newBd.setGroupConfigId(this.getGroupConfigId());
    newBd.setInterfaceId(this.getInterfaceId());
    newBd.setInterfaceMappingId(this.getInterfaceMappingId());
    newBd.setUrl(this.getUrl());
    newBd.setVariantName(this.getVariantName());
    newBd.setUrlScheme(this.getUrlScheme());
    newBd.setConfigValue(this.getConfigValue());
    newBd.setUDDIEntity(this.getUDDIEntity());
    newBd.setOriginal(this.isOriginal());

    //TODO remove this
    newBd.getSinglePropertyList().setSelected(Boolean.TRUE); 

    OperationData thisOps[] = this.getOperation();
    OperationData newIOps[] = new OperationData[thisOps.length];
    for (int i = 0; i < thisOps.length; i++) {
      newIOps[i] = thisOps[i].makeCopyWithoutProperties();
    }
    newBd.setOperation(newIOps);
    return newBd;
  }
  
  private static String dumpProperties(PropertyType[] properties) {
    StringBuffer stringBuffer = new StringBuffer();    
    for (int i = 0; i < properties.length; i++) {
      PropertyType property = properties[i];
      stringBuffer.append("  {" + property.getNamespace());
      stringBuffer.append("}" + property.getName());
      if (property.getName().indexOf("Password") != -1 || property.getName().indexOf("password") != -1) {
        // This is some kind of password property
        stringBuffer.append("= [hidden]").append("\r\n");
      } else {
        stringBuffer.append("=" + property.get_value()).append("\r\n");
      }
    }    
    return stringBuffer.toString();
  }
  
  public static String dumpBindingData(BindingData bindingData) {
    StringBuffer stringBuffer = new StringBuffer();    
    stringBuffer.append("Using logical port [").append(bindingData.getName()).append("]\r\n");
    stringBuffer.append("Logical port uses WSDL Binding [{" + bindingData.getBindingNamespace()).append("}").append(bindingData.getBindingName()).append("]\r\n");
    stringBuffer.append("Logical port uses InterfaceId [" + bindingData.getInterfaceId()).append("]\r\n");
    stringBuffer.append("Logical port uses InterfaceMappingId [" + bindingData.getInterfaceMappingId()).append("]\r\n");
    stringBuffer.append("Endpoint URL [" + bindingData.getUrl()).append("]\r\n");
    stringBuffer.append("Original [" + bindingData.isOriginal()).append("]\r\n");
    stringBuffer.append("Listing properties :\r\n");
    PropertyType[] properties = bindingData.getPropertyList()[0].getProperty();
    stringBuffer.append(dumpProperties(properties));
    stringBuffer.append("Operation Level properties : \r\n");
    OperationData[] operations = bindingData.getOperation();
    for (int i=0; i<operations.length; i++) {
      stringBuffer.append("Properties for operation [").append(operations[i].getName()).append("]\r\n");
      PropertyListType propertyList = operations[i].getPropertyList()[0];
      if (propertyList != null) {
        properties = propertyList.getProperty();
        stringBuffer.append(dumpProperties(properties));
      }      
    }
    return stringBuffer.toString();    
  }

}
