package no.hvl.dat109.yatzy;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import no.hvl.dat109.spiller.Spiller;

@Entity
@Table(name = "yatzy", schema = "yatzy")
public class Yatzy {
	
	@Id
	private String id;
	private Integer antall;
	private Brett brett;
	
	@ManyToMany
	@JoinTable(
			name = "spilldeltagelse",
			joinColumns = @JoinColumn(name = "id"),
			inverseJoinColumns = @JoinColumn(name = "brukernavn"))
	private Set<Spiller> spillere;
	
	public Yatzy() {
		
	}

	public Yatzy(Spiller[] spillere) {

	}

	public Brett getBrett() {
		return brett;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getAntall() {
		return antall;
	}

	public void setAntall(Integer antall) {
		this.antall = antall;
	}

	public Set<Spiller> getSpillere() {
		return spillere;
	}

	public void setSpillere(Set<Spiller> spillere) {
		this.spillere = spillere;
	}

	public void setBrett(Brett brett) {
		this.brett = brett;
	}
	
	

}