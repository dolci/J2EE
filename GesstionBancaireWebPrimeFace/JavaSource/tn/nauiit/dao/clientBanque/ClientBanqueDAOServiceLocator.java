/**
 * ClientBanqueDAOServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tn.nauiit.dao.clientBanque;

public class ClientBanqueDAOServiceLocator extends org.apache.axis.client.Service implements tn.nauiit.dao.clientBanque.ClientBanqueDAOService {

    public ClientBanqueDAOServiceLocator() {
    }


    public ClientBanqueDAOServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ClientBanqueDAOServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ClientBanqueDAOPort
    private java.lang.String ClientBanqueDAOPort_address = "http://localhost:8080/GestionBanque/ClientBanqueDAO";

    public java.lang.String getClientBanqueDAOPortAddress() {
        return ClientBanqueDAOPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ClientBanqueDAOPortWSDDServiceName = "ClientBanqueDAOPort";

    public java.lang.String getClientBanqueDAOPortWSDDServiceName() {
        return ClientBanqueDAOPortWSDDServiceName;
    }

    public void setClientBanqueDAOPortWSDDServiceName(java.lang.String name) {
        ClientBanqueDAOPortWSDDServiceName = name;
    }

    public tn.nauiit.dao.clientBanque.ClientBanqueWS getClientBanqueDAOPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ClientBanqueDAOPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getClientBanqueDAOPort(endpoint);
    }

    public tn.nauiit.dao.clientBanque.ClientBanqueWS getClientBanqueDAOPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            tn.nauiit.dao.clientBanque.ClientBanqueDAOServiceSoapBindingStub _stub = new tn.nauiit.dao.clientBanque.ClientBanqueDAOServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getClientBanqueDAOPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setClientBanqueDAOPortEndpointAddress(java.lang.String address) {
        ClientBanqueDAOPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (tn.nauiit.dao.clientBanque.ClientBanqueWS.class.isAssignableFrom(serviceEndpointInterface)) {
                tn.nauiit.dao.clientBanque.ClientBanqueDAOServiceSoapBindingStub _stub = new tn.nauiit.dao.clientBanque.ClientBanqueDAOServiceSoapBindingStub(new java.net.URL(ClientBanqueDAOPort_address), this);
                _stub.setPortName(getClientBanqueDAOPortWSDDServiceName());
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
        if ("ClientBanqueDAOPort".equals(inputPortName)) {
            return getClientBanqueDAOPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://clientBanque.dao.nauiit.tn/", "ClientBanqueDAOService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://clientBanque.dao.nauiit.tn/", "ClientBanqueDAOPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ClientBanqueDAOPort".equals(portName)) {
            setClientBanqueDAOPortEndpointAddress(address);
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
