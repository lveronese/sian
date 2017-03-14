
package it.sian.cooperazione.schema.wsmrga;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AcetProdotto1 complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AcetProdotto1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Prodotto">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="Designazione" type="{http://cooperazione.sian.it/schema/wsmrga/}AcetDesignProd1"/>
 *                   &lt;element name="CodiceProdotto" type="{http://cooperazione.sian.it/schema/wsmrga/}CodiceProdotto"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CodTenoreZucc" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice" minOccurs="0"/>
 *         &lt;element name="TitoloAlcolEff" type="{http://cooperazione.sian.it/schema/wsmrga/}Percentuale"/>
 *         &lt;element name="TitoloAlcolPot" type="{http://cooperazione.sian.it/schema/wsmrga/}Percentuale"/>
 *         &lt;element name="GradoAcidita" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoMassaVolume" minOccurs="0"/>
 *         &lt;element name="Montegradi" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoMassaVolume" minOccurs="0"/>
 *         &lt;element name="CodRecipiente" type="{http://cooperazione.sian.it/schema/wsmrga/}CodRecipiente" maxOccurs="unbounded"/>
 *         &lt;element name="Quantita" type="{http://cooperazione.sian.it/schema/wsmrga/}QtaKgScarico"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcetProdotto1", propOrder = {
    "prodotto",
    "codTenoreZucc",
    "titoloAlcolEff",
    "titoloAlcolPot",
    "gradoAcidita",
    "montegradi",
    "codRecipiente",
    "quantita"
})
public class AcetProdotto1 {

    @XmlElement(name = "Prodotto", required = true)
    protected AcetProdotto1 .Prodotto prodotto;
    @XmlElement(name = "CodTenoreZucc")
    protected String codTenoreZucc;
    @XmlElement(name = "TitoloAlcolEff", required = true)
    protected BigDecimal titoloAlcolEff;
    @XmlElement(name = "TitoloAlcolPot", required = true)
    protected BigDecimal titoloAlcolPot;
    @XmlElement(name = "GradoAcidita")
    protected BigDecimal gradoAcidita;
    @XmlElement(name = "Montegradi")
    protected BigDecimal montegradi;
    @XmlElement(name = "CodRecipiente", required = true)
    protected List<CodRecipiente> codRecipiente;
    @XmlElement(name = "Quantita", required = true)
    protected BigDecimal quantita;

    /**
     * Recupera il valore della proprietà prodotto.
     * 
     * @return
     *     possible object is
     *     {@link AcetProdotto1 .Prodotto }
     *     
     */
    public AcetProdotto1 .Prodotto getProdotto() {
        return prodotto;
    }

    /**
     * Imposta il valore della proprietà prodotto.
     * 
     * @param value
     *     allowed object is
     *     {@link AcetProdotto1 .Prodotto }
     *     
     */
    public void setProdotto(AcetProdotto1 .Prodotto value) {
        this.prodotto = value;
    }

    /**
     * Recupera il valore della proprietà codTenoreZucc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTenoreZucc() {
        return codTenoreZucc;
    }

    /**
     * Imposta il valore della proprietà codTenoreZucc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTenoreZucc(String value) {
        this.codTenoreZucc = value;
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

    /**
     * Gets the value of the codRecipiente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codRecipiente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodRecipiente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodRecipiente }
     * 
     * 
     */
    public List<CodRecipiente> getCodRecipiente() {
        if (codRecipiente == null) {
            codRecipiente = new ArrayList<CodRecipiente>();
        }
        return this.codRecipiente;
    }

    /**
     * Recupera il valore della proprietà quantita.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantita() {
        return quantita;
    }

    /**
     * Imposta il valore della proprietà quantita.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantita(BigDecimal value) {
        this.quantita = value;
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
     *         &lt;element name="Designazione" type="{http://cooperazione.sian.it/schema/wsmrga/}AcetDesignProd1"/>
     *         &lt;element name="CodiceProdotto" type="{http://cooperazione.sian.it/schema/wsmrga/}CodiceProdotto"/>
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
        "designazione",
        "codiceProdotto"
    })
    public static class Prodotto {

        @XmlElement(name = "Designazione")
        protected AcetDesignProd1 designazione;
        @XmlElement(name = "CodiceProdotto")
        protected CodiceProdotto codiceProdotto;

        /**
         * Recupera il valore della proprietà designazione.
         * 
         * @return
         *     possible object is
         *     {@link AcetDesignProd1 }
         *     
         */
        public AcetDesignProd1 getDesignazione() {
            return designazione;
        }

        /**
         * Imposta il valore della proprietà designazione.
         * 
         * @param value
         *     allowed object is
         *     {@link AcetDesignProd1 }
         *     
         */
        public void setDesignazione(AcetDesignProd1 value) {
            this.designazione = value;
        }

        /**
         * Recupera il valore della proprietà codiceProdotto.
         * 
         * @return
         *     possible object is
         *     {@link CodiceProdotto }
         *     
         */
        public CodiceProdotto getCodiceProdotto() {
            return codiceProdotto;
        }

        /**
         * Imposta il valore della proprietà codiceProdotto.
         * 
         * @param value
         *     allowed object is
         *     {@link CodiceProdotto }
         *     
         */
        public void setCodiceProdotto(CodiceProdotto value) {
            this.codiceProdotto = value;
        }

    }

}
