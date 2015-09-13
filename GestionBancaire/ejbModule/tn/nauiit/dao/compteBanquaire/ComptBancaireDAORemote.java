package tn.nauiit.dao.compteBanquaire;

import java.util.List;

import javax.ejb.Remote;
import tn.nauiit.model.CompteBancaire;


@Remote
public interface ComptBancaireDAORemote {

	void save(CompteBancaire c);
	
	void delete(CompteBancaire c);
	
	CompteBancaire getById(long rib);
	
	long getRibLastEnregistrement();
	
	List<CompteBancaire>getAll();

	 void updateCompteBancaire(long rib , double montant);
	
	double obtentionSolde(long rib);
}
