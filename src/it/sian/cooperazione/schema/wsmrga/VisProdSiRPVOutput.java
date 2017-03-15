
package it.sian.cooperazione.schema.wsmrga;

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
 *         &lt;element name="ProdCatalogo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CodiceProdotto" type="{http://cooperazione.sian.it/schema/wsmrga/}CodiceProdotto"/>
 *                   &lt;element name="Designazione" type="{http://cooperazione.sian.it/schema/wsmrga/}ProdottoCatalogo"/>
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
    "prodCatalogo"
})
@XmlRootElement(name = "VisProdSiRPVOutput")
public class VisProdSiRPVOutput {

    @XmlElement(name = "Esito")
    protected Response esito;
    @XmlElement(name = "ProdCatalogo")
    protected List<VisProdSiRPVOutput.ProdCatalogo> prodCatalogo;

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
     * Gets the value of the prodCatalogo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prodCatalogo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProdCatalogo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VisProdSiRPVOutput.ProdCatalogo }
     * 
     * 
     */
    public List<VisProdSiRPVOutput.ProdCatalogo> getProdCatalogo() {
        if (prodCatalogo == null) {
            prodCatalogo = new ArrayList<VisProdSiRPVOutput.ProdCatalogo>();
        }
        return this.prodCatalogo;
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
        "designazione"
    })
    public static class ProdCatalogo {

        @XmlElement(name = "CodiceProdotto", required = true)
        protected CodiceProdotto codiceProdotto;
        @XmlElement(name = "Designazione", required = true)
        protected ProdottoCatalogo designazione;

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

    }

}
