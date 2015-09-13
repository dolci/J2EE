package tn.nauiit.helper;

import tn.nauiit.dto.CompteBancaireDTO;
import tn.nauiit.model.CompteBancaire;

public class CompteBancaireHelper {
/***
 * 
 * @param c
 * @return
 */
	public static CompteBancaireDTO modelToDto(CompteBancaire c) {
		CompteBancaireDTO cb = new CompteBancaireDTO();
		cb.setRib(c.getRib());
		cb.setSolde(c.getSolde());
		return cb;
	}
/**
 * 
 * @param c
 * @return
 */
	public static CompteBancaire dtoToModel(CompteBancaireDTO c) {
		CompteBancaire cb = new CompteBancaire();
		cb.setRib(c.getRib());
		cb.setSolde(c.getSolde());
		return cb;
	}
}
