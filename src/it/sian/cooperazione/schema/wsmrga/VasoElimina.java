
package it.sian.cooperazione.schema.wsmrga;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per VasoElimina complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="VasoElimina">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodVaso" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VasoElimina", propOrder = {
    "codVaso"
})
public class VasoElimina {

    @XmlElement(name = "CodVaso", required = true)
    protected String codVaso;

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

}
