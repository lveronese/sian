
package it.sian.cooperazione.schema.wsmrga;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="CodOper" type="{http://cooperazione.sian.it/schema/wsmrga/}CUAA"/>
 *         &lt;element name="CodiceIcqrf" type="{http://cooperazione.sian.it/schema/wsmrga/}CodiceIcq"/>
 *         &lt;element name="DataGiacenza" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="CodiceProdotto" type="{http://cooperazione.sian.it/schema/wsmrga/}CodiceProdottoPrimario" minOccurs="0"/>
 *         &lt;element name="CodCommittente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodCategoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttoCert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodClassificazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodDopIgp" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodiceDopIgp" minOccurs="0"/>
 *         &lt;element name="CodEbacchus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrigineUve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Provenienza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SelPaesiProvenienza" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TipoFiltro" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoFiltro"/>
 *                   &lt;element name="PaesiProvenienza" type="{http://cooperazione.sian.it/schema/wsmrga/}PaesiProvenienza" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CodZonaViticola" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SelVarieta" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TipoFiltro" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoFiltro"/>
 *                   &lt;element name="Varieta" type="{http://cooperazione.sian.it/schema/wsmrga/}Cod_ValorePerc" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AltreVarieta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodSottozona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodVigna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodColore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SelMenzioni" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TipoFiltro" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoFiltro"/>
 *                   &lt;element name="Menzioni" type="{http://cooperazione.sian.it/schema/wsmrga/}Menzioni" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Biologico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SelPratiche" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TipoFiltro" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoFiltro"/>
 *                   &lt;element name="PraticheEnologiche" type="{http://cooperazione.sian.it/schema/wsmrga/}PraticheEnologiche" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CodPartita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Annata" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Anno">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;totalDigits value="4"/>
 *                         &lt;fractionDigits value="0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Percentuale" type="{http://cooperazione.sian.it/schema/wsmrga/}Percentuale" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MassaVolumica" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoMassaVolume" minOccurs="0"/>
 *         &lt;element name="CodStatoFisico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataCertDOP" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="NumCertDOP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "codOper",
    "codiceIcqrf",
    "dataGiacenza",
    "codiceProdotto",
    "codCommittente",
    "codCategoria",
    "attoCert",
    "codClassificazione",
    "codDopIgp",
    "codEbacchus",
    "origineUve",
    "provenienza",
    "selPaesiProvenienza",
    "codZonaViticola",
    "selVarieta",
    "altreVarieta",
    "codSottozona",
    "codVigna",
    "codColore",
    "selMenzioni",
    "biologico",
    "selPratiche",
    "codPartita",
    "annata",
    "massaVolumica",
    "codStatoFisico",
    "dataCertDOP",
    "numCertDOP"
})
@XmlRootElement(name = "VisGiacSiRPVInput")
public class VisGiacSiRPVInput {

    @XmlElement(name = "CodOper", required = true)
    protected CUAA codOper;
    @XmlElement(name = "CodiceIcqrf", required = true)
    protected String codiceIcqrf;
    @XmlElement(name = "DataGiacenza", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataGiacenza;
    @XmlElement(name = "CodiceProdotto")
    protected CodiceProdottoPrimario codiceProdotto;
    @XmlElement(name = "CodCommittente")
    protected String codCommittente;
    @XmlElement(name = "CodCategoria")
    protected String codCategoria;
    @XmlElement(name = "AttoCert")
    protected String attoCert;
    @XmlElement(name = "CodClassificazione")
    protected String codClassificazione;
    @XmlElement(name = "CodDopIgp")
    protected String codDopIgp;
    @XmlElement(name = "CodEbacchus")
    protected String codEbacchus;
    @XmlElement(name = "OrigineUve")
    protected String origineUve;
    @XmlElement(name = "Provenienza")
    protected String provenienza;
    @XmlElement(name = "SelPaesiProvenienza")
    protected VisGiacSiRPVInput.SelPaesiProvenienza selPaesiProvenienza;
    @XmlElement(name = "CodZonaViticola")
    protected String codZonaViticola;
    @XmlElement(name = "SelVarieta")
    protected VisGiacSiRPVInput.SelVarieta selVarieta;
    @XmlElement(name = "AltreVarieta")
    protected String altreVarieta;
    @XmlElement(name = "CodSottozona")
    protected String codSottozona;
    @XmlElement(name = "CodVigna")
    protected String codVigna;
    @XmlElement(name = "CodColore")
    protected String codColore;
    @XmlElement(name = "SelMenzioni")
    protected VisGiacSiRPVInput.SelMenzioni selMenzioni;
    @XmlElement(name = "Biologico")
    protected String biologico;
    @XmlElement(name = "SelPratiche")
    protected VisGiacSiRPVInput.SelPratiche selPratiche;
    @XmlElement(name = "CodPartita")
    protected String codPartita;
    @XmlElement(name = "Annata")
    protected VisGiacSiRPVInput.Annata annata;
    @XmlElement(name = "MassaVolumica")
    protected BigDecimal massaVolumica;
    @XmlElement(name = "CodStatoFisico")
    protected String codStatoFisico;
    @XmlElement(name = "DataCertDOP")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataCertDOP;
    @XmlElement(name = "NumCertDOP")
    protected String numCertDOP;

    /**
     * Recupera il valore della proprietà codOper.
     * 
     * @return
     *     possible object is
     *     {@link CUAA }
     *     
     */
    public CUAA getCodOper() {
        return codOper;
    }

    /**
     * Imposta il valore della proprietà codOper.
     * 
     * @param value
     *     allowed object is
     *     {@link CUAA }
     *     
     */
    public void setCodOper(CUAA value) {
        this.codOper = value;
    }

    /**
     * Recupera il valore della proprietà codiceIcqrf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceIcqrf() {
        return codiceIcqrf;
    }

    /**
     * Imposta il valore della proprietà codiceIcqrf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceIcqrf(String value) {
        this.codiceIcqrf = value;
    }

    /**
     * Recupera il valore della proprietà dataGiacenza.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataGiacenza() {
        return dataGiacenza;
    }

    /**
     * Imposta il valore della proprietà dataGiacenza.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataGiacenza(XMLGregorianCalendar value) {
        this.dataGiacenza = value;
    }

    /**
     * Recupera il valore della proprietà codiceProdotto.
     * 
     * @return
     *     possible object is
     *     {@link CodiceProdottoPrimario }
     *     
     */
    public CodiceProdottoPrimario getCodiceProdotto() {
        return codiceProdotto;
    }

    /**
     * Imposta il valore della proprietà codiceProdotto.
     * 
     * @param value
     *     allowed object is
     *     {@link CodiceProdottoPrimario }
     *     
     */
    public void setCodiceProdotto(CodiceProdottoPrimario value) {
        this.codiceProdotto = value;
    }

    /**
     * Recupera il valore della proprietà codCommittente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCommittente() {
        return codCommittente;
    }

    /**
     * Imposta il valore della proprietà codCommittente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCommittente(String value) {
        this.codCommittente = value;
    }

    /**
     * Recupera il valore della proprietà codCategoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCategoria() {
        return codCategoria;
    }

    /**
     * Imposta il valore della proprietà codCategoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCategoria(String value) {
        this.codCategoria = value;
    }

    /**
     * Recupera il valore della proprietà attoCert.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttoCert() {
        return attoCert;
    }

    /**
     * Imposta il valore della proprietà attoCert.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttoCert(String value) {
        this.attoCert = value;
    }

    /**
     * Recupera il valore della proprietà codClassificazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodClassificazione() {
        return codClassificazione;
    }

    /**
     * Imposta il valore della proprietà codClassificazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodClassificazione(String value) {
        this.codClassificazione = value;
    }

    /**
     * Recupera il valore della proprietà codDopIgp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodDopIgp() {
        return codDopIgp;
    }

    /**
     * Imposta il valore della proprietà codDopIgp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodDopIgp(String value) {
        this.codDopIgp = value;
    }

    /**
     * Recupera il valore della proprietà codEbacchus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEbacchus() {
        return codEbacchus;
    }

    /**
     * Imposta il valore della proprietà codEbacchus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEbacchus(String value) {
        this.codEbacchus = value;
    }

    /**
     * Recupera il valore della proprietà origineUve.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigineUve() {
        return origineUve;
    }

    /**
     * Imposta il valore della proprietà origineUve.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigineUve(String value) {
        this.origineUve = value;
    }

    /**
     * Recupera il valore della proprietà provenienza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvenienza() {
        return provenienza;
    }

    /**
     * Imposta il valore della proprietà provenienza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvenienza(String value) {
        this.provenienza = value;
    }

    /**
     * Recupera il valore della proprietà selPaesiProvenienza.
     * 
     * @return
     *     possible object is
     *     {@link VisGiacSiRPVInput.SelPaesiProvenienza }
     *     
     */
    public VisGiacSiRPVInput.SelPaesiProvenienza getSelPaesiProvenienza() {
        return selPaesiProvenienza;
    }

    /**
     * Imposta il valore della proprietà selPaesiProvenienza.
     * 
     * @param value
     *     allowed object is
     *     {@link VisGiacSiRPVInput.SelPaesiProvenienza }
     *     
     */
    public void setSelPaesiProvenienza(VisGiacSiRPVInput.SelPaesiProvenienza value) {
        this.selPaesiProvenienza = value;
    }

    /**
     * Recupera il valore della proprietà codZonaViticola.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodZonaViticola() {
        return codZonaViticola;
    }

    /**
     * Imposta il valore della proprietà codZonaViticola.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodZonaViticola(String value) {
        this.codZonaViticola = value;
    }

    /**
     * Recupera il valore della proprietà selVarieta.
     * 
     * @return
     *     possible object is
     *     {@link VisGiacSiRPVInput.SelVarieta }
     *     
     */
    public VisGiacSiRPVInput.SelVarieta getSelVarieta() {
        return selVarieta;
    }

    /**
     * Imposta il valore della proprietà selVarieta.
     * 
     * @param value
     *     allowed object is
     *     {@link VisGiacSiRPVInput.SelVarieta }
     *     
     */
    public void setSelVarieta(VisGiacSiRPVInput.SelVarieta value) {
        this.selVarieta = value;
    }

    /**
     * Recupera il valore della proprietà altreVarieta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltreVarieta() {
        return altreVarieta;
    }

    /**
     * Imposta il valore della proprietà altreVarieta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltreVarieta(String value) {
        this.altreVarieta = value;
    }

    /**
     * Recupera il valore della proprietà codSottozona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodSottozona() {
        return codSottozona;
    }

    /**
     * Imposta il valore della proprietà codSottozona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodSottozona(String value) {
        this.codSottozona = value;
    }

    /**
     * Recupera il valore della proprietà codVigna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodVigna() {
        return codVigna;
    }

    /**
     * Imposta il valore della proprietà codVigna.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodVigna(String value) {
        this.codVigna = value;
    }

    /**
     * Recupera il valore della proprietà codColore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodColore() {
        return codColore;
    }

    /**
     * Imposta il valore della proprietà codColore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodColore(String value) {
        this.codColore = value;
    }

    /**
     * Recupera il valore della proprietà selMenzioni.
     * 
     * @return
     *     possible object is
     *     {@link VisGiacSiRPVInput.SelMenzioni }
     *     
     */
    public VisGiacSiRPVInput.SelMenzioni getSelMenzioni() {
        return selMenzioni;
    }

    /**
     * Imposta il valore della proprietà selMenzioni.
     * 
     * @param value
     *     allowed object is
     *     {@link VisGiacSiRPVInput.SelMenzioni }
     *     
     */
    public void setSelMenzioni(VisGiacSiRPVInput.SelMenzioni value) {
        this.selMenzioni = value;
    }

    /**
     * Recupera il valore della proprietà biologico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiologico() {
        return biologico;
    }

    /**
     * Imposta il valore della proprietà biologico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiologico(String value) {
        this.biologico = value;
    }

    /**
     * Recupera il valore della proprietà selPratiche.
     * 
     * @return
     *     possible object is
     *     {@link VisGiacSiRPVInput.SelPratiche }
     *     
     */
    public VisGiacSiRPVInput.SelPratiche getSelPratiche() {
        return selPratiche;
    }

    /**
     * Imposta il valore della proprietà selPratiche.
     * 
     * @param value
     *     allowed object is
     *     {@link VisGiacSiRPVInput.SelPratiche }
     *     
     */
    public void setSelPratiche(VisGiacSiRPVInput.SelPratiche value) {
        this.selPratiche = value;
    }

    /**
     * Recupera il valore della proprietà codPartita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodPartita() {
        return codPartita;
    }

    /**
     * Imposta il valore della proprietà codPartita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodPartita(String value) {
        this.codPartita = value;
    }

    /**
     * Recupera il valore della proprietà annata.
     * 
     * @return
     *     possible object is
     *     {@link VisGiacSiRPVInput.Annata }
     *     
     */
    public VisGiacSiRPVInput.Annata getAnnata() {
        return annata;
    }

    /**
     * Imposta il valore della proprietà annata.
     * 
     * @param value
     *     allowed object is
     *     {@link VisGiacSiRPVInput.Annata }
     *     
     */
    public void setAnnata(VisGiacSiRPVInput.Annata value) {
        this.annata = value;
    }

    /**
     * Recupera il valore della proprietà massaVolumica.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMassaVolumica() {
        return massaVolumica;
    }

    /**
     * Imposta il valore della proprietà massaVolumica.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMassaVolumica(BigDecimal value) {
        this.massaVolumica = value;
    }

    /**
     * Recupera il valore della proprietà codStatoFisico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodStatoFisico() {
        return codStatoFisico;
    }

    /**
     * Imposta il valore della proprietà codStatoFisico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodStatoFisico(String value) {
        this.codStatoFisico = value;
    }

    /**
     * Recupera il valore della proprietà dataCertDOP.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCertDOP() {
        return dataCertDOP;
    }

    /**
     * Imposta il valore della proprietà dataCertDOP.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCertDOP(XMLGregorianCalendar value) {
        this.dataCertDOP = value;
    }

    /**
     * Recupera il valore della proprietà numCertDOP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCertDOP() {
        return numCertDOP;
    }

    /**
     * Imposta il valore della proprietà numCertDOP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCertDOP(String value) {
        this.numCertDOP = value;
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
     *       &lt;sequence>
     *         &lt;element name="Anno">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;totalDigits value="4"/>
     *               &lt;fractionDigits value="0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Percentuale" type="{http://cooperazione.sian.it/schema/wsmrga/}Percentuale" minOccurs="0"/>
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
        "anno",
        "percentuale"
    })
    public static class Annata {

        @XmlElement(name = "Anno", required = true)
        protected BigDecimal anno;
        @XmlElement(name = "Percentuale")
        protected BigDecimal percentuale;

        /**
         * Recupera il valore della proprietà anno.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAnno() {
            return anno;
        }

        /**
         * Imposta il valore della proprietà anno.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAnno(BigDecimal value) {
            this.anno = value;
        }

        /**
         * Recupera il valore della proprietà percentuale.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPercentuale() {
            return percentuale;
        }

        /**
         * Imposta il valore della proprietà percentuale.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPercentuale(BigDecimal value) {
            this.percentuale = value;
        }

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
     *       &lt;sequence>
     *         &lt;element name="TipoFiltro" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoFiltro"/>
     *         &lt;element name="Menzioni" type="{http://cooperazione.sian.it/schema/wsmrga/}Menzioni" maxOccurs="unbounded" minOccurs="0"/>
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
        "tipoFiltro",
        "menzioni"
    })
    public static class SelMenzioni {

        @XmlElement(name = "TipoFiltro", required = true)
        @XmlSchemaType(name = "string")
        protected TipoFiltro tipoFiltro;
        @XmlElement(name = "Menzioni")
        protected List<Menzioni> menzioni;

        /**
         * Recupera il valore della proprietà tipoFiltro.
         * 
         * @return
         *     possible object is
         *     {@link TipoFiltro }
         *     
         */
        public TipoFiltro getTipoFiltro() {
            return tipoFiltro;
        }

        /**
         * Imposta il valore della proprietà tipoFiltro.
         * 
         * @param value
         *     allowed object is
         *     {@link TipoFiltro }
         *     
         */
        public void setTipoFiltro(TipoFiltro value) {
            this.tipoFiltro = value;
        }

        /**
         * Gets the value of the menzioni property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the menzioni property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMenzioni().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Menzioni }
         * 
         * 
         */
        public List<Menzioni> getMenzioni() {
            if (menzioni == null) {
                menzioni = new ArrayList<Menzioni>();
            }
            return this.menzioni;
        }

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
     *       &lt;sequence>
     *         &lt;element name="TipoFiltro" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoFiltro"/>
     *         &lt;element name="PaesiProvenienza" type="{http://cooperazione.sian.it/schema/wsmrga/}PaesiProvenienza" maxOccurs="unbounded" minOccurs="0"/>
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
        "tipoFiltro",
        "paesiProvenienza"
    })
    public static class SelPaesiProvenienza {

        @XmlElement(name = "TipoFiltro", required = true)
        @XmlSchemaType(name = "string")
        protected TipoFiltro tipoFiltro;
        @XmlElement(name = "PaesiProvenienza")
        protected List<PaesiProvenienza> paesiProvenienza;

        /**
         * Recupera il valore della proprietà tipoFiltro.
         * 
         * @return
         *     possible object is
         *     {@link TipoFiltro }
         *     
         */
        public TipoFiltro getTipoFiltro() {
            return tipoFiltro;
        }

        /**
         * Imposta il valore della proprietà tipoFiltro.
         * 
         * @param value
         *     allowed object is
         *     {@link TipoFiltro }
         *     
         */
        public void setTipoFiltro(TipoFiltro value) {
            this.tipoFiltro = value;
        }

        /**
         * Gets the value of the paesiProvenienza property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paesiProvenienza property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaesiProvenienza().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PaesiProvenienza }
         * 
         * 
         */
        public List<PaesiProvenienza> getPaesiProvenienza() {
            if (paesiProvenienza == null) {
                paesiProvenienza = new ArrayList<PaesiProvenienza>();
            }
            return this.paesiProvenienza;
        }

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
     *       &lt;sequence>
     *         &lt;element name="TipoFiltro" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoFiltro"/>
     *         &lt;element name="PraticheEnologiche" type="{http://cooperazione.sian.it/schema/wsmrga/}PraticheEnologiche" maxOccurs="unbounded" minOccurs="0"/>
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
        "tipoFiltro",
        "praticheEnologiche"
    })
    public static class SelPratiche {

        @XmlElement(name = "TipoFiltro", required = true)
        @XmlSchemaType(name = "string")
        protected TipoFiltro tipoFiltro;
        @XmlElement(name = "PraticheEnologiche")
        protected List<PraticheEnologiche> praticheEnologiche;

        /**
         * Recupera il valore della proprietà tipoFiltro.
         * 
         * @return
         *     possible object is
         *     {@link TipoFiltro }
         *     
         */
        public TipoFiltro getTipoFiltro() {
            return tipoFiltro;
        }

        /**
         * Imposta il valore della proprietà tipoFiltro.
         * 
         * @param value
         *     allowed object is
         *     {@link TipoFiltro }
         *     
         */
        public void setTipoFiltro(TipoFiltro value) {
            this.tipoFiltro = value;
        }

        /**
         * Gets the value of the praticheEnologiche property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the praticheEnologiche property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPraticheEnologiche().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PraticheEnologiche }
         * 
         * 
         */
        public List<PraticheEnologiche> getPraticheEnologiche() {
            if (praticheEnologiche == null) {
                praticheEnologiche = new ArrayList<PraticheEnologiche>();
            }
            return this.praticheEnologiche;
        }

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
     *       &lt;sequence>
     *         &lt;element name="TipoFiltro" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoFiltro"/>
     *         &lt;element name="Varieta" type="{http://cooperazione.sian.it/schema/wsmrga/}Cod_ValorePerc" maxOccurs="unbounded" minOccurs="0"/>
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
        "tipoFiltro",
        "varieta"
    })
    public static class SelVarieta {

        @XmlElement(name = "TipoFiltro", required = true)
        @XmlSchemaType(name = "string")
        protected TipoFiltro tipoFiltro;
        @XmlElement(name = "Varieta")
        protected List<CodValorePerc> varieta;

        /**
         * Recupera il valore della proprietà tipoFiltro.
         * 
         * @return
         *     possible object is
         *     {@link TipoFiltro }
         *     
         */
        public TipoFiltro getTipoFiltro() {
            return tipoFiltro;
        }

        /**
         * Imposta il valore della proprietà tipoFiltro.
         * 
         * @param value
         *     allowed object is
         *     {@link TipoFiltro }
         *     
         */
        public void setTipoFiltro(TipoFiltro value) {
            this.tipoFiltro = value;
        }

        /**
         * Gets the value of the varieta property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the varieta property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVarieta().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CodValorePerc }
         * 
         * 
         */
        public List<CodValorePerc> getVarieta() {
            if (varieta == null) {
                varieta = new ArrayList<CodValorePerc>();
            }
            return this.varieta;
        }

    }

}
