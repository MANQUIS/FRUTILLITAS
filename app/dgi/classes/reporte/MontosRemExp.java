//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.01 at 06:40:40 PM UYT 
//


package dgi.classes.reporte;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Montos_Rem_Exp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Montos_Rem_Exp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mnts_Rem_Exp_Item" maxOccurs="1000">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Fecha" type="{http://cfe.dgi.gub.uy}FechaType"/>
 *                   &lt;element name="CodSuc" type="{http://cfe.dgi.gub.uy}CodSucType"/>
 *                   &lt;element name="TotMntExpyAsim" type="{http://cfe.dgi.gub.uy}Monto_admite_negType"/>
 *                   &lt;element name="TotMntTotal" type="{http://cfe.dgi.gub.uy}Monto_admite_negType"/>
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
@XmlType(name = "Montos_Rem_Exp", propOrder = {
    "mntsRemExpItem"
})
public class MontosRemExp {

    @XmlElement(name = "Mnts_Rem_Exp_Item", required = true)
    protected List<MontosRemExp.MntsRemExpItem> mntsRemExpItem;

    /**
     * Gets the value of the mntsRemExpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mntsRemExpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMntsRemExpItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MontosRemExp.MntsRemExpItem }
     * 
     * 
     */
    public List<MontosRemExp.MntsRemExpItem> getMntsRemExpItem() {
        if (mntsRemExpItem == null) {
            mntsRemExpItem = new ArrayList<MontosRemExp.MntsRemExpItem>();
        }
        return this.mntsRemExpItem;
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
     *         &lt;element name="Fecha" type="{http://cfe.dgi.gub.uy}FechaType"/>
     *         &lt;element name="CodSuc" type="{http://cfe.dgi.gub.uy}CodSucType"/>
     *         &lt;element name="TotMntExpyAsim" type="{http://cfe.dgi.gub.uy}Monto_admite_negType"/>
     *         &lt;element name="TotMntTotal" type="{http://cfe.dgi.gub.uy}Monto_admite_negType"/>
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
        "fecha",
        "codSuc",
        "totMntExpyAsim",
        "totMntTotal"
    })
    public static class MntsRemExpItem {

        @XmlElement(name = "Fecha", required = true)
        protected XMLGregorianCalendar fecha;
        @XmlElement(name = "CodSuc", required = true)
        protected BigInteger codSuc;
        @XmlElement(name = "TotMntExpyAsim", required = true)
        protected BigDecimal totMntExpyAsim;
        @XmlElement(name = "TotMntTotal", required = true)
        protected BigDecimal totMntTotal;

        /**
         * Gets the value of the fecha property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFecha() {
            return fecha;
        }

        /**
         * Sets the value of the fecha property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFecha(XMLGregorianCalendar value) {
            this.fecha = value;
        }

        /**
         * Gets the value of the codSuc property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCodSuc() {
            return codSuc;
        }

        /**
         * Sets the value of the codSuc property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCodSuc(BigInteger value) {
            this.codSuc = value;
        }

        /**
         * Gets the value of the totMntExpyAsim property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotMntExpyAsim() {
            return totMntExpyAsim;
        }

        /**
         * Sets the value of the totMntExpyAsim property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotMntExpyAsim(BigDecimal value) {
            this.totMntExpyAsim = value;
        }

        /**
         * Gets the value of the totMntTotal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotMntTotal() {
            return totMntTotal;
        }

        /**
         * Sets the value of the totMntTotal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotMntTotal(BigDecimal value) {
            this.totMntTotal = value;
        }

    }

}
