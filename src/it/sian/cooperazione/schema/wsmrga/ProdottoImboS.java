
package it.sian.cooperazione.schema.wsmrga;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ProdottoImboS complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ProdottoImboS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProdImboS1">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="Designazione" type="{http://cooperazione.sian.it/schema/wsmrga/}ProdottoImboA"/>
 *                   &lt;element name="CodiceProdotto" type="{http://cooperazione.sian.it/schema/wsmrga/}CodiceProdotto"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CodTenoreZucc" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice" minOccurs="0"/>
 *         &lt;element name="PercIgp" type="{http://cooperazione.sian.it/schema/wsmrga/}Percentuale" minOccurs="0"/>
 *         &lt;element name="TitoloAlcolPot" type="{http://cooperazione.sian.it/schema/wsmrga/}Percentuale" minOccurs="0"/>
 *         &lt;element name="TitoloAlcolEff" type="{http://cooperazione.sian.it/schema/wsmrga/}Percentuale" minOccurs="0"/>
 *         &lt;element name="TitoloAlcolTot" type="{http://cooperazione.sian.it/schema/wsmrga/}Percentuale" minOccurs="0"/>
 *         &lt;element name="CodRecipiente" type="{http://cooperazione.sian.it/schema/wsmrga/}CodRecipiente" maxOccurs="unbounded"/>
 *         &lt;element name="Quantita" type="{http://cooperazione.sian.it/schema/wsmrga/}QtaKgScarico"/>
 *         &lt;element name="QuantitaPerdita" type="{http://cooperazione.sian.it/schema/wsmrga/}QtaKgCarico" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProdottoImboS", propOrder = {
    "prodImboS1",
    "codTenoreZucc",
    "percIgp",
    "titoloAlcolPot",
    "titoloAlcolEff",
    "titoloAlcolTot",
    "codRecipiente",
    "quantita",
    "quantitaPerdita"
})
public class ProdottoImboS {

    @XmlElement(name = "ProdImboS1", required = true)
    protected ProdottoImboS.ProdImboS1 prodImboS1;
    @XmlElement(name = "CodTenoreZucc")
    protected String codTenoreZucc;
    @XmlElement(name = "PercIgp")
    protected BigDecimal percIgp;
    @XmlElement(name = "TitoloAlcolPot")
    protected BigDecimal titoloAlcolPot;
    @XmlElement(name = "TitoloAlcolEff")
    protected BigDecimal titoloAlcolEff;
    @XmlElement(name = "TitoloAlcolTot")
    protected BigDecimal titoloAlcolTot;
    @XmlElement(name = "CodRecipiente", required = true)
    protected List<CodRecipiente> codRecipiente;
    @XmlElement(name = "Quantita", required = true)
    protected BigDecimal quantita;
    @XmlElement(name = "QuantitaPerdita")
    protected BigDecimal quantitaPerdita;

    /**
     * Recupera il valore della proprietà prodImboS1.
     * 
     * @return
     *     possible object is
     *     {@link ProdottoImboS.ProdImboS1 }
     *     
     */
    public ProdottoImboS.ProdImboS1 getProdImboS1() {
        return prodImboS1;
    }

    /**
     * Imposta il valore della proprietà prodImboS1.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdottoImboS.ProdImboS1 }
     *     
     */
    public void setProdImboS1(ProdottoImboS.ProdImboS1 value) {
        this.prodImboS1 = value;
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
     * Recupera il valore della proprietà percIgp.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercIgp() {
        return percIgp;
    }

    /**
     * Imposta il valore della proprietà percIgp.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercIgp(BigDecimal value) {
        this.percIgp = value;
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
     * Recupera il valore della proprietà quantitaPerdita.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantitaPerdita() {
        return quantitaPerdita;
    }

    /**
     * Imposta il valore della proprietà quantitaPerdita.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantitaPerdita(BigDecimal value) {
        this.quantitaPerdita = value;
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
     *         &lt;element name="Designazione" type="{http://cooperazione.sian.it/schema/wsmrga/}ProdottoImboA"/>
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
    public static class ProdImboS1 {

        @XmlElement(name = "Designazione")
        protected ProdottoImboA designazione;
        @XmlElement(name = "CodiceProdotto")
        protected CodiceProdotto codiceProdotto;

        /**
         * Recupera il valore della proprietà designazione.
         * 
         * @return
         *     possible object is
         *     {@link ProdottoImboA }
         *     
         */
        public ProdottoImboA getDesignazione() {
            return designazione;
        }

        /**
         * Imposta il valore della proprietà designazione.
         * 
         * @param value
         *     allowed object is
         *     {@link ProdottoImboA }
         *     
         */
        public void setDesignazione(ProdottoImboA value) {
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
