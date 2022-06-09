import java.util.Scanner;
public class Exo12 {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.print("Entrer un nombre : ");
        var nombre=input.nextInt();

        for (int i =nombre+1; i<=nombre+10; i++){
            System.out.println(i);
        }
    }
}
