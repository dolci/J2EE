package tn.nauiit.managedBean;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.apache.axis.AxisFault;
import org.primefaces.event.RowEditEvent;

import tn.nauiit.dao.clientBanque.ClientBanqueDAOServiceSoapBindingStub;
import tn.nauiit.dto.ClientBanqueDto;
import tn.nauiit.model.ClientBanque;
import tn.nauiit.serviceGestionCompte.GestionCompteBancaireLocal;

@ManagedBean
@SessionScoped
public class Clients implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*@EJB
	GestionCompteBancaireLocal clDao;
*/
	
	//private List<ClientBanqueDto> listClt = null;
	private ClientBanqueDto selectedClient;
	private  tn.nauiit.dao.clientBanque.ClientBanque[] listClt = null;
    private MenuController mc ;
	@PostConstruct
	public void getListClient() {
		ClientBanqueDAOServiceSoapBindingStub clDao = null;
		try {
			clDao = new ClientBanqueDAOServiceSoapBindingStub();
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//listClt = clDao.getAllClient();
		// System.out.println(" ******nbre client *** "+listClt.size());
		try {
			listClt = clDao.getAll();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public tn.nauiit.dto.ClientBanqueDto getSelectedClient() {
		return selectedClient;
	}
	public void setSelectedClient(ClientBanqueDto selectedClient) {
		this.selectedClient = selectedClient;
	}

	/*public List<ClientBanqueDto> getListClt() {
		return listClt;
	}

	public void setListClt(List<ClientBanqueDto> listClt) {
		this.listClt = listClt;
	}

	public void onEdit(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Client Edited "+
				((ClientBanqueDto) event.getObject()).getCin());
		FacesContext.getCurrentInstance().addMessage(null, msg);
		clDao.Update(((ClientBanqueDto) event.getObject()));
		System.out.println("\n *******"+((ClientBanqueDto) event.getObject()).getAdresse()+"\n"+((ClientBanqueDto) event.getObject()).getNom()+"\n"+
				((ClientBanqueDto) event.getObject()).getPrenom()+"\n"+ ((ClientBanqueDto) event.getObject()).getCin());
		
	}

	public void onCancel(RowEditEvent event) {
		FacesMessage msg = new FacesMessage(" Cancelled");
		FacesContext.getCurrentInstance().addMessage(null, msg);
		listClt.remove((ClientBanqueDto) event.getObject());
	}
  
	public void delete(ClientBanqueDto clt)
	{
		clDao.delete(clt);
		FacesMessage msg = new FacesMessage("Client Deleted ");
		FacesContext.getCurrentInstance().addMessage(null, msg);
		listClt.remove(clt);
	}*/
	
	public void transfert()
	{
		//System.out.println("\n*******************\n"+mc.getPage());
		mc.page = "DetailsCompteClient";
		System.out.println("\n*******************\n"+mc.getPage());
	}

}
