
package it.sian.cooperazione.schema.wsmrga;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TipoPartitaNoContr complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TipoPartitaNoContr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VolNominale" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoVolume"/>
 *         &lt;element name="NumConf">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://cooperazione.sian.it/schema/wsmrga/}TipoNumOperazione">
 *               &lt;minExclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Lotto" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoDescrizione" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoPartitaNoContr", propOrder = {
    "volNominale",
    "numConf",
    "lotto"
})
public class TipoPartitaNoContr {

    @XmlElement(name = "VolNominale", required = true)
    protected BigDecimal volNominale;
    @XmlElement(name = "NumConf")
    protected int numConf;
    @XmlElement(name = "Lotto")
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
