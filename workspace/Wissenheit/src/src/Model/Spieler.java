package src.Model;


public class Spieler {
	String name;
	
	/**
	 * @directed true
	 * @supplierCardinality 4
	 */
	
	WissensStand stat;
	
	/**
	 * @directed true
	 * @supplierCardinality 3
	 */
	
	Streiter[] streiter;
	
	
	public String getName() {
		return name;
	}
}
