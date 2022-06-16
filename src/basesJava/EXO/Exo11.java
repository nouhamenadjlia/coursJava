package basesJava.EXO;

import java.util.Scanner;
public class Exo11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Donnez le nombre a calculer :");
        int numero = input.nextInt();

        while (numero<0){
            System.out.print("veuillez entrer un nombre positif :");
            numero = input.nextInt();
        }
        if (numero >1){
            int fact=1;
            System.out.print("Factorielle de " +numero+ " c'est : "+1);
            for (int i = 2; i<= numero; i++) {
                fact*=i;
                System.out.print(" x " + i+"="+fact);
            }
        }else if (numero == 0){
            System.out.print("Factorielle de " +numero+ " c'est : "+1);
        }
    }
}
