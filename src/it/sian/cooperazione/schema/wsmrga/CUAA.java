
package it.sian.cooperazione.schema.wsmrga;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CUAA complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CUAA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="PersonaGiuridica" type="{http://cooperazione.sian.it/schema/wsmrga/}CUAAPersonaGiuridica"/>
 *         &lt;element name="PersonaFisica" type="{http://cooperazione.sian.it/schema/wsmrga/}CUAAPersonaFisica"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CUAA", propOrder = {
    "personaGiuridica",
    "personaFisica"
})
public class CUAA {

    @XmlElement(name = "PersonaGiuridica")
    protected String personaGiuridica;
    @XmlElement(name = "PersonaFisica")
    protected String personaFisica;

    /**
     * Recupera il valore della proprietà personaGiuridica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonaGiuridica() {
        return personaGiuridica;
    }

    /**
     * Imposta il valore della proprietà personaGiuridica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonaGiuridica(String value) {
        this.personaGiuridica = value;
    }

    /**
     * Recupera il valore della proprietà personaFisica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonaFisica() {
        return personaFisica;
    }

    /**
     * Imposta il valore della proprietà personaFisica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonaFisica(String value) {
        this.personaFisica = value;
    }

}
