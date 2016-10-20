
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
 *         &lt;element name="CodOper" type="{http://cooperazione.sian.it/schema/wsmrga/}CUAA"/>
 *         &lt;element name="CodiceIcqrf" type="{http://cooperazione.sian.it/schema/wsmrga/}CodiceIcq"/>
 *         &lt;element name="TipoRichiesta" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoRichiesta"/>
 *         &lt;element name="Operazione" type="{http://cooperazione.sian.it/schema/wsmrga/}OperazioneSpec" maxOccurs="unbounded"/>
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
    "tipoRichiesta",
    "operazione"
})
@XmlRootElement(name = "OperSiRPVInput")
public class OperSiRPVInput {

    @XmlElement(name = "CodOper", required = true)
    protected CUAA codOper;
    @XmlElement(name = "CodiceIcqrf", required = true)
    protected String codiceIcqrf;
    @XmlElement(name = "TipoRichiesta", required = true)
    protected TipoRichiesta tipoRichiesta;
    @XmlElement(name = "Operazione", required = true)
    protected List<OperazioneSpec> operazione;

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
     * Recupera il valore della proprietà tipoRichiesta.
     * 
     * @return
     *     possible object is
     *     {@link TipoRichiesta }
     *     
     */
    public TipoRichiesta getTipoRichiesta() {
        return tipoRichiesta;
    }

    /**
     * Imposta il valore della proprietà tipoRichiesta.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoRichiesta }
     *     
     */
    public void setTipoRichiesta(TipoRichiesta value) {
        this.tipoRichiesta = value;
    }

    /**
     * Gets the value of the operazione property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operazione property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperazione().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperazioneSpec }
     * 
     * 
     */
    public List<OperazioneSpec> getOperazione() {
        if (operazione == null) {
            operazione = new ArrayList<OperazioneSpec>();
        }
        return this.operazione;
    }

}
