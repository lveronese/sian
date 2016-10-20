
package it.sian.cooperazione.schema.wsmrga;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per PigiProdotto2 complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PigiProdotto2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PigiDesignProd2" type="{http://cooperazione.sian.it/schema/wsmrga/}PigiDesignProd2"/>
 *         &lt;element name="Quantita" type="{http://cooperazione.sian.it/schema/wsmrga/}QtaKgCarico"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PigiProdotto2", propOrder = {
    "pigiDesignProd2",
    "quantita"
})
public class PigiProdotto2 {

    @XmlElement(name = "PigiDesignProd2", required = true)
    protected PigiDesignProd2 pigiDesignProd2;
    @XmlElement(name = "Quantita", required = true)
    protected BigDecimal quantita;

    /**
     * Recupera il valore della proprietà pigiDesignProd2.
     * 
     * @return
     *     possible object is
     *     {@link PigiDesignProd2 }
     *     
     */
    public PigiDesignProd2 getPigiDesignProd2() {
        return pigiDesignProd2;
    }

    /**
     * Imposta il valore della proprietà pigiDesignProd2.
     * 
     * @param value
     *     allowed object is
     *     {@link PigiDesignProd2 }
     *     
     */
    public void setPigiDesignProd2(PigiDesignProd2 value) {
        this.pigiDesignProd2 = value;
    }

    /**
     * Recupera il valore della proprietà quantita.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantita() {
        return quantita;
    }

    /**
     * Imposta il valore della proprietà quantita.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantita(BigDecimal value) {
        this.quantita = value;
    }

}
