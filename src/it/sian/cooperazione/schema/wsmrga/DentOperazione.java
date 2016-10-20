
package it.sian.cooperazione.schema.wsmrga;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per DentOperazione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DentOperazione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumOperazione" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoNumOperazione"/>
 *         &lt;element name="DataOperazione" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="CodCommittente" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoDescrizione" minOccurs="0"/>
 *         &lt;element name="DentProdotto1" type="{http://cooperazione.sian.it/schema/wsmrga/}DentProdotto1"/>
 *         &lt;element name="DentProdotto2" type="{http://cooperazione.sian.it/schema/wsmrga/}DentProdotto2"/>
 *         &lt;element name="DentProdotto3" type="{http://cooperazione.sian.it/schema/wsmrga/}DentProdotto3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DentOperazione", propOrder = {
    "numOperazione",
    "dataOperazione",
    "codCommittente",
    "note",
    "dentProdotto1",
    "dentProdotto2",
    "dentProdotto3"
})
public class DentOperazione {

    @XmlElement(name = "NumOperazione")
    protected int numOperazione;
    @XmlElement(name = "DataOperazione", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataOperazione;
    @XmlElement(name = "CodCommittente")
    protected String codCommittente;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "DentProdotto1", required = true)
    protected DentProdotto1 dentProdotto1;
    @XmlElement(name = "DentProdotto2", required = true)
    protected DentProdotto2 dentProdotto2;
    @XmlElement(name = "DentProdotto3", required = true)
    protected DentProdotto3 dentProdotto3;

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
     * Recupera il valore della proprietà dentProdotto1.
     * 
     * @return
     *     possible object is
     *     {@link DentProdotto1 }
     *     
     */
    public DentProdotto1 getDentProdotto1() {
        return dentProdotto1;
    }

    /**
     * Imposta il valore della proprietà dentProdotto1.
     * 
     * @param value
     *     allowed object is
     *     {@link DentProdotto1 }
     *     
     */
    public void setDentProdotto1(DentProdotto1 value) {
        this.dentProdotto1 = value;
    }

    /**
     * Recupera il valore della proprietà dentProdotto2.
     * 
     * @return
     *     possible object is
     *     {@link DentProdotto2 }
     *     
     */
    public DentProdotto2 getDentProdotto2() {
        return dentProdotto2;
    }

    /**
     * Imposta il valore della proprietà dentProdotto2.
     * 
     * @param value
     *     allowed object is
     *     {@link DentProdotto2 }
     *     
     */
    public void setDentProdotto2(DentProdotto2 value) {
        this.dentProdotto2 = value;
    }

    /**
     * Recupera il valore della proprietà dentProdotto3.
     * 
     * @return
     *     possible object is
     *     {@link DentProdotto3 }
     *     
     */
    public DentProdotto3 getDentProdotto3() {
        return dentProdotto3;
    }

    /**
     * Imposta il valore della proprietà dentProdotto3.
     * 
     * @param value
     *     allowed object is
     *     {@link DentProdotto3 }
     *     
     */
    public void setDentProdotto3(DentProdotto3 value) {
        this.dentProdotto3 = value;
    }

}
