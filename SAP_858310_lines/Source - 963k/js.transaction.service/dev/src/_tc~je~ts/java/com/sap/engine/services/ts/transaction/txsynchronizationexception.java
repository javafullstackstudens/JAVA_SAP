	package com.sap.engine.services.ts.transaction;

import com.sap.engine.services.ts.exceptions.ExceptionConstants;
import com.sap.exception.BaseExceptionInfo;
import com.sap.exception.IBaseException;
import com.sap.localization.LocalizableText;
import com.sap.localization.LocalizableTextFormatter;
import com.sap.tc.logging.Category;
import com.sap.tc.logging.Location;
import com.sap.engine.services.ts.exceptions.TSResourceAccessor;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Locale;
import java.util.TimeZone;
/**
 * A <code>TxSynchronizationException</code> is thrown when a passed
 * <code>Synchronization</code> object conflicts with another
 * <code>Synchronization</code> object that has already been registered
 * under the same synchronization id.
 */
public class TxSynchronizationException extends com.sap.transaction.TxSynchronizationException implements IBaseException{

  static final long serialVersionUID = -1247514649612326465L;
  private BaseExceptionInfo info = null;
    
    public TxSynchronizationException() {
        this(ExceptionConstants.DOUBLE_REGISTRATION_ERROR);
    }
    
    public TxSynchronizationException(Throwable t) {
        super(ExceptionConstants.DOUBLE_REGISTRATION_ERROR);
        info = new BaseExceptionInfo(TSResourceAccessor.location,
        new LocalizableTextFormatter(TSResourceAccessor.getResourceAccessor(), ExceptionConstants.DOUBLE_REGISTRATION_ERROR, (Object[])null), this, t);
    }
    
    /** Creates a new instance of TxException */
    public TxSynchronizationException(String key) {
        super();
        info = new BaseExceptionInfo(TSResourceAccessor.location,
        new LocalizableTextFormatter(TSResourceAccessor.getResourceAccessor(), key, (Object[])null), this, null);
    }
    
    public TxSynchronizationException(String key, Throwable t) {
        super(key);
        info = new BaseExceptionInfo(TSResourceAccessor.location,
        new LocalizableTextFormatter(TSResourceAccessor.getResourceAccessor(), key, (Object[])null), this, t);
    }
    
    
    public TxSynchronizationException(String key, Object[] args, Throwable t) {
        super(key);
        info = new BaseExceptionInfo(TSResourceAccessor.location,
        new LocalizableTextFormatter(TSResourceAccessor.getResourceAccessor(), key, args), this, t);
    }
    
    public Throwable initCause(Throwable throwable) {
        return info.initCause(throwable);
    }
    
    public Throwable getCause() {
        return info.getCause();
    }
    
    public String getMessage() {
        return "";
    }
    
    public String getNestedMessage() {
        return "";
    }
    
    public LocalizableText getLocalizableMessage() {
        return info.getLocalizableMessage();
    }
    
    public String getLocalizedMessage() {
        return info.getLocalizedMessage();
    }
    
    public String getLocalizedMessage(Locale locale) {
        return info.getLocalizedMessage(locale);
    }
    
    public String getLocalizedMessage(TimeZone zone) {
        return info.getLocalizedMessage(zone);
    }
    
    public String getLocalizedMessage(Locale locale, TimeZone zone) {
        return info.getLocalizedMessage(locale, zone);
    }
    
    public String getNestedLocalizedMessage() {
        return info.getNestedLocalizedMessage();
    }
    
    public String getNestedLocalizedMessage(Locale locale) {
        return info.getNestedLocalizedMessage(locale);
    }
    
    public String getNestedLocalizedMessage(TimeZone zone) {
        return info.getNestedLocalizedMessage(zone);
    }
    
    public String getNestedLocalizedMessage(Locale locale, TimeZone zone) {
        return info.getNestedLocalizedMessage(locale, zone);
    }
    
    public void finallyLocalize() {
        info.finallyLocalize();
    }
    
    public void finallyLocalize(Locale locale) {
        info.finallyLocalize(locale);
    }
    
    public void finallyLocalize(TimeZone zone) {
        info.finallyLocalize(zone);
    }
    
    public void finallyLocalize(Locale locale, TimeZone zone) {
        info.finallyLocalize(locale, zone);
    }
    
    public String getSystemStackTraceString() {
        StringWriter s = new StringWriter();
        super.printStackTrace(new PrintWriter(s));
        return s.toString();
    }
    
    public String getStackTraceString() {
        return info.getStackTraceString();
    }
    
    public String getNestedStackTraceString() {
        return info.getNestedStackTraceString();
    }
    
    public void printStackTrace() {
        info.printStackTrace();
    }
    
    public void printStackTrace(PrintStream stream) {
        info.printStackTrace(stream);
    }
    
    public void printStackTrace(PrintWriter writer) {
        info.printStackTrace(writer);
    }
    /**
     * @deprecated
     */
    public void setLogSettings(Category category, int i, Location location) {
        info.setLogSettings(category, i, location);
    }
    /**
     * @deprecated
     */
    public void log() {
        info.log();
    }
    
    private Object writeReplace(){
        StringWriter stringWriter = new StringWriter();
        printStackTrace(new PrintWriter(stringWriter,true));
        return new Exception(stringWriter.toString());
    }
}
