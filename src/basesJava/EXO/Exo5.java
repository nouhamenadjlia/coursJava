package basesJava.EXO;

import java.util.Scanner;
public class Exo5 {
    public static void main(String[] args) {
        //recupere nom, prenom et age et les affiche
        Scanner saisieUtilisateur = new Scanner(System.in);
        System.out.println("Veuillez saisir votre age :");
        int age= saisieUtilisateur.nextInt();
        int naissance = 2022 - age;
        if (age>0){
            System.out.println("votre annee de naissance est "+naissance);
        }else{
            System.out.println("Veuillez saisir votre age :");
            age= saisieUtilisateur.nextInt();
            naissance = 2022 - age;
            System.out.println("votre annee de naissance est "+naissance);
        }

    }
}
