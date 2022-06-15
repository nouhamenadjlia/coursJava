import java.util.Scanner;

public class Exo20 {
    public static void main(String[] args) {
    /*TP 20.
    A partir du TP précédent, ajouter le calcul de la somme de 2 diagonales*/
        Scanner input=new Scanner(System.in);

        System.out.print("veilliez remplir le matrice : \n");
        int nombreDelignes =4;
        int nombreDeColonne=4;
        int somme =0;
        int somme2 =0;
        int[][] matrice=new int[nombreDelignes ][nombreDeColonne];
        for(int i=0;i<matrice.length;i++){

            for(int j=0;j<matrice[i].length;j++){
                System.out.printf("matrice[%d][%d] : ",i,j);
                matrice[i][j]=input.nextInt();
                if(i ==j){
                    somme +=matrice[i][j];
                }
            }
            for( int k = matrice.length-1; k >= 0; k--){
                if(i+k == matrice.length-1){
                    somme2 +=matrice[i][k];
                }
            }
        }
        System.out.println("la somme est :"+somme);
        System.out.println("la somme 2 est :"+somme2);
    }
}
