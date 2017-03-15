
package it.sian.cooperazione.schema.wsmrga;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="CodiceProdotto" type="{http://cooperazione.sian.it/schema/wsmrga/}CodiceProdottoPrimario" minOccurs="0"/>
 *         &lt;element name="CodCategoria" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice" minOccurs="0"/>
 *         &lt;element name="CodClassificazione" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice" minOccurs="0"/>
 *         &lt;element name="CodStatoFisico" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice" minOccurs="0"/>
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
    "codiceProdotto",
    "codCategoria",
    "codClassificazione",
    "codStatoFisico"
})
@XmlRootElement(name = "VisProdSiRPVInput")
public class VisProdSiRPVInput {

    @XmlElement(name = "CodOper", required = true)
    protected CUAA codOper;
    @XmlElement(name = "CodiceIcqrf", required = true)
    protected String codiceIcqrf;
    @XmlElement(name = "CodiceProdotto")
    protected CodiceProdottoPrimario codiceProdotto;
    @XmlElement(name = "CodCategoria")
    protected String codCategoria;
    @XmlElement(name = "CodClassificazione")
    protected String codClassificazione;
    @XmlElement(name = "CodStatoFisico")
    protected String codStatoFisico;

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
     * Recupera il valore della proprietà codiceProdotto.
     * 
     * @return
     *     possible object is
     *     {@link CodiceProdottoPrimario }
     *     
     */
    public CodiceProdottoPrimario getCodiceProdotto() {
        return codiceProdotto;
    }

    /**
     * Imposta il valore della proprietà codiceProdotto.
     * 
     * @param value
     *     allowed object is
     *     {@link CodiceProdottoPrimario }
     *     
     */
    public void setCodiceProdotto(CodiceProdottoPrimario value) {
        this.codiceProdotto = value;
    }

    /**
     * Recupera il valore della proprietà codCategoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCategoria() {
        return codCategoria;
    }

    /**
     * Imposta il valore della proprietà codCategoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCategoria(String value) {
        this.codCategoria = value;
    }

    /**
     * Recupera il valore della proprietà codClassificazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodClassificazione() {
        return codClassificazione;
    }

    /**
     * Imposta il valore della proprietà codClassificazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodClassificazione(String value) {
        this.codClassificazione = value;
    }

    /**
     * Recupera il valore della proprietà codStatoFisico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodStatoFisico() {
        return codStatoFisico;
    }

    /**
     * Imposta il valore della proprietà codStatoFisico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodStatoFisico(String value) {
        this.codStatoFisico = value;
    }

}
