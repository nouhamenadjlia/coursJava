import java.util.Scanner;

public class Exo19 {
    public static void main(String[] args) {
        /*Ecrire un programme java qui demande à
    l'utilisateur de remplir une matrice carré 4 x 4 et qui ensuite va calculer la somme des elements de la diagonale*/
        Scanner input=new Scanner(System.in);

        System.out.print("veilliez remplir le matrice : \n");
        int nombreDelignes =4;
        int nombreDeColonne=4;
        int somme =0;
        int[][] matrice=new int[nombreDelignes ][nombreDeColonne];
        for(int i=0;i<matrice.length;i++){

            for(int j=0;j<matrice[i].length;j++){
                System.out.printf("matrice[%d][%d] : ",i,j);
                matrice[i][j]=input.nextInt();
                if(i ==j){
                    somme +=matrice[i][j];
                }
            }

        }
        System.out.println("la somme est :"+somme);

    }
}
