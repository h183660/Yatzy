package no.hvl.dat109.yatzy;

import no.hvl.dat109.spiller.Spiller;

public class Yatzy {
	private Brett brett;
	private Spiller[] spillere;

	public Yatzy(Spiller[] spillere) {
		this.spillere = spillere;
		brett = new Brett(spillere.length);
	}

	public Brett getBrett() {
		return brett;
	}

}