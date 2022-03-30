package no.hvl.dat109.yatzy;

/**
 * Definerer en kopp med terninger.
 * 
 * @author 
 */
public class Kopp {
	private final static int ANTALL_TERNINGER = 5;
	private Terning[] terninger;

	/**
	 * Lager en ny kopp med default antall terninger.
	 */
	public Kopp() {
		this.terninger = new Terning[ANTALL_TERNINGER];
		for (int i = 0; i < ANTALL_TERNINGER; i++) {
			terninger[i] = new Terning();
		}
	}

	/**
	 * Lager en ny kopp med gitt antall terninger.
	 * 
	 * @param antall antall ternigner
	 */
	public Kopp(Integer antall) {
		terninger = new Terning[antall];
		for (int i = 0; i < antall; i++) {
			terninger[i] = new Terning();
		}
	}

	/**
	 * Triller alle terningene.
	 */
	public void trill() {
		for (Terning terning: terninger) {
			if(!terning.erBeholdt()){
				terning.trill();
			}
			
		}
	}

	/**
	 * Metoden setter alle terningene som skal beholdes til true, og de som ikke er oppgitt til false
	 * @param terninger, array av terning posisjon som skal beholdes
	 */
	public void setBehold(int[] terninger){
		String beholdString = "";
		for(int i = 0; i < terninger.length; i++){
			beholdString += terninger[i] + "";
		}
	
		for(int i = 0; i < ANTALL_TERNINGER; i++){
			if(beholdString.contains(Integer.toString(i))){
				this.terninger[i].behold(true);
				continue;
			}
			this.terninger[i].behold(false);
			
		}
		
	}

  public void reset(){
    for(int i = 0; i < ANTALL_TERNINGER; i++){
      terninger[i].behold(false);
    }
  }

	/**
	 * Henter verdiene til terningene
	 */
	public int[] getTerninger(){
  	int[] tall = new int[terninger.length];
  	for(int i = 0; i < terninger.length; i++){
    		tall[i] = terninger[i].getVerdi();
  	}
    return tall;
	}

  public int getSum(){
    int tall = 0;
  	for(int i = 0; i < terninger.length; i++){
    		tall += terninger[i].getVerdi();
  	}
    return tall;
  }

  public String toString(){
    String tekst = "";
    
    for(int i = 0; i < terninger.length; i++){
      tekst += "Terning nr: " + (i+1) + "\t";
  		tekst += terninger[i].toString();
      tekst += "\n";
  	}
    
    return tekst;
  }
}