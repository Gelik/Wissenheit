package src.Controller;

import src.Model.Fassade;
import src.Model.Kategorie;
import src.Model.Kategorien;
import src.Model.Spieler;
import src.Model.Spielfeld;

public class Game {

	private Fassade lnkFassade;
	/**
	 * @link composition
	 */
	private Spielfeld lnkSpielfeld1;

	/**
	 * @directed true
	 * @link composition
	 * @supplierCardinality 2..4
	 */
	Spieler[] players;
	
	
	
	private Kategorien lnkKategorien;
	/**
	 * @supplierCardinality 4
	 */

	private Kategorie lnkKategorie;

	boolean newPlayer() {
		//Commented automatically
		//return;
		return false;
	}

	public void kategorieSetzen() {
		return;
	}

	public boolean chooseWissensstreiter() {
		return false;

	}

	public void moveWissensstreiter() {
		return;
	}

	public int wuerfeln() {
		return 0;
	}

	public Spieler[] getPlayers() {
		return players;
	}

	public void setPlayers(Spieler[] property1) {
		this.players = property1;
	}
}
