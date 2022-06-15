public class Exo1 {
    public static void main(String[] args) {
        byte age =2;
        if(age>=7 & age<=9){
            System.out.println("vous etes un poussin");
        } else if (age>=10 & age<=11){
            System.out.println("vous etes un pupille");
        } else if (age>=12 & age<=13) {
            System.out.println("vous etes un bengamin");
        }else if (age>=14 & age<=15){
            System.out.println("vous etes un minime");
        }else if (age>=16 & age<=17){
            System.out.println("vous etes un cadet");
        }else {
            System.out.println("la valeur entrée n'es pas prise en charge");
        }
    }
}
