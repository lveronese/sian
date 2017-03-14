
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
 * <p>Classe Java per AcetOperazione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AcetOperazione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumOperazione" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoNumOperazione"/>
 *         &lt;element name="DataOperazione" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="CodCommittente" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoDescrizione" minOccurs="0"/>
 *         &lt;element name="AcetProdotto1" type="{http://cooperazione.sian.it/schema/wsmrga/}AcetProdotto1" maxOccurs="unbounded"/>
 *         &lt;element name="AcetProdotto2" type="{http://cooperazione.sian.it/schema/wsmrga/}AcetProdotto2" minOccurs="0"/>
 *         &lt;element name="AcetProdotto3" type="{http://cooperazione.sian.it/schema/wsmrga/}AcetProdotto3" minOccurs="0"/>
 *         &lt;element name="AcetProdotto4" type="{http://cooperazione.sian.it/schema/wsmrga/}AcetProdotto4"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcetOperazione", propOrder = {
    "numOperazione",
    "dataOperazione",
    "codCommittente",
    "note",
    "acetProdotto1",
    "acetProdotto2",
    "acetProdotto3",
    "acetProdotto4"
})
public class AcetOperazione {

    @XmlElement(name = "NumOperazione")
    protected int numOperazione;
    @XmlElement(name = "DataOperazione", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataOperazione;
    @XmlElement(name = "CodCommittente")
    protected String codCommittente;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "AcetProdotto1", required = true)
    protected List<AcetProdotto1> acetProdotto1;
    @XmlElement(name = "AcetProdotto2")
    protected AcetProdotto2 acetProdotto2;
    @XmlElement(name = "AcetProdotto3")
    protected AcetProdotto3 acetProdotto3;
    @XmlElement(name = "AcetProdotto4", required = true)
    protected AcetProdotto4 acetProdotto4;

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
     * Gets the value of the acetProdotto1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acetProdotto1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcetProdotto1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcetProdotto1 }
     * 
     * 
     */
    public List<AcetProdotto1> getAcetProdotto1() {
        if (acetProdotto1 == null) {
            acetProdotto1 = new ArrayList<AcetProdotto1>();
        }
        return this.acetProdotto1;
    }

    /**
     * Recupera il valore della proprietà acetProdotto2.
     * 
     * @return
     *     possible object is
     *     {@link AcetProdotto2 }
     *     
     */
    public AcetProdotto2 getAcetProdotto2() {
        return acetProdotto2;
    }

    /**
     * Imposta il valore della proprietà acetProdotto2.
     * 
     * @param value
     *     allowed object is
     *     {@link AcetProdotto2 }
     *     
     */
    public void setAcetProdotto2(AcetProdotto2 value) {
        this.acetProdotto2 = value;
    }

    /**
     * Recupera il valore della proprietà acetProdotto3.
     * 
     * @return
     *     possible object is
     *     {@link AcetProdotto3 }
     *     
     */
    public AcetProdotto3 getAcetProdotto3() {
        return acetProdotto3;
    }

    /**
     * Imposta il valore della proprietà acetProdotto3.
     * 
     * @param value
     *     allowed object is
     *     {@link AcetProdotto3 }
     *     
     */
    public void setAcetProdotto3(AcetProdotto3 value) {
        this.acetProdotto3 = value;
    }

    /**
     * Recupera il valore della proprietà acetProdotto4.
     * 
     * @return
     *     possible object is
     *     {@link AcetProdotto4 }
     *     
     */
    public AcetProdotto4 getAcetProdotto4() {
        return acetProdotto4;
    }

    /**
     * Imposta il valore della proprietà acetProdotto4.
     * 
     * @param value
     *     allowed object is
     *     {@link AcetProdotto4 }
     *     
     */
    public void setAcetProdotto4(AcetProdotto4 value) {
        this.acetProdotto4 = value;
    }

}
