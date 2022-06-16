/**
 * SumaServicioServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fieldeas;

public class SumaServicioServiceLocator extends org.apache.axis.client.Service implements fieldeas.SumaServicioService {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SumaServicioServiceLocator() {
    }


    public SumaServicioServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SumaServicioServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SumaServicio
    private java.lang.String SumaServicio_address = "http://localhost:8080/SumaSOAP/services/SumaServicio";

    public java.lang.String getSumaServicioAddress() {
        return SumaServicio_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SumaServicioWSDDServiceName = "SumaServicio";

    public java.lang.String getSumaServicioWSDDServiceName() {
        return SumaServicioWSDDServiceName;
    }

    public void setSumaServicioWSDDServiceName(java.lang.String name) {
        SumaServicioWSDDServiceName = name;
    }

    public fieldeas.SumaServicio getSumaServicio() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SumaServicio_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSumaServicio(endpoint);
    }

    public fieldeas.SumaServicio getSumaServicio(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            fieldeas.SumaServicioSoapBindingStub _stub = new fieldeas.SumaServicioSoapBindingStub(portAddress, this);
            _stub.setPortName(getSumaServicioWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSumaServicioEndpointAddress(java.lang.String address) {
        SumaServicio_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (fieldeas.SumaServicio.class.isAssignableFrom(serviceEndpointInterface)) {
                fieldeas.SumaServicioSoapBindingStub _stub = new fieldeas.SumaServicioSoapBindingStub(new java.net.URL(SumaServicio_address), this);
                _stub.setPortName(getSumaServicioWSDDServiceName());
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
        if ("SumaServicio".equals(inputPortName)) {
            return getSumaServicio();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://fieldeas", "SumaServicioService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://fieldeas", "SumaServicio"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SumaServicio".equals(portName)) {
            setSumaServicioEndpointAddress(address);
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
