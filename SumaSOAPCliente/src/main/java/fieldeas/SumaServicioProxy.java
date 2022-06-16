package fieldeas;

public class SumaServicioProxy implements fieldeas.SumaServicio {
  private String _endpoint = null;
  private fieldeas.SumaServicio sumaServicio = null;
  
  public SumaServicioProxy() {
    _initSumaServicioProxy();
  }
  
  public SumaServicioProxy(String endpoint) {
    _endpoint = endpoint;
    _initSumaServicioProxy();
  }
  
  private void _initSumaServicioProxy() {
    try {
      sumaServicio = (new fieldeas.SumaServicioServiceLocator()).getSumaServicio();
      if (sumaServicio != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sumaServicio)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sumaServicio)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sumaServicio != null)
      ((javax.xml.rpc.Stub)sumaServicio)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public fieldeas.SumaServicio getSumaServicio() {
    if (sumaServicio == null)
      _initSumaServicioProxy();
    return sumaServicio;
  }
  
  public int suma(int a, int b) throws java.rmi.RemoteException{
    if (sumaServicio == null)
      _initSumaServicioProxy();
    return sumaServicio.suma(a, b);
  }
  
  
}