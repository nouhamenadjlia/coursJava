import java.util.ArrayList;
import java.util.Scanner;

public class Exo21 {
    public static void main(String[] args) {
        /*Ecrire un programme Java demande à l'utilisateur de saisir  liste de langages de programmations à partir du clavier.
        Une fois le tableau rempli, l'utilisateur sera appelé à saisir les noms des langages qu'il souhaite retirer de liste.
        Le programme devra ensuite retirer ces langages et afficher l'état du tableau avant et après la suppression.*/

        ArrayList<String> langagesDeProgrammation=new ArrayList<>();

        System.out.println("Taille du tableau : "+langagesDeProgrammation.size());
        Scanner input=new Scanner(System.in);
        System.out.print("veilliez entrez le nom des languages de programmations : \n");

        int langagesDeProgrammationSize=5;
        for(int i = 0; i<=langagesDeProgrammationSize; i++){
            var saisie = input.nextLine();
            langagesDeProgrammation.add(saisie);

        }
        System.out.println(langagesDeProgrammation);
        System.out.println("Veuillez entrer le nom du programme à supprimer:");
        for(int i = 0; i<=langagesDeProgrammationSize; i++){
            var programmeDelete = input.nextLine();
            if(programmeDelete.contains(programmeDelete)){
            langagesDeProgrammation.remove(programmeDelete);
                System.out.println("l'element a bien ete supprimer");
            System.out.println(langagesDeProgrammation);
            }else {
                System.out.println("language entrer non valide");
            }
        }
    }
}
