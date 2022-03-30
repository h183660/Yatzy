package no.hvl.dat109;

import java.util.Scanner;

import no.hvl.dat109.spiller.Spiller;
import no.hvl.dat109.yatzy.OppdateringUtility;
import no.hvl.dat109.yatzy.Yatzy;

public class Tekstbrukergrensesnitt {

  private static Yatzy yatzy; 
  private static Scanner sc = new Scanner(System.in);
  private static Spiller[] spillere;
  private static int tur;
  private static int runde;

  /**
  * Metode som kjører spillet
  **/
  public static void start(){
    lagSpillere();
    yatzy = new Yatzy(spillere);
    startSpill();
  }

  /**
  * Tar brukerinput for å bestemme spiller navn
  **/
  private static void lagSpillere(){
    System.out.println("Hvor mange spillere?");
    int antallSpillere = Integer.parseInt(sc.nextLine());

    spillere = new Spiller[antallSpillere];
    
    for(int i = 0; i < spillere.length; i++){
      System.out.println("Hva er navn på spiller " + (i+1));
      //spillere[i] = new Spiller(i, sc.nextLine());
    }
  }

  /**
  * Metode for hele spillet
  * Første 6 runder, så kalkulere bonus
  * Så resten av rundene
  * Finner en vinner til slutt
  **/
  private static void startSpill(){
    System.out.println(yatzy.getBrett().toString());

    int sum = 0;
    //6 første rundene
    for(runde = 0; runde < 6; runde++){
      System.out.println("Runde: " + runde);
      spillRunde();
    }

    //Bonus runde
    
    for(int i = 0; i < spillere.length; i++){
      yatzy.getBrett().setVerdi(7, i, OppdateringUtility.bonus(OppdateringUtility.sum(i, yatzy.getBrett())));
    }
    //Resten av spillet
    for( ; runde < 8+9; runde++){
      System.out.println("Runde: " + runde);
      spillRunde();
    }

    //Finn vinner


    
  }

  /**
  * Spiller runde for hver spiller
  **/
  private static void spillRunde(){
    for(tur = 0; tur < spillere.length; tur++){
      System.out.println(spillere[tur].getNavn() + " sin tur");
//      spillEnPerson(spillere[tur]);
      
      //Opdater sum
      yatzy.getBrett().setVerdi(6, tur, OppdateringUtility.sum(tur, yatzy.getBrett()));

      yatzy.getBrett().setVerdi(17, tur, OppdateringUtility.total(tur, yatzy.getBrett()));

      //Skriver ut brett
      System.out.println(yatzy.getBrett().toString());


      
      }
  }

  /**
  * Spiller en runde for 1 person
  * Gir brukeren mulighet til å skrive inn terninger som skal beholdes
  * <øø
  **/
//  private static void spillEnPerson(Spiller spiller){
//    for(int trill = 0; trill < 2; trill++){
//      spiller.spill();
//      System.out.println(spiller.getKopp().toString());
//      
//      System.out.println("Tast inn terninger å beholde separert med mellomrom");
//      String[] brukerInput = (sc.nextLine() + " ").split(" ");
//      
//      int[] terninger = new int[brukerInput.length];
//      for(int i = 0; i < terninger.length; i++){
//        terninger[i] = Integer.parseInt(brukerInput[i])-1;
//      }
//      spiller.behold(terninger);
//      
//    }
//    spiller.spill();
//    System.out.println(spiller.getKopp().toString());
//    spiller.reset();
//    yatzy.getBrett().setVerdi(runde,tur,OppdateringUtility.beregn(runde,spiller.getKopp().getTerninger()));
//
//  }

}