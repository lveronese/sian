
package it.sian.cooperazione.schema.wsmrga;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per SvinOperazione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SvinOperazione">
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
 *         &lt;element name="SvinProdotto1" type="{http://cooperazione.sian.it/schema/wsmrga/}SvinProdotto1"/>
 *         &lt;element name="SvinProdotto2" type="{http://cooperazione.sian.it/schema/wsmrga/}SvinProdotto2"/>
 *         &lt;element name="SvinProdotto3" type="{http://cooperazione.sian.it/schema/wsmrga/}SvinProdotto3" minOccurs="0"/>
 *         &lt;element name="SvinProdotto4" type="{http://cooperazione.sian.it/schema/wsmrga/}SvinProdotto4"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SvinOperazione", propOrder = {
    "numOperazione",
    "dataOperazione",
    "esoneroDeroga",
    "numGiustificativo",
    "dataGiustificativo",
    "codCommittente",
    "note",
    "svinProdotto1",
    "svinProdotto2",
    "svinProdotto3",
    "svinProdotto4"
})
public class SvinOperazione {

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
    @XmlElement(name = "SvinProdotto1", required = true)
    protected SvinProdotto1 svinProdotto1;
    @XmlElement(name = "SvinProdotto2", required = true)
    protected SvinProdotto2 svinProdotto2;
    @XmlElement(name = "SvinProdotto3")
    protected SvinProdotto3 svinProdotto3;
    @XmlElement(name = "SvinProdotto4", required = true)
    protected SvinProdotto4 svinProdotto4;

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
     * Recupera il valore della proprietà svinProdotto1.
     * 
     * @return
     *     possible object is
     *     {@link SvinProdotto1 }
     *     
     */
    public SvinProdotto1 getSvinProdotto1() {
        return svinProdotto1;
    }

    /**
     * Imposta il valore della proprietà svinProdotto1.
     * 
     * @param value
     *     allowed object is
     *     {@link SvinProdotto1 }
     *     
     */
    public void setSvinProdotto1(SvinProdotto1 value) {
        this.svinProdotto1 = value;
    }

    /**
     * Recupera il valore della proprietà svinProdotto2.
     * 
     * @return
     *     possible object is
     *     {@link SvinProdotto2 }
     *     
     */
    public SvinProdotto2 getSvinProdotto2() {
        return svinProdotto2;
    }

    /**
     * Imposta il valore della proprietà svinProdotto2.
     * 
     * @param value
     *     allowed object is
     *     {@link SvinProdotto2 }
     *     
     */
    public void setSvinProdotto2(SvinProdotto2 value) {
        this.svinProdotto2 = value;
    }

    /**
     * Recupera il valore della proprietà svinProdotto3.
     * 
     * @return
     *     possible object is
     *     {@link SvinProdotto3 }
     *     
     */
    public SvinProdotto3 getSvinProdotto3() {
        return svinProdotto3;
    }

    /**
     * Imposta il valore della proprietà svinProdotto3.
     * 
     * @param value
     *     allowed object is
     *     {@link SvinProdotto3 }
     *     
     */
    public void setSvinProdotto3(SvinProdotto3 value) {
        this.svinProdotto3 = value;
    }

    /**
     * Recupera il valore della proprietà svinProdotto4.
     * 
     * @return
     *     possible object is
     *     {@link SvinProdotto4 }
     *     
     */
    public SvinProdotto4 getSvinProdotto4() {
        return svinProdotto4;
    }

    /**
     * Imposta il valore della proprietà svinProdotto4.
     * 
     * @param value
     *     allowed object is
     *     {@link SvinProdotto4 }
     *     
     */
    public void setSvinProdotto4(SvinProdotto4 value) {
        this.svinProdotto4 = value;
    }

}
