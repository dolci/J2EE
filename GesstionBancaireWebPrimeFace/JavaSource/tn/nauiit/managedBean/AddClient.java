package tn.nauiit.managedBean;

import java.io.Serializable;


import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import tn.nauiit.dto.ClientBanqueDto;
import tn.nauiit.serviceGestionCompte.GestionCompteBancaireLocal;

@ManagedBean
@ViewScoped
public class AddClient implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EJB
	GestionCompteBancaireLocal clDao;
	private String cin,nom,prenom,adresse;
	
	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	private ClientBanqueDto clientDto  ;
	public ClientBanqueDto getClientDto() {
		return clientDto;
	}

	public void setClientDto(ClientBanqueDto clientDto) {
		this.clientDto = clientDto;
	}
    public void save()
    {
    	clientDto = new ClientBanqueDto(cin,nom,prenom,adresse) ;
    	clDao.creerClientBanque(clientDto);
    	 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Data Saved"));
    }
}
