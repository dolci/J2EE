package tn.nauiit.managedBean;

import java.io.Serializable;
import java.util.Map;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import tn.nauiit.dto.ClientBanqueDto;
import tn.nauiit.serviceGestionCompte.GestionCompteBancaireLocal;

@ManagedBean
public class ClientComptes implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String cin;
	ClientBanqueDto cltDto;
	@EJB
	GestionCompteBancaireLocal gestion;
	
	private String getCinFromJSF(FacesContext context) {
		Map<String, String> parameters = context.getExternalContext().getRequestParameterMap();
		
		return parameters.get("cin");
	}
	
	public String outcome() {
		FacesContext context = FacesContext.getCurrentInstance();
		this.cin = getCinFromJSF(context);
	
		return "index";
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public ClientBanqueDto getCltDto() {
		return cltDto;
	}

	public void setCltDto(ClientBanqueDto cltDto) {
		this.cltDto = cltDto;
	}
	
	
}
