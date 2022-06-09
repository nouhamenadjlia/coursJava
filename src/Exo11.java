import java.util.Scanner;
public class Exo11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Donnez le nombre a calculer :");
        int numero = input.nextInt();
        int reponse = 1;
        System.out.print("Factorielle de " +numero+ " c'est : 1");
        for (int i = 2; i<=numero;i++)
        {
            reponse*=i;
            System.out.print(" x " + i);
        }
        System.out.print(" = " + reponse );
    }
}
