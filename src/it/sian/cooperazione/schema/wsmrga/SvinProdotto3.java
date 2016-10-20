
package it.sian.cooperazione.schema.wsmrga;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per SvinProdotto3 complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SvinProdotto3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SvinDesignProd3" type="{http://cooperazione.sian.it/schema/wsmrga/}SvinDesignProd3"/>
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
@XmlType(name = "SvinProdotto3", propOrder = {
    "svinDesignProd3",
    "quantita"
})
public class SvinProdotto3 {

    @XmlElement(name = "SvinDesignProd3", required = true)
    protected SvinDesignProd3 svinDesignProd3;
    @XmlElement(name = "Quantita", required = true)
    protected BigDecimal quantita;

    /**
     * Recupera il valore della proprietà svinDesignProd3.
     * 
     * @return
     *     possible object is
     *     {@link SvinDesignProd3 }
     *     
     */
    public SvinDesignProd3 getSvinDesignProd3() {
        return svinDesignProd3;
    }

    /**
     * Imposta il valore della proprietà svinDesignProd3.
     * 
     * @param value
     *     allowed object is
     *     {@link SvinDesignProd3 }
     *     
     */
    public void setSvinDesignProd3(SvinDesignProd3 value) {
        this.svinDesignProd3 = value;
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
