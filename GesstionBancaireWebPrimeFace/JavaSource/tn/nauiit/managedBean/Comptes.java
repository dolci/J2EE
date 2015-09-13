package tn.nauiit.managedBean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;


import org.primefaces.event.RowEditEvent;
import tn.nauiit.dto.ClientBanqueDto;
import tn.nauiit.dto.CompteBancaireDTO;
import tn.nauiit.serviceGestionCompte.GestionCompteBancaireLocal;

@ManagedBean
public class Comptes {

	@EJB
	GestionCompteBancaireLocal clDao ;
	
	private List<CompteBancaireDTO> listCompte = null; 
	
	  @PostConstruct
	public void getListClient() {
		
		listCompte = clDao.getAllCompte();		
		
	}

	public List<CompteBancaireDTO> getListCompte() {
		return listCompte;
	}

	public void setListCompte(List<CompteBancaireDTO> listCompte) {
		this.listCompte = listCompte;
	}
	public void onEdit(RowEditEvent event) {
   //     MessageUtil.addInfoMessage("compteBancaire.edit", ((CompteBancaireDTO) event.getObject()).getRib());
    }

    public void onCancel(RowEditEvent event) {
       // MessageUtil.addInfoMessage("compteBancaire.edit.cancelled", ((CompteBancaireDTO) event.getObject()).getRib());
    }
 
}
