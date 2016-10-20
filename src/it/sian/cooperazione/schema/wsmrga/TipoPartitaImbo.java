
package it.sian.cooperazione.schema.wsmrga;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TipoPartitaImbo complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TipoPartitaImbo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VolNominale">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minExclusive value="0"/>
 *               &lt;totalDigits value="8"/>
 *               &lt;fractionDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NumConf">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://cooperazione.sian.it/schema/wsmrga/}TipoNumOperazione">
 *               &lt;minExclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NumSerie" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoDescrizione" minOccurs="0"/>
 *         &lt;element name="NumIniContr" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoDescrizione" minOccurs="0"/>
 *         &lt;element name="NumFinContr" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoDescrizione" minOccurs="0"/>
 *         &lt;element name="Lotto" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoDescrizione"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoPartitaImbo", propOrder = {
    "volNominale",
    "numConf",
    "numSerie",
    "numIniContr",
    "numFinContr",
    "lotto"
})
public class TipoPartitaImbo {

    @XmlElement(name = "VolNominale", required = true)
    protected BigDecimal volNominale;
    @XmlElement(name = "NumConf")
    protected int numConf;
    @XmlElement(name = "NumSerie")
    protected String numSerie;
    @XmlElement(name = "NumIniContr")
    protected String numIniContr;
    @XmlElement(name = "NumFinContr")
    protected String numFinContr;
    @XmlElement(name = "Lotto", required = true)
    protected String lotto;

    /**
     * Recupera il valore della proprietà volNominale.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolNominale() {
        return volNominale;
    }

    /**
     * Imposta il valore della proprietà volNominale.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolNominale(BigDecimal value) {
        this.volNominale = value;
    }

    /**
     * Recupera il valore della proprietà numConf.
     * 
     */
    public int getNumConf() {
        return numConf;
    }

    /**
     * Imposta il valore della proprietà numConf.
     * 
     */
    public void setNumConf(int value) {
        this.numConf = value;
    }

    /**
     * Recupera il valore della proprietà numSerie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumSerie() {
        return numSerie;
    }

    /**
     * Imposta il valore della proprietà numSerie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumSerie(String value) {
        this.numSerie = value;
    }

    /**
     * Recupera il valore della proprietà numIniContr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumIniContr() {
        return numIniContr;
    }

    /**
     * Imposta il valore della proprietà numIniContr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumIniContr(String value) {
        this.numIniContr = value;
    }

    /**
     * Recupera il valore della proprietà numFinContr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumFinContr() {
        return numFinContr;
    }

    /**
     * Imposta il valore della proprietà numFinContr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumFinContr(String value) {
        this.numFinContr = value;
    }

    /**
     * Recupera il valore della proprietà lotto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotto() {
        return lotto;
    }

    /**
     * Imposta il valore della proprietà lotto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotto(String value) {
        this.lotto = value;
    }

}
