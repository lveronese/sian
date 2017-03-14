
package it.sian.cooperazione.schema.wsmrga;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AvltProdotto1 complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AvltProdotto1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Prodotto">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="Designazione" type="{http://cooperazione.sian.it/schema/wsmrga/}AvltDesignProd1"/>
 *                   &lt;element name="CodiceProdotto" type="{http://cooperazione.sian.it/schema/wsmrga/}CodiceProdotto"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TitoloAlcolPot" type="{http://cooperazione.sian.it/schema/wsmrga/}Percentuale" minOccurs="0"/>
 *         &lt;element name="TitoloAlcolEff" type="{http://cooperazione.sian.it/schema/wsmrga/}Percentuale" minOccurs="0"/>
 *         &lt;element name="TitoloAlcolTot" type="{http://cooperazione.sian.it/schema/wsmrga/}Percentuale" minOccurs="0"/>
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
@XmlType(name = "AvltProdotto1", propOrder = {
    "prodotto",
    "titoloAlcolPot",
    "titoloAlcolEff",
    "titoloAlcolTot",
    "quantita"
})
public class AvltProdotto1 {

    @XmlElement(name = "Prodotto", required = true)
    protected AvltProdotto1 .Prodotto prodotto;
    @XmlElement(name = "TitoloAlcolPot")
    protected BigDecimal titoloAlcolPot;
    @XmlElement(name = "TitoloAlcolEff")
    protected BigDecimal titoloAlcolEff;
    @XmlElement(name = "TitoloAlcolTot")
    protected BigDecimal titoloAlcolTot;
    @XmlElement(name = "Quantita", required = true)
    protected BigDecimal quantita;

    /**
     * Recupera il valore della proprietà prodotto.
     * 
     * @return
     *     possible object is
     *     {@link AvltProdotto1 .Prodotto }
     *     
     */
    public AvltProdotto1 .Prodotto getProdotto() {
        return prodotto;
    }

    /**
     * Imposta il valore della proprietà prodotto.
     * 
     * @param value
     *     allowed object is
     *     {@link AvltProdotto1 .Prodotto }
     *     
     */
    public void setProdotto(AvltProdotto1 .Prodotto value) {
        this.prodotto = value;
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
     *         &lt;element name="Designazione" type="{http://cooperazione.sian.it/schema/wsmrga/}AvltDesignProd1"/>
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
        protected AvltDesignProd1 designazione;
        @XmlElement(name = "CodiceProdotto")
        protected CodiceProdotto codiceProdotto;

        /**
         * Recupera il valore della proprietà designazione.
         * 
         * @return
         *     possible object is
         *     {@link AvltDesignProd1 }
         *     
         */
        public AvltDesignProd1 getDesignazione() {
            return designazione;
        }

        /**
         * Imposta il valore della proprietà designazione.
         * 
         * @param value
         *     allowed object is
         *     {@link AvltDesignProd1 }
         *     
         */
        public void setDesignazione(AvltDesignProd1 value) {
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
