
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
 * <p>Classe Java per ScdsOperazione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ScdsOperazione">
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
 *         &lt;element name="ScdsProdotto1" type="{http://cooperazione.sian.it/schema/wsmrga/}ScdsProdotto1"/>
 *         &lt;element name="ScdsProdotto2" type="{http://cooperazione.sian.it/schema/wsmrga/}ScdsProdotto2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ScdsProdotto3" type="{http://cooperazione.sian.it/schema/wsmrga/}ScdsProdotto3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScdsOperazione", propOrder = {
    "numOperazione",
    "dataOperazione",
    "esoneroDeroga",
    "numGiustificativo",
    "dataGiustificativo",
    "codCommittente",
    "note",
    "scdsProdotto1",
    "scdsProdotto2",
    "scdsProdotto3"
})
public class ScdsOperazione {

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
    @XmlElement(name = "ScdsProdotto1", required = true)
    protected ScdsProdotto1 scdsProdotto1;
    @XmlElement(name = "ScdsProdotto2")
    protected List<ScdsProdotto2> scdsProdotto2;
    @XmlElement(name = "ScdsProdotto3", required = true)
    protected ScdsProdotto3 scdsProdotto3;

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
     * Recupera il valore della proprietà scdsProdotto1.
     * 
     * @return
     *     possible object is
     *     {@link ScdsProdotto1 }
     *     
     */
    public ScdsProdotto1 getScdsProdotto1() {
        return scdsProdotto1;
    }

    /**
     * Imposta il valore della proprietà scdsProdotto1.
     * 
     * @param value
     *     allowed object is
     *     {@link ScdsProdotto1 }
     *     
     */
    public void setScdsProdotto1(ScdsProdotto1 value) {
        this.scdsProdotto1 = value;
    }

    /**
     * Gets the value of the scdsProdotto2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scdsProdotto2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScdsProdotto2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScdsProdotto2 }
     * 
     * 
     */
    public List<ScdsProdotto2> getScdsProdotto2() {
        if (scdsProdotto2 == null) {
            scdsProdotto2 = new ArrayList<ScdsProdotto2>();
        }
        return this.scdsProdotto2;
    }

    /**
     * Recupera il valore della proprietà scdsProdotto3.
     * 
     * @return
     *     possible object is
     *     {@link ScdsProdotto3 }
     *     
     */
    public ScdsProdotto3 getScdsProdotto3() {
        return scdsProdotto3;
    }

    /**
     * Imposta il valore della proprietà scdsProdotto3.
     * 
     * @param value
     *     allowed object is
     *     {@link ScdsProdotto3 }
     *     
     */
    public void setScdsProdotto3(ScdsProdotto3 value) {
        this.scdsProdotto3 = value;
    }

}
