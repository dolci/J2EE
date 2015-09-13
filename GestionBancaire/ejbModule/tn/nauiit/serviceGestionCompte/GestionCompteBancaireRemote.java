package tn.nauiit.serviceGestionCompte;

import java.util.List;

import javax.ejb.Remote;

import tn.nauiit.dto.ClientBanqueDto;
import tn.nauiit.dto.CompteBancaireDTO;
import tn.nauiit.model.ClientBanque;


@Remote
public interface GestionCompteBancaireRemote {

	long creerCompteBancaire(CompteBancaireDTO c);
	
	boolean retraitArgent(long idCompte, double montant);

	void depotArgent(long idCompte, double montant);

	List<CompteBancaireDTO> detailComptes();
	
	String creerClientBanque(ClientBanqueDto cbd);
	
	String ouvertureCompteBancaire(CompteBancaireDTO cp);

	List<ClientBanqueDto> getAllClient();
}
