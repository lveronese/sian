
package it.sian.cooperazione.schema.wsmrga;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Esito" type="{http://cooperazione.sian.it/schema/wsmrga/}Response" minOccurs="0"/>
 *         &lt;element name="ProdGiacenza" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CodiceProdotto" type="{http://cooperazione.sian.it/schema/wsmrga/}CodiceProdotto"/>
 *                   &lt;element name="Designazione" type="{http://cooperazione.sian.it/schema/wsmrga/}ProdottoCatalogo"/>
 *                   &lt;element name="CodCommittente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="UnMis" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice"/>
 *                   &lt;element name="QtaGiacenza" type="{http://cooperazione.sian.it/schema/wsmrga/}QtaKgGiac"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "esito",
    "prodGiacenza"
})
@XmlRootElement(name = "VisGiacSiRPVOutput")
public class VisGiacSiRPVOutput {

    @XmlElement(name = "Esito")
    protected Response esito;
    @XmlElement(name = "ProdGiacenza")
    protected List<VisGiacSiRPVOutput.ProdGiacenza> prodGiacenza;

    /**
     * Recupera il valore della proprietà esito.
     * 
     * @return
     *     possible object is
     *     {@link Response }
     *     
     */
    public Response getEsito() {
        return esito;
    }

    /**
     * Imposta il valore della proprietà esito.
     * 
     * @param value
     *     allowed object is
     *     {@link Response }
     *     
     */
    public void setEsito(Response value) {
        this.esito = value;
    }

    /**
     * Gets the value of the prodGiacenza property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prodGiacenza property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProdGiacenza().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VisGiacSiRPVOutput.ProdGiacenza }
     * 
     * 
     */
    public List<VisGiacSiRPVOutput.ProdGiacenza> getProdGiacenza() {
        if (prodGiacenza == null) {
            prodGiacenza = new ArrayList<VisGiacSiRPVOutput.ProdGiacenza>();
        }
        return this.prodGiacenza;
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
     *         &lt;element name="CodiceProdotto" type="{http://cooperazione.sian.it/schema/wsmrga/}CodiceProdotto"/>
     *         &lt;element name="Designazione" type="{http://cooperazione.sian.it/schema/wsmrga/}ProdottoCatalogo"/>
     *         &lt;element name="CodCommittente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="UnMis" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice"/>
     *         &lt;element name="QtaGiacenza" type="{http://cooperazione.sian.it/schema/wsmrga/}QtaKgGiac"/>
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
        "codiceProdotto",
        "designazione",
        "codCommittente",
        "unMis",
        "qtaGiacenza"
    })
    public static class ProdGiacenza {

        @XmlElement(name = "CodiceProdotto", required = true)
        protected CodiceProdotto codiceProdotto;
        @XmlElement(name = "Designazione", required = true)
        protected ProdottoCatalogo designazione;
        @XmlElement(name = "CodCommittente")
        protected String codCommittente;
        @XmlElement(name = "UnMis", required = true)
        protected String unMis;
        @XmlElement(name = "QtaGiacenza", required = true)
        protected BigDecimal qtaGiacenza;

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

        /**
         * Recupera il valore della proprietà designazione.
         * 
         * @return
         *     possible object is
         *     {@link ProdottoCatalogo }
         *     
         */
        public ProdottoCatalogo getDesignazione() {
            return designazione;
        }

        /**
         * Imposta il valore della proprietà designazione.
         * 
         * @param value
         *     allowed object is
         *     {@link ProdottoCatalogo }
         *     
         */
        public void setDesignazione(ProdottoCatalogo value) {
            this.designazione = value;
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
         * Recupera il valore della proprietà unMis.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnMis() {
            return unMis;
        }

        /**
         * Imposta il valore della proprietà unMis.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnMis(String value) {
            this.unMis = value;
        }

        /**
         * Recupera il valore della proprietà qtaGiacenza.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getQtaGiacenza() {
            return qtaGiacenza;
        }

        /**
         * Imposta il valore della proprietà qtaGiacenza.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setQtaGiacenza(BigDecimal value) {
            this.qtaGiacenza = value;
        }

    }

}
