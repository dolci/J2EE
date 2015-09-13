package tn.nauiit.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class ClientBanque implements Serializable{
    
	
	@Id
	private String cin;
	private String nom;
	private String prenom;
	private String adresse;
	@OneToMany
    @JoinColumn(name="cin_client", referencedColumnName="cin")
	private Collection <CompteBancaire> listeCompte;
	
	public ClientBanque() {
		
	 listeCompte=new ArrayList <CompteBancaire> ();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the cin
	 */
	public String getCin() {
		return cin;
	}
	/**
	 * @param cin the cin to set
	 */
	public void setCin(String cin) {
		this.cin = cin;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}
	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	/**
	 * @return the listeCompte
	 */
	public Collection<CompteBancaire> getListeCompte() {
		return listeCompte;
	}
	/**
	 * @param listeCompte the listeCompte to set
	 */
	public void setListeCompte(Collection<CompteBancaire> listeCompte) {
		this.listeCompte = listeCompte;
	}
	public ClientBanque(String cin, String nom, String prenom, String adresse) {
		
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	    listeCompte=new ArrayList <CompteBancaire> ();
	}
	
	public boolean equals(Object otherOb) /* mehtode a redefinir selon la specifiation J2EE*/
	{
		return true;
	}
	public int hashCode() /* mehtode a redefinir selon la specifiation J2EE*/
	{
		return 0;
	}
}
