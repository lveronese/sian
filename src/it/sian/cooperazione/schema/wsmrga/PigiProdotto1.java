
package it.sian.cooperazione.schema.wsmrga;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per PigiProdotto1 complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PigiProdotto1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PigiDesignProd1" type="{http://cooperazione.sian.it/schema/wsmrga/}PigiDesignProd1"/>
 *         &lt;element name="Quantita" type="{http://cooperazione.sian.it/schema/wsmrga/}QtaKgScarico"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PigiProdotto1", propOrder = {
    "pigiDesignProd1",
    "quantita"
})
public class PigiProdotto1 {

    @XmlElement(name = "PigiDesignProd1", required = true)
    protected PigiDesignProd1 pigiDesignProd1;
    @XmlElement(name = "Quantita", required = true)
    protected BigDecimal quantita;

    /**
     * Recupera il valore della proprietà pigiDesignProd1.
     * 
     * @return
     *     possible object is
     *     {@link PigiDesignProd1 }
     *     
     */
    public PigiDesignProd1 getPigiDesignProd1() {
        return pigiDesignProd1;
    }

    /**
     * Imposta il valore della proprietà pigiDesignProd1.
     * 
     * @param value
     *     allowed object is
     *     {@link PigiDesignProd1 }
     *     
     */
    public void setPigiDesignProd1(PigiDesignProd1 value) {
        this.pigiDesignProd1 = value;
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
