package basesJava.EXO;

import java.util.Scanner;
public class Exo14 {
    public static void main(String[] args) {
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

            for (  int i =5; i >=0 ; i--){
                if (i>0){
                    System.out.print("Entrez votre email et code PIN pour deverouiller l'appareil : \n");
                    System.out.println("email: ");
                    emailATester = input.nextLine();
                    System.out.println("code PIN : ");
                    codeATester = input.nextLine();
                    while (!codeATester.equals(codePIN) || !emailATester.equals(email) & i>0 ) {

                        if(codeATester.equals(codePIN) & emailATester.equals(email) & i > 0 ){
                            System.out.println("Bienvenu dans votre espace client");
                            break;
                        }else {
                            System.out.println("identifiants errone.\n Il vous reste "+(i-1)+" tantative");
                            break;
                        }
                    }
                }else if (i == 0) {
                    System.out.println("Vous avez saisi des mauvais identifiants " + i+ "fois, votre compte est bloqué");
                    break;
                }
            }
    }
}
