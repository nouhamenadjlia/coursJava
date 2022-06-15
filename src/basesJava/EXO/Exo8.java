import java.util.Scanner;
public class Exo8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Entrez un nombre entier:");
        int nombreEntier=input.nextInt();


        if(nombreEntier>=1 & nombreEntier <=12){
            switch (nombreEntier) {
                case 1:
                    System.out.println("Janvier");
                    break;
                case 2:
                    System.out.println("Fevrier");
                    break;
                case 3:
                    System.out.println("Mars");
                    break;
                case 4:
                    System.out.println("Avril");
                    break;
                case 5:
                    System.out.println("Mai");
                    break;
                case 6:
                    System.out.println("Juin");
                    break;
                case 7:
                    System.out.println("Juillet");
                    break;
                case 8:
                    System.out.println("Aout");
                    break;
                case 9:
                    System.out.println("Septembre");
                    break;
                case 10:
                    System.out.println("Octobre");
                    break;
                case 11:
                    System.out.println("Novembre");
                    break;
                case 12:
                    System.out.println("decembre");
                    break;
            }

        }else{
            System.out.println("entrer un nombre entre 1 et 12");

        }

//        Exercice 9
//        Ecrire un programme qui permet à l'utilisateur de saisir un entier entre 1 et 12 et qui affiche le nom du mois correspondant.
//
//        Ex:
//        Mois : 4
//        Résult : Avril
//
//        Pour cet exercices, vous devez aussi présenter une version qui utilise le sélecteur de cas(à trouver sur internet)

    }
}
