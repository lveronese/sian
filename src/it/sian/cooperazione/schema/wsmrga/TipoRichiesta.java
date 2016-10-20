
package it.sian.cooperazione.schema.wsmrga;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TipoRichiesta.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoRichiesta">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;length value="1"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="A"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoRichiesta")
@XmlEnum
public enum TipoRichiesta {

    I,
    A;

    public String value() {
        return name();
    }

    public static TipoRichiesta fromValue(String v) {
        return valueOf(v);
    }

}
