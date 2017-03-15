
package it.sian.cooperazione.schema.wsmrga;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodOper" type="{http://cooperazione.sian.it/schema/wsmrga/}CUAA" minOccurs="0"/>
 *         &lt;element name="CodiceIcqrf" type="{http://cooperazione.sian.it/schema/wsmrga/}CodiceIcq" minOccurs="0"/>
 *         &lt;element name="Esito" type="{http://cooperazione.sian.it/schema/wsmrga/}Response" minOccurs="0"/>
 *         &lt;element name="ProdottoEsito" type="{http://cooperazione.sian.it/schema/wsmrga/}ProdottoEsito" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "codOper",
    "codiceIcqrf",
    "esito",
    "prodottoEsito"
})
@XmlRootElement(name = "GetProdSiRPVOutput")
public class GetProdSiRPVOutput {

    @XmlElement(name = "CodOper")
    protected CUAA codOper;
    @XmlElement(name = "CodiceIcqrf")
    protected String codiceIcqrf;
    @XmlElement(name = "Esito")
    protected Response esito;
    @XmlElement(name = "ProdottoEsito")
    protected List<ProdottoEsito> prodottoEsito;

    /**
     * Recupera il valore della proprietà codOper.
     * 
     * @return
     *     possible object is
     *     {@link CUAA }
     *     
     */
    public CUAA getCodOper() {
        return codOper;
    }

    /**
     * Imposta il valore della proprietà codOper.
     * 
     * @param value
     *     allowed object is
     *     {@link CUAA }
     *     
     */
    public void setCodOper(CUAA value) {
        this.codOper = value;
    }

    /**
     * Recupera il valore della proprietà codiceIcqrf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceIcqrf() {
        return codiceIcqrf;
    }

    /**
     * Imposta il valore della proprietà codiceIcqrf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceIcqrf(String value) {
        this.codiceIcqrf = value;
    }

    /**
     * Recupera il valore della proprietà esito.
     * 
     * @return
     *     possible object is
     *     {@link Response }
     *     
     */
    public Response getEsito() {
        return esito;
    }

    /**
     * Imposta il valore della proprietà esito.
     * 
     * @param value
     *     allowed object is
     *     {@link Response }
     *     
     */
    public void setEsito(Response value) {
        this.esito = value;
    }

    /**
     * Gets the value of the prodottoEsito property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prodottoEsito property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProdottoEsito().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProdottoEsito }
     * 
     * 
     */
    public List<ProdottoEsito> getProdottoEsito() {
        if (prodottoEsito == null) {
            prodottoEsito = new ArrayList<ProdottoEsito>();
        }
        return this.prodottoEsito;
    }

}
