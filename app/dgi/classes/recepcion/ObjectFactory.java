//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.01 at 06:36:07 PM UYT 
//


package dgi.classes.recepcion;

import java.math.BigInteger;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dgi.classes.recepcion package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MgmtData_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "MgmtData");
    private final static QName _KeyName_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "KeyName");
    private final static QName _DigestValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "DigestValue");
    private final static QName _AgreementMethodOriginatorKeyInfo_QNAME = new QName("http://www.w3.org/2001/04/xmlenc#", "OriginatorKeyInfo");
    private final static QName _AgreementMethodRecipientKeyInfo_QNAME = new QName("http://www.w3.org/2001/04/xmlenc#", "RecipientKeyInfo");
    private final static QName _AgreementMethodKANonce_QNAME = new QName("http://www.w3.org/2001/04/xmlenc#", "KA-Nonce");
    private final static QName _X509DataX509IssuerSerial_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509IssuerSerial");
    private final static QName _X509DataX509Certificate_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509Certificate");
    private final static QName _X509DataX509SKI_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509SKI");
    private final static QName _X509DataX509SubjectName_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509SubjectName");
    private final static QName _X509DataX509CRL_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509CRL");
    private final static QName _TransformXPath_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "XPath");
    private final static QName _EncryptionMethodTypeKeySize_QNAME = new QName("http://www.w3.org/2001/04/xmlenc#", "KeySize");
    private final static QName _EncryptionMethodTypeOAEPparams_QNAME = new QName("http://www.w3.org/2001/04/xmlenc#", "OAEPparams");
    private final static QName _SignatureMethodHMACOutputLength_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "HMACOutputLength");
    private final static QName _ReferenceListDataReference_QNAME = new QName("http://www.w3.org/2001/04/xmlenc#", "DataReference");
    private final static QName _ReferenceListKeyReference_QNAME = new QName("http://www.w3.org/2001/04/xmlenc#", "KeyReference");
    private final static QName _SPKIDataSPKISexp_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SPKISexp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dgi.classes.recepcion
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EnvioCFE }
     * 
     */
    public EnvioCFE createEnvioCFE() {
        return new EnvioCFE();
    }

    /**
     * Create an instance of {@link ItemDetFactExp }
     * 
     */
    public ItemDetFactExp createItemDetFactExp() {
        return new ItemDetFactExp();
    }

    /**
     * Create an instance of {@link ItemRem }
     * 
     */
    public ItemRem createItemRem() {
        return new ItemRem();
    }

    /**
     * Create an instance of {@link ItemRemExp }
     * 
     */
    public ItemRemExp createItemRemExp() {
        return new ItemRemExp();
    }

    /**
     * Create an instance of {@link MediosPago }
     * 
     */
    public MediosPago createMediosPago() {
        return new MediosPago();
    }

    /**
     * Create an instance of {@link DscRcgGlobal }
     * 
     */
    public DscRcgGlobal createDscRcgGlobal() {
        return new DscRcgGlobal();
    }

    /**
     * Create an instance of {@link dgi.classes.recepcion.Totales }
     * 
     */
    public dgi.classes.recepcion.Totales createTotales() {
        return new dgi.classes.recepcion.Totales();
    }

    /**
     * Create an instance of {@link ItemDetFact }
     * 
     */
    public ItemDetFact createItemDetFact() {
        return new ItemDetFact();
    }

    /**
     * Create an instance of {@link ReferenciaTipo }
     * 
     */
    public ReferenciaTipo createReferenciaTipo() {
        return new ReferenciaTipo();
    }

    /**
     * Create an instance of {@link TotalesResg }
     * 
     */
    public TotalesResg createTotalesResg() {
        return new TotalesResg();
    }

    /**
     * Create an instance of {@link SubTotInfo }
     * 
     */
    public SubTotInfo createSubTotInfo() {
        return new SubTotInfo();
    }

    /**
     * Create an instance of {@link CFEDefType }
     * 
     */
    public CFEDefType createCFEDefType() {
        return new CFEDefType();
    }

    /**
     * Create an instance of {@link CFEDefType.ETck }
     * 
     */
    public CFEDefType.ETck createCFEDefTypeETck() {
        return new CFEDefType.ETck();
    }

    /**
     * Create an instance of {@link CFEDefType.EFact }
     * 
     */
    public CFEDefType.EFact createCFEDefTypeEFact() {
        return new CFEDefType.EFact();
    }

    /**
     * Create an instance of {@link CFEDefType.EFactExp }
     * 
     */
    public CFEDefType.EFactExp createCFEDefTypeEFactExp() {
        return new CFEDefType.EFactExp();
    }

    /**
     * Create an instance of {@link CFEDefType.ERem }
     * 
     */
    public CFEDefType.ERem createCFEDefTypeERem() {
        return new CFEDefType.ERem();
    }

    /**
     * Create an instance of {@link CFEDefType.ERem.Encabezado }
     * 
     */
    public CFEDefType.ERem.Encabezado createCFEDefTypeERemEncabezado() {
        return new CFEDefType.ERem.Encabezado();
    }

    /**
     * Create an instance of {@link CFEDefType.ERemExp }
     * 
     */
    public CFEDefType.ERemExp createCFEDefTypeERemExp() {
        return new CFEDefType.ERemExp();
    }

    /**
     * Create an instance of {@link CFEDefType.EResg }
     * 
     */
    public CFEDefType.EResg createCFEDefTypeEResg() {
        return new CFEDefType.EResg();
    }

    /**
     * Create an instance of {@link EnvioCFE.Caratula }
     * 
     */
    public EnvioCFE.Caratula createEnvioCFECaratula() {
        return new EnvioCFE.Caratula();
    }

    /**
     * Create an instance of {@link IdDocRem }
     * 
     */
    public IdDocRem createIdDocRem() {
        return new IdDocRem();
    }

    /**
     * Create an instance of {@link ReceptorTck }
     * 
     */
    public ReceptorTck createReceptorTck() {
        return new ReceptorTck();
    }

    /**
     * Create an instance of {@link IdDocFactExp }
     * 
     */
    public IdDocFactExp createIdDocFactExp() {
        return new IdDocFactExp();
    }

    /**
     * Create an instance of {@link ComplFiscalType }
     * 
     */
    public ComplFiscalType createComplFiscalType() {
        return new ComplFiscalType();
    }

    /**
     * Create an instance of {@link ReceptorRem }
     * 
     */
    public ReceptorRem createReceptorRem() {
        return new ReceptorRem();
    }

    /**
     * Create an instance of {@link ReceptorRemExp }
     * 
     */
    public ReceptorRemExp createReceptorRemExp() {
        return new ReceptorRemExp();
    }

    /**
     * Create an instance of {@link IdDocCompFisc }
     * 
     */
    public IdDocCompFisc createIdDocCompFisc() {
        return new IdDocCompFisc();
    }

    /**
     * Create an instance of {@link CAEDataType }
     * 
     */
    public CAEDataType createCAEDataType() {
        return new CAEDataType();
    }

    /**
     * Create an instance of {@link TotalesRemExp }
     * 
     */
    public TotalesRemExp createTotalesRemExp() {
        return new TotalesRemExp();
    }

    /**
     * Create an instance of {@link TotalesFactExp }
     * 
     */
    public TotalesFactExp createTotalesFactExp() {
        return new TotalesFactExp();
    }

    /**
     * Create an instance of {@link DatosComplFiscType }
     * 
     */
    public DatosComplFiscType createDatosComplFiscType() {
        return new DatosComplFiscType();
    }

    /**
     * Create an instance of {@link ReceptorFact }
     * 
     */
    public ReceptorFact createReceptorFact() {
        return new ReceptorFact();
    }

    /**
     * Create an instance of {@link RechazoCFEDGIType }
     * 
     */
    public RechazoCFEDGIType createRechazoCFEDGIType() {
        return new RechazoCFEDGIType();
    }

    /**
     * Create an instance of {@link RechazoCFEPartesType }
     * 
     */
    public RechazoCFEPartesType createRechazoCFEPartesType() {
        return new RechazoCFEPartesType();
    }

    /**
     * Create an instance of {@link IdDocRemExp }
     * 
     */
    public IdDocRemExp createIdDocRemExp() {
        return new IdDocRemExp();
    }

    /**
     * Create an instance of {@link RetPercResg }
     * 
     */
    public RetPercResg createRetPercResg() {
        return new RetPercResg();
    }

    /**
     * Create an instance of {@link RechazoSobreType }
     * 
     */
    public RechazoSobreType createRechazoSobreType() {
        return new RechazoSobreType();
    }

    /**
     * Create an instance of {@link IdDocFact }
     * 
     */
    public IdDocFact createIdDocFact() {
        return new IdDocFact();
    }

    /**
     * Create an instance of {@link ReceptorResg }
     * 
     */
    public ReceptorResg createReceptorResg() {
        return new ReceptorResg();
    }

    /**
     * Create an instance of {@link Emisor }
     * 
     */
    public Emisor createEmisor() {
        return new Emisor();
    }

    /**
     * Create an instance of {@link ComplFiscalDataType }
     * 
     */
    public ComplFiscalDataType createComplFiscalDataType() {
        return new ComplFiscalDataType();
    }

    /**
     * Create an instance of {@link IdDocTck }
     * 
     */
    public IdDocTck createIdDocTck() {
        return new IdDocTck();
    }

    /**
     * Create an instance of {@link IdDocResg }
     * 
     */
    public IdDocResg createIdDocResg() {
        return new IdDocResg();
    }

    /**
     * Create an instance of {@link ItemResg }
     * 
     */
    public ItemResg createItemResg() {
        return new ItemResg();
    }

    /**
     * Create an instance of {@link RetPerc }
     * 
     */
    public RetPerc createRetPerc() {
        return new RetPerc();
    }

    /**
     * Create an instance of {@link InfoRespOriType }
     * 
     */
    public InfoRespOriType createInfoRespOriType() {
        return new InfoRespOriType();
    }

    /**
     * Create an instance of {@link RechazoRepType }
     * 
     */
    public RechazoRepType createRechazoRepType() {
        return new RechazoRepType();
    }

    /**
     * Create an instance of {@link ObsCFCType }
     * 
     */
    public ObsCFCType createObsCFCType() {
        return new ObsCFCType();
    }

    /**
     * Create an instance of {@link ReceptorFactExp }
     * 
     */
    public ReceptorFactExp createReceptorFactExp() {
        return new ReceptorFactExp();
    }

    /**
     * Create an instance of {@link KeyInfo }
     * 
     */
    public KeyInfo createKeyInfo() {
        return new KeyInfo();
    }

    /**
     * Create an instance of {@link KeyValue }
     * 
     */
    public KeyValue createKeyValue() {
        return new KeyValue();
    }

    /**
     * Create an instance of {@link DSAKeyValue }
     * 
     */
    public DSAKeyValue createDSAKeyValue() {
        return new DSAKeyValue();
    }

    /**
     * Create an instance of {@link RSAKeyValue }
     * 
     */
    public RSAKeyValue createRSAKeyValue() {
        return new RSAKeyValue();
    }

    /**
     * Create an instance of {@link RetrievalMethod }
     * 
     */
    public RetrievalMethod createRetrievalMethod() {
        return new RetrievalMethod();
    }

    /**
     * Create an instance of {@link Transforms }
     * 
     */
    public Transforms createTransforms() {
        return new Transforms();
    }

    /**
     * Create an instance of {@link Transform }
     * 
     */
    public Transform createTransform() {
        return new Transform();
    }

    /**
     * Create an instance of {@link X509Data }
     * 
     */
    public X509Data createX509Data() {
        return new X509Data();
    }

    /**
     * Create an instance of {@link X509IssuerSerialType }
     * 
     */
    public X509IssuerSerialType createX509IssuerSerialType() {
        return new X509IssuerSerialType();
    }

    /**
     * Create an instance of {@link PGPData }
     * 
     */
    public PGPData createPGPData() {
        return new PGPData();
    }

    /**
     * Create an instance of {@link SPKIData }
     * 
     */
    public SPKIData createSPKIData() {
        return new SPKIData();
    }

    /**
     * Create an instance of {@link SignedInfo }
     * 
     */
    public SignedInfo createSignedInfo() {
        return new SignedInfo();
    }

    /**
     * Create an instance of {@link CanonicalizationMethod }
     * 
     */
    public CanonicalizationMethod createCanonicalizationMethod() {
        return new CanonicalizationMethod();
    }

    /**
     * Create an instance of {@link SignatureMethod }
     * 
     */
    public SignatureMethod createSignatureMethod() {
        return new SignatureMethod();
    }

    /**
     * Create an instance of {@link DsigReferenceType }
     * 
     */
    public DsigReferenceType createDsigReferenceType() {
        return new DsigReferenceType();
    }

    /**
     * Create an instance of {@link DigestMethod }
     * 
     */
    public DigestMethod createDigestMethod() {
        return new DigestMethod();
    }

    /**
     * Create an instance of {@link Signature }
     * 
     */
    public Signature createSignature() {
        return new Signature();
    }

    /**
     * Create an instance of {@link SignatureValue }
     * 
     */
    public SignatureValue createSignatureValue() {
        return new SignatureValue();
    }

    /**
     * Create an instance of {@link Object }
     * 
     */
    public Object createObject() {
        return new Object();
    }

    /**
     * Create an instance of {@link Manifest }
     * 
     */
    public Manifest createManifest() {
        return new Manifest();
    }

    /**
     * Create an instance of {@link SignatureProperty }
     * 
     */
    public SignatureProperty createSignatureProperty() {
        return new SignatureProperty();
    }

    /**
     * Create an instance of {@link SignatureProperties }
     * 
     */
    public SignatureProperties createSignatureProperties() {
        return new SignatureProperties();
    }

    /**
     * Create an instance of {@link ReferenceList }
     * 
     */
    public ReferenceList createReferenceList() {
        return new ReferenceList();
    }

    /**
     * Create an instance of {@link ReferenceType }
     * 
     */
    public ReferenceType createReferenceType() {
        return new ReferenceType();
    }

    /**
     * Create an instance of {@link AgreementMethod }
     * 
     */
    public AgreementMethod createAgreementMethod() {
        return new AgreementMethod();
    }

    /**
     * Create an instance of {@link CipherReference }
     * 
     */
    public CipherReference createCipherReference() {
        return new CipherReference();
    }

    /**
     * Create an instance of {@link TransformsType }
     * 
     */
    public TransformsType createTransformsType() {
        return new TransformsType();
    }

    /**
     * Create an instance of {@link EncryptedKey }
     * 
     */
    public EncryptedKey createEncryptedKey() {
        return new EncryptedKey();
    }

    /**
     * Create an instance of {@link EncryptionMethodType }
     * 
     */
    public EncryptionMethodType createEncryptionMethodType() {
        return new EncryptionMethodType();
    }

    /**
     * Create an instance of {@link CipherData }
     * 
     */
    public CipherData createCipherData() {
        return new CipherData();
    }

    /**
     * Create an instance of {@link EncryptionProperties }
     * 
     */
    public EncryptionProperties createEncryptionProperties() {
        return new EncryptionProperties();
    }

    /**
     * Create an instance of {@link EncryptionProperty }
     * 
     */
    public EncryptionProperty createEncryptionProperty() {
        return new EncryptionProperty();
    }

    /**
     * Create an instance of {@link EncryptedData }
     * 
     */
    public EncryptedData createEncryptedData() {
        return new EncryptedData();
    }

    /**
     * Create an instance of {@link ItemDetFactExp.CodItem }
     * 
     */
    public ItemDetFactExp.CodItem createItemDetFactExpCodItem() {
        return new ItemDetFactExp.CodItem();
    }

    /**
     * Create an instance of {@link ItemDetFactExp.SubDescuento }
     * 
     */
    public ItemDetFactExp.SubDescuento createItemDetFactExpSubDescuento() {
        return new ItemDetFactExp.SubDescuento();
    }

    /**
     * Create an instance of {@link ItemDetFactExp.SubRecargo }
     * 
     */
    public ItemDetFactExp.SubRecargo createItemDetFactExpSubRecargo() {
        return new ItemDetFactExp.SubRecargo();
    }

    /**
     * Create an instance of {@link ItemRem.CodItem }
     * 
     */
    public ItemRem.CodItem createItemRemCodItem() {
        return new ItemRem.CodItem();
    }

    /**
     * Create an instance of {@link ItemRemExp.CodItem }
     * 
     */
    public ItemRemExp.CodItem createItemRemExpCodItem() {
        return new ItemRemExp.CodItem();
    }

    /**
     * Create an instance of {@link MediosPago.MedioPago }
     * 
     */
    public MediosPago.MedioPago createMediosPagoMedioPago() {
        return new MediosPago.MedioPago();
    }

    /**
     * Create an instance of {@link DscRcgGlobal.DRGItem }
     * 
     */
    public DscRcgGlobal.DRGItem createDscRcgGlobalDRGItem() {
        return new DscRcgGlobal.DRGItem();
    }

    /**
     * Create an instance of {@link dgi.classes.recepcion.Totales.RetencPercep }
     * 
     */
    public dgi.classes.recepcion.Totales.RetencPercep createTotalesRetencPercep() {
        return new dgi.classes.recepcion.Totales.RetencPercep();
    }

    /**
     * Create an instance of {@link ItemDetFact.CodItem }
     * 
     */
    public ItemDetFact.CodItem createItemDetFactCodItem() {
        return new ItemDetFact.CodItem();
    }

    /**
     * Create an instance of {@link ItemDetFact.SubDescuento }
     * 
     */
    public ItemDetFact.SubDescuento createItemDetFactSubDescuento() {
        return new ItemDetFact.SubDescuento();
    }

    /**
     * Create an instance of {@link ItemDetFact.SubRecargo }
     * 
     */
    public ItemDetFact.SubRecargo createItemDetFactSubRecargo() {
        return new ItemDetFact.SubRecargo();
    }

    /**
     * Create an instance of {@link ReferenciaTipo.Referencia }
     * 
     */
    public ReferenciaTipo.Referencia createReferenciaTipoReferencia() {
        return new ReferenciaTipo.Referencia();
    }

    /**
     * Create an instance of {@link TotalesResg.RetencPercep }
     * 
     */
    public TotalesResg.RetencPercep createTotalesResgRetencPercep() {
        return new TotalesResg.RetencPercep();
    }

    /**
     * Create an instance of {@link SubTotInfo.STIItem }
     * 
     */
    public SubTotInfo.STIItem createSubTotInfoSTIItem() {
        return new SubTotInfo.STIItem();
    }

    /**
     * Create an instance of {@link CFEDefType.ETck.Encabezado }
     * 
     */
    public CFEDefType.ETck.Encabezado createCFEDefTypeETckEncabezado() {
        return new CFEDefType.ETck.Encabezado();
    }

    /**
     * Create an instance of {@link CFEDefType.ETck.Detalle }
     * 
     */
    public CFEDefType.ETck.Detalle createCFEDefTypeETckDetalle() {
        return new CFEDefType.ETck.Detalle();
    }

    /**
     * Create an instance of {@link CFEDefType.EFact.Encabezado }
     * 
     */
    public CFEDefType.EFact.Encabezado createCFEDefTypeEFactEncabezado() {
        return new CFEDefType.EFact.Encabezado();
    }

    /**
     * Create an instance of {@link CFEDefType.EFact.Detalle }
     * 
     */
    public CFEDefType.EFact.Detalle createCFEDefTypeEFactDetalle() {
        return new CFEDefType.EFact.Detalle();
    }

    /**
     * Create an instance of {@link CFEDefType.EFactExp.Encabezado }
     * 
     */
    public CFEDefType.EFactExp.Encabezado createCFEDefTypeEFactExpEncabezado() {
        return new CFEDefType.EFactExp.Encabezado();
    }

    /**
     * Create an instance of {@link CFEDefType.EFactExp.Detalle }
     * 
     */
    public CFEDefType.EFactExp.Detalle createCFEDefTypeEFactExpDetalle() {
        return new CFEDefType.EFactExp.Detalle();
    }

    /**
     * Create an instance of {@link CFEDefType.ERem.Detalle }
     * 
     */
    public CFEDefType.ERem.Detalle createCFEDefTypeERemDetalle() {
        return new CFEDefType.ERem.Detalle();
    }

    /**
     * Create an instance of {@link CFEDefType.ERem.Encabezado.Totales }
     * 
     */
    public CFEDefType.ERem.Encabezado.Totales createCFEDefTypeERemEncabezadoTotales() {
        return new CFEDefType.ERem.Encabezado.Totales();
    }

    /**
     * Create an instance of {@link CFEDefType.ERemExp.Encabezado }
     * 
     */
    public CFEDefType.ERemExp.Encabezado createCFEDefTypeERemExpEncabezado() {
        return new CFEDefType.ERemExp.Encabezado();
    }

    /**
     * Create an instance of {@link CFEDefType.ERemExp.Detalle }
     * 
     */
    public CFEDefType.ERemExp.Detalle createCFEDefTypeERemExpDetalle() {
        return new CFEDefType.ERemExp.Detalle();
    }

    /**
     * Create an instance of {@link CFEDefType.EResg.Encabezado }
     * 
     */
    public CFEDefType.EResg.Encabezado createCFEDefTypeEResgEncabezado() {
        return new CFEDefType.EResg.Encabezado();
    }

    /**
     * Create an instance of {@link CFEDefType.EResg.Detalle }
     * 
     */
    public CFEDefType.EResg.Detalle createCFEDefTypeEResgDetalle() {
        return new CFEDefType.EResg.Detalle();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "MgmtData")
    public JAXBElement<String> createMgmtData(String value) {
        return new JAXBElement<String>(_MgmtData_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "KeyName")
    public JAXBElement<String> createKeyName(String value) {
        return new JAXBElement<String>(_KeyName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "DigestValue")
    public JAXBElement<byte[]> createDigestValue(byte[] value) {
        return new JAXBElement<byte[]>(_DigestValue_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/04/xmlenc#", name = "OriginatorKeyInfo", scope = AgreementMethod.class)
    public JAXBElement<KeyInfo> createAgreementMethodOriginatorKeyInfo(KeyInfo value) {
        return new JAXBElement<KeyInfo>(_AgreementMethodOriginatorKeyInfo_QNAME, KeyInfo.class, AgreementMethod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/04/xmlenc#", name = "RecipientKeyInfo", scope = AgreementMethod.class)
    public JAXBElement<KeyInfo> createAgreementMethodRecipientKeyInfo(KeyInfo value) {
        return new JAXBElement<KeyInfo>(_AgreementMethodRecipientKeyInfo_QNAME, KeyInfo.class, AgreementMethod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/04/xmlenc#", name = "KA-Nonce", scope = AgreementMethod.class)
    public JAXBElement<byte[]> createAgreementMethodKANonce(byte[] value) {
        return new JAXBElement<byte[]>(_AgreementMethodKANonce_QNAME, byte[].class, AgreementMethod.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link X509IssuerSerialType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509IssuerSerial", scope = X509Data.class)
    public JAXBElement<X509IssuerSerialType> createX509DataX509IssuerSerial(X509IssuerSerialType value) {
        return new JAXBElement<X509IssuerSerialType>(_X509DataX509IssuerSerial_QNAME, X509IssuerSerialType.class, X509Data.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509Certificate", scope = X509Data.class)
    public JAXBElement<byte[]> createX509DataX509Certificate(byte[] value) {
        return new JAXBElement<byte[]>(_X509DataX509Certificate_QNAME, byte[].class, X509Data.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509SKI", scope = X509Data.class)
    public JAXBElement<byte[]> createX509DataX509SKI(byte[] value) {
        return new JAXBElement<byte[]>(_X509DataX509SKI_QNAME, byte[].class, X509Data.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509SubjectName", scope = X509Data.class)
    public JAXBElement<String> createX509DataX509SubjectName(String value) {
        return new JAXBElement<String>(_X509DataX509SubjectName_QNAME, String.class, X509Data.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509CRL", scope = X509Data.class)
    public JAXBElement<byte[]> createX509DataX509CRL(byte[] value) {
        return new JAXBElement<byte[]>(_X509DataX509CRL_QNAME, byte[].class, X509Data.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "XPath", scope = Transform.class)
    public JAXBElement<String> createTransformXPath(String value) {
        return new JAXBElement<String>(_TransformXPath_QNAME, String.class, Transform.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/04/xmlenc#", name = "KeySize", scope = EncryptionMethodType.class)
    public JAXBElement<BigInteger> createEncryptionMethodTypeKeySize(BigInteger value) {
        return new JAXBElement<BigInteger>(_EncryptionMethodTypeKeySize_QNAME, BigInteger.class, EncryptionMethodType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/04/xmlenc#", name = "OAEPparams", scope = EncryptionMethodType.class)
    public JAXBElement<byte[]> createEncryptionMethodTypeOAEPparams(byte[] value) {
        return new JAXBElement<byte[]>(_EncryptionMethodTypeOAEPparams_QNAME, byte[].class, EncryptionMethodType.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "HMACOutputLength", scope = SignatureMethod.class)
    public JAXBElement<BigInteger> createSignatureMethodHMACOutputLength(BigInteger value) {
        return new JAXBElement<BigInteger>(_SignatureMethodHMACOutputLength_QNAME, BigInteger.class, SignatureMethod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/04/xmlenc#", name = "DataReference", scope = ReferenceList.class)
    public JAXBElement<ReferenceType> createReferenceListDataReference(ReferenceType value) {
        return new JAXBElement<ReferenceType>(_ReferenceListDataReference_QNAME, ReferenceType.class, ReferenceList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/04/xmlenc#", name = "KeyReference", scope = ReferenceList.class)
    public JAXBElement<ReferenceType> createReferenceListKeyReference(ReferenceType value) {
        return new JAXBElement<ReferenceType>(_ReferenceListKeyReference_QNAME, ReferenceType.class, ReferenceList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SPKISexp", scope = SPKIData.class)
    public JAXBElement<byte[]> createSPKIDataSPKISexp(byte[] value) {
        return new JAXBElement<byte[]>(_SPKIDataSPKISexp_QNAME, byte[].class, SPKIData.class, ((byte[]) value));
    }

}
