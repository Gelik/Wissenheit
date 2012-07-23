package src.Model;

import java.awt.Color;

public class Spieler {

	String name;

	Color farbe;

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

	public Color getFarbe() {
		return farbe;
	}

	public void setFarbe(Color farbe) {
		this.farbe = farbe;
	}

	public String getName() {
		return name;
	}

}
