
package it.sian.cooperazione.schema.wsmrga;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per AcidOperazione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AcidOperazione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumOperazione" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoNumOperazione"/>
 *         &lt;element name="DataOperazione" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="CodCommittente" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoDescrizione" minOccurs="0"/>
 *         &lt;element name="AcidProdotto1" type="{http://cooperazione.sian.it/schema/wsmrga/}AcidProdotto1"/>
 *         &lt;element name="AcidProdotto2" type="{http://cooperazione.sian.it/schema/wsmrga/}AcidProdotto2" minOccurs="0"/>
 *         &lt;element name="AcidProdotto3" type="{http://cooperazione.sian.it/schema/wsmrga/}AcidProdotto3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcidOperazione", propOrder = {
    "numOperazione",
    "dataOperazione",
    "codCommittente",
    "note",
    "acidProdotto1",
    "acidProdotto2",
    "acidProdotto3"
})
public class AcidOperazione {

    @XmlElement(name = "NumOperazione")
    protected int numOperazione;
    @XmlElement(name = "DataOperazione", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataOperazione;
    @XmlElement(name = "CodCommittente")
    protected String codCommittente;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "AcidProdotto1", required = true)
    protected AcidProdotto1 acidProdotto1;
    @XmlElement(name = "AcidProdotto2")
    protected AcidProdotto2 acidProdotto2;
    @XmlElement(name = "AcidProdotto3", required = true)
    protected AcidProdotto3 acidProdotto3;

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
     * Recupera il valore della proprietà acidProdotto1.
     * 
     * @return
     *     possible object is
     *     {@link AcidProdotto1 }
     *     
     */
    public AcidProdotto1 getAcidProdotto1() {
        return acidProdotto1;
    }

    /**
     * Imposta il valore della proprietà acidProdotto1.
     * 
     * @param value
     *     allowed object is
     *     {@link AcidProdotto1 }
     *     
     */
    public void setAcidProdotto1(AcidProdotto1 value) {
        this.acidProdotto1 = value;
    }

    /**
     * Recupera il valore della proprietà acidProdotto2.
     * 
     * @return
     *     possible object is
     *     {@link AcidProdotto2 }
     *     
     */
    public AcidProdotto2 getAcidProdotto2() {
        return acidProdotto2;
    }

    /**
     * Imposta il valore della proprietà acidProdotto2.
     * 
     * @param value
     *     allowed object is
     *     {@link AcidProdotto2 }
     *     
     */
    public void setAcidProdotto2(AcidProdotto2 value) {
        this.acidProdotto2 = value;
    }

    /**
     * Recupera il valore della proprietà acidProdotto3.
     * 
     * @return
     *     possible object is
     *     {@link AcidProdotto3 }
     *     
     */
    public AcidProdotto3 getAcidProdotto3() {
        return acidProdotto3;
    }

    /**
     * Imposta il valore della proprietà acidProdotto3.
     * 
     * @param value
     *     allowed object is
     *     {@link AcidProdotto3 }
     *     
     */
    public void setAcidProdotto3(AcidProdotto3 value) {
        this.acidProdotto3 = value;
    }

}
