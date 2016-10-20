
package it.sian.cooperazione.schema.wsmrga;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AcetDesignProd3 complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AcetDesignProd3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodCategoria" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice"/>
 *         &lt;element name="CodDopIgp" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice" minOccurs="0"/>
 *         &lt;element name="OrigineUve" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodicePaese" minOccurs="0"/>
 *         &lt;element name="Provenienza" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice" minOccurs="0"/>
 *         &lt;element name="PaesiProvenienza" type="{http://cooperazione.sian.it/schema/wsmrga/}PaesiProvenienza" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Varieta" type="{http://cooperazione.sian.it/schema/wsmrga/}Cod_ValorePerc" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CodColore" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice"/>
 *         &lt;element name="Menzioni" type="{http://cooperazione.sian.it/schema/wsmrga/}Menzioni" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Biologico" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice"/>
 *         &lt;element name="CodPartita" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice" minOccurs="0"/>
 *         &lt;element name="TitoloAlcolTot" type="{http://cooperazione.sian.it/schema/wsmrga/}Percentuale"/>
 *         &lt;element name="CodStatoFisico" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice"/>
 *         &lt;element name="GradoAcidita" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoMassaVolume" minOccurs="0"/>
 *         &lt;element name="Montegradi" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoMassaVolume" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcetDesignProd3", propOrder = {
    "codCategoria",
    "codDopIgp",
    "origineUve",
    "provenienza",
    "paesiProvenienza",
    "varieta",
    "codColore",
    "menzioni",
    "biologico",
    "codPartita",
    "titoloAlcolTot",
    "codStatoFisico",
    "gradoAcidita",
    "montegradi"
})
public class AcetDesignProd3 {

    @XmlElement(name = "CodCategoria", required = true)
    protected String codCategoria;
    @XmlElement(name = "CodDopIgp")
    protected String codDopIgp;
    @XmlElement(name = "OrigineUve")
    protected String origineUve;
    @XmlElement(name = "Provenienza")
    protected String provenienza;
    @XmlElement(name = "PaesiProvenienza")
    protected List<PaesiProvenienza> paesiProvenienza;
    @XmlElement(name = "Varieta")
    protected List<CodValorePerc> varieta;
    @XmlElement(name = "CodColore", required = true)
    protected String codColore;
    @XmlElement(name = "Menzioni")
    protected List<Menzioni> menzioni;
    @XmlElement(name = "Biologico", required = true)
    protected String biologico;
    @XmlElement(name = "CodPartita")
    protected String codPartita;
    @XmlElement(name = "TitoloAlcolTot", required = true)
    protected BigDecimal titoloAlcolTot;
    @XmlElement(name = "CodStatoFisico", required = true)
    protected String codStatoFisico;
    @XmlElement(name = "GradoAcidita")
    protected BigDecimal gradoAcidita;
    @XmlElement(name = "Montegradi")
    protected BigDecimal montegradi;

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
     * Recupera il valore della proprietà gradoAcidita.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGradoAcidita() {
        return gradoAcidita;
    }

    /**
     * Imposta il valore della proprietà gradoAcidita.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGradoAcidita(BigDecimal value) {
        this.gradoAcidita = value;
    }

    /**
     * Recupera il valore della proprietà montegradi.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontegradi() {
        return montegradi;
    }

    /**
     * Imposta il valore della proprietà montegradi.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontegradi(BigDecimal value) {
        this.montegradi = value;
    }

}
