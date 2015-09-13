package tn.nauiit.service.calc;

import javax.ejb.Local;

@Local
public interface CalculatriceLocal {
	double som(double x, double y);// somme

	double mult(double x, double y);// multiplication

	double sous(double x, double y);// soustraction
}
