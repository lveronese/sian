
package it.sian.cooperazione.schema.wsmrga;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per ElmcOperazione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ElmcOperazione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumOperazione" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoNumOperazione"/>
 *         &lt;element name="DataOperazione" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="EsoneroDeroga" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice" minOccurs="0"/>
 *         &lt;element name="NumGiustificativo" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice" minOccurs="0"/>
 *         &lt;element name="DataGiustificativo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CodCommittente" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoDescrizione" minOccurs="0"/>
 *         &lt;element name="ElmcProdotto1" type="{http://cooperazione.sian.it/schema/wsmrga/}ElmcProdotto1"/>
 *         &lt;element name="ElmcProdotto2" type="{http://cooperazione.sian.it/schema/wsmrga/}ElmcProdotto2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElmcOperazione", propOrder = {
    "numOperazione",
    "dataOperazione",
    "esoneroDeroga",
    "numGiustificativo",
    "dataGiustificativo",
    "codCommittente",
    "note",
    "elmcProdotto1",
    "elmcProdotto2"
})
public class ElmcOperazione {

    @XmlElement(name = "NumOperazione")
    protected int numOperazione;
    @XmlElement(name = "DataOperazione", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataOperazione;
    @XmlElement(name = "EsoneroDeroga")
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
    @XmlElement(name = "ElmcProdotto1", required = true)
    protected ElmcProdotto1 elmcProdotto1;
    @XmlElement(name = "ElmcProdotto2", required = true)
    protected ElmcProdotto2 elmcProdotto2;

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
     * Recupera il valore della proprietà elmcProdotto1.
     * 
     * @return
     *     possible object is
     *     {@link ElmcProdotto1 }
     *     
     */
    public ElmcProdotto1 getElmcProdotto1() {
        return elmcProdotto1;
    }

    /**
     * Imposta il valore della proprietà elmcProdotto1.
     * 
     * @param value
     *     allowed object is
     *     {@link ElmcProdotto1 }
     *     
     */
    public void setElmcProdotto1(ElmcProdotto1 value) {
        this.elmcProdotto1 = value;
    }

    /**
     * Recupera il valore della proprietà elmcProdotto2.
     * 
     * @return
     *     possible object is
     *     {@link ElmcProdotto2 }
     *     
     */
    public ElmcProdotto2 getElmcProdotto2() {
        return elmcProdotto2;
    }

    /**
     * Imposta il valore della proprietà elmcProdotto2.
     * 
     * @param value
     *     allowed object is
     *     {@link ElmcProdotto2 }
     *     
     */
    public void setElmcProdotto2(ElmcProdotto2 value) {
        this.elmcProdotto2 = value;
    }

}
