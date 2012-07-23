package src.Controller;

import src.Model.Fassade;
import src.Model.Kategorie;
import src.Model.Kategorien;
import src.Model.Spieler;
import src.Model.Spielfeld;

public class Game {

	private Fassade lnkFassade;
	/**
	 * @supplierCardinality 2..4
	 */
	Spieler[] players;
	
	
	
	private Kategorien lnkKategorien;
/**
	 * @supplierCardinality 4
	 */

	private Kategorie lnkKategorie;
	private Spielfeld lnkSpielfeld;

	boolean newPlayer() {
		//Commented automatically
		//return;
		return false;
	}

	public void kategorieSetzen() {
		return;
	}

	public void chooseWissensstreiter() {

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
