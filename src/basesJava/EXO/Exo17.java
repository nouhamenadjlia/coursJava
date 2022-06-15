import java.util.Scanner;

public class Exo17 {
    /*Ecrire un programme Java demande à l'utilisateur de saisir un text et qui ensuit, retourne la chaine inverse.*/
    public static void main(String[] args) {
        var input=new Scanner(System.in);

        System.out.print("Veuillez saisir un mot : ");
        var saisie  = input.nextLine();
        StringBuilder saisieB  = new StringBuilder(saisie );
        saisie = saisieB.reverse().toString();
        System.out.println(saisie);


//        System.out.println("Veuillez saisir du texte : ");
//
//        var text = input.nextLine();
//
//        var newText = "";
//
//        for (int i = text.length()-1 ; i >= 0 ; i--)
//        {
//            newText = newText + text.charAt(i);
//        }
//        System.out.printf("Le texte inverse est : %s", newText);

    }
}
