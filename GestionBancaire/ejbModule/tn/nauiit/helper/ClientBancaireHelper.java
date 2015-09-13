package tn.nauiit.helper;

import tn.nauiit.dto.ClientBanqueDto;
import tn.nauiit.dto.CompteBancaireDTO;
import tn.nauiit.model.ClientBanque;
import tn.nauiit.model.CompteBancaire;

public class ClientBancaireHelper {
 /**
  * 
  * @param c
  * @return
  */
	public static ClientBanqueDto modelToDto(ClientBanque c) {
		ClientBanqueDto cb = new ClientBanqueDto();
		cb.setCin(c.getCin());
		cb.setNom(c.getNom());
		cb.setAdresse(c.getAdresse());
		cb.setPrenom(c.getPrenom());
		if (c.getListeCompte().size() > 0) {
			for (CompteBancaire o : c.getListeCompte()) {
				cb.getListeCompte().add(CompteBancaireHelper.modelToDto(o));
			}
		}
		return cb;
	}
 /**
  * 
  * @param c
  * @return
  */
	public static ClientBanque dtoToModel(ClientBanqueDto c) {
		
		ClientBanque cb = new ClientBanque();
		cb.setCin(c.getCin());
		cb.setNom(c.getNom());
		cb.setAdresse(c.getAdresse());
		cb.setPrenom(c.getPrenom());
		if (c.getListeCompte().size() > 0) {
			for (CompteBancaireDTO o : c.getListeCompte()) {
				
				cb.getListeCompte().add(CompteBancaireHelper.dtoToModel(o));
			}
		}
		return cb;
	}
}
