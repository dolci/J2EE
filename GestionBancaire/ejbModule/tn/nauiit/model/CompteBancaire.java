package tn.nauiit.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class CompteBancaire implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long rib;
	private double solde;
	@JoinColumn
	ClientBanque client;
	//private Date dateCreation;
	
	
	/**
	 * @return the rip
	 */
	public long getRib() {
		return rib;
	}
	/**
	 * @param rip the rip to set
	 */
	public void setRib(long rib) {
		this.rib = rib;
	}
	/**
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	/**
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	/**
	 * @return the dateCreation
	 */
	/*public Date getDateCreation() {
		return dateCreation;
	}
	/**
	 * @param dateCreation the dateCreation to set
	 */
/*	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	*/
	public CompteBancaire() {}
	
	public CompteBancaire(double solde)
	{
		
		//this.dateCreation = dateCreation ;
		this.solde = solde ;
		
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
