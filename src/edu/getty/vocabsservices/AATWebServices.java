/**
 * AATWebServices.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.getty.vocabsservices;

public interface AATWebServices extends javax.xml.rpc.Service {

/**
 * AAT Web Services
 */
    public java.lang.String getAATWebServicesSoapAddress();

    public edu.getty.vocabsservices.AATWebServicesSoap getAATWebServicesSoap() throws javax.xml.rpc.ServiceException;

    public edu.getty.vocabsservices.AATWebServicesSoap getAATWebServicesSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
