package basesJava.EXO;

import java.util.Scanner;

public class Exo19 {
    public static void main(String[] args) {
        /*Ecrire un programme java qui demande à
    l'utilisateur de remplir une matrice carré 4 x 4 et qui ensuite va calculer la somme des elements de la diagonale*/
        Scanner input=new Scanner(System.in);

        System.out.print("veilliez remplir le matrice : \n");
       int[][] matrice=new int[4 ][4];
        int somme =0;

        for(int i=0;i<matrice.length;i++){

            for(int j=0;j<matrice[i].length;j++){
                System.out.printf("matrice[%d][%d] : ",i,j);
                matrice[i][j]=input.nextInt();
                if(i ==j){
                    somme +=matrice[i][j];
                }
            }

        }

        System.out.println("Affichage de tout le tableau");
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] +" / ");
            }
            System.out.println();
        }

        System.out.printf("La somme de la premiere diagonale est  : %d .",somme);

    }

}
