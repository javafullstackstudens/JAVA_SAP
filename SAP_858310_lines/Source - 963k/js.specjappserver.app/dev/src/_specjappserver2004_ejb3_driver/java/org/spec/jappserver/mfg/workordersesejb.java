package org.spec.jappserver.mfg;

/**
 * Service Endpoint Interface (generated by SAP WSDL to Java generator).
 */
@javax.jws.WebService(name = "WorkOrderSesEJB", targetNamespace = "http://mfg.jappserver.spec.org/")
@javax.jws.soap.SOAPBinding(parameterStyle = javax.jws.soap.SOAPBinding.ParameterStyle.WRAPPED, style = javax.jws.soap.SOAPBinding.Style.DOCUMENT, use = javax.jws.soap.SOAPBinding.Use.LITERAL)
public interface WorkOrderSesEJB {

  /**
   * Java representation of web method [scheduleWorkOrder].
   */
  @javax.jws.WebMethod(operationName = "scheduleWorkOrder")
  @javax.xml.ws.RequestWrapper(localName = "scheduleWorkOrder", targetNamespace = "http://mfg.jappserver.spec.org/", className = "org.spec.jappserver.mfg.ScheduleWorkOrderType")
  @javax.xml.ws.ResponseWrapper(localName = "scheduleWorkOrderResponse", targetNamespace = "http://mfg.jappserver.spec.org/", className = "org.spec.jappserver.mfg.ScheduleWorkOrderResponseType")
  @javax.jws.WebResult(name = "return", targetNamespace = "")
  public int scheduleWorkOrder(@javax.jws.WebParam(name = "arg0", targetNamespace = "") java.lang.String arg0, @javax.jws.WebParam(name = "arg1", targetNamespace = "") int arg1, @javax.jws.WebParam(name = "arg2", targetNamespace = "") javax.xml.datatype.XMLGregorianCalendar arg2);

  /**
   * Java representation of web method [scheduleLargeWorkOrder].
   */
  @javax.jws.WebMethod(operationName = "scheduleLargeWorkOrder")
  @javax.xml.ws.RequestWrapper(localName = "scheduleLargeWorkOrder", targetNamespace = "http://mfg.jappserver.spec.org/", className = "org.spec.jappserver.mfg.ScheduleLargeWorkOrderType")
  @javax.xml.ws.ResponseWrapper(localName = "scheduleLargeWorkOrderResponse", targetNamespace = "http://mfg.jappserver.spec.org/", className = "org.spec.jappserver.mfg.ScheduleLargeWorkOrderResponseType")
  @javax.jws.WebResult(name = "return", targetNamespace = "")
  public int scheduleLargeWorkOrder(@javax.jws.WebParam(name = "arg0", targetNamespace = "") int arg0, @javax.jws.WebParam(name = "arg1", targetNamespace = "") int arg1, @javax.jws.WebParam(name = "arg2", targetNamespace = "") java.lang.String arg2, @javax.jws.WebParam(name = "arg3", targetNamespace = "") int arg3, @javax.jws.WebParam(name = "arg4", targetNamespace = "") javax.xml.datatype.XMLGregorianCalendar arg4);

  /**
   * Java representation of web method [updateWorkOrder].
   */
  @javax.jws.WebMethod(operationName = "updateWorkOrder")
  @javax.xml.ws.RequestWrapper(localName = "updateWorkOrder", targetNamespace = "http://mfg.jappserver.spec.org/", className = "org.spec.jappserver.mfg.UpdateWorkOrderType")
  @javax.xml.ws.ResponseWrapper(localName = "updateWorkOrderResponse", targetNamespace = "http://mfg.jappserver.spec.org/", className = "org.spec.jappserver.mfg.UpdateWorkOrderResponseType")
  public void updateWorkOrder(@javax.jws.WebParam(name = "arg0", targetNamespace = "") int arg0);

  /**
   * Java representation of web method [completeWorkOrder].
   */
  @javax.jws.WebMethod(operationName = "completeWorkOrder")
  @javax.xml.ws.RequestWrapper(localName = "completeWorkOrder", targetNamespace = "http://mfg.jappserver.spec.org/", className = "org.spec.jappserver.mfg.CompleteWorkOrderType")
  @javax.xml.ws.ResponseWrapper(localName = "completeWorkOrderResponse", targetNamespace = "http://mfg.jappserver.spec.org/", className = "org.spec.jappserver.mfg.CompleteWorkOrderResponseType")
  @javax.jws.WebResult(name = "return", targetNamespace = "")
  public boolean completeWorkOrder(@javax.jws.WebParam(name = "arg0", targetNamespace = "") int arg0);

}
