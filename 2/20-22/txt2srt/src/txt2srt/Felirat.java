/**
 * Made by Andrea Mate.
 * For practice.
 * This is the way!
 */
package txt2srt;

/**
 * Feliratok átalakítása srt formátumra
 *
 * @author Máté Andrea
 */
public class Felirat {

    private int ido1, ido2;//eleje, vége mp-ben
    private String szoveg;//felirat

    /**
     * Felirat osztály konstruktora
     *
     * @param s1 első sor
     * @param s2 második sor
     */
    public Felirat(String s1, String s2) {
        ido1 = Integer.parseInt(s1.substring(0, 2)) * 60 + Integer.parseInt(s1.substring(3, 5));
        ido2 = Integer.parseInt(s1.substring(8, 10)) * 60 + Integer.parseInt(s1.substring(11, 13));
        szoveg = s2;
    }

    /**
     * szöveg lekérdezése
     *
     * @return szöveg
     */
    public String getSzoveg() {
        return szoveg;
    }

    /**
     * időpont : mp → óó:pp:mp
     *
     * @param mp időpont mp-ben
     * @return óó:pp:mp Str
     */
    private String atalakit(int mp) {
        return String.format("%02d:%02d:%02d", mp / 3600, (mp % 3600) / 60, (mp % 60));
    }

    /**
     * időzítés → srt formátum
     *
     * @return átalakított időzítés
     */
    public String getSrt() {
        return atalakit(ido1) + " --> " + atalakit(ido2);
    }

    /**
     * időzítés eltolása n mp-cel
     *
     * @param n eltolás mp-ben
     */
    public void eltol(int n) {
        ido1 += n;
        ido2 += n;
    }
//tesztelés

    public static void main(String[] args) {
        Felirat f1 = new Felirat("01:14 - 01:16", "And we are going to grab");
        f1.eltol(1);
        System.out.println(f1.getSrt());
        System.out.println(f1.getSzoveg());

        Felirat f2 = new Felirat("10:49 - 10:51", "on the circle select,");
        f2.eltol(-1);
        System.out.println(f2.getSrt());
        System.out.println(f2.getSzoveg());
    }
}
