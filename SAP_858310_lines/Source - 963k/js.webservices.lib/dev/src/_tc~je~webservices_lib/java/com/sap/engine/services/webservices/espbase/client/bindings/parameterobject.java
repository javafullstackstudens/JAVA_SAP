/*
 * Copyright (c) 2003 by SAP AG, Walldorf.,
 * http://www.sap.com
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of SAP AG, Walldorf. You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms
 * of the license agreement you entered into with SAP.
 */
package com.sap.engine.services.webservices.espbase.client.bindings;

import com.sun.xml.bind.api.TypeReference;

/**
 * Holder Class containing TransportBinding parameters.
 * @version 1.0
 * @author Chavdar Baikov, chavdar.baikov@sap.com
 */
public class ParameterObject {
  
  public Class parameterType;
  public Object parameterValue; 
  public TypeReference typeReference;
}
