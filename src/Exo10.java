import java.util.Scanner;
public class Exo10 {
    public static void main(String[] args) {

        var input=new Scanner(System.in);
        System.out.print("Entrer le nombre dont vous voulez voir la table de multiplication : ");
        var nombre=input.nextInt();
        System.out.println("Table de:");
        for(int i=1;i<=10;i++){
            System.out.printf("%d x %d = %d\n",nombre,i,(nombre*i));
        }







    }
}