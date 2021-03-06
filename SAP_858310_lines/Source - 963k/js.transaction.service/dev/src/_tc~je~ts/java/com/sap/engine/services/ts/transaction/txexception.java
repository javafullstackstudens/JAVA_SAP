package com.sap.engine.services.ts.transaction;

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
 * A <code>TxException</code> is thrown to indicate that the transaction
 * manager has encountered an unexpected error situation. Most likely, an
 * exception of this type is raised when a call to the underlying JTA
 * transaction manager has failed. In this case, the caught JTA exception is
 * packed as "cause" attribute into the <code>TxException</code>.
 */
public class TxException extends com.sap.transaction.TxException implements IBaseException{

  static final long serialVersionUID = -7537633520682818211L;
  private BaseExceptionInfo info = null;
    
    /** Creates a new instance of TxException */
    public TxException(String key) {
        super();
        info = new BaseExceptionInfo(TSResourceAccessor.location,
        new LocalizableTextFormatter(TSResourceAccessor.getResourceAccessor(), key, (Object[])null), this, null);
    }
    
    public TxException(String key, Throwable t) {
        super(key);
        info = new BaseExceptionInfo(TSResourceAccessor.location,
        new LocalizableTextFormatter(TSResourceAccessor.getResourceAccessor(), key, (Object[])null), this, t);
    }
    
    
    public TxException(String key, Object[] args, Throwable t) {
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
