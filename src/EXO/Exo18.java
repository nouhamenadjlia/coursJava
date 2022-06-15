import java.util.Scanner;

public class Exo18 {
    public static void main(String[] args) {
        /*TP 18.
        Ecrire un programme Java demande
        à l'utilisateur de saisir un text et qui ensuit, renseigne si celui est un palindrome(mot qui se lit de la même dans les 2 sens).*/

        var input=new Scanner(System.in);

        System.out.print("Veuillez saisir un mot : ");
        var saisie  = input.nextLine();

         String saisieClean =saisie.replaceAll("\\s+", "").toLowerCase();
        StringBuilder saisieB  = new StringBuilder(saisieClean );
        StringBuilder saisieReverse = saisieB.reverse();
        System.out.println(saisieReverse);

        if((saisieReverse.toString()).equals(saisieClean)){
            System.out.println("ce ci est un palindrome");
        }else{
            System.out.println("ce mot n'set pas un palindrome");
        }

//        System.out.println("Veuillez renseigner un mot : ");
//
//        var text = input.nextLine();
//
//        var newText = "";
//
//        for (int i = text.length()-1 ; i >= 0 ; i--)
//        {
//            newText = newText + text.charAt(i);
//        }
//
//        if (newText.equalsIgnoreCase(text))
//        {
//            System.out.printf("%s est un palindrome",text);
//        }
//        else
//        {
//            System.out.printf("%s n'est pas un palindrome",text);
//        }

    }
}
