package POJO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Scanner;

public class Esercizio1 {

    private static final Logger logger = LoggerFactory.getLogger ( Esercizio1.class );
    private int[] myArray = new int[10];

    public Esercizio1() {
        setMyArray ();
    }

    public void setMyArray () {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int)Math.floor ( Math.random () * 10 + 1 );
        }
    }

    @Override
    public String toString () {
        return Arrays.toString ( myArray );
    }

    public int gameArray () {
        Scanner scanner = new Scanner ( System.in );

        int[] array = new int[10];

        System.out.println (" Inserisci la posizione da modificare" );


        int posizione = 0;
        boolean posizioneCheck = true;

        while (posizioneCheck) {
            try {
                 posizione = scanner.nextInt();
                if ( posizione < 0  || posizione > 10 ) {
                    logger.error ( "Posizione inserita non valida" );
                } else {
                    posizioneCheck = false;
                }
            } catch (Exception e) {
                System.out.println ( e.getMessage () );
                scanner.nextLine ();
            }
        }

        System.out.println ("Quale numero vuoi inserire alla posizione " + posizione + "?" );

        int elementoPrima = myArray[posizione];
        int elemento = scanner.nextInt ();

        try {
            if ( elemento < 0 || elemento > 10) {
                logger.error("Posizione inserita fuori dal range, array non modificato");
                elemento = elementoPrima;
            }

        } catch (Exception e) {
            logger.error("Errore durante l'inserimento dell'elemento, array non modificato");
        }


        for ( int i = 0; i < myArray.length; i++ ) {
            if ( i == posizione) {
                array[i] = elemento;
            } else {
                array[i] = myArray[i];
            }
        }
        myArray = array;
        System.out.println ("Ecco il tuo array!" + toString () );
        return elemento;
    }
}
