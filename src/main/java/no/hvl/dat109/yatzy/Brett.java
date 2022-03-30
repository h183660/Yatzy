package no.hvl.dat109.yatzy;

public class Brett {

	private String[] rader = { "Enere: ", "Toere:", "Treere:", "Firere:", "Femmere:", "Seksere:", "Sum:", "Bonus:",
			"Ett par:", "To par:", "Tre like:", "Fire like:", "Liten Straight:", "Stor Straight:", "Hus:", "Sjanse:",
			"Yatzy:", "Total:" };

	private int HOYDE = 18;
	private int BREDDE;
	private int[][] brett;
	private final int INGEN_VERDI = 0;
	private final int STRYK = -1;

	public Brett(int antallSpiller) {
		BREDDE = antallSpiller;
		brett = new int[HOYDE][BREDDE];
	}

//Henter ruten i tabellen
	public int getRuteNR(int rad, int rekke) {
		return brett[rad][rekke];
	}

//setter verdien inn i ruten når man har fullført en runde
	public void setVerdi(int rad, int rekke, int sumKast) {
		brett[rad][rekke] = sumKast;
	}

	/**
	 * Grafisk syn på tabellen
	 */
	public String toString() {
		String brettString = "";

		// String.format("%-20s", );
		for (int i = 0; i < HOYDE; i++) {
			brettString += String.format("%-20s", rader[i]);

			for (int j = 0; j < BREDDE; j++) {

				if (brett[i][j] == INGEN_VERDI) {
					brettString += String.format("%-10s", ":(");
					continue;
				}
				if (brett[i][j] == STRYK) {
					brettString += String.format("%-10s", "0");
					continue;
				}
				brettString += String.format("%-10s", brett[i][j]);

			}
			brettString += "\n";

		}

		return brettString;
	}

}

