
package it.sian.cooperazione.schema.wsmrga;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per SczcProdotto2 complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SczcProdotto2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Prodotto">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="Designazione" type="{http://cooperazione.sian.it/schema/wsmrga/}SczcDesignProd2"/>
 *                   &lt;element name="CodiceProdotto" type="{http://cooperazione.sian.it/schema/wsmrga/}CodiceProdotto"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TitoloAlcolTot" type="{http://cooperazione.sian.it/schema/wsmrga/}Percentuale"/>
 *         &lt;element name="CodRecipiente" type="{http://cooperazione.sian.it/schema/wsmrga/}CodRecipiente" maxOccurs="unbounded"/>
 *         &lt;element name="Quantita" type="{http://cooperazione.sian.it/schema/wsmrga/}QtaKgCarico"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SczcProdotto2", propOrder = {
    "prodotto",
    "titoloAlcolTot",
    "codRecipiente",
    "quantita"
})
public class SczcProdotto2 {

    @XmlElement(name = "Prodotto", required = true)
    protected SczcProdotto2 .Prodotto prodotto;
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
     *     {@link SczcProdotto2 .Prodotto }
     *     
     */
    public SczcProdotto2 .Prodotto getProdotto() {
        return prodotto;
    }

    /**
     * Imposta il valore della proprietà prodotto.
     * 
     * @param value
     *     allowed object is
     *     {@link SczcProdotto2 .Prodotto }
     *     
     */
    public void setProdotto(SczcProdotto2 .Prodotto value) {
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
     *         &lt;element name="Designazione" type="{http://cooperazione.sian.it/schema/wsmrga/}SczcDesignProd2"/>
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
        protected SczcDesignProd2 designazione;
        @XmlElement(name = "CodiceProdotto")
        protected CodiceProdotto codiceProdotto;

        /**
         * Recupera il valore della proprietà designazione.
         * 
         * @return
         *     possible object is
         *     {@link SczcDesignProd2 }
         *     
         */
        public SczcDesignProd2 getDesignazione() {
            return designazione;
        }

        /**
         * Imposta il valore della proprietà designazione.
         * 
         * @param value
         *     allowed object is
         *     {@link SczcDesignProd2 }
         *     
         */
        public void setDesignazione(SczcDesignProd2 value) {
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
