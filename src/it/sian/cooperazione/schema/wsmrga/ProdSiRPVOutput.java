
package it.sian.cooperazione.schema.wsmrga;

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
 *         &lt;element name="Codice">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IdTrasmissione" type="{http://cooperazione.sian.it/schema/wsmrga/}IdTrasmissione"/>
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
    "codice",
    "idTrasmissione"
})
@XmlRootElement(name = "ProdSiRPVOutput")
public class ProdSiRPVOutput {

    @XmlElement(name = "Codice", required = true)
    protected String codice;
    @XmlElement(name = "IdTrasmissione", required = true)
    protected String idTrasmissione;

    /**
     * Recupera il valore della proprietà codice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodice() {
        return codice;
    }

    /**
     * Imposta il valore della proprietà codice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodice(String value) {
        this.codice = value;
    }

    /**
     * Recupera il valore della proprietà idTrasmissione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTrasmissione() {
        return idTrasmissione;
    }

    /**
     * Imposta il valore della proprietà idTrasmissione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTrasmissione(String value) {
        this.idTrasmissione = value;
    }

}
