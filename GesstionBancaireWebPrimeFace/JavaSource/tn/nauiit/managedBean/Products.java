package tn.nauiit.managedBean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import tn.nauiit.dto.ClientBanqueDto;
import tn.nauiit.model.Product;
import tn.nauiit.serviceGestionCompte.GestionCompteBancaireLocal;

@ManagedBean
@SessionScoped
public class Products {

	/*class Produit
	{
		private String key;
	    private String qte; 
	 
	    public String getKey() {
	        return key;
	    }
	 
	    public void setKey(String key) {
	        this.key = key;
	    }
	 
	    public String getValue() {
	        return key;
	    }
	 
	    public void setValue(String value) {
	        this.key = value;
	    }
	}
	private Product p;*/
	private ArrayList<Products>  cacheList;
    
	@EJB
	GestionCompteBancaireLocal clDao;

	private List<Product> listprod = null;
    
	@PostConstruct
	public void getListClient() {

		setListprod(clDao.getAllProducts());
		// System.out.println(" ******nbre client *** "+listClt.size());

	}
    public void clear() {
          
        cacheList.clear();
     
    }
    public List getCacheList() {
        return cacheList;
    }
	/*public Product getP() {
		return p;
	}
	public void setP(Product p) {
		this.p = p;
	}*/
	public List<Product> getListprod() {
		return listprod;
	}
	public void setListprod(List<Product> listprod) {
		this.listprod = listprod;
	}
	public void setCacheList(java.util.ArrayList cacheList) {
		this.cacheList = cacheList;
	}
 
}
