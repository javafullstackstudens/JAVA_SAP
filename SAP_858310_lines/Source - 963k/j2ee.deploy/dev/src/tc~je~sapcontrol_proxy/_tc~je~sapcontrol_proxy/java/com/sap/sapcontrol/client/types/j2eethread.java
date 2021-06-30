﻿/*
 * Generated by SAP SchemaToJava Generator NW05 on Mon May 29 10:14:50 EEST 2006
 * Copyright (c) 2002 by SAP Labs Sofia AG.
 * url: http://www.saplabs.bg
 * All rights reserved.
 */
package com.sap.sapcontrol.client.types;

/**
 * Schema complexType Java representation.
 * Represents type {urn:SAPControl}J2EEThread
 */
public  class J2EEThread implements java.io.Serializable {

  // Element field for element {}processname
  private java.lang.String _f_Processname;
  /**
   * Set method for element {}processname
   */
  public void setProcessname(java.lang.String _Processname) {
    this._f_Processname = _Processname;
  }
  /**
   * Get method for element {}processname
   */
  public java.lang.String getProcessname() {
    return this._f_Processname;
  }

  // Element field for element {}startTime
  private java.lang.String _f_StartTime;
  /**
   * Set method for element {}startTime
   */
  public void setStartTime(java.lang.String _StartTime) {
    this._f_StartTime = _StartTime;
  }
  /**
   * Get method for element {}startTime
   */
  public java.lang.String getStartTime() {
    return this._f_StartTime;
  }

  // Element field for element {}updateTime
  private java.lang.String _f_UpdateTime;
  /**
   * Set method for element {}updateTime
   */
  public void setUpdateTime(java.lang.String _UpdateTime) {
    this._f_UpdateTime = _UpdateTime;
  }
  /**
   * Get method for element {}updateTime
   */
  public java.lang.String getUpdateTime() {
    return this._f_UpdateTime;
  }

  // Element field for element {}taskupdateTime
  private java.lang.String _f_TaskupdateTime;
  /**
   * Set method for element {}taskupdateTime
   */
  public void setTaskupdateTime(java.lang.String _TaskupdateTime) {
    this._f_TaskupdateTime = _TaskupdateTime;
  }
  /**
   * Get method for element {}taskupdateTime
   */
  public java.lang.String getTaskupdateTime() {
    return this._f_TaskupdateTime;
  }

  // Element field for element {}subtaskupdateTime
  private java.lang.String _f_SubtaskupdateTime;
  /**
   * Set method for element {}subtaskupdateTime
   */
  public void setSubtaskupdateTime(java.lang.String _SubtaskupdateTime) {
    this._f_SubtaskupdateTime = _SubtaskupdateTime;
  }
  /**
   * Get method for element {}subtaskupdateTime
   */
  public java.lang.String getSubtaskupdateTime() {
    return this._f_SubtaskupdateTime;
  }

  // Element field for element {}task
  private java.lang.String _f_Task;
  /**
   * Set method for element {}task
   */
  public void setTask(java.lang.String _Task) {
    this._f_Task = _Task;
  }
  /**
   * Get method for element {}task
   */
  public java.lang.String getTask() {
    return this._f_Task;
  }

  // Element field for element {}subtask
  private java.lang.String _f_Subtask;
  /**
   * Set method for element {}subtask
   */
  public void setSubtask(java.lang.String _Subtask) {
    this._f_Subtask = _Subtask;
  }
  /**
   * Get method for element {}subtask
   */
  public java.lang.String getSubtask() {
    return this._f_Subtask;
  }

  // Element field for element {}name
  private java.lang.String _f_Name;
  /**
   * Set method for element {}name
   */
  public void setName(java.lang.String _Name) {
    this._f_Name = _Name;
  }
  /**
   * Get method for element {}name
   */
  public java.lang.String getName() {
    return this._f_Name;
  }

  // Element field for element {}classname
  private java.lang.String _f_Classname;
  /**
   * Set method for element {}classname
   */
  public void setClassname(java.lang.String _Classname) {
    this._f_Classname = _Classname;
  }
  /**
   * Get method for element {}classname
   */
  public java.lang.String getClassname() {
    return this._f_Classname;
  }

  // Element field for element {}user
  private java.lang.String _f_User;
  /**
   * Set method for element {}user
   */
  public void setUser(java.lang.String _User) {
    this._f_User = _User;
  }
  /**
   * Get method for element {}user
   */
  public java.lang.String getUser() {
    return this._f_User;
  }

  // Element field for element {}pool
  private java.lang.String _f_Pool;
  /**
   * Set method for element {}pool
   */
  public void setPool(java.lang.String _Pool) {
    this._f_Pool = _Pool;
  }
  /**
   * Get method for element {}pool
   */
  public java.lang.String getPool() {
    return this._f_Pool;
  }

  // Element field for element {}state
  private java.lang.String _f_State;
  /**
   * Set method for element {}state
   */
  public void setState(java.lang.String _State) {
    this._f_State = _State;
  }
  /**
   * Get method for element {}state
   */
  public java.lang.String getState() {
    return this._f_State;
  }

  // Element field for element {}dispstatus
  private com.sap.sapcontrol.client.types.STATECOLOR _f_Dispstatus;
  /**
   * Set method for element {}dispstatus
   */
  public void setDispstatus(com.sap.sapcontrol.client.types.STATECOLOR _Dispstatus) {
    this._f_Dispstatus = _Dispstatus;
  }
  /**
   * Get method for element {}dispstatus
   */
  public com.sap.sapcontrol.client.types.STATECOLOR getDispstatus() {
    return this._f_Dispstatus;
  }

  /**
   * Equals method implementation.
   */
  public boolean equals(Object object) {
    if (object == null) return false;
    if (!(object instanceof J2EEThread)) return false;
    J2EEThread typed = (J2EEThread) object;
    if (this._f_Processname != null) {
      if (typed._f_Processname == null) return false;
      if (!this._f_Processname.equals(typed._f_Processname)) return false;
    } else {
      if (typed._f_Processname != null) return false;
    }
    if (this._f_StartTime != null) {
      if (typed._f_StartTime == null) return false;
      if (!this._f_StartTime.equals(typed._f_StartTime)) return false;
    } else {
      if (typed._f_StartTime != null) return false;
    }
    if (this._f_UpdateTime != null) {
      if (typed._f_UpdateTime == null) return false;
      if (!this._f_UpdateTime.equals(typed._f_UpdateTime)) return false;
    } else {
      if (typed._f_UpdateTime != null) return false;
    }
    if (this._f_TaskupdateTime != null) {
      if (typed._f_TaskupdateTime == null) return false;
      if (!this._f_TaskupdateTime.equals(typed._f_TaskupdateTime)) return false;
    } else {
      if (typed._f_TaskupdateTime != null) return false;
    }
    if (this._f_SubtaskupdateTime != null) {
      if (typed._f_SubtaskupdateTime == null) return false;
      if (!this._f_SubtaskupdateTime.equals(typed._f_SubtaskupdateTime)) return false;
    } else {
      if (typed._f_SubtaskupdateTime != null) return false;
    }
    if (this._f_Task != null) {
      if (typed._f_Task == null) return false;
      if (!this._f_Task.equals(typed._f_Task)) return false;
    } else {
      if (typed._f_Task != null) return false;
    }
    if (this._f_Subtask != null) {
      if (typed._f_Subtask == null) return false;
      if (!this._f_Subtask.equals(typed._f_Subtask)) return false;
    } else {
      if (typed._f_Subtask != null) return false;
    }
    if (this._f_Name != null) {
      if (typed._f_Name == null) return false;
      if (!this._f_Name.equals(typed._f_Name)) return false;
    } else {
      if (typed._f_Name != null) return false;
    }
    if (this._f_Classname != null) {
      if (typed._f_Classname == null) return false;
      if (!this._f_Classname.equals(typed._f_Classname)) return false;
    } else {
      if (typed._f_Classname != null) return false;
    }
    if (this._f_User != null) {
      if (typed._f_User == null) return false;
      if (!this._f_User.equals(typed._f_User)) return false;
    } else {
      if (typed._f_User != null) return false;
    }
    if (this._f_Pool != null) {
      if (typed._f_Pool == null) return false;
      if (!this._f_Pool.equals(typed._f_Pool)) return false;
    } else {
      if (typed._f_Pool != null) return false;
    }
    if (this._f_State != null) {
      if (typed._f_State == null) return false;
      if (!this._f_State.equals(typed._f_State)) return false;
    } else {
      if (typed._f_State != null) return false;
    }
    if (this._f_Dispstatus != null) {
      if (typed._f_Dispstatus == null) return false;
      if (!this._f_Dispstatus.equals(typed._f_Dispstatus)) return false;
    } else {
      if (typed._f_Dispstatus != null) return false;
    }
    return true;
  }

  /**
   * Hashcode method implementation.
   */
  public int hashCode() {
    int result = 0;
    if (this._f_Processname != null) {
      result+= this._f_Processname.hashCode();
    }
    if (this._f_StartTime != null) {
      result+= this._f_StartTime.hashCode();
    }
    if (this._f_UpdateTime != null) {
      result+= this._f_UpdateTime.hashCode();
    }
    if (this._f_TaskupdateTime != null) {
      result+= this._f_TaskupdateTime.hashCode();
    }
    if (this._f_SubtaskupdateTime != null) {
      result+= this._f_SubtaskupdateTime.hashCode();
    }
    if (this._f_Task != null) {
      result+= this._f_Task.hashCode();
    }
    if (this._f_Subtask != null) {
      result+= this._f_Subtask.hashCode();
    }
    if (this._f_Name != null) {
      result+= this._f_Name.hashCode();
    }
    if (this._f_Classname != null) {
      result+= this._f_Classname.hashCode();
    }
    if (this._f_User != null) {
      result+= this._f_User.hashCode();
    }
    if (this._f_Pool != null) {
      result+= this._f_Pool.hashCode();
    }
    if (this._f_State != null) {
      result+= this._f_State.hashCode();
    }
    if (this._f_Dispstatus != null) {
      result+= this._f_Dispstatus.hashCode();
    }
    return result;
  }
}
