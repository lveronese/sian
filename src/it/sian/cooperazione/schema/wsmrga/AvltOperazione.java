
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
 * <p>Classe Java per AvltOperazione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AvltOperazione">
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
 *         &lt;element name="AvltProdotto1" type="{http://cooperazione.sian.it/schema/wsmrga/}AvltProdotto1" maxOccurs="unbounded"/>
 *         &lt;element name="AvltProdotto2" type="{http://cooperazione.sian.it/schema/wsmrga/}AvltProdotto2" minOccurs="0"/>
 *         &lt;element name="AvltProdotto3" type="{http://cooperazione.sian.it/schema/wsmrga/}AvltProdotto3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvltOperazione", propOrder = {
    "numOperazione",
    "dataOperazione",
    "esoneroDeroga",
    "numGiustificativo",
    "dataGiustificativo",
    "codCommittente",
    "note",
    "avltProdotto1",
    "avltProdotto2",
    "avltProdotto3"
})
public class AvltOperazione {

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
    @XmlElement(name = "AvltProdotto1", required = true)
    protected List<AvltProdotto1> avltProdotto1;
    @XmlElement(name = "AvltProdotto2")
    protected AvltProdotto2 avltProdotto2;
    @XmlElement(name = "AvltProdotto3", required = true)
    protected AvltProdotto3 avltProdotto3;

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
     * Gets the value of the avltProdotto1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the avltProdotto1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvltProdotto1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AvltProdotto1 }
     * 
     * 
     */
    public List<AvltProdotto1> getAvltProdotto1() {
        if (avltProdotto1 == null) {
            avltProdotto1 = new ArrayList<AvltProdotto1>();
        }
        return this.avltProdotto1;
    }

    /**
     * Recupera il valore della proprietà avltProdotto2.
     * 
     * @return
     *     possible object is
     *     {@link AvltProdotto2 }
     *     
     */
    public AvltProdotto2 getAvltProdotto2() {
        return avltProdotto2;
    }

    /**
     * Imposta il valore della proprietà avltProdotto2.
     * 
     * @param value
     *     allowed object is
     *     {@link AvltProdotto2 }
     *     
     */
    public void setAvltProdotto2(AvltProdotto2 value) {
        this.avltProdotto2 = value;
    }

    /**
     * Recupera il valore della proprietà avltProdotto3.
     * 
     * @return
     *     possible object is
     *     {@link AvltProdotto3 }
     *     
     */
    public AvltProdotto3 getAvltProdotto3() {
        return avltProdotto3;
    }

    /**
     * Imposta il valore della proprietà avltProdotto3.
     * 
     * @param value
     *     allowed object is
     *     {@link AvltProdotto3 }
     *     
     */
    public void setAvltProdotto3(AvltProdotto3 value) {
        this.avltProdotto3 = value;
    }

}
