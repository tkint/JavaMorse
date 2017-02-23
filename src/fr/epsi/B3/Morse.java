/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.epsi.B3;

/**
 *
 * @author tkint
 */
public class Morse {

    public static void main(String[] args) {
        // Valeurs de test
        char testChar = 'A';
        String testString = "Hello world!";

        // Transformation d'un caractère en sa valeur morse
        String testToMorse = toMorse(testChar);
        // Transformation de la valeur morse en caractère
        char testToChar = fromMorse(testToMorse);

        // Affichage du test morse
        System.out.println(testToMorse);
        // Affichage du test caractère
        System.out.println(testToChar);

        // Transformation d'une chaîne de caractères en morse
        String str = stringToMorse(testString);
        // Transformation d'une chaîne de caractère codée en morse en chaîne lisible
        String mor = morseToString(str);

        // Affichage des résultats
        System.out.println(str);
        System.out.println(mor);
    }

    /**
     * Transforme un chaîne de caractère en morse
     *
     * @param str
     * @return
     */
    private static String stringToMorse(String str) {
        String morse = "";
        // On transforme la chaîne de caractère en tableau de caractères
        char[] chars = str.toCharArray();
        // Pour chaque caractère
        for (char c : chars) {
            // Si le caractère est un espace
            if (c == ' ') {
                // On ajoute un espace
                morse += " ";
            } else {
                // Sinon on ajoute la correspondance morse du caractère
                morse += toMorse(Character.toUpperCase(c)) + " ";
            }
        }
        return morse;
    }

    /**
     * Transforme du morse en chaîne de caractères
     *
     * @param morse
     * @return
     */
    private static String morseToString(String morse) {
        String str = "";
        // On sépare la chaîne en lettres
        String[] strings = morse.split(" ");
        // Pour chaque lettre
        for (String s : strings) {
            // On ajoute au résultat la correspondance en morse
            // Si fromMorse renvoie null, on ajoute un espace
            str += (fromMorse(s) != null ? fromMorse(s) : " ");
        }
        return str;
    }

    /**
     * Transforme un caractère en morse
     *
     * @param c
     * @return
     */
    private static String toMorse(char c) {
        String morse = "";
        // Pour chaque élément de l'énumération
        for (Lettres l : Lettres.values()) {
            // Si le nom de l'élément est égal à c OU si le chiffre de l'élément correspond à c
            if ((l.name().toCharArray()[0] == c && l.getChiffre() == -1)
                    || Character.toChars(l.getChiffre() + 48)[0] == c) {
                // On récupère la correspondance en morse du caractère
                morse = l.getMorse();
            }
        }
        return morse;
    }

    /**
     * Transforme du morse en caractère
     *
     * @param s
     * @return
     */
    private static Character fromMorse(String s) {
        Character c = null;
        // Pour chaque élément de l'énumération
        for (Lettres l : Lettres.values()) {
            // Si le morse de l'élément est égal à la chaîne s
            if (l.getMorse().equals(s)) {
                // Si ce n'est pas un chiffre
                if (l.getChiffre() == -1) {
                    // On récupère le nom
                    c = l.name().toCharArray()[0];
                } else {
                    // Sinon on récupère le chiffre
                    c = Character.toChars(l.getChiffre() + 48)[0];
                }

            }
        }
        return c;
    }
}
