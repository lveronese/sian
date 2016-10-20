
package it.sian.cooperazione.schema.wsmrga;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ProdottoImboI complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ProdottoImboI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProdImboI1" type="{http://cooperazione.sian.it/schema/wsmrga/}ProdottoImboB"/>
 *         &lt;element name="Quantita" type="{http://cooperazione.sian.it/schema/wsmrga/}QtaKgCarico"/>
 *         &lt;element name="Partita" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoPartitaImbo" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProdottoImboI", propOrder = {
    "prodImboI1",
    "quantita",
    "partita"
})
public class ProdottoImboI {

    @XmlElement(name = "ProdImboI1", required = true)
    protected ProdottoImboB prodImboI1;
    @XmlElement(name = "Quantita", required = true)
    protected BigDecimal quantita;
    @XmlElement(name = "Partita", required = true)
    protected List<TipoPartitaImbo> partita;

    /**
     * Recupera il valore della proprietà prodImboI1.
     * 
     * @return
     *     possible object is
     *     {@link ProdottoImboB }
     *     
     */
    public ProdottoImboB getProdImboI1() {
        return prodImboI1;
    }

    /**
     * Imposta il valore della proprietà prodImboI1.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdottoImboB }
     *     
     */
    public void setProdImboI1(ProdottoImboB value) {
        this.prodImboI1 = value;
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

    /**
     * Gets the value of the partita property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partita property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartita().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoPartitaImbo }
     * 
     * 
     */
    public List<TipoPartitaImbo> getPartita() {
        if (partita == null) {
            partita = new ArrayList<TipoPartitaImbo>();
        }
        return this.partita;
    }

}
