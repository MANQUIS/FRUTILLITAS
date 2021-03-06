//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.11 at 05:34:27 PM UYT 
//


package dgi.classes.entreEmpresas;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediosPago complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediosPago">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MedioPago" maxOccurs="40" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NroLinMP">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://cfe.dgi.gub.uy}LineasMP">
 *                         &lt;minInclusive value="1"/>
 *                         &lt;maxInclusive value="40"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CodMP" type="{http://cfe.dgi.gub.uy}MedioPagoType" minOccurs="0"/>
 *                   &lt;element name="GlosaMP" type="{http://cfe.dgi.gub.uy}Glosa50Type"/>
 *                   &lt;element name="OrdenMP" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;totalDigits value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ValorPago" type="{http://cfe.dgi.gub.uy}Monto_admite_negType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediosPago", propOrder = {
    "medioPagos"
})
public class MediosPago {

    @XmlElement(name = "MedioPago")
    protected List<MediosPago.MedioPago> medioPagos;

    /**
     * Gets the value of the medioPagos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the medioPagos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedioPagos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediosPago.MedioPago }
     * 
     * 
     */
    public List<MediosPago.MedioPago> getMedioPagos() {
        if (medioPagos == null) {
            medioPagos = new ArrayList<MediosPago.MedioPago>();
        }
        return this.medioPagos;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="NroLinMP">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://cfe.dgi.gub.uy}LineasMP">
     *               &lt;minInclusive value="1"/>
     *               &lt;maxInclusive value="40"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CodMP" type="{http://cfe.dgi.gub.uy}MedioPagoType" minOccurs="0"/>
     *         &lt;element name="GlosaMP" type="{http://cfe.dgi.gub.uy}Glosa50Type"/>
     *         &lt;element name="OrdenMP" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;totalDigits value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ValorPago" type="{http://cfe.dgi.gub.uy}Monto_admite_negType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nroLinMP",
        "codMP",
        "glosaMP",
        "ordenMP",
        "valorPago"
    })
    public static class MedioPago {

        @XmlElement(name = "NroLinMP")
        protected int nroLinMP;
        @XmlElement(name = "CodMP")
        protected BigInteger codMP;
        @XmlElement(name = "GlosaMP", required = true)
        protected String glosaMP;
        @XmlElement(name = "OrdenMP")
        protected BigInteger ordenMP;
        @XmlElement(name = "ValorPago", required = true)
        protected BigDecimal valorPago;

        /**
         * Gets the value of the nroLinMP property.
         * 
         */
        public int getNroLinMP() {
            return nroLinMP;
        }

        /**
         * Sets the value of the nroLinMP property.
         * 
         */
        public void setNroLinMP(int value) {
            this.nroLinMP = value;
        }

        /**
         * Gets the value of the codMP property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCodMP() {
            return codMP;
        }

        /**
         * Sets the value of the codMP property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCodMP(BigInteger value) {
            this.codMP = value;
        }

        /**
         * Gets the value of the glosaMP property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGlosaMP() {
            return glosaMP;
        }

        /**
         * Sets the value of the glosaMP property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGlosaMP(String value) {
            this.glosaMP = value;
        }

        /**
         * Gets the value of the ordenMP property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOrdenMP() {
            return ordenMP;
        }

        /**
         * Sets the value of the ordenMP property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOrdenMP(BigInteger value) {
            this.ordenMP = value;
        }

        /**
         * Gets the value of the valorPago property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorPago() {
            return valorPago;
        }

        /**
         * Sets the value of the valorPago property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorPago(BigDecimal value) {
            this.valorPago = value;
        }

    }

}
