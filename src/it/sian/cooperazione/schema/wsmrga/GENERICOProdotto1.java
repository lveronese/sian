
package it.sian.cooperazione.schema.wsmrga;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per GENERICOProdotto1 complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GENERICOProdotto1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Prodotto" type="{http://cooperazione.sian.it/schema/wsmrga/}GENERICODesignProd1"/>
 *         &lt;element name="CodRecipiente" type="{http://cooperazione.sian.it/schema/wsmrga/}CodRecipiente" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Quantita" type="{http://cooperazione.sian.it/schema/wsmrga/}QtaKgCarico"/>
 *         &lt;element name="Partita" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoPartita" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GENERICOProdotto1", propOrder = {
    "prodotto",
    "codRecipiente",
    "quantita",
    "partita"
})
public class GENERICOProdotto1 {

    @XmlElement(name = "Prodotto", required = true)
    protected GENERICODesignProd1 prodotto;
    @XmlElement(name = "CodRecipiente")
    protected List<CodRecipiente> codRecipiente;
    @XmlElement(name = "Quantita", required = true)
    protected BigDecimal quantita;
    @XmlElement(name = "Partita")
    protected List<TipoPartita> partita;

    /**
     * Recupera il valore della proprietà prodotto.
     * 
     * @return
     *     possible object is
     *     {@link GENERICODesignProd1 }
     *     
     */
    public GENERICODesignProd1 getProdotto() {
        return prodotto;
    }

    /**
     * Imposta il valore della proprietà prodotto.
     * 
     * @param value
     *     allowed object is
     *     {@link GENERICODesignProd1 }
     *     
     */
    public void setProdotto(GENERICODesignProd1 value) {
        this.prodotto = value;
    }

    /**
     * Gets the value of the codRecipiente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codRecipiente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodRecipiente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodRecipiente }
     * 
     * 
     */
    public List<CodRecipiente> getCodRecipiente() {
        if (codRecipiente == null) {
            codRecipiente = new ArrayList<CodRecipiente>();
        }
        return this.codRecipiente;
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
     * {@link TipoPartita }
     * 
     * 
     */
    public List<TipoPartita> getPartita() {
        if (partita == null) {
            partita = new ArrayList<TipoPartita>();
        }
        return this.partita;
    }

}
