/*
 * Copyright (c) 2004 Standard Performance Evaluation Corporation (SPEC)
 *               All rights reserved.
 *
 * This source code is provided as is, without any express or implied warranty.
 *
 *  History:
 *  Date        ID, Company             Description
 *  ----------  ----------------        ----------------------------------------------
 *  2002/03/22  Akara Sucharitakul, SUN  Created
 *  2002/04/12  Matt Hogstrom, IBM      Conversion from ECperf 1.1 to SPECjAppServer2001
 *  2002/07/10  Russel Raymundo, BEA    Conversion from SPECjAppServer2001 to 
 *                                      SPECjAppServer2002 (EJB2.0).
 *  2003/01/01  John Stecher, IBM       Modifed for SPECjAppServer2004
 */

package org.spec.jappserver.supplier.helper;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletOutputStream;

import org.spec.jappserver.common.Debug;

/**
 * LogManager manages logs written through the debug calls.
 * It can only support servlets and allows servlets to include
 * functionality to switch and download log files.
 *
 * @author Akara Sucharitakul
 */
public class LogManager {

    private static int instanceId = 0;

    private Debug debug;

    private int numLogs;
    private int logId = 0;
    private File[] logTarget;

    /**
     * LogManager constructor.
     * @param numLogs The number of logs to be used.
     * @param debug   The debug instance used to write.
     * @param config  The ServletConfig of the calling servlet.
     */
    public LogManager(int numLogs, Debug debug, ServletConfig config) {

        ++instanceId;

        this.numLogs = numLogs;
        this.debug = debug;

        logTarget = new File[numLogs];

        String servletName;

        // Some containers are still 2.1 and getServletName is not there
        try {
            servletName = config.getServletName();
        } catch( NoSuchMethodError nme ) {
            servletName = String.valueOf(instanceId);
        }

        File tmpDir = (File) config.getServletContext().getAttribute(
                                                                    "javax.servlet.context.tempdir");
        if( tmpDir == null )
            tmpDir = new File(System.getProperty("java.io.tmpdir"));

        for( int i = 0; i < numLogs; i++ ) {
            logTarget[i] = new File(tmpDir, servletName + "_log"
                                    + i + ".err");
        }

        try {
            PrintStream logStream = new PrintStream(new FileOutputStream(
                                                                        logTarget[logId]), true);
            logStream.println("Log started: " + new Date());
            debug.setLogTarget(logStream);

        } catch( FileNotFoundException e ) {
            config.getServletContext().log(
                                          "FileNotFoundException: Cannot open " +
                                          logTarget[logId] + " for writing!", e);
        } catch( Exception e ) {
            config.getServletContext().log(e.getMessage(), e);
        }
    }

    /**
     * Method switchLog, switches to use the next log file.
     * @exception  IOException  Cannot open next log file.
     */
    public void switchLog() throws IOException {
        int newLogId = (logId + 1) % numLogs;
        try {
            PrintStream oldLogTarget = debug.getLogTarget();

            PrintStream newLogTarget = new PrintStream(new FileOutputStream(
                                                                           logTarget[newLogId]), true);
            newLogTarget.println("Log started: " + new Date());

            debug.setLogTarget(newLogTarget);
            logId = newLogId;

            /* Don't close stderr or stdout */
            if( !(oldLogTarget.equals(System.err) ||
                  oldLogTarget.equals(System.out)) )
                oldLogTarget.close();

        } catch( FileNotFoundException e ) {
            debug.println(1, "FileNotFoundException: Cannot open " +
                          logTarget[newLogId] + " for writing!");
            debug.printStackTrace(e);
            throw e;
        }
    }

    /**
     * Method writeLog writes the current log to the target OutputStream.
     * @param     s           The target ServletOutputStream
     * @exception IOException OutputStream write or log file read error occurred
     */
    public void writeLog(ServletOutputStream s) throws IOException {
        FileInputStream logInp = new FileInputStream(
                                                    logTarget[logId]);
        int bufferSize = logInp.available();

        /* Ensure bufferSize is not beyond 64K */
        bufferSize = bufferSize > 1024 * 64 ? 1024 * 64
                     : bufferSize;
        /* Ensure bufferSize is not below 64 bytes */
        bufferSize = bufferSize < 64 ? 64 : bufferSize;

        byte[] buffer = new byte[bufferSize];

        int readSize = 0;

        do {
            readSize = logInp.read(buffer);

            if( readSize > 0 )
                s.write(buffer, 0, readSize);

        } while( readSize != -1 );

        s.println("\nLog ended: " + new Date());
    }
}
