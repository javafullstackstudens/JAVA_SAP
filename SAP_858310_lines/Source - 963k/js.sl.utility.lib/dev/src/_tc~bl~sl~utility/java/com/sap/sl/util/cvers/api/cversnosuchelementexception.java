package com.sap.sl.util.cvers.api;

/**
 *  Central exception for errors during DB access of CVERS
 *
 *@author     md
 *
 *@version    1.0
 */

public class CVersNoSuchElementException extends CVersAccessException {	//$JL-SER$

  public CVersNoSuchElementException(String message) {
	super(message);
  }

}