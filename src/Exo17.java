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

    }
}
