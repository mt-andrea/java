package kodolas;

/*
 * Made by Andrea Mate.
 * For practice.
 * This is the way!
 */

 /* @author Máté Andrea */
public class Caesar {
    
    String titkosit(String s, int tol) {
        s = s.toUpperCase().replaceAll("[:,;.' ]", "");
        s = s.replace("Á", "A").replace("É", "E").replace("Í", "I").replaceAll("[ÓŐÖ]", "O").replaceAll("[ÚÜŰ]", "U");
        String uj = "";
        int hossz = 'Z' - 'A' + 1;
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) + tol;
            if (c < 'A') {
                c += hossz;
            } else if (c > 'Z') {
                c -= hossz;
            }
            uj += (char) c;
        }
        return uj;
    }

    public static void main(String[] args) {
        Caesar c = new Caesar();
        System.out.println(c.titkosit("íöüóőúéáű", 0));
        System.out.println(c.titkosit("abc", 1));
        System.out.println(c.titkosit("abc", -1));
    }
}
