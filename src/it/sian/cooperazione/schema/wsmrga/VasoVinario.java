
package it.sian.cooperazione.schema.wsmrga;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per VasoVinario complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="VasoVinario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodVaso" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice"/>
 *         &lt;element name="TipoVaso" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoCodice"/>
 *         &lt;element name="Descrizione">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="200"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Volume" type="{http://cooperazione.sian.it/schema/wsmrga/}TipoVolume"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VasoVinario", propOrder = {
    "codVaso",
    "tipoVaso",
    "descrizione",
    "volume"
})
public class VasoVinario {

    @XmlElement(name = "CodVaso", required = true)
    protected String codVaso;
    @XmlElement(name = "TipoVaso", required = true)
    protected String tipoVaso;
    @XmlElement(name = "Descrizione", required = true)
    protected String descrizione;
    @XmlElement(name = "Volume", required = true)
    protected BigDecimal volume;

    /**
     * Recupera il valore della proprietà codVaso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodVaso() {
        return codVaso;
    }

    /**
     * Imposta il valore della proprietà codVaso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodVaso(String value) {
        this.codVaso = value;
    }

    /**
     * Recupera il valore della proprietà tipoVaso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoVaso() {
        return tipoVaso;
    }

    /**
     * Imposta il valore della proprietà tipoVaso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoVaso(String value) {
        this.tipoVaso = value;
    }

    /**
     * Recupera il valore della proprietà descrizione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * Imposta il valore della proprietà descrizione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizione(String value) {
        this.descrizione = value;
    }

    /**
     * Recupera il valore della proprietà volume.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolume() {
        return volume;
    }

    /**
     * Imposta il valore della proprietà volume.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolume(BigDecimal value) {
        this.volume = value;
    }

}
