
package it.sian.cooperazione.schema.wsmrga;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per ARMCOperazione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ARMCOperazione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumOperazione" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoNumOperazione"/>
 *         &lt;element name="DataOperazione" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="NumGiustificativo" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoDescrizione"/>
 *         &lt;element name="DataGiustificativo" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="CodCommittente" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoDescrizione" minOccurs="0"/>
 *         &lt;element name="ProdBase" type="{http://cooperazione.sian.it/schema/wsmrga/}ProdottoBase"/>
 *         &lt;element name="ProdAggiunto" type="{http://cooperazione.sian.it/schema/wsmrga/}ProdottoAggiunto"/>
 *         &lt;element name="ProdArricchito" type="{http://cooperazione.sian.it/schema/wsmrga/}ProdottoArricchito"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ARMCOperazione", propOrder = {
    "numOperazione",
    "dataOperazione",
    "numGiustificativo",
    "dataGiustificativo",
    "codCommittente",
    "note",
    "prodBase",
    "prodAggiunto",
    "prodArricchito"
})
public class ARMCOperazione {

    @XmlElement(name = "NumOperazione")
    protected int numOperazione;
    @XmlElement(name = "DataOperazione", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataOperazione;
    @XmlElement(name = "NumGiustificativo", required = true)
    protected String numGiustificativo;
    @XmlElement(name = "DataGiustificativo", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataGiustificativo;
    @XmlElement(name = "CodCommittente")
    protected String codCommittente;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "ProdBase", required = true)
    protected ProdottoBase prodBase;
    @XmlElement(name = "ProdAggiunto", required = true)
    protected ProdottoAggiunto prodAggiunto;
    @XmlElement(name = "ProdArricchito", required = true)
    protected ProdottoArricchito prodArricchito;

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
     * Recupera il valore della proprietà prodBase.
     * 
     * @return
     *     possible object is
     *     {@link ProdottoBase }
     *     
     */
    public ProdottoBase getProdBase() {
        return prodBase;
    }

    /**
     * Imposta il valore della proprietà prodBase.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdottoBase }
     *     
     */
    public void setProdBase(ProdottoBase value) {
        this.prodBase = value;
    }

    /**
     * Recupera il valore della proprietà prodAggiunto.
     * 
     * @return
     *     possible object is
     *     {@link ProdottoAggiunto }
     *     
     */
    public ProdottoAggiunto getProdAggiunto() {
        return prodAggiunto;
    }

    /**
     * Imposta il valore della proprietà prodAggiunto.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdottoAggiunto }
     *     
     */
    public void setProdAggiunto(ProdottoAggiunto value) {
        this.prodAggiunto = value;
    }

    /**
     * Recupera il valore della proprietà prodArricchito.
     * 
     * @return
     *     possible object is
     *     {@link ProdottoArricchito }
     *     
     */
    public ProdottoArricchito getProdArricchito() {
        return prodArricchito;
    }

    /**
     * Imposta il valore della proprietà prodArricchito.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdottoArricchito }
     *     
     */
    public void setProdArricchito(ProdottoArricchito value) {
        this.prodArricchito = value;
    }

}
