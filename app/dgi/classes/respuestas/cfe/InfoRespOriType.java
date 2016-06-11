//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.11 at 05:27:01 PM UYT 
//


package dgi.classes.respuestas.cfe;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InfoRespOriType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InfoRespOriType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDRespSobre" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="IDEmisorSobre" type="{http://cfe.dgi.gub.uy}IDRecEmiType"/>
 *         &lt;element name="IDReceptorSobre" type="{http://cfe.dgi.gub.uy}IDRecEmiType"/>
 *         &lt;element name="IDTokenSobre" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoRespOriType", namespace = "http://cfe.dgi.gub.uy", propOrder = {
    "idRespSobre",
    "idEmisorSobre",
    "idReceptorSobre",
    "idTokenSobre"
})
public class InfoRespOriType {

    @XmlElement(name = "IDRespSobre", required = true)
    protected BigInteger idRespSobre;
    @XmlElement(name = "IDEmisorSobre", required = true)
    protected BigInteger idEmisorSobre;
    @XmlElement(name = "IDReceptorSobre", required = true)
    protected BigInteger idReceptorSobre;
    @XmlElement(name = "IDTokenSobre", required = true)
    protected byte[] idTokenSobre;

    /**
     * Gets the value of the idRespSobre property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIDRespSobre() {
        return idRespSobre;
    }

    /**
     * Sets the value of the idRespSobre property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIDRespSobre(BigInteger value) {
        this.idRespSobre = value;
    }

    /**
     * Gets the value of the idEmisorSobre property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIDEmisorSobre() {
        return idEmisorSobre;
    }

    /**
     * Sets the value of the idEmisorSobre property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIDEmisorSobre(BigInteger value) {
        this.idEmisorSobre = value;
    }

    /**
     * Gets the value of the idReceptorSobre property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIDReceptorSobre() {
        return idReceptorSobre;
    }

    /**
     * Sets the value of the idReceptorSobre property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIDReceptorSobre(BigInteger value) {
        this.idReceptorSobre = value;
    }

    /**
     * Gets the value of the idTokenSobre property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getIDTokenSobre() {
        return idTokenSobre;
    }

    /**
     * Sets the value of the idTokenSobre property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setIDTokenSobre(byte[] value) {
        this.idTokenSobre = value;
    }

}
