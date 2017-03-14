
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
 * <p>Classe Java per SpabOperazione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SpabOperazione">
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
 *         &lt;element name="SpabProdotto1" type="{http://cooperazione.sian.it/schema/wsmrga/}SpabProdotto1" maxOccurs="unbounded"/>
 *         &lt;element name="SpabProdotto2" type="{http://cooperazione.sian.it/schema/wsmrga/}SpabProdotto2" minOccurs="0"/>
 *         &lt;element name="SpabProdotto3" type="{http://cooperazione.sian.it/schema/wsmrga/}SpabProdotto3" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpabProdotto4" type="{http://cooperazione.sian.it/schema/wsmrga/}SpabProdotto4" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpabProdotto5" type="{http://cooperazione.sian.it/schema/wsmrga/}SpabProdotto5"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpabOperazione", propOrder = {
    "numOperazione",
    "dataOperazione",
    "esoneroDeroga",
    "numGiustificativo",
    "dataGiustificativo",
    "codCommittente",
    "note",
    "spabProdotto1",
    "spabProdotto2",
    "spabProdotto3",
    "spabProdotto4",
    "spabProdotto5"
})
public class SpabOperazione {

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
    @XmlElement(name = "SpabProdotto1", required = true)
    protected List<SpabProdotto1> spabProdotto1;
    @XmlElement(name = "SpabProdotto2")
    protected SpabProdotto2 spabProdotto2;
    @XmlElement(name = "SpabProdotto3")
    protected List<SpabProdotto3> spabProdotto3;
    @XmlElement(name = "SpabProdotto4")
    protected List<SpabProdotto4> spabProdotto4;
    @XmlElement(name = "SpabProdotto5", required = true)
    protected SpabProdotto5 spabProdotto5;

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
     * Gets the value of the spabProdotto1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spabProdotto1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpabProdotto1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpabProdotto1 }
     * 
     * 
     */
    public List<SpabProdotto1> getSpabProdotto1() {
        if (spabProdotto1 == null) {
            spabProdotto1 = new ArrayList<SpabProdotto1>();
        }
        return this.spabProdotto1;
    }

    /**
     * Recupera il valore della proprietà spabProdotto2.
     * 
     * @return
     *     possible object is
     *     {@link SpabProdotto2 }
     *     
     */
    public SpabProdotto2 getSpabProdotto2() {
        return spabProdotto2;
    }

    /**
     * Imposta il valore della proprietà spabProdotto2.
     * 
     * @param value
     *     allowed object is
     *     {@link SpabProdotto2 }
     *     
     */
    public void setSpabProdotto2(SpabProdotto2 value) {
        this.spabProdotto2 = value;
    }

    /**
     * Gets the value of the spabProdotto3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spabProdotto3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpabProdotto3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpabProdotto3 }
     * 
     * 
     */
    public List<SpabProdotto3> getSpabProdotto3() {
        if (spabProdotto3 == null) {
            spabProdotto3 = new ArrayList<SpabProdotto3>();
        }
        return this.spabProdotto3;
    }

    /**
     * Gets the value of the spabProdotto4 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spabProdotto4 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpabProdotto4().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpabProdotto4 }
     * 
     * 
     */
    public List<SpabProdotto4> getSpabProdotto4() {
        if (spabProdotto4 == null) {
            spabProdotto4 = new ArrayList<SpabProdotto4>();
        }
        return this.spabProdotto4;
    }

    /**
     * Recupera il valore della proprietà spabProdotto5.
     * 
     * @return
     *     possible object is
     *     {@link SpabProdotto5 }
     *     
     */
    public SpabProdotto5 getSpabProdotto5() {
        return spabProdotto5;
    }

    /**
     * Imposta il valore della proprietà spabProdotto5.
     * 
     * @param value
     *     allowed object is
     *     {@link SpabProdotto5 }
     *     
     */
    public void setSpabProdotto5(SpabProdotto5 value) {
        this.spabProdotto5 = value;
    }

}
