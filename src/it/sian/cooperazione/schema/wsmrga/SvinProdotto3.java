
package it.sian.cooperazione.schema.wsmrga;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per SvinProdotto3 complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SvinProdotto3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SvinDesignProd3">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="Designazione" type="{http://cooperazione.sian.it/schema/wsmrga/}SvinDesignProd3"/>
 *                   &lt;element name="CodiceProdotto" type="{http://cooperazione.sian.it/schema/wsmrga/}CodiceProdotto"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "SvinProdotto3", propOrder = {
    "svinDesignProd3",
    "quantita"
})
public class SvinProdotto3 {

    @XmlElement(name = "SvinDesignProd3", required = true)
    protected SvinProdotto3 .SvinDesignProd3 svinDesignProd3;
    @XmlElement(name = "Quantita", required = true)
    protected BigDecimal quantita;

    /**
     * Recupera il valore della proprietà svinDesignProd3.
     * 
     * @return
     *     possible object is
     *     {@link SvinProdotto3 .SvinDesignProd3 }
     *     
     */
    public SvinProdotto3 .SvinDesignProd3 getSvinDesignProd3() {
        return svinDesignProd3;
    }

    /**
     * Imposta il valore della proprietà svinDesignProd3.
     * 
     * @param value
     *     allowed object is
     *     {@link SvinProdotto3 .SvinDesignProd3 }
     *     
     */
    public void setSvinDesignProd3(SvinProdotto3 .SvinDesignProd3 value) {
        this.svinDesignProd3 = value;
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
     *         &lt;element name="Designazione" type="{http://cooperazione.sian.it/schema/wsmrga/}SvinDesignProd3"/>
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
    public static class SvinDesignProd3 {

        @XmlElement(name = "Designazione")
        protected it.sian.cooperazione.schema.wsmrga.SvinDesignProd3 designazione;
        @XmlElement(name = "CodiceProdotto")
        protected CodiceProdotto codiceProdotto;

        /**
         * Recupera il valore della proprietà designazione.
         * 
         * @return
         *     possible object is
         *     {@link it.sian.cooperazione.schema.wsmrga.SvinDesignProd3 }
         *     
         */
        public it.sian.cooperazione.schema.wsmrga.SvinDesignProd3 getDesignazione() {
            return designazione;
        }

        /**
         * Imposta il valore della proprietà designazione.
         * 
         * @param value
         *     allowed object is
         *     {@link it.sian.cooperazione.schema.wsmrga.SvinDesignProd3 }
         *     
         */
        public void setDesignazione(it.sian.cooperazione.schema.wsmrga.SvinDesignProd3 value) {
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
