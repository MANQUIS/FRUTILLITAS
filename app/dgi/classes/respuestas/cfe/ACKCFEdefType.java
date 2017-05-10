//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.11 at 05:27:01 PM UYT 
//


package dgi.classes.respuestas.cfe;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ACKCFEdefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACKCFEdefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Caratula">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RUCReceptor" type="{http://cfe.dgi.gub.uy}RUCType"/>
 *                   &lt;element name="RUCEmisor" type="{http://cfe.dgi.gub.uy}RUCType"/>
 *                   &lt;element name="IDRespuesta">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;totalDigits value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="NomArch" type="{http://cfe.dgi.gub.uy}NomArchType"/>
 *                   &lt;element name="FecHRecibido" type="{http://cfe.dgi.gub.uy}FechaHoraType"/>
 *                   &lt;element name="IDEmisor" type="{http://cfe.dgi.gub.uy}IDRecEmiType"/>
 *                   &lt;element name="IDReceptor" type="{http://cfe.dgi.gub.uy}IDRecEmiType"/>
 *                   &lt;element name="CantenSobre">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;totalDigits value="3"/>
 *                         &lt;minInclusive value="0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CantResponden">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;totalDigits value="3"/>
 *                         &lt;minInclusive value="0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CantCFEAceptados" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;totalDigits value="3"/>
 *                         &lt;minInclusive value="0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CantCFERechazados" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;totalDigits value="3"/>
 *                         &lt;minInclusive value="0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CantCFCAceptados" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;totalDigits value="3"/>
 *                         &lt;minInclusive value="0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CantCFCObservados" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;totalDigits value="3"/>
 *                         &lt;minInclusive value="0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CantOtrosRechazados" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;totalDigits value="3"/>
 *                         &lt;minInclusive value="0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Tmst" type="{http://cfe.dgi.gub.uy}FechaHoraType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ACKCFE_Det" maxOccurs="250">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Nro_ordinal" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="TipoCFE" type="{http://cfe.dgi.gub.uy}CFEType" minOccurs="0"/>
 *                   &lt;element name="Serie" type="{http://cfe.dgi.gub.uy}SerieType" minOccurs="0"/>
 *                   &lt;element name="NroCFE" type="{http://cfe.dgi.gub.uy}NroCFEType" minOccurs="0"/>
 *                   &lt;element name="FechaCFE" type="{http://cfe.dgi.gub.uy}FechaType" minOccurs="0"/>
 *                   &lt;element name="TmstCFE" type="{http://cfe.dgi.gub.uy}FechaHoraType" minOccurs="0"/>
 *                   &lt;element name="Estado" type="{http://cfe.dgi.gub.uy}EstadoACKCFEType"/>
 *                   &lt;choice>
 *                     &lt;element name="MotivosRechazoCF" type="{http://cfe.dgi.gub.uy}RechazoCFE_DGIType" maxOccurs="30" minOccurs="0"/>
 *                     &lt;element name="ObsCFC" type="{http://cfe.dgi.gub.uy}ObsCFCType" maxOccurs="10" minOccurs="0"/>
 *                   &lt;/choice>
 *                   &lt;element name="InfoRespOri" type="{http://cfe.dgi.gub.uy}InfoRespOriType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" fixed="1.0">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="3"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACKCFEdefType", namespace = "http://cfe.dgi.gub.uy", propOrder = {
    "caratula",
    "ackcfeDet",
    "signature"
})
@XmlRootElement(name = "ACKCFE")
public class ACKCFEdefType {

    @XmlElement(name = "Caratula", required = true)
    protected ACKCFEdefType.Caratula caratula;
    @XmlElement(name = "ACKCFE_Det", required = true)
    protected List<ACKCFEdefType.ACKCFEDet> ackcfeDet;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the caratula property.
     * 
     * @return
     *     possible object is
     *     {@link ACKCFEdefType.Caratula }
     *     
     */
    public ACKCFEdefType.Caratula getCaratula() {
        return caratula;
    }

    /**
     * Sets the value of the caratula property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACKCFEdefType.Caratula }
     *     
     */
    public void setCaratula(ACKCFEdefType.Caratula value) {
        this.caratula = value;
    }

    /**
     * Gets the value of the ackcfeDet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ackcfeDet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getACKCFEDet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ACKCFEdefType.ACKCFEDet }
     * 
     * 
     */
    public List<ACKCFEdefType.ACKCFEDet> getACKCFEDet() {
        if (ackcfeDet == null) {
            ackcfeDet = new ArrayList<ACKCFEdefType.ACKCFEDet>();
        }
        return this.ackcfeDet;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "1.0";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
     *         &lt;element name="Nro_ordinal" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="TipoCFE" type="{http://cfe.dgi.gub.uy}CFEType" minOccurs="0"/>
     *         &lt;element name="Serie" type="{http://cfe.dgi.gub.uy}SerieType" minOccurs="0"/>
     *         &lt;element name="NroCFE" type="{http://cfe.dgi.gub.uy}NroCFEType" minOccurs="0"/>
     *         &lt;element name="FechaCFE" type="{http://cfe.dgi.gub.uy}FechaType" minOccurs="0"/>
     *         &lt;element name="TmstCFE" type="{http://cfe.dgi.gub.uy}FechaHoraType" minOccurs="0"/>
     *         &lt;element name="Estado" type="{http://cfe.dgi.gub.uy}EstadoACKCFEType"/>
     *         &lt;choice>
     *           &lt;element name="MotivosRechazoCF" type="{http://cfe.dgi.gub.uy}RechazoCFE_DGIType" maxOccurs="30" minOccurs="0"/>
     *           &lt;element name="ObsCFC" type="{http://cfe.dgi.gub.uy}ObsCFCType" maxOccurs="10" minOccurs="0"/>
     *         &lt;/choice>
     *         &lt;element name="InfoRespOri" type="{http://cfe.dgi.gub.uy}InfoRespOriType" minOccurs="0"/>
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
        "nroOrdinal",
        "tipoCFE",
        "serie",
        "nroCFE",
        "fechaCFE",
        "tmstCFE",
        "estado",
        "motivosRechazoCF",
        "obsCFC",
        "infoRespOri"
    })
    public static class ACKCFEDet {

        @XmlElement(name = "Nro_ordinal", namespace = "http://cfe.dgi.gub.uy", required = true)
        protected BigInteger nroOrdinal;
        @XmlElement(name = "TipoCFE", namespace = "http://cfe.dgi.gub.uy")
        protected BigInteger tipoCFE;
        @XmlElement(name = "Serie", namespace = "http://cfe.dgi.gub.uy")
        protected String serie;
        @XmlElement(name = "NroCFE", namespace = "http://cfe.dgi.gub.uy")
        protected BigInteger nroCFE;
        @XmlElement(name = "FechaCFE", namespace = "http://cfe.dgi.gub.uy")
        protected XMLGregorianCalendar fechaCFE;
        @XmlElement(name = "TmstCFE", namespace = "http://cfe.dgi.gub.uy")
        protected XMLGregorianCalendar tmstCFE;
        @XmlElement(name = "Estado", namespace = "http://cfe.dgi.gub.uy", required = true)
        protected EstadoACKCFEType estado;
        @XmlElement(name = "MotivosRechazoCF", namespace = "http://cfe.dgi.gub.uy")
        protected List<RechazoCFEDGIType> motivosRechazoCF;
        @XmlElement(name = "ObsCFC", namespace = "http://cfe.dgi.gub.uy")
        protected List<ObsCFCType> obsCFC;
        @XmlElement(name = "InfoRespOri", namespace = "http://cfe.dgi.gub.uy")
        protected InfoRespOriType infoRespOri;

        /**
         * Gets the value of the nroOrdinal property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNroOrdinal() {
            return nroOrdinal;
        }

        /**
         * Sets the value of the nroOrdinal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNroOrdinal(BigInteger value) {
            this.nroOrdinal = value;
        }

        /**
         * Gets the value of the tipoCFE property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTipoCFE() {
            return tipoCFE;
        }

        /**
         * Sets the value of the tipoCFE property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTipoCFE(BigInteger value) {
            this.tipoCFE = value;
        }

        /**
         * Gets the value of the serie property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSerie() {
            return serie;
        }

        /**
         * Sets the value of the serie property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSerie(String value) {
            this.serie = value;
        }

        /**
         * Gets the value of the nroCFE property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNroCFE() {
            return nroCFE;
        }

        /**
         * Sets the value of the nroCFE property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNroCFE(BigInteger value) {
            this.nroCFE = value;
        }

        /**
         * Gets the value of the fechaCFE property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFechaCFE() {
            return fechaCFE;
        }

        /**
         * Sets the value of the fechaCFE property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaCFE(XMLGregorianCalendar value) {
            this.fechaCFE = value;
        }

        /**
         * Gets the value of the tmstCFE property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTmstCFE() {
            return tmstCFE;
        }

        /**
         * Sets the value of the tmstCFE property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTmstCFE(XMLGregorianCalendar value) {
            this.tmstCFE = value;
        }

        /**
         * Gets the value of the estado property.
         * 
         * @return
         *     possible object is
         *     {@link EstadoACKCFEType }
         *     
         */
        public EstadoACKCFEType getEstado() {
            return estado;
        }

        /**
         * Sets the value of the estado property.
         * 
         * @param value
         *     allowed object is
         *     {@link EstadoACKCFEType }
         *     
         */
        public void setEstado(EstadoACKCFEType value) {
            this.estado = value;
        }

        /**
         * Gets the value of the motivosRechazoCF property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the motivosRechazoCF property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMotivosRechazoCF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RechazoCFEDGIType }
         * 
         * 
         */
        public List<RechazoCFEDGIType> getMotivosRechazoCF() {
            if (motivosRechazoCF == null) {
                motivosRechazoCF = new ArrayList<RechazoCFEDGIType>();
            }
            return this.motivosRechazoCF;
        }

        /**
         * Gets the value of the obsCFC property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the obsCFC property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getObsCFC().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ObsCFCType }
         * 
         * 
         */
        public List<ObsCFCType> getObsCFC() {
            if (obsCFC == null) {
                obsCFC = new ArrayList<ObsCFCType>();
            }
            return this.obsCFC;
        }

        /**
         * Gets the value of the infoRespOri property.
         * 
         * @return
         *     possible object is
         *     {@link InfoRespOriType }
         *     
         */
        public InfoRespOriType getInfoRespOri() {
            return infoRespOri;
        }

        /**
         * Sets the value of the infoRespOri property.
         * 
         * @param value
         *     allowed object is
         *     {@link InfoRespOriType }
         *     
         */
        public void setInfoRespOri(InfoRespOriType value) {
            this.infoRespOri = value;
        }

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
     *         &lt;element name="RUCReceptor" type="{http://cfe.dgi.gub.uy}RUCType"/>
     *         &lt;element name="RUCEmisor" type="{http://cfe.dgi.gub.uy}RUCType"/>
     *         &lt;element name="IDRespuesta">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;totalDigits value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="NomArch" type="{http://cfe.dgi.gub.uy}NomArchType"/>
     *         &lt;element name="FecHRecibido" type="{http://cfe.dgi.gub.uy}FechaHoraType"/>
     *         &lt;element name="IDEmisor" type="{http://cfe.dgi.gub.uy}IDRecEmiType"/>
     *         &lt;element name="IDReceptor" type="{http://cfe.dgi.gub.uy}IDRecEmiType"/>
     *         &lt;element name="CantenSobre">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;totalDigits value="3"/>
     *               &lt;minInclusive value="0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CantResponden">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;totalDigits value="3"/>
     *               &lt;minInclusive value="0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CantCFEAceptados" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;totalDigits value="3"/>
     *               &lt;minInclusive value="0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CantCFERechazados" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;totalDigits value="3"/>
     *               &lt;minInclusive value="0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CantCFCAceptados" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;totalDigits value="3"/>
     *               &lt;minInclusive value="0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CantCFCObservados" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;totalDigits value="3"/>
     *               &lt;minInclusive value="0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CantOtrosRechazados" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;totalDigits value="3"/>
     *               &lt;minInclusive value="0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Tmst" type="{http://cfe.dgi.gub.uy}FechaHoraType"/>
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
        "rucReceptor",
        "rucEmisor",
        "idRespuesta",
        "nomArch",
        "fecHRecibido",
        "idEmisor",
        "idReceptor",
        "cantenSobre",
        "cantResponden",
        "cantCFEAceptados",
        "cantCFERechazados",
        "cantCFCAceptados",
        "cantCFCObservados",
        "cantOtrosRechazados",
        "tmst"
    })
    public static class Caratula {

        @XmlElement(name = "RUCReceptor", namespace = "http://cfe.dgi.gub.uy", required = true)
        protected String rucReceptor;
        @XmlElement(name = "RUCEmisor", namespace = "http://cfe.dgi.gub.uy", required = true)
        protected String rucEmisor;
        @XmlElement(name = "IDRespuesta", namespace = "http://cfe.dgi.gub.uy", required = true)
        protected BigInteger idRespuesta;
        @XmlElement(name = "NomArch", namespace = "http://cfe.dgi.gub.uy", required = true)
        protected String nomArch;
        @XmlElement(name = "FecHRecibido", namespace = "http://cfe.dgi.gub.uy", required = true)
        protected XMLGregorianCalendar fecHRecibido;
        @XmlElement(name = "IDEmisor", namespace = "http://cfe.dgi.gub.uy", required = true)
        protected BigInteger idEmisor;
        @XmlElement(name = "IDReceptor", namespace = "http://cfe.dgi.gub.uy", required = true)
        protected BigInteger idReceptor;
        @XmlElement(name = "CantenSobre", namespace = "http://cfe.dgi.gub.uy", required = true)
        protected BigInteger cantenSobre;
        @XmlElement(name = "CantResponden", namespace = "http://cfe.dgi.gub.uy", required = true)
        protected BigInteger cantResponden;
        @XmlElement(name = "CantCFEAceptados", namespace = "http://cfe.dgi.gub.uy")
        protected BigInteger cantCFEAceptados;
        @XmlElement(name = "CantCFERechazados", namespace = "http://cfe.dgi.gub.uy")
        protected BigInteger cantCFERechazados;
        @XmlElement(name = "CantCFCAceptados", namespace = "http://cfe.dgi.gub.uy")
        protected BigInteger cantCFCAceptados;
        @XmlElement(name = "CantCFCObservados", namespace = "http://cfe.dgi.gub.uy")
        protected BigInteger cantCFCObservados;
        @XmlElement(name = "CantOtrosRechazados", namespace = "http://cfe.dgi.gub.uy")
        protected BigInteger cantOtrosRechazados;
        @XmlElement(name = "Tmst", namespace = "http://cfe.dgi.gub.uy", required = true)
        protected XMLGregorianCalendar tmst;

        /**
         * Gets the value of the rucReceptor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRUCReceptor() {
            return rucReceptor;
        }

        /**
         * Sets the value of the rucReceptor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRUCReceptor(String value) {
            this.rucReceptor = value;
        }

        /**
         * Gets the value of the rucEmisor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRUCEmisor() {
            return rucEmisor;
        }

        /**
         * Sets the value of the rucEmisor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRUCEmisor(String value) {
            this.rucEmisor = value;
        }

        /**
         * Gets the value of the idRespuesta property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIDRespuesta() {
            return idRespuesta;
        }

        /**
         * Sets the value of the idRespuesta property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIDRespuesta(BigInteger value) {
            this.idRespuesta = value;
        }

        /**
         * Gets the value of the nomArch property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomArch() {
            return nomArch;
        }

        /**
         * Sets the value of the nomArch property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNomArch(String value) {
            this.nomArch = value;
        }

        /**
         * Gets the value of the fecHRecibido property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFecHRecibido() {
            return fecHRecibido;
        }

        /**
         * Sets the value of the fecHRecibido property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFecHRecibido(XMLGregorianCalendar value) {
            this.fecHRecibido = value;
        }

        /**
         * Gets the value of the idEmisor property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIDEmisor() {
            return idEmisor;
        }

        /**
         * Sets the value of the idEmisor property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIDEmisor(BigInteger value) {
            this.idEmisor = value;
        }

        /**
         * Gets the value of the idReceptor property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIDReceptor() {
            return idReceptor;
        }

        /**
         * Sets the value of the idReceptor property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIDReceptor(BigInteger value) {
            this.idReceptor = value;
        }

        /**
         * Gets the value of the cantenSobre property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCantenSobre() {
            return cantenSobre;
        }

        /**
         * Sets the value of the cantenSobre property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCantenSobre(BigInteger value) {
            this.cantenSobre = value;
        }

        /**
         * Gets the value of the cantResponden property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCantResponden() {
            return cantResponden;
        }

        /**
         * Sets the value of the cantResponden property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCantResponden(BigInteger value) {
            this.cantResponden = value;
        }

        /**
         * Gets the value of the cantCFEAceptados property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCantCFEAceptados() {
            return cantCFEAceptados;
        }

        /**
         * Sets the value of the cantCFEAceptados property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCantCFEAceptados(BigInteger value) {
            this.cantCFEAceptados = value;
        }

        /**
         * Gets the value of the cantCFERechazados property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCantCFERechazados() {
            return cantCFERechazados;
        }

        /**
         * Sets the value of the cantCFERechazados property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCantCFERechazados(BigInteger value) {
            this.cantCFERechazados = value;
        }

        /**
         * Gets the value of the cantCFCAceptados property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCantCFCAceptados() {
            return cantCFCAceptados;
        }

        /**
         * Sets the value of the cantCFCAceptados property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCantCFCAceptados(BigInteger value) {
            this.cantCFCAceptados = value;
        }

        /**
         * Gets the value of the cantCFCObservados property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCantCFCObservados() {
            return cantCFCObservados;
        }

        /**
         * Sets the value of the cantCFCObservados property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCantCFCObservados(BigInteger value) {
            this.cantCFCObservados = value;
        }

        /**
         * Gets the value of the cantOtrosRechazados property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCantOtrosRechazados() {
            return cantOtrosRechazados;
        }

        /**
         * Sets the value of the cantOtrosRechazados property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCantOtrosRechazados(BigInteger value) {
            this.cantOtrosRechazados = value;
        }

        /**
         * Gets the value of the tmst property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTmst() {
            return tmst;
        }

        /**
         * Sets the value of the tmst property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTmst(XMLGregorianCalendar value) {
            this.tmst = value;
        }

    }

}
