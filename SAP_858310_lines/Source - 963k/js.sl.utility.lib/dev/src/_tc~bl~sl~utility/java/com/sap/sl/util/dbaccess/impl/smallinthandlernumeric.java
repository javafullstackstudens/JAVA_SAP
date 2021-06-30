﻿package com.sap.sl.util.dbaccess.impl;


import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sap.sl.util.jarsl.api.JarSLIF;


class SmallIntHandlerNumeric extends SmallIntHandler
{
  SmallIntHandlerNumeric(String name)
  {
    super(name, java.sql.Types.SMALLINT);
  }

  void setValue(PreparedStatement stmt, int columnNumber, JarSLIF jarsl) throws IOException, SQLException
  {
    int len = jarsl.getIntData();
    if (len < 0)
      stmt.setNull(columnNumber,this.type);
    else
    {
      char[] buffer = new char[len];

      for (int i = 0; i < len; i++)
        buffer[i] = jarsl.getCharData();

      super.setValue(stmt,columnNumber,new String(buffer));
    }
  }

}
