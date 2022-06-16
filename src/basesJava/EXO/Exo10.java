package basesJava.EXO;

import java.util.Scanner;
public class Exo10 {
    public static void main(String[] args) {
        /*Écrivez un programme Tables.java affichant les tables de multiplication de 2 à 10.
        Votre programme devra produire la sortie suivante à l'écran : */

        for(int i =2 ; i<=10; i++){
            System.out.println("");
            System.out.println("Table de multiplication de : "+i);

            for(int j=0; j<=10; j++){

                System.out.println(i+"x"+j+"="+j*j);
            }
        }

    }
}
