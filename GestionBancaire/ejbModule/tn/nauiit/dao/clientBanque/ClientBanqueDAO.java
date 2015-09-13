package tn.nauiit.dao.clientBanque;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.nauiit.model.ClientBanque;
import tn.nauiit.model.CompteBancaire;

/**
 * Session Bean implementation class ClientBanqueDAO
 */
@Stateless
public class ClientBanqueDAO implements ClientBanqueDAORemote, ClientBanqueDAOLocal {

	@PersistenceContext
	EntityManager manager;
    /**
     * Default constructor. 
     */
	
    public ClientBanqueDAO() {
        // TODO Auto-generated constructor stub
    }

	public void save(ClientBanque c) {
		
		manager.persist(c);
		for( CompteBancaire cb : c.getListeCompte())
		{ manager.persist(cb);}
	}

	public void delete(ClientBanque c) {
      manager.remove(c);		
	}

	public ClientBanque getById(String cin) {
		return manager.find(ClientBanque.class, cin);		
	}

	public List<ClientBanque> getAll() {
		Query query = manager.createQuery("select OBJECT(b) from ClientBanque b");
		
		return query.getResultList();
	}

	

	public void updateClientBanque(long rib, double montant) {
	
		
	}

	public void addCompteBanque(CompteBancaire cb) {
		
		
	}

	public List<CompteBancaire> getAllCompteBancaie() {
		Query query = manager.createQuery("select OBJECT(b) from CompteBancaire b, ClientBanque c WHERE b.cin_client = c.cin");
		return query.getResultList();
	}

}
