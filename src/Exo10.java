import java.util.Scanner;
public class Exo10 {
    public static void main(String[] args) {

//        var input=new Scanner(System.in);
//        System.out.print("Entrer le nombre dont vous voulez voir la table de multiplication : ");
//        var nombre=input.nextInt();
//        System.out.println("Table de multiplication de :"+ nombre);
//        for(int i=1;i<=10;i++){
//            System.out.println(nombre+"x"+i+"="+(nombre*i));

//        }
        for(int i = 2 ; i<=10; i++){
            for (int j =1; j<=10; j++){
                System.out.println(i+"x"+j+"="+(i*j));
            }
        }

    }
}
