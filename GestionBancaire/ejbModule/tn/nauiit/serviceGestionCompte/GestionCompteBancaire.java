package tn.nauiit.serviceGestionCompte;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import tn.nauiit.dao.clientBanque.ClientBanqueDAORemote;
import tn.nauiit.dao.compteBanquaire.ComptBancaireDAORemote;
import tn.nauiit.dto.ClientBanqueDto;
import tn.nauiit.dto.CompteBancaireDTO;
import tn.nauiit.helper.ClientBancaireHelper;
import tn.nauiit.helper.CompteBancaireHelper;
import tn.nauiit.model.ClientBanque;
import tn.nauiit.model.CompteBancaire;

/**
 * Session Bean implementation class GestionCompteBancaire
 */
@Stateless
public class GestionCompteBancaire implements GestionCompteBancaireRemote,GestionCompteBancaireLocal {

	/**
	 * Default constructor.
	 */
	@EJB
	ComptBancaireDAORemote compte;
	@EJB
    ClientBanqueDAORemote client;
	public GestionCompteBancaire() {
		// TODO Auto-generated constructor stub
	}
   /**
    * 
    */
	public long creerCompteBancaire(CompteBancaireDTO c) {
	  
		compte.save( CompteBancaireHelper.dtoToModel(c));
		
		return compte.getRibLastEnregistrement();
	}
/**
 * 
 */
	public boolean retraitArgent(long idCompte, double montant) {
		/*CompteBancaireDTO c = compte.getById(idCompte);
		if (c != null) {
			if (c.getSolde() >= montant) {
				c.setSolde(c.getSolde() - montant);
				compte.updateCompteBancaire("UPDATE CompteBancaire cb SET cb.solde="
						+ c.getSolde() + " WHERE cb.rib = " + idCompte);
				return true;
			} else
				return false;
		}*/
		return false;
	}
/**
 * 
 */
	public void depotArgent(long rib, double montant) {

		compte.updateCompteBancaire(rib, montant);
	}
/**
 * @return 
 * @return 
 * 
 */
	public  List<CompteBancaireDTO> detailComptes() {
		 List<CompteBancaire> lis = compte.getAll();
		 List<CompteBancaireDTO> listDTO =new ArrayList <CompteBancaireDTO>();
		 
		 for( CompteBancaire c:lis)
		 
			 listDTO.add(CompteBancaireHelper.modelToDto(c));
			 	 
		 
		 return listDTO;
	}
	/**
	 * 
	 */
public  String creerClientBanque(ClientBanqueDto c) {
	
	ClientBanque clt = ClientBancaireHelper.dtoToModel(c);
	client.save(clt);
	
	return "client crée";
	/*
	if(client.getById(clt.getCin()).equals(null))
	{
		
	}s
	else
	{
		return " client existe déjà";
	}*/
	
	/**
	 * 
	 */
	
}
public String ouvertureCompteBancaire(CompteBancaireDTO cp) {
	
/*	if(client.getById(CompteBancaireHelper.dtoToModel(cp).getCin_client())!= null)
	{
		client.addCompteBanque(CompteBancaireHelper.dtoToModel(cp));
		 return "compte cree";
	}	
	else
	{
		return "client à creer";
	}
}*/
 return "ter";
}
public List<ClientBanqueDto> getAllClient() {
	
	List<ClientBanqueDto> listCltDto = null;
	
	if(client.getAll().size()>0)
	{  System.out.println( "***\n nbre client = "+client.getAll().size());
	   
		listCltDto =new ArrayList<ClientBanqueDto> ();
		for(ClientBanque cb :client.getAll())
		{
			/*List<CompteBancaireDTO> listCpte =new ArrayList<CompteBancaireDTO> ();
	
			for(CompteBancaire o : client.getAllCompteBancaie() )
			{
				listCpte.add(CompteBancaireHelper.modelToDto(o));
			}*/
			ClientBanqueDto cdto= ClientBancaireHelper.modelToDto(cb);
			if(cdto.getListeCompte().size()>0)
			cdto.setListeCompte(null);
			 listCltDto.add(cdto);
		}
	}
	return listCltDto;
}
}
