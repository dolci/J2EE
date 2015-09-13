package tn.nauiit.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;


public class ClientBanqueDto implements Serializable {
	
	private String cin;
	private String nom;
	private String prenom;
	private String adresse;
	private Collection<CompteBancaireDTO> listeCompte;
	
	public ClientBanqueDto() {
		
		listeCompte=new ArrayList <CompteBancaireDTO> ();
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
	public Collection<CompteBancaireDTO> getListeCompte() {
		return listeCompte;
	}
	/**
	 * @param listeCompte the listeCompte to set
	 */
	public void setListeCompte(Collection<CompteBancaireDTO> listeCompte) {
		this.listeCompte = listeCompte;
	}
	
	
	public ClientBanqueDto(String cin, String nom, String prenom, String adresse) {
		
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		listeCompte=new ArrayList <CompteBancaireDTO> ();
	}
	
}
