
package it.sian.cooperazione.schema.wsmrga;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per DistOperazione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DistOperazione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumOperazione" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoNumOperazione"/>
 *         &lt;element name="DataOperazione" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="CodCommittente" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoDescrizione" minOccurs="0"/>
 *         &lt;element name="DistProdotto1" type="{http://cooperazione.sian.it/schema/wsmrga/}DistProdotto1" maxOccurs="unbounded"/>
 *         &lt;element name="DistProdotto2" type="{http://cooperazione.sian.it/schema/wsmrga/}DistProdotto2"/>
 *         &lt;element name="DistProdotto3" type="{http://cooperazione.sian.it/schema/wsmrga/}DistProdotto3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistOperazione", propOrder = {
    "numOperazione",
    "dataOperazione",
    "codCommittente",
    "note",
    "distProdotto1",
    "distProdotto2",
    "distProdotto3"
})
public class DistOperazione {

    @XmlElement(name = "NumOperazione")
    protected int numOperazione;
    @XmlElement(name = "DataOperazione", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataOperazione;
    @XmlElement(name = "CodCommittente")
    protected String codCommittente;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "DistProdotto1", required = true)
    protected List<DistProdotto1> distProdotto1;
    @XmlElement(name = "DistProdotto2", required = true)
    protected DistProdotto2 distProdotto2;
    @XmlElement(name = "DistProdotto3", required = true)
    protected DistProdotto3 distProdotto3;

    /**
     * Recupera il valore della proprietà numOperazione.
     * 
     */
    public int getNumOperazione() {
        return numOperazione;
    }

    /**
     * Imposta il valore della proprietà numOperazione.
     * 
     */
    public void setNumOperazione(int value) {
        this.numOperazione = value;
    }

    /**
     * Recupera il valore della proprietà dataOperazione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataOperazione() {
        return dataOperazione;
    }

    /**
     * Imposta il valore della proprietà dataOperazione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataOperazione(XMLGregorianCalendar value) {
        this.dataOperazione = value;
    }

    /**
     * Recupera il valore della proprietà codCommittente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCommittente() {
        return codCommittente;
    }

    /**
     * Imposta il valore della proprietà codCommittente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCommittente(String value) {
        this.codCommittente = value;
    }

    /**
     * Recupera il valore della proprietà note.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Imposta il valore della proprietà note.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the distProdotto1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distProdotto1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistProdotto1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistProdotto1 }
     * 
     * 
     */
    public List<DistProdotto1> getDistProdotto1() {
        if (distProdotto1 == null) {
            distProdotto1 = new ArrayList<DistProdotto1>();
        }
        return this.distProdotto1;
    }

    /**
     * Recupera il valore della proprietà distProdotto2.
     * 
     * @return
     *     possible object is
     *     {@link DistProdotto2 }
     *     
     */
    public DistProdotto2 getDistProdotto2() {
        return distProdotto2;
    }

    /**
     * Imposta il valore della proprietà distProdotto2.
     * 
     * @param value
     *     allowed object is
     *     {@link DistProdotto2 }
     *     
     */
    public void setDistProdotto2(DistProdotto2 value) {
        this.distProdotto2 = value;
    }

    /**
     * Recupera il valore della proprietà distProdotto3.
     * 
     * @return
     *     possible object is
     *     {@link DistProdotto3 }
     *     
     */
    public DistProdotto3 getDistProdotto3() {
        return distProdotto3;
    }

    /**
     * Imposta il valore della proprietà distProdotto3.
     * 
     * @param value
     *     allowed object is
     *     {@link DistProdotto3 }
     *     
     */
    public void setDistProdotto3(DistProdotto3 value) {
        this.distProdotto3 = value;
    }

}
