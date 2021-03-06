
package org.archfirst.bfoms.interfaceout.exchange.referencedataadapter.client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ReferenceDataWebService", targetNamespace = "http://archfirst.org/bfexch/referencedataservice.wsdl")
public interface ReferenceDataWebService {


    /**
     * 
     * @param symbol
     * @return
     *     returns org.archfirst.bfoms.interfaceout.exchange.referencedataadapter.client.Instrument
     */
    @WebMethod(operationName = "Lookup", action = "Lookup")
    @WebResult(name = "Instrument", targetNamespace = "")
    @RequestWrapper(localName = "Lookup", targetNamespace = "http://archfirst.org/bfexch/referencedataservice.wsdl", className = "org.archfirst.bfoms.interfaceout.exchange.referencedataadapter.client.Lookup")
    @ResponseWrapper(localName = "LookupResponse", targetNamespace = "http://archfirst.org/bfexch/referencedataservice.wsdl", className = "org.archfirst.bfoms.interfaceout.exchange.referencedataadapter.client.LookupResponse")
    public Instrument lookup(
        @WebParam(name = "Symbol", targetNamespace = "")
        String symbol);

    /**
     * 
     * @return
     *     returns java.util.List<org.archfirst.bfoms.interfaceout.exchange.referencedataadapter.client.Instrument>
     */
    @WebMethod(operationName = "GetInstruments", action = "GetInstruments")
    @WebResult(name = "Instrument", targetNamespace = "")
    @RequestWrapper(localName = "GetInstruments", targetNamespace = "http://archfirst.org/bfexch/referencedataservice.wsdl", className = "org.archfirst.bfoms.interfaceout.exchange.referencedataadapter.client.GetInstruments")
    @ResponseWrapper(localName = "GetInstrumentsResponse", targetNamespace = "http://archfirst.org/bfexch/referencedataservice.wsdl", className = "org.archfirst.bfoms.interfaceout.exchange.referencedataadapter.client.GetInstrumentsResponse")
    public List<Instrument> getInstruments();

}
