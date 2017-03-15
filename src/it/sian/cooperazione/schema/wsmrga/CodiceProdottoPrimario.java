
package it.sian.cooperazione.schema.wsmrga;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CodiceProdottoPrimario complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CodiceProdottoPrimario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodPrimario">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CodSecondario" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "CodiceProdottoPrimario", propOrder = {
    "codPrimario",
    "codSecondario"
})
public class CodiceProdottoPrimario {

    @XmlElement(name = "CodPrimario", required = true)
    protected String codPrimario;
    @XmlElement(name = "CodSecondario")
    protected String codSecondario;

    /**
     * Recupera il valore della proprietà codPrimario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodPrimario() {
        return codPrimario;
    }

    /**
     * Imposta il valore della proprietà codPrimario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodPrimario(String value) {
        this.codPrimario = value;
    }

    /**
     * Recupera il valore della proprietà codSecondario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodSecondario() {
        return codSecondario;
    }

    /**
     * Imposta il valore della proprietà codSecondario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodSecondario(String value) {
        this.codSecondario = value;
    }

}
