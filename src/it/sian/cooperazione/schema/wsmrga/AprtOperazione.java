
package it.sian.cooperazione.schema.wsmrga;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per AprtOperazione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AprtOperazione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumOperazione" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoNumOperazione"/>
 *         &lt;element name="DataOperazione" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="EsoneroDeroga" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice"/>
 *         &lt;element name="CodCommittente" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoDescrizione" minOccurs="0"/>
 *         &lt;element name="AprtProdotto1" type="{http://cooperazione.sian.it/schema/wsmrga/}AprtProdotto1"/>
 *         &lt;element name="AprtProdotto2" type="{http://cooperazione.sian.it/schema/wsmrga/}AprtProdotto2" minOccurs="0"/>
 *         &lt;element name="AprtProdotto3" type="{http://cooperazione.sian.it/schema/wsmrga/}AprtProdotto3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AprtOperazione", propOrder = {
    "numOperazione",
    "dataOperazione",
    "esoneroDeroga",
    "codCommittente",
    "note",
    "aprtProdotto1",
    "aprtProdotto2",
    "aprtProdotto3"
})
public class AprtOperazione {

    @XmlElement(name = "NumOperazione")
    protected int numOperazione;
    @XmlElement(name = "DataOperazione", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataOperazione;
    @XmlElement(name = "EsoneroDeroga", required = true)
    protected String esoneroDeroga;
    @XmlElement(name = "CodCommittente")
    protected String codCommittente;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "AprtProdotto1", required = true)
    protected AprtProdotto1 aprtProdotto1;
    @XmlElement(name = "AprtProdotto2")
    protected AprtProdotto2 aprtProdotto2;
    @XmlElement(name = "AprtProdotto3", required = true)
    protected AprtProdotto3 aprtProdotto3;

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
     * Recupera il valore della proprietà esoneroDeroga.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsoneroDeroga() {
        return esoneroDeroga;
    }

    /**
     * Imposta il valore della proprietà esoneroDeroga.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsoneroDeroga(String value) {
        this.esoneroDeroga = value;
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
     * Recupera il valore della proprietà aprtProdotto1.
     * 
     * @return
     *     possible object is
     *     {@link AprtProdotto1 }
     *     
     */
    public AprtProdotto1 getAprtProdotto1() {
        return aprtProdotto1;
    }

    /**
     * Imposta il valore della proprietà aprtProdotto1.
     * 
     * @param value
     *     allowed object is
     *     {@link AprtProdotto1 }
     *     
     */
    public void setAprtProdotto1(AprtProdotto1 value) {
        this.aprtProdotto1 = value;
    }

    /**
     * Recupera il valore della proprietà aprtProdotto2.
     * 
     * @return
     *     possible object is
     *     {@link AprtProdotto2 }
     *     
     */
    public AprtProdotto2 getAprtProdotto2() {
        return aprtProdotto2;
    }

    /**
     * Imposta il valore della proprietà aprtProdotto2.
     * 
     * @param value
     *     allowed object is
     *     {@link AprtProdotto2 }
     *     
     */
    public void setAprtProdotto2(AprtProdotto2 value) {
        this.aprtProdotto2 = value;
    }

    /**
     * Recupera il valore della proprietà aprtProdotto3.
     * 
     * @return
     *     possible object is
     *     {@link AprtProdotto3 }
     *     
     */
    public AprtProdotto3 getAprtProdotto3() {
        return aprtProdotto3;
    }

    /**
     * Imposta il valore della proprietà aprtProdotto3.
     * 
     * @param value
     *     allowed object is
     *     {@link AprtProdotto3 }
     *     
     */
    public void setAprtProdotto3(AprtProdotto3 value) {
        this.aprtProdotto3 = value;
    }

}
