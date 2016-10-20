
package it.sian.cooperazione.schema.wsmrga;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Esito" type="{http://cooperazione.sian.it/schema/wsmrga/}Response" minOccurs="0"/>
 *         &lt;element name="DettaglioOperazione" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="ARMC" type="{http://cooperazione.sian.it/schema/wsmrga/}ARMCOperazione"/>
 *                   &lt;element name="GIIN" type="{http://cooperazione.sian.it/schema/wsmrga/}GiinOperazione"/>
 *                   &lt;element name="CASD" type="{http://cooperazione.sian.it/schema/wsmrga/}CasdOperazione"/>
 *                   &lt;element name="USSD" type="{http://cooperazione.sian.it/schema/wsmrga/}UssdOperazione"/>
 *                   &lt;element name="IMBO" type="{http://cooperazione.sian.it/schema/wsmrga/}ImboOperazione"/>
 *                   &lt;element name="ACID" type="{http://cooperazione.sian.it/schema/wsmrga/}AcidOperazione"/>
 *                   &lt;element name="PIGI" type="{http://cooperazione.sian.it/schema/wsmrga/}PigiOperazione"/>
 *                   &lt;element name="DOLC" type="{http://cooperazione.sian.it/schema/wsmrga/}DolcOperazione"/>
 *                   &lt;element name="SVIN" type="{http://cooperazione.sian.it/schema/wsmrga/}SvinOperazione"/>
 *                   &lt;element name="TAGL" type="{http://cooperazione.sian.it/schema/wsmrga/}TaglOperazione"/>
 *                   &lt;element name="CERT" type="{http://cooperazione.sian.it/schema/wsmrga/}CertOperazione"/>
 *                   &lt;element name="DIST" type="{http://cooperazione.sian.it/schema/wsmrga/}DistOperazione"/>
 *                   &lt;element name="DENT" type="{http://cooperazione.sian.it/schema/wsmrga/}DentOperazione"/>
 *                   &lt;element name="AUCO" type="{http://cooperazione.sian.it/schema/wsmrga/}AucoOperazione"/>
 *                   &lt;element name="PERD" type="{http://cooperazione.sian.it/schema/wsmrga/}PerdOperazione"/>
 *                   &lt;element name="SFEC" type="{http://cooperazione.sian.it/schema/wsmrga/}SfecOperazione"/>
 *                   &lt;element name="AVLT" type="{http://cooperazione.sian.it/schema/wsmrga/}AvltOperazione"/>
 *                   &lt;element name="SPGS" type="{http://cooperazione.sian.it/schema/wsmrga/}SpgsOperazione"/>
 *                   &lt;element name="SPAB" type="{http://cooperazione.sian.it/schema/wsmrga/}SpabOperazione"/>
 *                   &lt;element name="SCDS" type="{http://cooperazione.sian.it/schema/wsmrga/}ScdsOperazione"/>
 *                   &lt;element name="ELMC" type="{http://cooperazione.sian.it/schema/wsmrga/}ElmcOperazione"/>
 *                   &lt;element name="FRGS" type="{http://cooperazione.sian.it/schema/wsmrga/}FrgsOperazione"/>
 *                   &lt;element name="SCZC" type="{http://cooperazione.sian.it/schema/wsmrga/}SczcOperazione"/>
 *                   &lt;element name="LIEL" type="{http://cooperazione.sian.it/schema/wsmrga/}LielOperazione"/>
 *                   &lt;element name="EVAL" type="{http://cooperazione.sian.it/schema/wsmrga/}EvalOperazione"/>
 *                   &lt;element name="FRAB" type="{http://cooperazione.sian.it/schema/wsmrga/}FrabOperazione"/>
 *                   &lt;element name="AARD" type="{http://cooperazione.sian.it/schema/wsmrga/}AardOperazione"/>
 *                   &lt;element name="DISA" type="{http://cooperazione.sian.it/schema/wsmrga/}DisaOperazione"/>
 *                   &lt;element name="BABS" type="{http://cooperazione.sian.it/schema/wsmrga/}BabsOperazione"/>
 *                   &lt;element name="APRT" type="{http://cooperazione.sian.it/schema/wsmrga/}AprtOperazione"/>
 *                   &lt;element name="ETIC" type="{http://cooperazione.sian.it/schema/wsmrga/}EticOperazione"/>
 *                   &lt;element name="SUPE" type="{http://cooperazione.sian.it/schema/wsmrga/}SupeOperazione"/>
 *                   &lt;element name="DERI" type="{http://cooperazione.sian.it/schema/wsmrga/}DeriOperazione"/>
 *                   &lt;element name="ACET" type="{http://cooperazione.sian.it/schema/wsmrga/}AcetOperazione"/>
 *                   &lt;element name="TRSO" type="{http://cooperazione.sian.it/schema/wsmrga/}TrsoOperazione"/>
 *                 &lt;/choice>
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
@XmlType(name = "", propOrder = {
    "esito",
    "dettaglioOperazione"
})
@XmlRootElement(name = "VisOperSiRPVOutput")
public class VisOperSiRPVOutput {

    @XmlElement(name = "Esito")
    protected Response esito;
    @XmlElement(name = "DettaglioOperazione")
    protected List<VisOperSiRPVOutput.DettaglioOperazione> dettaglioOperazione;

    /**
     * Recupera il valore della proprietà esito.
     * 
     * @return
     *     possible object is
     *     {@link Response }
     *     
     */
    public Response getEsito() {
        return esito;
    }

    /**
     * Imposta il valore della proprietà esito.
     * 
     * @param value
     *     allowed object is
     *     {@link Response }
     *     
     */
    public void setEsito(Response value) {
        this.esito = value;
    }

    /**
     * Gets the value of the dettaglioOperazione property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dettaglioOperazione property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDettaglioOperazione().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VisOperSiRPVOutput.DettaglioOperazione }
     * 
     * 
     */
    public List<VisOperSiRPVOutput.DettaglioOperazione> getDettaglioOperazione() {
        if (dettaglioOperazione == null) {
            dettaglioOperazione = new ArrayList<VisOperSiRPVOutput.DettaglioOperazione>();
        }
        return this.dettaglioOperazione;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="ARMC" type="{http://cooperazione.sian.it/schema/wsmrga/}ARMCOperazione"/>
     *         &lt;element name="GIIN" type="{http://cooperazione.sian.it/schema/wsmrga/}GiinOperazione"/>
     *         &lt;element name="CASD" type="{http://cooperazione.sian.it/schema/wsmrga/}CasdOperazione"/>
     *         &lt;element name="USSD" type="{http://cooperazione.sian.it/schema/wsmrga/}UssdOperazione"/>
     *         &lt;element name="IMBO" type="{http://cooperazione.sian.it/schema/wsmrga/}ImboOperazione"/>
     *         &lt;element name="ACID" type="{http://cooperazione.sian.it/schema/wsmrga/}AcidOperazione"/>
     *         &lt;element name="PIGI" type="{http://cooperazione.sian.it/schema/wsmrga/}PigiOperazione"/>
     *         &lt;element name="DOLC" type="{http://cooperazione.sian.it/schema/wsmrga/}DolcOperazione"/>
     *         &lt;element name="SVIN" type="{http://cooperazione.sian.it/schema/wsmrga/}SvinOperazione"/>
     *         &lt;element name="TAGL" type="{http://cooperazione.sian.it/schema/wsmrga/}TaglOperazione"/>
     *         &lt;element name="CERT" type="{http://cooperazione.sian.it/schema/wsmrga/}CertOperazione"/>
     *         &lt;element name="DIST" type="{http://cooperazione.sian.it/schema/wsmrga/}DistOperazione"/>
     *         &lt;element name="DENT" type="{http://cooperazione.sian.it/schema/wsmrga/}DentOperazione"/>
     *         &lt;element name="AUCO" type="{http://cooperazione.sian.it/schema/wsmrga/}AucoOperazione"/>
     *         &lt;element name="PERD" type="{http://cooperazione.sian.it/schema/wsmrga/}PerdOperazione"/>
     *         &lt;element name="SFEC" type="{http://cooperazione.sian.it/schema/wsmrga/}SfecOperazione"/>
     *         &lt;element name="AVLT" type="{http://cooperazione.sian.it/schema/wsmrga/}AvltOperazione"/>
     *         &lt;element name="SPGS" type="{http://cooperazione.sian.it/schema/wsmrga/}SpgsOperazione"/>
     *         &lt;element name="SPAB" type="{http://cooperazione.sian.it/schema/wsmrga/}SpabOperazione"/>
     *         &lt;element name="SCDS" type="{http://cooperazione.sian.it/schema/wsmrga/}ScdsOperazione"/>
     *         &lt;element name="ELMC" type="{http://cooperazione.sian.it/schema/wsmrga/}ElmcOperazione"/>
     *         &lt;element name="FRGS" type="{http://cooperazione.sian.it/schema/wsmrga/}FrgsOperazione"/>
     *         &lt;element name="SCZC" type="{http://cooperazione.sian.it/schema/wsmrga/}SczcOperazione"/>
     *         &lt;element name="LIEL" type="{http://cooperazione.sian.it/schema/wsmrga/}LielOperazione"/>
     *         &lt;element name="EVAL" type="{http://cooperazione.sian.it/schema/wsmrga/}EvalOperazione"/>
     *         &lt;element name="FRAB" type="{http://cooperazione.sian.it/schema/wsmrga/}FrabOperazione"/>
     *         &lt;element name="AARD" type="{http://cooperazione.sian.it/schema/wsmrga/}AardOperazione"/>
     *         &lt;element name="DISA" type="{http://cooperazione.sian.it/schema/wsmrga/}DisaOperazione"/>
     *         &lt;element name="BABS" type="{http://cooperazione.sian.it/schema/wsmrga/}BabsOperazione"/>
     *         &lt;element name="APRT" type="{http://cooperazione.sian.it/schema/wsmrga/}AprtOperazione"/>
     *         &lt;element name="ETIC" type="{http://cooperazione.sian.it/schema/wsmrga/}EticOperazione"/>
     *         &lt;element name="SUPE" type="{http://cooperazione.sian.it/schema/wsmrga/}SupeOperazione"/>
     *         &lt;element name="DERI" type="{http://cooperazione.sian.it/schema/wsmrga/}DeriOperazione"/>
     *         &lt;element name="ACET" type="{http://cooperazione.sian.it/schema/wsmrga/}AcetOperazione"/>
     *         &lt;element name="TRSO" type="{http://cooperazione.sian.it/schema/wsmrga/}TrsoOperazione"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "armc",
        "giin",
        "casd",
        "ussd",
        "imbo",
        "acid",
        "pigi",
        "dolc",
        "svin",
        "tagl",
        "cert",
        "dist",
        "dent",
        "auco",
        "perd",
        "sfec",
        "avlt",
        "spgs",
        "spab",
        "scds",
        "elmc",
        "frgs",
        "sczc",
        "liel",
        "eval",
        "frab",
        "aard",
        "disa",
        "babs",
        "aprt",
        "etic",
        "supe",
        "deri",
        "acet",
        "trso"
    })
    public static class DettaglioOperazione {

        @XmlElement(name = "ARMC")
        protected ARMCOperazione armc;
        @XmlElement(name = "GIIN")
        protected GiinOperazione giin;
        @XmlElement(name = "CASD")
        protected CasdOperazione casd;
        @XmlElement(name = "USSD")
        protected UssdOperazione ussd;
        @XmlElement(name = "IMBO")
        protected ImboOperazione imbo;
        @XmlElement(name = "ACID")
        protected AcidOperazione acid;
        @XmlElement(name = "PIGI")
        protected PigiOperazione pigi;
        @XmlElement(name = "DOLC")
        protected DolcOperazione dolc;
        @XmlElement(name = "SVIN")
        protected SvinOperazione svin;
        @XmlElement(name = "TAGL")
        protected TaglOperazione tagl;
        @XmlElement(name = "CERT")
        protected CertOperazione cert;
        @XmlElement(name = "DIST")
        protected DistOperazione dist;
        @XmlElement(name = "DENT")
        protected DentOperazione dent;
        @XmlElement(name = "AUCO")
        protected AucoOperazione auco;
        @XmlElement(name = "PERD")
        protected PerdOperazione perd;
        @XmlElement(name = "SFEC")
        protected SfecOperazione sfec;
        @XmlElement(name = "AVLT")
        protected AvltOperazione avlt;
        @XmlElement(name = "SPGS")
        protected SpgsOperazione spgs;
        @XmlElement(name = "SPAB")
        protected SpabOperazione spab;
        @XmlElement(name = "SCDS")
        protected ScdsOperazione scds;
        @XmlElement(name = "ELMC")
        protected ElmcOperazione elmc;
        @XmlElement(name = "FRGS")
        protected FrgsOperazione frgs;
        @XmlElement(name = "SCZC")
        protected SczcOperazione sczc;
        @XmlElement(name = "LIEL")
        protected LielOperazione liel;
        @XmlElement(name = "EVAL")
        protected EvalOperazione eval;
        @XmlElement(name = "FRAB")
        protected FrabOperazione frab;
        @XmlElement(name = "AARD")
        protected AardOperazione aard;
        @XmlElement(name = "DISA")
        protected DisaOperazione disa;
        @XmlElement(name = "BABS")
        protected BabsOperazione babs;
        @XmlElement(name = "APRT")
        protected AprtOperazione aprt;
        @XmlElement(name = "ETIC")
        protected EticOperazione etic;
        @XmlElement(name = "SUPE")
        protected SupeOperazione supe;
        @XmlElement(name = "DERI")
        protected DeriOperazione deri;
        @XmlElement(name = "ACET")
        protected AcetOperazione acet;
        @XmlElement(name = "TRSO")
        protected TrsoOperazione trso;

        /**
         * Recupera il valore della proprietà armc.
         * 
         * @return
         *     possible object is
         *     {@link ARMCOperazione }
         *     
         */
        public ARMCOperazione getARMC() {
            return armc;
        }

        /**
         * Imposta il valore della proprietà armc.
         * 
         * @param value
         *     allowed object is
         *     {@link ARMCOperazione }
         *     
         */
        public void setARMC(ARMCOperazione value) {
            this.armc = value;
        }

        /**
         * Recupera il valore della proprietà giin.
         * 
         * @return
         *     possible object is
         *     {@link GiinOperazione }
         *     
         */
        public GiinOperazione getGIIN() {
            return giin;
        }

        /**
         * Imposta il valore della proprietà giin.
         * 
         * @param value
         *     allowed object is
         *     {@link GiinOperazione }
         *     
         */
        public void setGIIN(GiinOperazione value) {
            this.giin = value;
        }

        /**
         * Recupera il valore della proprietà casd.
         * 
         * @return
         *     possible object is
         *     {@link CasdOperazione }
         *     
         */
        public CasdOperazione getCASD() {
            return casd;
        }

        /**
         * Imposta il valore della proprietà casd.
         * 
         * @param value
         *     allowed object is
         *     {@link CasdOperazione }
         *     
         */
        public void setCASD(CasdOperazione value) {
            this.casd = value;
        }

        /**
         * Recupera il valore della proprietà ussd.
         * 
         * @return
         *     possible object is
         *     {@link UssdOperazione }
         *     
         */
        public UssdOperazione getUSSD() {
            return ussd;
        }

        /**
         * Imposta il valore della proprietà ussd.
         * 
         * @param value
         *     allowed object is
         *     {@link UssdOperazione }
         *     
         */
        public void setUSSD(UssdOperazione value) {
            this.ussd = value;
        }

        /**
         * Recupera il valore della proprietà imbo.
         * 
         * @return
         *     possible object is
         *     {@link ImboOperazione }
         *     
         */
        public ImboOperazione getIMBO() {
            return imbo;
        }

        /**
         * Imposta il valore della proprietà imbo.
         * 
         * @param value
         *     allowed object is
         *     {@link ImboOperazione }
         *     
         */
        public void setIMBO(ImboOperazione value) {
            this.imbo = value;
        }

        /**
         * Recupera il valore della proprietà acid.
         * 
         * @return
         *     possible object is
         *     {@link AcidOperazione }
         *     
         */
        public AcidOperazione getACID() {
            return acid;
        }

        /**
         * Imposta il valore della proprietà acid.
         * 
         * @param value
         *     allowed object is
         *     {@link AcidOperazione }
         *     
         */
        public void setACID(AcidOperazione value) {
            this.acid = value;
        }

        /**
         * Recupera il valore della proprietà pigi.
         * 
         * @return
         *     possible object is
         *     {@link PigiOperazione }
         *     
         */
        public PigiOperazione getPIGI() {
            return pigi;
        }

        /**
         * Imposta il valore della proprietà pigi.
         * 
         * @param value
         *     allowed object is
         *     {@link PigiOperazione }
         *     
         */
        public void setPIGI(PigiOperazione value) {
            this.pigi = value;
        }

        /**
         * Recupera il valore della proprietà dolc.
         * 
         * @return
         *     possible object is
         *     {@link DolcOperazione }
         *     
         */
        public DolcOperazione getDOLC() {
            return dolc;
        }

        /**
         * Imposta il valore della proprietà dolc.
         * 
         * @param value
         *     allowed object is
         *     {@link DolcOperazione }
         *     
         */
        public void setDOLC(DolcOperazione value) {
            this.dolc = value;
        }

        /**
         * Recupera il valore della proprietà svin.
         * 
         * @return
         *     possible object is
         *     {@link SvinOperazione }
         *     
         */
        public SvinOperazione getSVIN() {
            return svin;
        }

        /**
         * Imposta il valore della proprietà svin.
         * 
         * @param value
         *     allowed object is
         *     {@link SvinOperazione }
         *     
         */
        public void setSVIN(SvinOperazione value) {
            this.svin = value;
        }

        /**
         * Recupera il valore della proprietà tagl.
         * 
         * @return
         *     possible object is
         *     {@link TaglOperazione }
         *     
         */
        public TaglOperazione getTAGL() {
            return tagl;
        }

        /**
         * Imposta il valore della proprietà tagl.
         * 
         * @param value
         *     allowed object is
         *     {@link TaglOperazione }
         *     
         */
        public void setTAGL(TaglOperazione value) {
            this.tagl = value;
        }

        /**
         * Recupera il valore della proprietà cert.
         * 
         * @return
         *     possible object is
         *     {@link CertOperazione }
         *     
         */
        public CertOperazione getCERT() {
            return cert;
        }

        /**
         * Imposta il valore della proprietà cert.
         * 
         * @param value
         *     allowed object is
         *     {@link CertOperazione }
         *     
         */
        public void setCERT(CertOperazione value) {
            this.cert = value;
        }

        /**
         * Recupera il valore della proprietà dist.
         * 
         * @return
         *     possible object is
         *     {@link DistOperazione }
         *     
         */
        public DistOperazione getDIST() {
            return dist;
        }

        /**
         * Imposta il valore della proprietà dist.
         * 
         * @param value
         *     allowed object is
         *     {@link DistOperazione }
         *     
         */
        public void setDIST(DistOperazione value) {
            this.dist = value;
        }

        /**
         * Recupera il valore della proprietà dent.
         * 
         * @return
         *     possible object is
         *     {@link DentOperazione }
         *     
         */
        public DentOperazione getDENT() {
            return dent;
        }

        /**
         * Imposta il valore della proprietà dent.
         * 
         * @param value
         *     allowed object is
         *     {@link DentOperazione }
         *     
         */
        public void setDENT(DentOperazione value) {
            this.dent = value;
        }

        /**
         * Recupera il valore della proprietà auco.
         * 
         * @return
         *     possible object is
         *     {@link AucoOperazione }
         *     
         */
        public AucoOperazione getAUCO() {
            return auco;
        }

        /**
         * Imposta il valore della proprietà auco.
         * 
         * @param value
         *     allowed object is
         *     {@link AucoOperazione }
         *     
         */
        public void setAUCO(AucoOperazione value) {
            this.auco = value;
        }

        /**
         * Recupera il valore della proprietà perd.
         * 
         * @return
         *     possible object is
         *     {@link PerdOperazione }
         *     
         */
        public PerdOperazione getPERD() {
            return perd;
        }

        /**
         * Imposta il valore della proprietà perd.
         * 
         * @param value
         *     allowed object is
         *     {@link PerdOperazione }
         *     
         */
        public void setPERD(PerdOperazione value) {
            this.perd = value;
        }

        /**
         * Recupera il valore della proprietà sfec.
         * 
         * @return
         *     possible object is
         *     {@link SfecOperazione }
         *     
         */
        public SfecOperazione getSFEC() {
            return sfec;
        }

        /**
         * Imposta il valore della proprietà sfec.
         * 
         * @param value
         *     allowed object is
         *     {@link SfecOperazione }
         *     
         */
        public void setSFEC(SfecOperazione value) {
            this.sfec = value;
        }

        /**
         * Recupera il valore della proprietà avlt.
         * 
         * @return
         *     possible object is
         *     {@link AvltOperazione }
         *     
         */
        public AvltOperazione getAVLT() {
            return avlt;
        }

        /**
         * Imposta il valore della proprietà avlt.
         * 
         * @param value
         *     allowed object is
         *     {@link AvltOperazione }
         *     
         */
        public void setAVLT(AvltOperazione value) {
            this.avlt = value;
        }

        /**
         * Recupera il valore della proprietà spgs.
         * 
         * @return
         *     possible object is
         *     {@link SpgsOperazione }
         *     
         */
        public SpgsOperazione getSPGS() {
            return spgs;
        }

        /**
         * Imposta il valore della proprietà spgs.
         * 
         * @param value
         *     allowed object is
         *     {@link SpgsOperazione }
         *     
         */
        public void setSPGS(SpgsOperazione value) {
            this.spgs = value;
        }

        /**
         * Recupera il valore della proprietà spab.
         * 
         * @return
         *     possible object is
         *     {@link SpabOperazione }
         *     
         */
        public SpabOperazione getSPAB() {
            return spab;
        }

        /**
         * Imposta il valore della proprietà spab.
         * 
         * @param value
         *     allowed object is
         *     {@link SpabOperazione }
         *     
         */
        public void setSPAB(SpabOperazione value) {
            this.spab = value;
        }

        /**
         * Recupera il valore della proprietà scds.
         * 
         * @return
         *     possible object is
         *     {@link ScdsOperazione }
         *     
         */
        public ScdsOperazione getSCDS() {
            return scds;
        }

        /**
         * Imposta il valore della proprietà scds.
         * 
         * @param value
         *     allowed object is
         *     {@link ScdsOperazione }
         *     
         */
        public void setSCDS(ScdsOperazione value) {
            this.scds = value;
        }

        /**
         * Recupera il valore della proprietà elmc.
         * 
         * @return
         *     possible object is
         *     {@link ElmcOperazione }
         *     
         */
        public ElmcOperazione getELMC() {
            return elmc;
        }

        /**
         * Imposta il valore della proprietà elmc.
         * 
         * @param value
         *     allowed object is
         *     {@link ElmcOperazione }
         *     
         */
        public void setELMC(ElmcOperazione value) {
            this.elmc = value;
        }

        /**
         * Recupera il valore della proprietà frgs.
         * 
         * @return
         *     possible object is
         *     {@link FrgsOperazione }
         *     
         */
        public FrgsOperazione getFRGS() {
            return frgs;
        }

        /**
         * Imposta il valore della proprietà frgs.
         * 
         * @param value
         *     allowed object is
         *     {@link FrgsOperazione }
         *     
         */
        public void setFRGS(FrgsOperazione value) {
            this.frgs = value;
        }

        /**
         * Recupera il valore della proprietà sczc.
         * 
         * @return
         *     possible object is
         *     {@link SczcOperazione }
         *     
         */
        public SczcOperazione getSCZC() {
            return sczc;
        }

        /**
         * Imposta il valore della proprietà sczc.
         * 
         * @param value
         *     allowed object is
         *     {@link SczcOperazione }
         *     
         */
        public void setSCZC(SczcOperazione value) {
            this.sczc = value;
        }

        /**
         * Recupera il valore della proprietà liel.
         * 
         * @return
         *     possible object is
         *     {@link LielOperazione }
         *     
         */
        public LielOperazione getLIEL() {
            return liel;
        }

        /**
         * Imposta il valore della proprietà liel.
         * 
         * @param value
         *     allowed object is
         *     {@link LielOperazione }
         *     
         */
        public void setLIEL(LielOperazione value) {
            this.liel = value;
        }

        /**
         * Recupera il valore della proprietà eval.
         * 
         * @return
         *     possible object is
         *     {@link EvalOperazione }
         *     
         */
        public EvalOperazione getEVAL() {
            return eval;
        }

        /**
         * Imposta il valore della proprietà eval.
         * 
         * @param value
         *     allowed object is
         *     {@link EvalOperazione }
         *     
         */
        public void setEVAL(EvalOperazione value) {
            this.eval = value;
        }

        /**
         * Recupera il valore della proprietà frab.
         * 
         * @return
         *     possible object is
         *     {@link FrabOperazione }
         *     
         */
        public FrabOperazione getFRAB() {
            return frab;
        }

        /**
         * Imposta il valore della proprietà frab.
         * 
         * @param value
         *     allowed object is
         *     {@link FrabOperazione }
         *     
         */
        public void setFRAB(FrabOperazione value) {
            this.frab = value;
        }

        /**
         * Recupera il valore della proprietà aard.
         * 
         * @return
         *     possible object is
         *     {@link AardOperazione }
         *     
         */
        public AardOperazione getAARD() {
            return aard;
        }

        /**
         * Imposta il valore della proprietà aard.
         * 
         * @param value
         *     allowed object is
         *     {@link AardOperazione }
         *     
         */
        public void setAARD(AardOperazione value) {
            this.aard = value;
        }

        /**
         * Recupera il valore della proprietà disa.
         * 
         * @return
         *     possible object is
         *     {@link DisaOperazione }
         *     
         */
        public DisaOperazione getDISA() {
            return disa;
        }

        /**
         * Imposta il valore della proprietà disa.
         * 
         * @param value
         *     allowed object is
         *     {@link DisaOperazione }
         *     
         */
        public void setDISA(DisaOperazione value) {
            this.disa = value;
        }

        /**
         * Recupera il valore della proprietà babs.
         * 
         * @return
         *     possible object is
         *     {@link BabsOperazione }
         *     
         */
        public BabsOperazione getBABS() {
            return babs;
        }

        /**
         * Imposta il valore della proprietà babs.
         * 
         * @param value
         *     allowed object is
         *     {@link BabsOperazione }
         *     
         */
        public void setBABS(BabsOperazione value) {
            this.babs = value;
        }

        /**
         * Recupera il valore della proprietà aprt.
         * 
         * @return
         *     possible object is
         *     {@link AprtOperazione }
         *     
         */
        public AprtOperazione getAPRT() {
            return aprt;
        }

        /**
         * Imposta il valore della proprietà aprt.
         * 
         * @param value
         *     allowed object is
         *     {@link AprtOperazione }
         *     
         */
        public void setAPRT(AprtOperazione value) {
            this.aprt = value;
        }

        /**
         * Recupera il valore della proprietà etic.
         * 
         * @return
         *     possible object is
         *     {@link EticOperazione }
         *     
         */
        public EticOperazione getETIC() {
            return etic;
        }

        /**
         * Imposta il valore della proprietà etic.
         * 
         * @param value
         *     allowed object is
         *     {@link EticOperazione }
         *     
         */
        public void setETIC(EticOperazione value) {
            this.etic = value;
        }

        /**
         * Recupera il valore della proprietà supe.
         * 
         * @return
         *     possible object is
         *     {@link SupeOperazione }
         *     
         */
        public SupeOperazione getSUPE() {
            return supe;
        }

        /**
         * Imposta il valore della proprietà supe.
         * 
         * @param value
         *     allowed object is
         *     {@link SupeOperazione }
         *     
         */
        public void setSUPE(SupeOperazione value) {
            this.supe = value;
        }

        /**
         * Recupera il valore della proprietà deri.
         * 
         * @return
         *     possible object is
         *     {@link DeriOperazione }
         *     
         */
        public DeriOperazione getDERI() {
            return deri;
        }

        /**
         * Imposta il valore della proprietà deri.
         * 
         * @param value
         *     allowed object is
         *     {@link DeriOperazione }
         *     
         */
        public void setDERI(DeriOperazione value) {
            this.deri = value;
        }

        /**
         * Recupera il valore della proprietà acet.
         * 
         * @return
         *     possible object is
         *     {@link AcetOperazione }
         *     
         */
        public AcetOperazione getACET() {
            return acet;
        }

        /**
         * Imposta il valore della proprietà acet.
         * 
         * @param value
         *     allowed object is
         *     {@link AcetOperazione }
         *     
         */
        public void setACET(AcetOperazione value) {
            this.acet = value;
        }

        /**
         * Recupera il valore della proprietà trso.
         * 
         * @return
         *     possible object is
         *     {@link TrsoOperazione }
         *     
         */
        public TrsoOperazione getTRSO() {
            return trso;
        }

        /**
         * Imposta il valore della proprietà trso.
         * 
         * @param value
         *     allowed object is
         *     {@link TrsoOperazione }
         *     
         */
        public void setTRSO(TrsoOperazione value) {
            this.trso = value;
        }

    }

}
