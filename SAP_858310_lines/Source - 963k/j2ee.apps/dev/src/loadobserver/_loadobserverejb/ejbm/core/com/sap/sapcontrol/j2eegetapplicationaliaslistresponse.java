
package com.sap.sapcontrol;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for J2EEGetApplicationAliasListResponse element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="J2EEGetApplicationAliasListResponse">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="alias" type="{urn:SAPControl}ArrayOfJ2EEApplicationAlias" minOccurs="0"/>
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
    "alias"
})
@XmlRootElement(name = "J2EEGetApplicationAliasListResponse")
public class J2EEGetApplicationAliasListResponse {

    @XmlElementRef(name = "alias", type = JAXBElement.class)
    protected JAXBElement<ArrayOfJ2EEApplicationAlias> alias;

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJ2EEApplicationAlias }{@code >}
     *     
     */
    public JAXBElement<ArrayOfJ2EEApplicationAlias> getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJ2EEApplicationAlias }{@code >}
     *     
     */
    public void setAlias(JAXBElement<ArrayOfJ2EEApplicationAlias> value) {
        this.alias = ((JAXBElement<ArrayOfJ2EEApplicationAlias> ) value);
    }

}
