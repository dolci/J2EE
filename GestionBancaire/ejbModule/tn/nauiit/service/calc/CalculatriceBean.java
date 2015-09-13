package tn.nauiit.service.calc;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class CalculatriceBean
 */
@Stateless
public class CalculatriceBean implements CalculatriceRemote, CalculatriceLocal {

	/**
	 * Default constructor.
	 */
	public CalculatriceBean() {
		// TODO Auto-generated constructor stub
	}

	public double som(double x, double y) {
		
		return x + y;
	}

	public double mult(double x, double y) {
		
		return x * y;
	}

	public double sous(double x, double y) {
	
		return x - y;
	}
}
