package tn.nauiit.serviceGestionCompte;

import java.util.List;

import javax.ejb.Local;

import tn.nauiit.dto.ClientBanqueDto;
import tn.nauiit.dto.CompteBancaireDTO;
import tn.nauiit.model.ClientBanque;


@Local
public interface GestionCompteBancaireLocal {

	long creerCompteBancaire(CompteBancaireDTO c);

	boolean retraitArgent(long idCompte, double montant);

	void depotArgent(long idCompte, double montant);

	List<CompteBancaireDTO> detailComptes();
	
	String creerClientBanque(ClientBanqueDto cbd);
	
	String ouvertureCompteBancaire(CompteBancaireDTO cp);
	
	List<ClientBanqueDto> getAllClient();
	
}
