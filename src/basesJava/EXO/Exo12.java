package basesJava.EXO;

import java.util.Scanner;
public class Exo12 {
    /*Ecrire un algorithme qui demande un nombre de départ, et qui
     ensuite affiche les dix nombres suivants. Par exemple, si l'utilisateur entre
     le nombre 17, le programme affichera les nombres de 18 à 27*/
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.print("Entrer un nombre : ");
        var nombre=input.nextInt();

        for (int i =nombre+1; i<=nombre+10; i++){
            System.out.println(i);
        }
    }
}
