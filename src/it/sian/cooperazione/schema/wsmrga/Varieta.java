
package it.sian.cooperazione.schema.wsmrga;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Varieta complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Varieta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodVarieta" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice"/>
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
@XmlType(name = "Varieta", propOrder = {
    "codVarieta",
    "percentuale"
})
public class Varieta {

    @XmlElement(name = "CodVarieta", required = true)
    protected String codVarieta;
    @XmlElement(name = "Percentuale")
    protected BigDecimal percentuale;

    /**
     * Recupera il valore della proprietà codVarieta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodVarieta() {
        return codVarieta;
    }

    /**
     * Imposta il valore della proprietà codVarieta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodVarieta(String value) {
        this.codVarieta = value;
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
