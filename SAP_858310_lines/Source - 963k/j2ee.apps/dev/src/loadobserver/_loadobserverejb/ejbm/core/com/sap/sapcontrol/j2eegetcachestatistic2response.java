
package com.sap.sapcontrol;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for J2EEGetCacheStatistic2Response element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="J2EEGetCacheStatistic2Response">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="cache" type="{urn:SAPControl}ArrayOfJ2EECache2" minOccurs="0"/>
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
    "cache"
})
@XmlRootElement(name = "J2EEGetCacheStatistic2Response")
public class J2EEGetCacheStatistic2Response {

    @XmlElementRef(name = "cache", type = JAXBElement.class)
    protected JAXBElement<ArrayOfJ2EECache2> cache;

    /**
     * Gets the value of the cache property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJ2EECache2 }{@code >}
     *     
     */
    public JAXBElement<ArrayOfJ2EECache2> getCache() {
        return cache;
    }

    /**
     * Sets the value of the cache property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJ2EECache2 }{@code >}
     *     
     */
    public void setCache(JAXBElement<ArrayOfJ2EECache2> value) {
        this.cache = ((JAXBElement<ArrayOfJ2EECache2> ) value);
    }

}
