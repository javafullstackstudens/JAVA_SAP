
package com.sap.sapcontrol;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for J2EEGetThreadList2Response element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="J2EEGetThreadList2Response">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="thread" type="{urn:SAPControl}ArrayOfJ2EEThread2" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "thread"
})
@XmlRootElement(name = "J2EEGetThreadList2Response")
public class J2EEGetThreadList2Response {

    @XmlElementRef(name = "thread", type = JAXBElement.class)
    protected JAXBElement<ArrayOfJ2EEThread2> thread;

    /**
     * Gets the value of the thread property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJ2EEThread2 }{@code >}
     *     
     */
    public JAXBElement<ArrayOfJ2EEThread2> getThread() {
        return thread;
    }

    /**
     * Sets the value of the thread property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJ2EEThread2 }{@code >}
     *     
     */
    public void setThread(JAXBElement<ArrayOfJ2EEThread2> value) {
        this.thread = ((JAXBElement<ArrayOfJ2EEThread2> ) value);
    }

}
