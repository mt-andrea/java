package nepesseg;

public class Nepesseg {

    static String str_assist(int x, String s) {
        String txt = "";
        for (int i = 0; i < x; i++) {
            txt += " ";
        }
        txt += s;
        return txt;
    }

    static String row_assist(String cont, int[] pop) {
        String txt = str_assist(20 - cont.length(), cont);
        for (int i = 0; i < pop.length; i++) {
            txt += str_assist(5 - Integer.toString(pop[i]).length(), Integer.toString(pop[i]));
        }
        return txt;
    }

    public static void main(String[] args) {
        // adatok inicializálása
        int[][] nepesseg
                = {
                    {106, 107, 111, 133, 221, 767, 1766},
                    {502, 635, 809, 947, 1402, 3634, 5268},
                    {2, 2, 2, 6, 13, 30, 46},
                    {163, 203, 276, 408, 547, 729, 628},
                    {2, 7, 26, 82, 172, 307, 392},
                    {16, 24, 38, 74, 167, 511, 809}
                };
        String[] foldreszek
                = {
                    "Afrika",
                    "Ázsia",
                    "Ausztrália",
                    "Európa",
                    "Észak-America",
                    "Dél-America"
                };
        // adatok kiírása
        int[] ev = {1750, 1800, 1850, 1900, 1950, 2000, 2050};
        String txt = str_assist(20 - "Év".length(), "Év");
        for (int i = 0; i < ev.length; i++) {
            txt += str_assist(5 - Integer.toString(ev[i]).length(), Integer.toString(ev[i]));
        }
        System.out.println(txt);
        for (int i = 0; i < foldreszek.length; i++) {
            System.out.println(row_assist(foldreszek[i], nepesseg[i]));
        }
        // összegzés
        txt = str_assist(20 - "Összeg".length(), "Összeg");
        for (int i = 0; i < ev.length; i++) {
            int c = 0;
            for (int j = 0; j < nepesseg.length; j++) {
                c += nepesseg[j][i];
            }
            txt += str_assist(5 - Integer.toString(c).length(), Integer.toString(c));
        }
        System.out.println(txt);
    }

}
