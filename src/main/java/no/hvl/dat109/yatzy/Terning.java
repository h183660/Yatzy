package no.hvl.dat109.yatzy;

/**
*Definerer en spillebrikke som gir oss en verdi fra 1 til 6
**/
public class Terning {
  int verdi;
	boolean behold;

  public Terning() {
    verdi = -1;
	  behold = false;
  }

  /**
  * Metode for å trille en terning
  **/
    public int trill() {
      verdi =(int)(Math.random()*6+1);
      return verdi;
  }

  public int getVerdi(){
    return verdi;
  }
  /**
  * Metode for å beholde terningen.
  **/
	public void behold(boolean skalBeholdes){
    this.behold = skalBeholdes;
	}
/**
* Metode for å sjekke om en terning er beholdt eller ikke.
**/
  public boolean erBeholdt() {
    return behold;
  }

  public String toString(){
    return "Verdi: " + verdi + "; Beholdt: " + behold;
  }
  
}

