package POO.exo1;

public class Personne {
    /*
    * TP 1 POO:
        Ecrire une classe Personne qui est décrit par les données suivantes:
        firstName
        lastName
        pays
        married(booléen)
        nombreEnfants
        On doit avoir une méthode qui retourne un string nomComplet
        Dans le main, vous devez à partir du clavier demander à l'utilisateur de fournir toutes ces données et
        enfin les afficher dans main.*/
    String firstName;
    public String lastName;
    public String pays;
    public boolean etesMarrier;
    public byte nombreEnfants;
    String nomComplet(){
        return firstName+" "+lastName;
    }
    public Personne(String firstName, String lastName,String pays,boolean etesMarrier,byte nombreEnfants){
        this.firstName=firstName;
        this.lastName=lastName;
        this.pays=pays;
        this.etesMarrier=etesMarrier;
        this.nombreEnfants=nombreEnfants;
    }

    public String getfirstName(){
        return firstName;
    }

    public String getlastName(){return lastName;}
    public String getpays(){return pays;}
    public boolean getetesMarrier(){return etesMarrier;}
    public byte nombreEnfants(){return nombreEnfants;}
    

 

    public void SetlastName(String nextLine) {
        this.lastName=lastName;
    }

    public void setfirstName(String nextLine) {
        this.firstName=firstName;
    }

    public void Setpays(String nextLine) {
        this.pays=pays;
    }

    public void SetnombreEnfants(byte nextByte) {
        this.nombreEnfants =nombreEnfants;
    }

    public void setetesMarrier(boolean b) {
        this.etesMarrier =etesMarrier;
    }
}
