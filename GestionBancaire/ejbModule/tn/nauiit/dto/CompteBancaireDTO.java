package tn.nauiit.dto;

import java.io.Serializable;
import java.util.Date;



public class CompteBancaireDTO implements Serializable{
	
	private long rib;
	private double solde;
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
	/*public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}*/
	
	public CompteBancaireDTO() {}
	public CompteBancaireDTO(double solde)
	{
		this.solde = solde;
	//	this.dateCreation = dateCreation;
	}

}
