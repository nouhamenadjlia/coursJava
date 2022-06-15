import java.util.Scanner;
public class Exo16 {
    public static void main(String[] args) {
       /* Ecrire un programme Java qui permet à l'utilisateur de déclarer 3 array d'entiers.
        Ces tableaux ne doivent pas forcément avoir la même taille.
        Le programme doit ensuite fournir afficher les 3 tableaux en format [element1, element2,...,elementN] et la somme
        de tous les éléments multiples 3 dans les 3 tableaux.
        */
        var input = new Scanner(System.in);
        System.out.println("Combien d'elements dans T1?");

        var  taille1=input.nextInt();//7

       int[] tableauT1=new int[taille1];

//        System.out.println("Combien d'elements dans T2?");
//        int tailleT2=input.nextInt();
//        int[] tableauT2=new int[tailleT2];
//
//        System.out.println("Combien d'elements dans T3?");
//        int tailleT3=input.nextInt();
//        int[] tableauT3=new int[tailleT3];
//
//
//
//        int[][] tableauFinal = {tableauT1, tableauT2, tableauT3};
//        for(int i =0; i<tableauFinal.length; i++){
//            for(int j =0; j < tableauFinal[i].length; j++){
//                System.out.println(tableauFinal[i][j]);
//            }
//        }
    }
}
