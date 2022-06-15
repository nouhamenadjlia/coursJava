public class ConditionsIntro {
    public static void main(String[] args) {
    //Declaration variable age
        byte age = 10;
        //Test condition
        //si age >= 18 alors
        //afficher un message : "Vous etes majeur et pouver participer à la competition"
        //fin sin
        //sinon
        //afficher:"vous etes mineur et ne pouver pas participer"
        //fin sin
        if (age>=18){
            System.out.println("Vous etes majeur et pouver participer a la competition");
        } else {
            System.out.println("Vous etes majeur et pouver participer à la competition");
        }
        String pays ="Chine";
        if(pays == "France"){
            System.out.println("Bonjour");
        } else if (pays == "Chine") {
            System.out.println("Nihau");
        } else if (pays =="Espagne") {
            System.out.println("Holla");
        }else {
            System.out.println("le pays fourni n'est pas supporter");
        }
    }
}
