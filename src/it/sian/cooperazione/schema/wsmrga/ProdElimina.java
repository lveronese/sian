
package it.sian.cooperazione.schema.wsmrga;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ProdElimina complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ProdElimina">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodiceProdotto" type="{http://cooperazione.sian.it/schema/wsmrga/}CodiceProdotto"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProdElimina", propOrder = {
    "codiceProdotto"
})
public class ProdElimina {

    @XmlElement(name = "CodiceProdotto", required = true)
    protected CodiceProdotto codiceProdotto;

    /**
     * Recupera il valore della proprietà codiceProdotto.
     * 
     * @return
     *     possible object is
     *     {@link CodiceProdotto }
     *     
     */
    public CodiceProdotto getCodiceProdotto() {
        return codiceProdotto;
    }

    /**
     * Imposta il valore della proprietà codiceProdotto.
     * 
     * @param value
     *     allowed object is
     *     {@link CodiceProdotto }
     *     
     */
    public void setCodiceProdotto(CodiceProdotto value) {
        this.codiceProdotto = value;
    }

}
