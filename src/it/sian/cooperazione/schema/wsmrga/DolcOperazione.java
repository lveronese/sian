
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
 * <p>Classe Java per DolcOperazione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DolcOperazione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumOperazione" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoNumOperazione"/>
 *         &lt;element name="DataOperazione" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="CodCommittente" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoDescrizione" minOccurs="0"/>
 *         &lt;element name="DolcProdotto1" type="{http://cooperazione.sian.it/schema/wsmrga/}DolcProdotto1"/>
 *         &lt;element name="DolcProdotto2" type="{http://cooperazione.sian.it/schema/wsmrga/}DolcProdotto2" maxOccurs="unbounded"/>
 *         &lt;element name="DolcProdotto3" type="{http://cooperazione.sian.it/schema/wsmrga/}DolcProdotto3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DolcOperazione", propOrder = {
    "numOperazione",
    "dataOperazione",
    "codCommittente",
    "note",
    "dolcProdotto1",
    "dolcProdotto2",
    "dolcProdotto3"
})
public class DolcOperazione {

    @XmlElement(name = "NumOperazione")
    protected int numOperazione;
    @XmlElement(name = "DataOperazione", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataOperazione;
    @XmlElement(name = "CodCommittente")
    protected String codCommittente;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "DolcProdotto1", required = true)
    protected DolcProdotto1 dolcProdotto1;
    @XmlElement(name = "DolcProdotto2", required = true)
    protected List<DolcProdotto2> dolcProdotto2;
    @XmlElement(name = "DolcProdotto3", required = true)
    protected DolcProdotto3 dolcProdotto3;

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
     * Recupera il valore della proprietà dolcProdotto1.
     * 
     * @return
     *     possible object is
     *     {@link DolcProdotto1 }
     *     
     */
    public DolcProdotto1 getDolcProdotto1() {
        return dolcProdotto1;
    }

    /**
     * Imposta il valore della proprietà dolcProdotto1.
     * 
     * @param value
     *     allowed object is
     *     {@link DolcProdotto1 }
     *     
     */
    public void setDolcProdotto1(DolcProdotto1 value) {
        this.dolcProdotto1 = value;
    }

    /**
     * Gets the value of the dolcProdotto2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dolcProdotto2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDolcProdotto2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DolcProdotto2 }
     * 
     * 
     */
    public List<DolcProdotto2> getDolcProdotto2() {
        if (dolcProdotto2 == null) {
            dolcProdotto2 = new ArrayList<DolcProdotto2>();
        }
        return this.dolcProdotto2;
    }

    /**
     * Recupera il valore della proprietà dolcProdotto3.
     * 
     * @return
     *     possible object is
     *     {@link DolcProdotto3 }
     *     
     */
    public DolcProdotto3 getDolcProdotto3() {
        return dolcProdotto3;
    }

    /**
     * Imposta il valore della proprietà dolcProdotto3.
     * 
     * @param value
     *     allowed object is
     *     {@link DolcProdotto3 }
     *     
     */
    public void setDolcProdotto3(DolcProdotto3 value) {
        this.dolcProdotto3 = value;
    }

}
