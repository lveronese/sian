
package it.sian.cooperazione.schema.soapautenticazione;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.sian.cooperazione.schema.soapautenticazione package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SOAPAutenticazione_QNAME = new QName("http://cooperazione.sian.it/schema/SoapAutenticazione", "SOAPAutenticazione");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.sian.cooperazione.schema.soapautenticazione
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SOAPAutenticazione }
     * 
     */
    public SOAPAutenticazione createSOAPAutenticazione() {
        return new SOAPAutenticazione();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SOAPAutenticazione }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cooperazione.sian.it/schema/SoapAutenticazione", name = "SOAPAutenticazione")
    public JAXBElement<SOAPAutenticazione> createSOAPAutenticazione(SOAPAutenticazione value) {
        return new JAXBElement<SOAPAutenticazione>(_SOAPAutenticazione_QNAME, SOAPAutenticazione.class, null, value);
    }

}
