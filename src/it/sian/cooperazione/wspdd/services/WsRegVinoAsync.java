package it.sian.cooperazione.wspdd.services;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2016-10-20T08:54:29.049+02:00
 * Generated source version: 2.7.18
 * 
 */
@WebServiceClient(name = "wsRegVinoAsync", 
                  wsdlLocation = "wsRegVinoAsync.wsdl",
                  targetNamespace = "http://cooperazione.sian.it/wspdd/services") 
public class WsRegVinoAsync extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://cooperazione.sian.it/wspdd/services", "wsRegVinoAsync");
    public final static QName WsRegVinoAsync = new QName("http://cooperazione.sian.it/wspdd/services", "wsRegVinoAsync");
    static {
        URL url = WsRegVinoAsync.class.getResource("wsRegVinoAsync.wsdl");
        if (url == null) {
            url = WsRegVinoAsync.class.getClassLoader().getResource("wsRegVinoAsync.wsdl");
        } 
        if (url == null) {
            java.util.logging.Logger.getLogger(WsRegVinoAsync.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "wsRegVinoAsync.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public WsRegVinoAsync(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WsRegVinoAsync(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsRegVinoAsync() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public WsRegVinoAsync(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public WsRegVinoAsync(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public WsRegVinoAsync(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns WsRegVinoAsyncInterService
     */
    @WebEndpoint(name = "wsRegVinoAsync")
    public WsRegVinoAsyncInterService getWsRegVinoAsync() {
        return super.getPort(WsRegVinoAsync, WsRegVinoAsyncInterService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsRegVinoAsyncInterService
     */
    @WebEndpoint(name = "wsRegVinoAsync")
    public WsRegVinoAsyncInterService getWsRegVinoAsync(WebServiceFeature... features) {
        return super.getPort(WsRegVinoAsync, WsRegVinoAsyncInterService.class, features);
    }

}