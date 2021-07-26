/**
 * AATWebServicesLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.getty.vocabsservices;

public class AATWebServicesLocator extends org.apache.axis.client.Service implements edu.getty.vocabsservices.AATWebServices {

/**
 * AAT Web Services
 */

    public AATWebServicesLocator() {
    }


    public AATWebServicesLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AATWebServicesLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AATWebServicesSoap
    private java.lang.String AATWebServicesSoap_address = "http://vocabsservices.getty.edu/AATService.asmx";

    public java.lang.String getAATWebServicesSoapAddress() {
        return AATWebServicesSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AATWebServicesSoapWSDDServiceName = "AATWebServicesSoap";

    public java.lang.String getAATWebServicesSoapWSDDServiceName() {
        return AATWebServicesSoapWSDDServiceName;
    }

    public void setAATWebServicesSoapWSDDServiceName(java.lang.String name) {
        AATWebServicesSoapWSDDServiceName = name;
    }

    public edu.getty.vocabsservices.AATWebServicesSoap getAATWebServicesSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AATWebServicesSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAATWebServicesSoap(endpoint);
    }

    public edu.getty.vocabsservices.AATWebServicesSoap getAATWebServicesSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            edu.getty.vocabsservices.AATWebServicesSoapStub _stub = new edu.getty.vocabsservices.AATWebServicesSoapStub(portAddress, this);
            _stub.setPortName(getAATWebServicesSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAATWebServicesSoapEndpointAddress(java.lang.String address) {
        AATWebServicesSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (edu.getty.vocabsservices.AATWebServicesSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                edu.getty.vocabsservices.AATWebServicesSoapStub _stub = new edu.getty.vocabsservices.AATWebServicesSoapStub(new java.net.URL(AATWebServicesSoap_address), this);
                _stub.setPortName(getAATWebServicesSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AATWebServicesSoap".equals(inputPortName)) {
            return getAATWebServicesSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "AATWebServices");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "AATWebServicesSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AATWebServicesSoap".equals(portName)) {
            setAATWebServicesSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
