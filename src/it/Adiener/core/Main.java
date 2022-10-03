package it.Adiener.core;


import POJO.Esercizio1;
import POJO.Esercizio2;

public class Main {
    public static void main(String[] args) {

//        ESERCIZIO 1
        Esercizio1 e1 = new Esercizio1();

        int check = -1;

        while (check != 0) {
            e1.gameArray ();
            System.out.println (e1.gameArray () );
            check = e1.gameArray();
        }


    }

}

