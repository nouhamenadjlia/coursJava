package POO.Exo2;

public class Patients {
    /*Le but de cet exercice est de créer des « patients » qui ont un poids et une taille,et de calculer leur « Indice de Masse
    Corporelle» (IMC).crée un patient,
    affiche les données du patient ainsi que son IMC.
    Avoir la possibilité de connaître la taille du patient, son poids*/
    public float poids;
    public float taille;
    public String nom;
    public String prenom;
    public byte age;


    public Patients(){
        nom ="menadjlia";
        prenom = "nouha";
        poids=63;
        taille=165;
        age=28;
    }

    public float getPoids(){
        return  poids;
    }

    public float getTaille(){
        return taille;
    }

    public void setTaille(float taille){
        this.taille=taille;
    }

    public void setPoids(float poids){
        this.poids=poids;
    }
    public void SetlastNom(String nom) {
        this.nom= nom;
    }

    public void SetPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void SetAge(byte age) {
        this.age = age;
    }
    String nomComplet(){
        return nom+" "+prenom;
    }
    double calculIMC(){
        return this.getPoids()/  Math.pow(this.getTaille(),2);
    }
}
