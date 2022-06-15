package poo;

public class Exo24 {
    /*TP 24.
    Ecrire une méthode Java qui prend en paramètre 2 string et qui ensuite retourne un booléen(true/false) selon que le 2ème string est le préfixe du premier ou pas.

    Ex :
    isPrefix("banner", "bang")
    > false
    isPrefix("hugging", "hug")
    > true*/

      static boolean isPrefix (String text, String prefix)
    {
        String textPrefix = text.substring(0,prefix.length());

        return textPrefix.equals(prefix);
    }

    public static void main(String[] args)

    {

    String word1 = "banner";
    String word2 = "bang";

    boolean word12 = isPrefix(word1,word2);

    System.out.println(word12);

    }

}
