
package it.sian.cooperazione.schema.wsmrga;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per SfecOperazione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SfecOperazione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumOperazione" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoNumOperazione"/>
 *         &lt;element name="DataOperazione" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="CodCommittente" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoDescrizione" minOccurs="0"/>
 *         &lt;element name="SfecProdotto1" type="{http://cooperazione.sian.it/schema/wsmrga/}SfecProdotto1"/>
 *         &lt;element name="SfecProdotto2" type="{http://cooperazione.sian.it/schema/wsmrga/}SfecProdotto2"/>
 *         &lt;element name="SfecProdotto3" type="{http://cooperazione.sian.it/schema/wsmrga/}SfecProdotto3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SfecOperazione", propOrder = {
    "numOperazione",
    "dataOperazione",
    "codCommittente",
    "note",
    "sfecProdotto1",
    "sfecProdotto2",
    "sfecProdotto3"
})
public class SfecOperazione {

    @XmlElement(name = "NumOperazione")
    protected int numOperazione;
    @XmlElement(name = "DataOperazione", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataOperazione;
    @XmlElement(name = "CodCommittente")
    protected String codCommittente;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "SfecProdotto1", required = true)
    protected SfecProdotto1 sfecProdotto1;
    @XmlElement(name = "SfecProdotto2", required = true)
    protected SfecProdotto2 sfecProdotto2;
    @XmlElement(name = "SfecProdotto3", required = true)
    protected SfecProdotto3 sfecProdotto3;

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
     * Recupera il valore della proprietà sfecProdotto1.
     * 
     * @return
     *     possible object is
     *     {@link SfecProdotto1 }
     *     
     */
    public SfecProdotto1 getSfecProdotto1() {
        return sfecProdotto1;
    }

    /**
     * Imposta il valore della proprietà sfecProdotto1.
     * 
     * @param value
     *     allowed object is
     *     {@link SfecProdotto1 }
     *     
     */
    public void setSfecProdotto1(SfecProdotto1 value) {
        this.sfecProdotto1 = value;
    }

    /**
     * Recupera il valore della proprietà sfecProdotto2.
     * 
     * @return
     *     possible object is
     *     {@link SfecProdotto2 }
     *     
     */
    public SfecProdotto2 getSfecProdotto2() {
        return sfecProdotto2;
    }

    /**
     * Imposta il valore della proprietà sfecProdotto2.
     * 
     * @param value
     *     allowed object is
     *     {@link SfecProdotto2 }
     *     
     */
    public void setSfecProdotto2(SfecProdotto2 value) {
        this.sfecProdotto2 = value;
    }

    /**
     * Recupera il valore della proprietà sfecProdotto3.
     * 
     * @return
     *     possible object is
     *     {@link SfecProdotto3 }
     *     
     */
    public SfecProdotto3 getSfecProdotto3() {
        return sfecProdotto3;
    }

    /**
     * Imposta il valore della proprietà sfecProdotto3.
     * 
     * @param value
     *     allowed object is
     *     {@link SfecProdotto3 }
     *     
     */
    public void setSfecProdotto3(SfecProdotto3 value) {
        this.sfecProdotto3 = value;
    }

}
