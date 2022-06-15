import java.util.Scanner;
public class Exo3 {
    public static void main(String[] args) {
        //recupere nom, prenom et age et les affiche
        Scanner saisieUtilisateur = new Scanner(System.in);
        System.out.println("Veuillez saisir votre age :");
        int age= saisieUtilisateur.nextInt();
        System.out.println("Veuillez saisir votre prenom:");
        String prenom= saisieUtilisateur.next();
        System.out.println("Veuillez saisir votre nom:");
        String nom = saisieUtilisateur.next();
        System.out.println("Vous vous appelez " + prenom + " " + nom + " et vous avez " + age + " ans.");
    }
}


