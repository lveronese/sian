
package it.sian.cooperazione.schema.wsmrga;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per VasoVinarioOutput complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="VasoVinarioOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodVaso" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice"/>
 *         &lt;element name="Esito" type="{http://cooperazione.sian.it/schema/wsmrga/}Response"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VasoVinarioOutput", propOrder = {
    "codVaso",
    "esito"
})
public class VasoVinarioOutput {

    @XmlElement(name = "CodVaso", required = true)
    protected String codVaso;
    @XmlElement(name = "Esito", required = true)
    protected Response esito;

    /**
     * Recupera il valore della proprietà codVaso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodVaso() {
        return codVaso;
    }

    /**
     * Imposta il valore della proprietà codVaso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodVaso(String value) {
        this.codVaso = value;
    }

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

}
