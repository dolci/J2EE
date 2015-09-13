package tn.nauiit.dao.clientBanque;

public class ClientBanqueWSProxy implements tn.nauiit.dao.clientBanque.ClientBanqueWS {
  private String _endpoint = null;
  private tn.nauiit.dao.clientBanque.ClientBanqueWS clientBanqueWS = null;
  
  public ClientBanqueWSProxy() {
    _initClientBanqueWSProxy();
  }
  
  public ClientBanqueWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initClientBanqueWSProxy();
  }
  
  private void _initClientBanqueWSProxy() {
    try {
      clientBanqueWS = (new tn.nauiit.dao.clientBanque.ClientBanqueDAOServiceLocator()).getClientBanqueDAOPort();
      if (clientBanqueWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)clientBanqueWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)clientBanqueWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (clientBanqueWS != null)
      ((javax.xml.rpc.Stub)clientBanqueWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public tn.nauiit.dao.clientBanque.ClientBanqueWS getClientBanqueWS() {
    if (clientBanqueWS == null)
      _initClientBanqueWSProxy();
    return clientBanqueWS;
  }
  
  public tn.nauiit.dao.clientBanque.ClientBanque[] getAll() throws java.rmi.RemoteException{
    if (clientBanqueWS == null)
      _initClientBanqueWSProxy();
    return clientBanqueWS.getAll();
  }
  
  
}