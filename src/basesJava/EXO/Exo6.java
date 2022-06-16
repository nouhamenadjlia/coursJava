package basesJava.EXO;

import java.util.Scanner;
public class Exo6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Entrez un nombre entier:");
        int nombreEntier=input.nextInt();
//        System.out.println(nombreEntier);

        if(nombreEntier>0 && nombreEntier% 2 ==0 || nombreEntier ==0 ){
            System.out.println("Le nombre est positif et pair.");
        } else if (nombreEntier>0 && nombreEntier% 2 !=0 ) {
            System.out.println("Le nombre est positif et impair.");
        }else if (nombreEntier<0 && nombreEntier% 2 == 0) {
            System.out.println("Le nombre est negatif et pair.");
        }else{
            System.err.println("Le nombre entrer n'est pas un nombre entier");
        }

//        Ecrivez un programme Java qui lit un nombre et indique s'il est positif, négatif ou s'il vaut zéro et s'il est pair ou impair.
//        Exemple d'exécution:
//        Entrez un nombre entier: 5
//        Le nombre est positif et impair
//        Entrez un nombre entier: -4
//        Le nombre est négatif et pair
//        Entrez un nombre entier: 0
//        Le nombre est zéro (et il est pair)

    }
}
