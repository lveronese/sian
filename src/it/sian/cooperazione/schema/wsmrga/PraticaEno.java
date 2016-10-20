
package it.sian.cooperazione.schema.wsmrga;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per PraticaEno complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PraticaEno">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodPraticaEno" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "PraticaEno", propOrder = {
    "codPraticaEno",
    "percentuale"
})
public class PraticaEno {

    @XmlElement(name = "CodPraticaEno", required = true)
    protected String codPraticaEno;
    @XmlElement(name = "Percentuale")
    protected BigDecimal percentuale;

    /**
     * Recupera il valore della proprietà codPraticaEno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodPraticaEno() {
        return codPraticaEno;
    }

    /**
     * Imposta il valore della proprietà codPraticaEno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodPraticaEno(String value) {
        this.codPraticaEno = value;
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
