package POO.exo1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        var input = new Scanner(System.in);

     //    Personne personne = new Personne();

//        System.out.println("Veuillez saisir un prenom : ");
//
//        personne.firstName = input.nextLine();
//
//        System.out.println("Veuillez saisir un nom : ");
//
//        personne.lastName = input.nextLine();
//
//        System.out.println("Veuillez saisir votre pays : ");
//
//        personne.country = input.nextLine();
//
//        System.out.println("Etes vous marrie ?");
//
//        String marriedQuestion = input.nextLine();
//
//        if (marriedQuestion.equalsIgnoreCase("Oui"))
//        {
//            personne.married = true;
//        }
//        else
//        {
//            personne.married  = false;
//        }
//
//        System.out.println("Combien d'enfants avez-vous ?");
//
//        personne.numberChildren = input.nextByte();
//
//        System.out.printf("Vous etes %s, vous venez de %s.\n",
//                personne.nomComplet(),personne.country);
//
//        System.out.println("Vous "+(personne.married?"etes marie":"n'etes pas marie")
//                +" et vous avez " +personne.numberChildren +" enfant.");
     Personne personne=new Personne("nouha", "menadjlia", "france", true, (byte) 0);
        System.out.println("veuillez remplir vos informations:");
        System.out.println("firstName: ");
        personne.setfirstName(input.nextLine());

        System.out.println("lastName: ");
        personne.SetlastName(input.nextLine());
        System.out.println("pays: ");
        personne.Setpays(input.nextLine());
        System.out.println("nombre d'enfants: ");
        personne.SetnombreEnfants(input.nextByte());

        System.out.println("etes vous marrier: ");

     String marriedQuestion = input.nextLine();

     if (marriedQuestion.equalsIgnoreCase("Oui"))
     {
      personne.setetesMarrier(true);
     }else{
      personne.setetesMarrier(false);
     }

        System.out.println("Votre etes"+personne.nomComplet()+ " Vous venez de "+personne.pays+" et vous etes "+
               "Vous "+(personne.etesMarrier?"etes marie(e).":"n'etes pas marie(e).")+ "vous avez "+personne.nombreEnfants);
    }


}
