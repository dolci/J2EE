package tn.nauiit.dao.compteBanquaire;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import tn.nauiit.model.CompteBancaire;

/**
 * Session Bean implementation class ComptBancaire
 */
@Stateless
public class ComptBancaireDAO implements ComptBancaireDAOLocal,ComptBancaireDAORemote {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	EntityManager manager;
    public ComptBancaireDAO() {
        // TODO Auto-generated constructor stub
    }
    /**
	 * 
	 */
	public void save(CompteBancaire c) {
	
		manager.persist(c);
	}
	/**
	 * 
	 */
	public void delete(CompteBancaire c) {
	
	 manager.remove(c);	
	}
	/**
	 * 
	 */
	public CompteBancaire getById(long rib) {
		return manager.find(CompteBancaire.class, rib);
	}
	/**
	 * 
	 */
	public List<CompteBancaire> getAll() {
		Query query = manager.createQuery("select OBJECT(b) from CompteBancaire b");
		return query.getResultList();
	}
	/**
	 * 
	 */
	public long getRibLastEnregistrement() {
		Query query = manager.createQuery("SELECT MAX(b.rib) from CompteBancaire b ");
		
		return (Long) query.getResultList().get(0);
	}
	/**
	 * 
	 */
	
   public void updateCompteBancaire(long rib , double montant)
   {
	   CompteBancaire c = getById(rib);
		if (c != null) {
			c.setSolde(c.getSolde() + montant);		
	   Query query = manager.createQuery("UPDATE CompteBancaire cb SET cb.solde="
				+ c.getSolde() + " WHERE cb.rib = " + rib);
	    query.executeUpdate();
          }
	}
	public double obtentionSolde(long rib) {
		return manager.find(CompteBancaire.class, rib).getSolde();
	}
	
	
}
