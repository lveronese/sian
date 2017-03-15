
package it.sian.cooperazione.schema.wsmrga;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per TipoFiltro.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoFiltro">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;length value="1"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoFiltro")
@XmlEnum
public enum TipoFiltro {

    S,
    N;

    public String value() {
        return name();
    }

    public static TipoFiltro fromValue(String v) {
        return valueOf(v);
    }

}
