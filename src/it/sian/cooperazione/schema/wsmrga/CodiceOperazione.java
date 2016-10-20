
package it.sian.cooperazione.schema.wsmrga;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CodiceOperazione.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CodiceOperazione">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;length value="4"/>
 *     &lt;enumeration value="GIIN"/>
 *     &lt;enumeration value="CASD"/>
 *     &lt;enumeration value="USSD"/>
 *     &lt;enumeration value="IMBO"/>
 *     &lt;enumeration value="ACID"/>
 *     &lt;enumeration value="PIGI"/>
 *     &lt;enumeration value="ARMC"/>
 *     &lt;enumeration value="DOLC"/>
 *     &lt;enumeration value="PERD"/>
 *     &lt;enumeration value="SVIN"/>
 *     &lt;enumeration value="TAGL"/>
 *     &lt;enumeration value="CERT"/>
 *     &lt;enumeration value="AUCO"/>
 *     &lt;enumeration value="DIST"/>
 *     &lt;enumeration value="DENT"/>
 *     &lt;enumeration value="SFEC"/>
 *     &lt;enumeration value="AVLT"/>
 *     &lt;enumeration value="SPGS"/>
 *     &lt;enumeration value="SPAB"/>
 *     &lt;enumeration value="SCDS"/>
 *     &lt;enumeration value="ELMC"/>
 *     &lt;enumeration value="FRGS"/>
 *     &lt;enumeration value="SCZC"/>
 *     &lt;enumeration value="LIEL"/>
 *     &lt;enumeration value="EVAL"/>
 *     &lt;enumeration value="FRAB"/>
 *     &lt;enumeration value="AARD"/>
 *     &lt;enumeration value="DISA"/>
 *     &lt;enumeration value="BABS"/>
 *     &lt;enumeration value="APRT"/>
 *     &lt;enumeration value="ETIC"/>
 *     &lt;enumeration value="SUPE"/>
 *     &lt;enumeration value="DERI"/>
 *     &lt;enumeration value="ACET"/>
 *     &lt;enumeration value="TRSO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CodiceOperazione")
@XmlEnum
public enum CodiceOperazione {

    GIIN,
    CASD,
    USSD,
    IMBO,
    ACID,
    PIGI,
    ARMC,
    DOLC,
    PERD,
    SVIN,
    TAGL,
    CERT,
    AUCO,
    DIST,
    DENT,
    SFEC,
    AVLT,
    SPGS,
    SPAB,
    SCDS,
    ELMC,
    FRGS,
    SCZC,
    LIEL,
    EVAL,
    FRAB,
    AARD,
    DISA,
    BABS,
    APRT,
    ETIC,
    SUPE,
    DERI,
    ACET,
    TRSO;

    public String value() {
        return name();
    }

    public static CodiceOperazione fromValue(String v) {
        return valueOf(v);
    }

}
