package no.hvl.dat109.yatzy;

public class OppdateringUtility{

	   public static int beregn(int runde, int[] terninger){
	     int sum = 0;
	     switch(runde){
	       case 0:
	         sum = enere(terninger);
	         break;
	       case 1:
	         sum =  toere(terninger);
	         break;
	      case 2:
	         sum =  treer(terninger);
	         break;
	      case 3:
	         sum =  firere(terninger);
	         break;
	      case 4:
	         sum =  femere(terninger);
	         break;
	      case 5:
	         sum =  seksere(terninger);
	         break;
	      case 8:
	         sum = etPar(terninger);
	         break;
	      case 9:
	         sum = toPar(terninger);
	         break;
	      case 10:
	         sum = treLike(terninger);
	         break;
	      case 11:
	         sum = fireLike(terninger);
	         break;
	      case 12:
	         sum = litenStraight(terninger);
	         break;
	      case 13:
	         sum = storStraight(terninger);
	         break;
	      case 14:
	         sum = hus(terninger);
	         break;
	      case 15:
	         sum = sjanse(terninger);
	         break;
	      case 16:
	         sum = yatzy(terninger);
	         break;
	         
	       default:
	         break;
	      
	     }

	     if(sum == 0){
	       return -1;
	     }
	     return sum;
	   }
	   
	  /**
	  * Hvis terningen viser 1
	  */
	    public static int enere(int[] terning){
	        int sum = 0;
	        for(int i=0; i < terning.length; i++){
	             if(terning[i] == 1){
	              sum += 1;
	              }
	        }
	        return sum;
	    }
	  
	  /**
	  *Hvis terningen viser 2
	  */
	  public static int toere(int[] terning){
	    int sum = 0;
	        for(int i=0; i < terning.length; i++){
	             if(terning[i] == 2){
	              sum += 2;
	              }
	        }
	        return sum;
	  }
	  
	  /**
	  *Hvis terningen viser 3
	  */
	  public static int treer(int[] terning){
	    int sum = 0;
	        for(int i=0; i < terning.length; i++){
	             if(terning[i] == 3){
	              sum += 3;
	              }
	        }
	        return sum;
	  }
	  
	  /**
	  *Hvis terningen viser 4
	  */
	  public static int firere(int[] terning){
	    int sum = 0;
	        for(int i=0; i < terning.length; i++){
	             if(terning[i] == 4){
	              sum += 4;
	              }
	        }
	        return sum;
	  }
	  
	  /**
	  *Hvis terningen viser 5
	  */
	  public static int femere(int[] terning){
	    int sum = 0;
	        for(int i=0; i < terning.length; i++){
	             if(terning[i] == 5){
	              sum += 5;
	              }
	        }
	        return sum;
	  }
	/**
	*Hvis terningen viser 6
	*/
	    public static int seksere(int[] terning){
	        int sum = 0;
	        for(int i=0; i < terning.length; i++){
	            if(terning[i] == 6){
	                sum += 6;
	            }
	        }
	        return sum;
	    }

	  
	//DEL 2 AV BRETTET
	  /**
	  *Hvis spilleren sin score er mer enn 63 poeng blir det lagt inn 50 ekstra poeng
	  */

	   

	  
	  /**
	  *Hvis spilleren triller to like terninger
	  */
	  public static int etPar(int[] terning){
	    //forslag:
	    int[] teller = new int[6];
	    for (int i = 0; i < terning.length; i++){
	      teller[terning[i]-1] += 1;
	    }
	    
	    for(int i = teller.length-1; i >= 0; i--){
	      if(teller[i] >= 2){
	        return 2*(i+1);
	      }
	    }
	    return 0;
	  }

	   /**
	  *Hvis spilleren triller to like terninger og to like terninger av en annen verdi
	  */
	  public static int toPar(int[] terning){
	     //forslag:
	    int[] par = new int[6];
	    for (int i = 0; i < terning.length; i++){
	      par[terning[i]-1] += 1;
	    }

	    int par1 = 0;
	    int par2 = 0;
	    for (int i = 0; i < par.length; i++){
	      if (par[i] >= 2){
	        par2 = par1;
	        par1 = i+1;
	      }
	    }
	    if(par1 != 0 && par2 != 0){
	      return (par1*2) + (par2*2);
	    }
	    
	  return 0;

	}


	/**
	  * hvis en spiller triller Tre like terninger
	  */
	  public static int treLike(int[] terning) {
	    //forslag:
	    int[] teller = new int[6];
	    for (int i = 0; i < terning.length; i++){
	      teller[terning[i]-1] += 1;
	    }

	    for(int i = teller.length-1; i >= 0; i--){
	      if(teller[i] >= 3){
	        return 3*(i+1);
	        }
	      }
	    return 0;
	  }


	/**
	  * hvis en spiller triller fire like terninger
	  */
	  public static int fireLike(int[] terning) {
	  //forslag
	    int[] teller = new int[6];
	    for (int i = 0; i < terning.length; i++){
	      teller[terning[i]-1] += 1;
	      }
	    
	    for (int i = teller.length-1; i >= 0; i--){
	      if (teller[i] >= 4){
	        return 4*(i+1);
	      }
	    }

	     return 0;
	    
	  }


	  
	  /**
	  * hvis en spiller har 1,2,3,4,5
	  */
	  public static int litenStraight(int[] terning){
	    int[] teller = new int[6];
	    for (int i = 0; i < terning.length; i++){
	      teller[terning[i]-1] += 1;
	    }

	    //Løkken går fra 1-5, hvis en av disse har fått verdi mindre enn 1, return 0
	    for(int i = 0; i < teller.length-1; i++){
	      if(teller[i] < 1){
	        return 0;
	      }
	   }
	    return 15;
	    
	  }

	  
	  /**
	  * hvis en spiller har 2,3,4,5,6
	  */
	  public static int storStraight(int[] terning){
	    //forslag:
	    int[] teller = new int[6];
	    for (int i = 0; i < terning.length; i++){
	      teller[terning[i]-1] += 1;
	    }
	    //Løkken går fra 2-6, hvis en av disse har fått verdi mindre enn 1, return 0
	    for(int i = 1; i < teller.length; i++){
	      if(teller[i] < 1){
	        return 0;
	      }
	   }
	    return 20;
	  }
	  

	  /**
	  * Hus, 3 av en verdi kombinert med 2 av en annen verdi
	  */
	  public static int hus(int[] terning){
	    
	    int[] teller = new int[6];
	    for (int i = 0; i < terning.length; i++){
	      teller[terning[i]-1] += 1;
	    }

	    int trelike = 0;
	    int tolike = 0;
	    for (int i = 0; i < teller.length; i++){
	      if (teller[i] >= 3){
	        trelike = i+1;
	        continue;
	        }
	      if(teller[i] >= 2){
	        tolike = i+1;
	        }
	    }
	    if(trelike != 0 && tolike != 0){
	      return (trelike*3) + (tolike*2);
	    }

	    return 0;
	  }


	  /**
	  * sjanse, hva enn en spiller får
	  */
	  public static int sjanse(int[] terninger){
	    int sum = 0;

	    for(int verdi : terninger){
	      sum += verdi;
	    }
	    
	    return sum;
	  }


	  /**
	  *Yatze, om en spiller får 5 av samme terning
	  */
	  public static int yatzy(int[] terninger){
	    int verdi = terninger[0];
	    
	    for(int i = 1; i < terninger.length; i++){
	      if(verdi != terninger[i]){
	        return 0;
	      }
	    }
	    return 50;
	  }

	   /**
	  * Regner ut sum fra 6 første runder
	  **/
	   public static int sum(int spillerID, Brett brett){
	     int spillerSum = 0;
	     int brettVerdi = 0;
	     for(int i = 0; i < 6; i++){
	       brettVerdi = brett.getRuteNR(i, spillerID);
	       spillerSum += brettVerdi == -1 ? 0 : brettVerdi;
	     }
	     return spillerSum == 0 ? -1 : spillerSum;
	   }

	   public static int bonus(int sum){
	     return sum >= 63 ? 50 : -1;
	   }

	    /**
	  * Regner ut total verdi for en spiller
	  **/
	   public static int total(int spillerID, Brett brett){
	     int spillerTotalSum = 0;

	     //Henter bonus
	     int bonus = brett.getRuteNR(6, spillerID);
	     //Henter sum fra 6 første
	     int sum = brett.getRuteNR(7, spillerID);

	     spillerTotalSum += bonus == -1 ? 0 : bonus;
	     spillerTotalSum += sum == -1 ? 0 : sum;
	     

	     int brettVerdi = 0;
	     //Verdi for siste rutene
	     for(int i = 8; i <  8+8; i++){
	       brettVerdi = brett.getRuteNR(i, spillerID);
	       spillerTotalSum += brettVerdi == -1 ? 0 : brettVerdi;
	     }

	     return spillerTotalSum == 0 ? -1 : spillerTotalSum;
	   }
	   
	  
	}

	    