
package it.sian.cooperazione.schema.wsmrga;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per EvalOperazione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EvalOperazione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumOperazione" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoNumOperazione"/>
 *         &lt;element name="DataOperazione" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="CodCommittente" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoDescrizione" minOccurs="0"/>
 *         &lt;element name="EvalProdotto1" type="{http://cooperazione.sian.it/schema/wsmrga/}EvalProdotto1"/>
 *         &lt;element name="EvalProdotto2" type="{http://cooperazione.sian.it/schema/wsmrga/}EvalProdotto2"/>
 *         &lt;element name="EvalProdotto3" type="{http://cooperazione.sian.it/schema/wsmrga/}EvalProdotto3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EvalOperazione", propOrder = {
    "numOperazione",
    "dataOperazione",
    "codCommittente",
    "note",
    "evalProdotto1",
    "evalProdotto2",
    "evalProdotto3"
})
public class EvalOperazione {

    @XmlElement(name = "NumOperazione")
    protected int numOperazione;
    @XmlElement(name = "DataOperazione", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataOperazione;
    @XmlElement(name = "CodCommittente")
    protected String codCommittente;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "EvalProdotto1", required = true)
    protected EvalProdotto1 evalProdotto1;
    @XmlElement(name = "EvalProdotto2", required = true)
    protected EvalProdotto2 evalProdotto2;
    @XmlElement(name = "EvalProdotto3", required = true)
    protected EvalProdotto3 evalProdotto3;

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
     * Recupera il valore della proprietà evalProdotto1.
     * 
     * @return
     *     possible object is
     *     {@link EvalProdotto1 }
     *     
     */
    public EvalProdotto1 getEvalProdotto1() {
        return evalProdotto1;
    }

    /**
     * Imposta il valore della proprietà evalProdotto1.
     * 
     * @param value
     *     allowed object is
     *     {@link EvalProdotto1 }
     *     
     */
    public void setEvalProdotto1(EvalProdotto1 value) {
        this.evalProdotto1 = value;
    }

    /**
     * Recupera il valore della proprietà evalProdotto2.
     * 
     * @return
     *     possible object is
     *     {@link EvalProdotto2 }
     *     
     */
    public EvalProdotto2 getEvalProdotto2() {
        return evalProdotto2;
    }

    /**
     * Imposta il valore della proprietà evalProdotto2.
     * 
     * @param value
     *     allowed object is
     *     {@link EvalProdotto2 }
     *     
     */
    public void setEvalProdotto2(EvalProdotto2 value) {
        this.evalProdotto2 = value;
    }

    /**
     * Recupera il valore della proprietà evalProdotto3.
     * 
     * @return
     *     possible object is
     *     {@link EvalProdotto3 }
     *     
     */
    public EvalProdotto3 getEvalProdotto3() {
        return evalProdotto3;
    }

    /**
     * Imposta il valore della proprietà evalProdotto3.
     * 
     * @param value
     *     allowed object is
     *     {@link EvalProdotto3 }
     *     
     */
    public void setEvalProdotto3(EvalProdotto3 value) {
        this.evalProdotto3 = value;
    }

}
