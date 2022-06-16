package POO.Exo2;
import POO.exo1.Personne;

import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Patients patient =new Patients();
        var input = new Scanner(System.in);
        System.out.println("veuillez remplir vos informations:");
        System.out.println("nom: ");
        patient.SetlastNom(input.nextLine());

        System.out.println("prenom: ");
        patient.SetPrenom(input.nextLine());

        System.out.println("age: ");
        patient.SetAge(input.nextByte());

        System.out.println("Poids: ");
        patient.setPoids(input.nextFloat());
        System.out.println("Taille: ");
        patient.setTaille(input.nextFloat());
        System.out.println("votre nom : "+patient.nomComplet()+" votre age est: "+patient.age+ " Votre indice IMC est : "+patient.calculIMC());
    }
}
