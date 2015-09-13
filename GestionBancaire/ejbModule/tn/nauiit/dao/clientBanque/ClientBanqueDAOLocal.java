package tn.nauiit.dao.clientBanque;

import java.util.List;

import javax.ejb.Local;

import tn.nauiit.model.ClientBanque;
import tn.nauiit.model.CompteBancaire;


@Local
public interface ClientBanqueDAOLocal {
	
    void save(ClientBanque c);
	
	void delete(ClientBanque c);
	
	ClientBanque getById(String cin);
	
	List<ClientBanque>getAll();
	
	List<CompteBancaire> getAllCompteBancaie();

	void updateClientBanque(long rib , double montant);
	
	void addCompteBanque(CompteBancaire cb) ;

}
