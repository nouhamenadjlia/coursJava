public class Variables {
    public static void main(String[] args) {
        //les variables et fonction en Java sont en camlCase
        //calcule Rectangle
        int longeur=50;
        int largeur=25;
        int surface= largeur*longeur;
        int perimetre=2*(longeur+largeur);
        System.out.println(surface);
        System.out.println(perimetre);

        //Reels
        //calcule somme de nombres
        //double pour plus de precision dans la virgule
        float nombre1 = 150.5F;
        // calcule de la vitesse
        float distanceParcourus = 90.6F;
         float temps = 12.345F;
         double vitesseMoyenne = distanceParcourus/temps;

         //Chaine de caracteres et caracteres
        // Chaine de caracteres et caracters
        String prenom="Christian";//chaine de caracteres
        char genre='M';

    }
}
