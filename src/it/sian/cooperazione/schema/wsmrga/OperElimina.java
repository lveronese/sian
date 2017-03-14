
package it.sian.cooperazione.schema.wsmrga;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per OperElimina complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OperElimina">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataOperazione" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="NumOperazione" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoNumOperazione"/>
 *         &lt;element name="CodOperazione" type="{http://cooperazione.sian.it/schema/wsmrga/}CodiceOperazione"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperElimina", propOrder = {
    "dataOperazione",
    "numOperazione",
    "codOperazione"
})
public class OperElimina {

    @XmlElement(name = "DataOperazione", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataOperazione;
    @XmlElement(name = "NumOperazione")
    protected int numOperazione;
    @XmlElement(name = "CodOperazione", required = true)
    @XmlSchemaType(name = "string")
    protected CodiceOperazione codOperazione;

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

}
