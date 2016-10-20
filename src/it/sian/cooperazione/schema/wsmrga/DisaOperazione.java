
package it.sian.cooperazione.schema.wsmrga;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per DisaOperazione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DisaOperazione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumOperazione" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoNumOperazione"/>
 *         &lt;element name="DataOperazione" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="EsoneroDeroga" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice"/>
 *         &lt;element name="CodCommittente" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoDescrizione" minOccurs="0"/>
 *         &lt;element name="DisaProdotto1" type="{http://cooperazione.sian.it/schema/wsmrga/}DisaProdotto1"/>
 *         &lt;element name="DisaProdotto2" type="{http://cooperazione.sian.it/schema/wsmrga/}DisaProdotto2" minOccurs="0"/>
 *         &lt;element name="DisaProdotto3" type="{http://cooperazione.sian.it/schema/wsmrga/}DisaProdotto3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisaOperazione", propOrder = {
    "numOperazione",
    "dataOperazione",
    "esoneroDeroga",
    "codCommittente",
    "note",
    "disaProdotto1",
    "disaProdotto2",
    "disaProdotto3"
})
public class DisaOperazione {

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
    @XmlElement(name = "DisaProdotto1", required = true)
    protected DisaProdotto1 disaProdotto1;
    @XmlElement(name = "DisaProdotto2")
    protected DisaProdotto2 disaProdotto2;
    @XmlElement(name = "DisaProdotto3", required = true)
    protected DisaProdotto3 disaProdotto3;

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
     * Recupera il valore della proprietà disaProdotto1.
     * 
     * @return
     *     possible object is
     *     {@link DisaProdotto1 }
     *     
     */
    public DisaProdotto1 getDisaProdotto1() {
        return disaProdotto1;
    }

    /**
     * Imposta il valore della proprietà disaProdotto1.
     * 
     * @param value
     *     allowed object is
     *     {@link DisaProdotto1 }
     *     
     */
    public void setDisaProdotto1(DisaProdotto1 value) {
        this.disaProdotto1 = value;
    }

    /**
     * Recupera il valore della proprietà disaProdotto2.
     * 
     * @return
     *     possible object is
     *     {@link DisaProdotto2 }
     *     
     */
    public DisaProdotto2 getDisaProdotto2() {
        return disaProdotto2;
    }

    /**
     * Imposta il valore della proprietà disaProdotto2.
     * 
     * @param value
     *     allowed object is
     *     {@link DisaProdotto2 }
     *     
     */
    public void setDisaProdotto2(DisaProdotto2 value) {
        this.disaProdotto2 = value;
    }

    /**
     * Recupera il valore della proprietà disaProdotto3.
     * 
     * @return
     *     possible object is
     *     {@link DisaProdotto3 }
     *     
     */
    public DisaProdotto3 getDisaProdotto3() {
        return disaProdotto3;
    }

    /**
     * Imposta il valore della proprietà disaProdotto3.
     * 
     * @param value
     *     allowed object is
     *     {@link DisaProdotto3 }
     *     
     */
    public void setDisaProdotto3(DisaProdotto3 value) {
        this.disaProdotto3 = value;
    }

}
