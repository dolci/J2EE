package tn.nauiit.managedBean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.context.FacesContext;

import tn.nauiit.dto.CompteBancaireDTO;
import tn.nauiit.serviceGestionCompte.GestionCompteBancaireLocal;


@ManagedBean 
@ViewScoped
public class CompteOperation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EJB
	GestionCompteBancaireLocal gestion;
	private Long rib;
	private Double montant;
	private Double solde;
	private Date dateCreation;
	private String nonClt;
	
	public Long getRib() {
		return rib;
	}
	public void setRib(Long rib) {
		this.rib = rib;
	}
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getNonClt() {
		return nonClt;
	}
	public void setNonClt(String nonClt) {
		this.nonClt = nonClt;
	}
	public void searchCompte()
	{
		System.out.println("\n ***** \n solde"+solde);
		solde=gestion.searchCompte(getRib()).getSolde();
		
		System.out.println("\n ***** \n solde"+solde);
	}
	public Double getSolde() {
		return solde;
	}
	public void setSolde(Double solde) {
		this.solde = solde;
	}
	public void versementMontant()
	{
		gestion.searchCompte(getRib()).setSolde(solde+montant);
		gestion.UpdateCpte(gestion.searchCompte(rib));
		setSolde(solde+montant);
	}
	public void retraitMontant()
	{
		
		gestion.searchCompte(getRib()).setSolde(solde-montant);
		gestion.UpdateCpte(gestion.searchCompte(rib));
		setSolde(solde-montant);
	}
	
}
