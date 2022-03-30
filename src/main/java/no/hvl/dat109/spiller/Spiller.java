package no.hvl.dat109.spiller;

import java.util.Set;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import com.google.gson.Gson;
import no.hvl.dat109.passord.Passord;
import no.hvl.dat109.yatzy.Kopp;
import no.hvl.dat109.yatzy.Yatzy;

@Entity
@Table(name = "spiller", schema = "yatzy")
public class Spiller implements Comparable<Spiller> {

	@Id
	private String brukernavn;
	private String navn;
	private String epost;
	@Embedded
	private Passord passordhash;
	
	@ManyToMany(mappedBy = "spillere")
	private Set<Yatzy> yatzy;

	public Spiller() {

	}

	public Spiller(String brukernavn, String navn, String epost, Passord passordhash) {
		this.brukernavn = brukernavn;
		this.navn = navn;
		this.epost = epost;
		this.passordhash = passordhash;
	}

	public String getBrukernavn() {
		return brukernavn;
	}

	public String getNavn() {
		return navn;
	}

	public String getEpost() {
		return epost;
	}

	public Passord getPassord() {
		return passordhash;
	}

	public void setBrukernavn(String brukernavn) {
		this.brukernavn = brukernavn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public void setEpost(String epost) {
		this.epost = epost;
	}

	public void setPassord(Passord passordhash) {
		this.passordhash = passordhash;
	}

	public void spill(Kopp kopp) {
		kopp.trill();
	}

	public void behold(Kopp kopp, int[] terninger) {
		kopp.setBehold(terninger);
	}

	public void reset(Kopp kopp) {
		kopp.reset();
	}

	@Override
	public boolean equals(Object obj) {
		Spiller other = (Spiller) obj;
		return this.getBrukernavn().equals(other.getBrukernavn());
	}

	@Override
	public int compareTo(Spiller that) {
		return this.getBrukernavn().compareTo(that.getBrukernavn());
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}