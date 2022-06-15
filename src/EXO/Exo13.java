import java.util.Scanner;
public class Exo13 {
    public static void main(String[] args) {
        /*Ecrire un programme Javascript qui permet à l'utilisateur de définir une adresse email et un mot de passe.
        Ensuite dans un second temps, il sera demandé à l'utilisateur de fournir l'email et le mot de passe:
        Si l'email et le mot de passe ne correspondent pas aux valeurs définies, le message "Identifiants incorrect
        devra s'afficher", et l'utilisateur devra recommencer la saisie des valeurs.
        Sinon, le message "Bienvenu dans votre espace client" devra s'afficher.*/


        var input=new Scanner(System.in);

        System.out.print("Veuillez saisir votre e-mail : ");
        var email = input.nextLine();
        System.out.print("Veuillez definir un code PIN : ");
        var codePIN=input.nextLine();

        while (codePIN.length()!=4){
            System.out.print("Code PIN : ");
            codePIN=input.nextLine();
            if(codePIN.length()!=4){
                System.out.println("Error : Le code PIN doit etre compose de 4 caracteres");
            }else{
                System.out.println("Code PIN defini avec succes");
            }
        }
        String codeATester = "";
        var emailATester ="";
        while (!codeATester.equals(codePIN) || !emailATester.equals(email) ) {
            System.out.print("Entrez votre email et code PIN pour deverouiller l'appareil : \n");
            System.out.println("email: ");
            emailATester = input.nextLine();
            System.out.println("code PIN : ");
            codeATester = input.nextLine();
            if(codeATester.equals(codePIN) & emailATester.equals(email)){
                System.out.println("Bienvenu dans votre espace client");
            }else{
                System.out.println("identifiants errone.Veuillez recommencer");
            }
        }


    }
}
