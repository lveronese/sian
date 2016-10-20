
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
 * <p>Classe Java per BabsOperazione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BabsOperazione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumOperazione" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoNumOperazione"/>
 *         &lt;element name="DataOperazione" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="EsoneroDeroga" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice"/>
 *         &lt;element name="NumGiustificativo" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoDescrizione"/>
 *         &lt;element name="DataGiustificativo" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="CodCommittente" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoDescrizione" minOccurs="0"/>
 *         &lt;element name="BabsProdotto1" type="{http://cooperazione.sian.it/schema/wsmrga/}BabsProdotto1" maxOccurs="unbounded"/>
 *         &lt;element name="BabsProdotto2" type="{http://cooperazione.sian.it/schema/wsmrga/}BabsProdotto2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BabsProdotto3" type="{http://cooperazione.sian.it/schema/wsmrga/}BabsProdotto3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BabsOperazione", propOrder = {
    "numOperazione",
    "dataOperazione",
    "esoneroDeroga",
    "numGiustificativo",
    "dataGiustificativo",
    "codCommittente",
    "note",
    "babsProdotto1",
    "babsProdotto2",
    "babsProdotto3"
})
public class BabsOperazione {

    @XmlElement(name = "NumOperazione")
    protected int numOperazione;
    @XmlElement(name = "DataOperazione", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataOperazione;
    @XmlElement(name = "EsoneroDeroga", required = true)
    protected String esoneroDeroga;
    @XmlElement(name = "NumGiustificativo", required = true)
    protected String numGiustificativo;
    @XmlElement(name = "DataGiustificativo", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataGiustificativo;
    @XmlElement(name = "CodCommittente")
    protected String codCommittente;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "BabsProdotto1", required = true)
    protected List<BabsProdotto1> babsProdotto1;
    @XmlElement(name = "BabsProdotto2")
    protected List<BabsProdotto2> babsProdotto2;
    @XmlElement(name = "BabsProdotto3", required = true)
    protected BabsProdotto3 babsProdotto3;

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
     * Gets the value of the babsProdotto1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the babsProdotto1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBabsProdotto1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BabsProdotto1 }
     * 
     * 
     */
    public List<BabsProdotto1> getBabsProdotto1() {
        if (babsProdotto1 == null) {
            babsProdotto1 = new ArrayList<BabsProdotto1>();
        }
        return this.babsProdotto1;
    }

    /**
     * Gets the value of the babsProdotto2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the babsProdotto2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBabsProdotto2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BabsProdotto2 }
     * 
     * 
     */
    public List<BabsProdotto2> getBabsProdotto2() {
        if (babsProdotto2 == null) {
            babsProdotto2 = new ArrayList<BabsProdotto2>();
        }
        return this.babsProdotto2;
    }

    /**
     * Recupera il valore della proprietà babsProdotto3.
     * 
     * @return
     *     possible object is
     *     {@link BabsProdotto3 }
     *     
     */
    public BabsProdotto3 getBabsProdotto3() {
        return babsProdotto3;
    }

    /**
     * Imposta il valore della proprietà babsProdotto3.
     * 
     * @param value
     *     allowed object is
     *     {@link BabsProdotto3 }
     *     
     */
    public void setBabsProdotto3(BabsProdotto3 value) {
        this.babsProdotto3 = value;
    }

}
