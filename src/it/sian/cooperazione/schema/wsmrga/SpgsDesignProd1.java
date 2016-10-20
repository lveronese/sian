
package it.sian.cooperazione.schema.wsmrga;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per SpgsDesignProd1 complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SpgsDesignProd1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodCategoria" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice"/>
 *         &lt;element name="AttoCert" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice"/>
 *         &lt;element name="CodClassificazione" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice"/>
 *         &lt;element name="OrigineUve" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodicePaese" minOccurs="0"/>
 *         &lt;element name="Provenienza" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice" minOccurs="0"/>
 *         &lt;element name="PaesiProvenienza" type="{http://cooperazione.sian.it/schema/wsmrga/}PaesiProvenienza" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CodZonaViticola" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice"/>
 *         &lt;element name="Varieta" type="{http://cooperazione.sian.it/schema/wsmrga/}Cod_ValorePerc" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AltreVarieta" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoDescrizione" minOccurs="0"/>
 *         &lt;element name="Biologico" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice"/>
 *         &lt;element name="PraticheEnologiche" type="{http://cooperazione.sian.it/schema/wsmrga/}PraticheEnologiche" maxOccurs="unbounded"/>
 *         &lt;element name="Annata" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoAnnata" minOccurs="0"/>
 *         &lt;element name="TitoloAlcolPot" type="{http://cooperazione.sian.it/schema/wsmrga/}Percentuale" minOccurs="0"/>
 *         &lt;element name="TitoloAlcolEff" type="{http://cooperazione.sian.it/schema/wsmrga/}Percentuale" minOccurs="0"/>
 *         &lt;element name="TitoloAlcolTot" type="{http://cooperazione.sian.it/schema/wsmrga/}Percentuale" minOccurs="0"/>
 *         &lt;element name="MassaVolumica" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoMassaVolume" minOccurs="0"/>
 *         &lt;element name="CodStatoFisico" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpgsDesignProd1", propOrder = {
    "codCategoria",
    "attoCert",
    "codClassificazione",
    "origineUve",
    "provenienza",
    "paesiProvenienza",
    "codZonaViticola",
    "varieta",
    "altreVarieta",
    "biologico",
    "praticheEnologiche",
    "annata",
    "titoloAlcolPot",
    "titoloAlcolEff",
    "titoloAlcolTot",
    "massaVolumica",
    "codStatoFisico"
})
public class SpgsDesignProd1 {

    @XmlElement(name = "CodCategoria", required = true)
    protected String codCategoria;
    @XmlElement(name = "AttoCert", required = true)
    protected String attoCert;
    @XmlElement(name = "CodClassificazione", required = true)
    protected String codClassificazione;
    @XmlElement(name = "OrigineUve")
    protected String origineUve;
    @XmlElement(name = "Provenienza")
    protected String provenienza;
    @XmlElement(name = "PaesiProvenienza")
    protected List<PaesiProvenienza> paesiProvenienza;
    @XmlElement(name = "CodZonaViticola", required = true)
    protected String codZonaViticola;
    @XmlElement(name = "Varieta")
    protected List<CodValorePerc> varieta;
    @XmlElement(name = "AltreVarieta")
    protected String altreVarieta;
    @XmlElement(name = "Biologico", required = true)
    protected String biologico;
    @XmlElement(name = "PraticheEnologiche", required = true)
    protected List<PraticheEnologiche> praticheEnologiche;
    @XmlElement(name = "Annata")
    protected TipoAnnata annata;
    @XmlElement(name = "TitoloAlcolPot")
    protected BigDecimal titoloAlcolPot;
    @XmlElement(name = "TitoloAlcolEff")
    protected BigDecimal titoloAlcolEff;
    @XmlElement(name = "TitoloAlcolTot")
    protected BigDecimal titoloAlcolTot;
    @XmlElement(name = "MassaVolumica")
    protected BigDecimal massaVolumica;
    @XmlElement(name = "CodStatoFisico", required = true)
    protected String codStatoFisico;

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

    /**
     * Recupera il valore della proprietà annata.
     * 
     * @return
     *     possible object is
     *     {@link TipoAnnata }
     *     
     */
    public TipoAnnata getAnnata() {
        return annata;
    }

    /**
     * Imposta il valore della proprietà annata.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoAnnata }
     *     
     */
    public void setAnnata(TipoAnnata value) {
        this.annata = value;
    }

    /**
     * Recupera il valore della proprietà titoloAlcolPot.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTitoloAlcolPot() {
        return titoloAlcolPot;
    }

    /**
     * Imposta il valore della proprietà titoloAlcolPot.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTitoloAlcolPot(BigDecimal value) {
        this.titoloAlcolPot = value;
    }

    /**
     * Recupera il valore della proprietà titoloAlcolEff.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTitoloAlcolEff() {
        return titoloAlcolEff;
    }

    /**
     * Imposta il valore della proprietà titoloAlcolEff.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTitoloAlcolEff(BigDecimal value) {
        this.titoloAlcolEff = value;
    }

    /**
     * Recupera il valore della proprietà titoloAlcolTot.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTitoloAlcolTot() {
        return titoloAlcolTot;
    }

    /**
     * Imposta il valore della proprietà titoloAlcolTot.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTitoloAlcolTot(BigDecimal value) {
        this.titoloAlcolTot = value;
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

}
