
package it.sian.cooperazione.schema.wsmrga;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per SpabProdotto2 complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SpabProdotto2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Prodotto">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="Designazione" type="{http://cooperazione.sian.it/schema/wsmrga/}SpabDesignProd2"/>
 *                   &lt;element name="CodiceProdotto" type="{http://cooperazione.sian.it/schema/wsmrga/}CodiceProdotto"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TitoloAlcolTot" type="{http://cooperazione.sian.it/schema/wsmrga/}Percentuale"/>
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
@XmlType(name = "SpabProdotto2", propOrder = {
    "prodotto",
    "titoloAlcolTot",
    "codRecipiente",
    "quantita"
})
public class SpabProdotto2 {

    @XmlElement(name = "Prodotto", required = true)
    protected SpabProdotto2 .Prodotto prodotto;
    @XmlElement(name = "TitoloAlcolTot", required = true)
    protected BigDecimal titoloAlcolTot;
    @XmlElement(name = "CodRecipiente", required = true)
    protected List<CodRecipiente> codRecipiente;
    @XmlElement(name = "Quantita", required = true)
    protected BigDecimal quantita;

    /**
     * Recupera il valore della proprietà prodotto.
     * 
     * @return
     *     possible object is
     *     {@link SpabProdotto2 .Prodotto }
     *     
     */
    public SpabProdotto2 .Prodotto getProdotto() {
        return prodotto;
    }

    /**
     * Imposta il valore della proprietà prodotto.
     * 
     * @param value
     *     allowed object is
     *     {@link SpabProdotto2 .Prodotto }
     *     
     */
    public void setProdotto(SpabProdotto2 .Prodotto value) {
        this.prodotto = value;
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
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="Designazione" type="{http://cooperazione.sian.it/schema/wsmrga/}SpabDesignProd2"/>
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
        protected SpabDesignProd2 designazione;
        @XmlElement(name = "CodiceProdotto")
        protected CodiceProdotto codiceProdotto;

        /**
         * Recupera il valore della proprietà designazione.
         * 
         * @return
         *     possible object is
         *     {@link SpabDesignProd2 }
         *     
         */
        public SpabDesignProd2 getDesignazione() {
            return designazione;
        }

        /**
         * Imposta il valore della proprietà designazione.
         * 
         * @param value
         *     allowed object is
         *     {@link SpabDesignProd2 }
         *     
         */
        public void setDesignazione(SpabDesignProd2 value) {
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
