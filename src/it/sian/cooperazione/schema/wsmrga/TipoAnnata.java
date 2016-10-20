
package it.sian.cooperazione.schema.wsmrga;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TipoAnnata complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TipoAnnata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Codice" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoAnno"/>
 *         &lt;element name="Percentuale" type="{http://cooperazione.sian.it/schema/wsmrga/}Percentuale" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoAnnata", propOrder = {
    "codice",
    "percentuale"
})
public class TipoAnnata {

    @XmlElement(name = "Codice")
    protected int codice;
    @XmlElement(name = "Percentuale")
    protected BigDecimal percentuale;

    /**
     * Recupera il valore della proprietà codice.
     * 
     */
    public int getCodice() {
        return codice;
    }

    /**
     * Imposta il valore della proprietà codice.
     * 
     */
    public void setCodice(int value) {
        this.codice = value;
    }

    /**
     * Recupera il valore della proprietà percentuale.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentuale() {
        return percentuale;
    }

    /**
     * Imposta il valore della proprietà percentuale.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentuale(BigDecimal value) {
        this.percentuale = value;
    }

}
