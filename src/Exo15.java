import java.util.Scanner;
import java.util.regex.*;

public class Exo15 {
    public static void main(String[] args) {
        var input=new Scanner(System.in);

        System.out.print("Veuillez saisir votre e-mail : ");
        var email = input.nextLine();
        System.out.print("Veuillez definir un code PIN : ");
        var codePIN=input.nextLine();

        boolean checkNumeric =false;
        checkNumeric = codePIN.matches("[+-]?\\d*(\\.\\d+)?");


            while (codePIN.length()!=4 || !checkNumeric){
                System.out.print("Code PIN : ");
                codePIN=input.nextLine();
                if(codePIN.length()!=4 & !checkNumeric){
                    System.out.println("Error : Le code PIN doit etre compose de 4 caracteres numerique ");
                }else{
                    System.out.println("Code PIN defini avec succes");
                    break;
                }
            }


        String codeATester = "";
        var emailATester ="";

        int tantativeCodePin =5 ;


        for (  int i =5; i >0 ; i--){
            while (!codeATester.equals(codePIN) || !emailATester.equals(email) ) {
                System.out.print("Entrez votre email et code PIN pour deverouiller l'appareil : \n");
                System.out.println("email: ");
                emailATester = input.nextLine();
                System.out.println("code PIN : ");
                codeATester = input.nextLine();

                if(codeATester.equals(codePIN) & emailATester.equals(email) & i > 0 ){
                    System.out.println("Bienvenu dans votre espace client");
                    break;
                }else if (i == 0){

                    System.out.println("Vous avez saisi des mauvais identifiants " + i+ "fois, votre compte est bloqué");
                    break;
                }else {
                    System.out.println("identifiants errone.Veuillez recommencer.\n Il vous reste "+(i-1)+"tantative");
                    break;
                }
            }
        }
    }
}
