
package it.sian.cooperazione.schema.wsmrga;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodOper" type="{http://cooperazione.sian.it/schema/wsmrga/}CUAA"/>
 *         &lt;element name="CodiceIcqrf" type="{http://cooperazione.sian.it/schema/wsmrga/}CodiceIcq"/>
 *         &lt;element name="DataOperIni" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="DataOperFine" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="NumOperazione" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoNumOperazione" minOccurs="0"/>
 *         &lt;element name="CodiceFornDest" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice" minOccurs="0"/>
 *         &lt;element name="CodOperazione" type="{http://cooperazione.sian.it/schema/wsmrga/}CodiceOperazione" minOccurs="0"/>
 *         &lt;element name="Categoria" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice" minOccurs="0"/>
 *         &lt;element name="CodCommittente" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "codOper",
    "codiceIcqrf",
    "dataOperIni",
    "dataOperFine",
    "numOperazione",
    "codiceFornDest",
    "codOperazione",
    "categoria",
    "codCommittente"
})
@XmlRootElement(name = "VisOperSiRPVInput")
public class VisOperSiRPVInput {

    @XmlElement(name = "CodOper", required = true)
    protected CUAA codOper;
    @XmlElement(name = "CodiceIcqrf", required = true)
    protected String codiceIcqrf;
    @XmlElement(name = "DataOperIni", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataOperIni;
    @XmlElement(name = "DataOperFine")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataOperFine;
    @XmlElement(name = "NumOperazione")
    protected Integer numOperazione;
    @XmlElement(name = "CodiceFornDest")
    protected String codiceFornDest;
    @XmlElement(name = "CodOperazione")
    @XmlSchemaType(name = "string")
    protected CodiceOperazione codOperazione;
    @XmlElement(name = "Categoria")
    protected String categoria;
    @XmlElement(name = "CodCommittente")
    protected String codCommittente;

    /**
     * Recupera il valore della proprietà codOper.
     * 
     * @return
     *     possible object is
     *     {@link CUAA }
     *     
     */
    public CUAA getCodOper() {
        return codOper;
    }

    /**
     * Imposta il valore della proprietà codOper.
     * 
     * @param value
     *     allowed object is
     *     {@link CUAA }
     *     
     */
    public void setCodOper(CUAA value) {
        this.codOper = value;
    }

    /**
     * Recupera il valore della proprietà codiceIcqrf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceIcqrf() {
        return codiceIcqrf;
    }

    /**
     * Imposta il valore della proprietà codiceIcqrf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceIcqrf(String value) {
        this.codiceIcqrf = value;
    }

    /**
     * Recupera il valore della proprietà dataOperIni.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataOperIni() {
        return dataOperIni;
    }

    /**
     * Imposta il valore della proprietà dataOperIni.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataOperIni(XMLGregorianCalendar value) {
        this.dataOperIni = value;
    }

    /**
     * Recupera il valore della proprietà dataOperFine.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataOperFine() {
        return dataOperFine;
    }

    /**
     * Imposta il valore della proprietà dataOperFine.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataOperFine(XMLGregorianCalendar value) {
        this.dataOperFine = value;
    }

    /**
     * Recupera il valore della proprietà numOperazione.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumOperazione() {
        return numOperazione;
    }

    /**
     * Imposta il valore della proprietà numOperazione.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumOperazione(Integer value) {
        this.numOperazione = value;
    }

    /**
     * Recupera il valore della proprietà codiceFornDest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFornDest() {
        return codiceFornDest;
    }

    /**
     * Imposta il valore della proprietà codiceFornDest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFornDest(String value) {
        this.codiceFornDest = value;
    }

    /**
     * Recupera il valore della proprietà codOperazione.
     * 
     * @return
     *     possible object is
     *     {@link CodiceOperazione }
     *     
     */
    public CodiceOperazione getCodOperazione() {
        return codOperazione;
    }

    /**
     * Imposta il valore della proprietà codOperazione.
     * 
     * @param value
     *     allowed object is
     *     {@link CodiceOperazione }
     *     
     */
    public void setCodOperazione(CodiceOperazione value) {
        this.codOperazione = value;
    }

    /**
     * Recupera il valore della proprietà categoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Imposta il valore della proprietà categoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoria(String value) {
        this.categoria = value;
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

}
