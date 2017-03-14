
package it.sian.cooperazione.schema.wsmrga;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per SczcDesignProd2 complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SczcDesignProd2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodCategoria" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice"/>
 *         &lt;element name="AttoCert" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice"/>
 *         &lt;element name="CodClassificazione" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice"/>
 *         &lt;element name="CodDopIgp" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodiceDopIgp" minOccurs="0"/>
 *         &lt;element name="OrigineUve" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodicePaese" minOccurs="0"/>
 *         &lt;element name="Provenienza" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice" minOccurs="0"/>
 *         &lt;element name="PaesiProvenienza" type="{http://cooperazione.sian.it/schema/wsmrga/}PaesiProvenienza" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CodZonaViticola" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice" minOccurs="0"/>
 *         &lt;element name="Varieta" type="{http://cooperazione.sian.it/schema/wsmrga/}Cod_Valore" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AltreVarieta" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoDescrizione" minOccurs="0"/>
 *         &lt;element name="CodSottozona" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice" minOccurs="0"/>
 *         &lt;element name="CodVigna" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice" minOccurs="0"/>
 *         &lt;element name="CodColore" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice" minOccurs="0"/>
 *         &lt;element name="Menzioni" type="{http://cooperazione.sian.it/schema/wsmrga/}Menzioni" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Biologico" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice" minOccurs="0"/>
 *         &lt;element name="Annata" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoAnnataCodice" minOccurs="0"/>
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
@XmlType(name = "SczcDesignProd2", propOrder = {
    "codCategoria",
    "attoCert",
    "codClassificazione",
    "codDopIgp",
    "origineUve",
    "provenienza",
    "paesiProvenienza",
    "codZonaViticola",
    "varieta",
    "altreVarieta",
    "codSottozona",
    "codVigna",
    "codColore",
    "menzioni",
    "biologico",
    "annata",
    "codStatoFisico"
})
public class SczcDesignProd2 {

    @XmlElement(name = "CodCategoria", required = true)
    protected String codCategoria;
    @XmlElement(name = "AttoCert", required = true)
    protected String attoCert;
    @XmlElement(name = "CodClassificazione", required = true)
    protected String codClassificazione;
    @XmlElement(name = "CodDopIgp")
    protected String codDopIgp;
    @XmlElement(name = "OrigineUve")
    protected String origineUve;
    @XmlElement(name = "Provenienza")
    protected String provenienza;
    @XmlElement(name = "PaesiProvenienza")
    protected List<PaesiProvenienza> paesiProvenienza;
    @XmlElement(name = "CodZonaViticola")
    protected String codZonaViticola;
    @XmlElement(name = "Varieta")
    protected List<CodValore> varieta;
    @XmlElement(name = "AltreVarieta")
    protected String altreVarieta;
    @XmlElement(name = "CodSottozona")
    protected String codSottozona;
    @XmlElement(name = "CodVigna")
    protected String codVigna;
    @XmlElement(name = "CodColore")
    protected String codColore;
    @XmlElement(name = "Menzioni")
    protected List<Menzioni> menzioni;
    @XmlElement(name = "Biologico")
    protected String biologico;
    @XmlElement(name = "Annata")
    protected TipoAnnataCodice annata;
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
     * {@link CodValore }
     * 
     * 
     */
    public List<CodValore> getVarieta() {
        if (varieta == null) {
            varieta = new ArrayList<CodValore>();
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
     * Recupera il valore della proprietà annata.
     * 
     * @return
     *     possible object is
     *     {@link TipoAnnataCodice }
     *     
     */
    public TipoAnnataCodice getAnnata() {
        return annata;
    }

    /**
     * Imposta il valore della proprietà annata.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoAnnataCodice }
     *     
     */
    public void setAnnata(TipoAnnataCodice value) {
        this.annata = value;
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
