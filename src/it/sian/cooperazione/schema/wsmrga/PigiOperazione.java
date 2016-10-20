
package it.sian.cooperazione.schema.wsmrga;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per PigiOperazione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PigiOperazione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumOperazione" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoNumOperazione"/>
 *         &lt;element name="DataOperazione" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="EsoneroDeroga" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice"/>
 *         &lt;element name="NumGiustificativo" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoDescrizione" minOccurs="0"/>
 *         &lt;element name="DataGiustificativo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CodCommittente" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoDescrizione" minOccurs="0"/>
 *         &lt;element name="PigiProdotto1" type="{http://cooperazione.sian.it/schema/wsmrga/}PigiProdotto1"/>
 *         &lt;element name="PigiProdotto2" type="{http://cooperazione.sian.it/schema/wsmrga/}PigiProdotto2"/>
 *         &lt;element name="PigiProdotto3" type="{http://cooperazione.sian.it/schema/wsmrga/}PigiProdotto3" minOccurs="0"/>
 *         &lt;element name="PigiProdotto4" type="{http://cooperazione.sian.it/schema/wsmrga/}PigiProdotto4"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PigiOperazione", propOrder = {
    "numOperazione",
    "dataOperazione",
    "esoneroDeroga",
    "numGiustificativo",
    "dataGiustificativo",
    "codCommittente",
    "note",
    "pigiProdotto1",
    "pigiProdotto2",
    "pigiProdotto3",
    "pigiProdotto4"
})
public class PigiOperazione {

    @XmlElement(name = "NumOperazione")
    protected int numOperazione;
    @XmlElement(name = "DataOperazione", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataOperazione;
    @XmlElement(name = "EsoneroDeroga", required = true)
    protected String esoneroDeroga;
    @XmlElement(name = "NumGiustificativo")
    protected String numGiustificativo;
    @XmlElement(name = "DataGiustificativo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataGiustificativo;
    @XmlElement(name = "CodCommittente")
    protected String codCommittente;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "PigiProdotto1", required = true)
    protected PigiProdotto1 pigiProdotto1;
    @XmlElement(name = "PigiProdotto2", required = true)
    protected PigiProdotto2 pigiProdotto2;
    @XmlElement(name = "PigiProdotto3")
    protected PigiProdotto3 pigiProdotto3;
    @XmlElement(name = "PigiProdotto4", required = true)
    protected PigiProdotto4 pigiProdotto4;

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
     * Recupera il valore della proprietà numGiustificativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumGiustificativo() {
        return numGiustificativo;
    }

    /**
     * Imposta il valore della proprietà numGiustificativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumGiustificativo(String value) {
        this.numGiustificativo = value;
    }

    /**
     * Recupera il valore della proprietà dataGiustificativo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataGiustificativo() {
        return dataGiustificativo;
    }

    /**
     * Imposta il valore della proprietà dataGiustificativo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataGiustificativo(XMLGregorianCalendar value) {
        this.dataGiustificativo = value;
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
     * Recupera il valore della proprietà pigiProdotto1.
     * 
     * @return
     *     possible object is
     *     {@link PigiProdotto1 }
     *     
     */
    public PigiProdotto1 getPigiProdotto1() {
        return pigiProdotto1;
    }

    /**
     * Imposta il valore della proprietà pigiProdotto1.
     * 
     * @param value
     *     allowed object is
     *     {@link PigiProdotto1 }
     *     
     */
    public void setPigiProdotto1(PigiProdotto1 value) {
        this.pigiProdotto1 = value;
    }

    /**
     * Recupera il valore della proprietà pigiProdotto2.
     * 
     * @return
     *     possible object is
     *     {@link PigiProdotto2 }
     *     
     */
    public PigiProdotto2 getPigiProdotto2() {
        return pigiProdotto2;
    }

    /**
     * Imposta il valore della proprietà pigiProdotto2.
     * 
     * @param value
     *     allowed object is
     *     {@link PigiProdotto2 }
     *     
     */
    public void setPigiProdotto2(PigiProdotto2 value) {
        this.pigiProdotto2 = value;
    }

    /**
     * Recupera il valore della proprietà pigiProdotto3.
     * 
     * @return
     *     possible object is
     *     {@link PigiProdotto3 }
     *     
     */
    public PigiProdotto3 getPigiProdotto3() {
        return pigiProdotto3;
    }

    /**
     * Imposta il valore della proprietà pigiProdotto3.
     * 
     * @param value
     *     allowed object is
     *     {@link PigiProdotto3 }
     *     
     */
    public void setPigiProdotto3(PigiProdotto3 value) {
        this.pigiProdotto3 = value;
    }

    /**
     * Recupera il valore della proprietà pigiProdotto4.
     * 
     * @return
     *     possible object is
     *     {@link PigiProdotto4 }
     *     
     */
    public PigiProdotto4 getPigiProdotto4() {
        return pigiProdotto4;
    }

    /**
     * Imposta il valore della proprietà pigiProdotto4.
     * 
     * @param value
     *     allowed object is
     *     {@link PigiProdotto4 }
     *     
     */
    public void setPigiProdotto4(PigiProdotto4 value) {
        this.pigiProdotto4 = value;
    }

}
