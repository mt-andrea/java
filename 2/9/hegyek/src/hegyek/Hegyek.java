/*
 * Made by Andrea Mate.
 * For practice.
 * This is the way!
 */
package hegyek;

/* @author Máté Andrea */
public class Hegyek {

    static int[] rec = {500, 500, 500, 500, 500, 600, 600, 650, 700, 750, 820, 880, 930, 1010, 1050, 980, 930, 830, 780, 720, 720, 710, 700, 750, 770, 790, 820, 880, 880, 820, 760, 740, 600, 500, 560, 670, 780, 820, 920, 880, 860, 820, 770, 770, 760, 750, 740, 740, 730, 720};

    static void f1(String label) {
        System.out.println(label);
        int c = 0;
        System.out.print("\t800m felettiek: \n\t");
        for (int elem : rec) {
            if (elem > 800) {
                System.out.print(elem + " ");
                c++;
            }
        }
        System.out.println("\n\tDarab: " + c);
    }

    static void f2(String label) {
        System.out.println(label);
        int maxi = 0;
        for (int i = 0; i < rec.length; i++) {
            if (rec[maxi] < rec[i]) {
                maxi = i;
            }
        }
        System.out.println("\tMaximum: " + rec[maxi]);
    }

    static void f3(String label) {
        System.out.println(label + "\n\tLegalább 100 különbség:");
        for (int i = 0; i < rec.length - 1; i++) {
            if (Math.abs(rec[i] - rec[i + 1]) >= 100) {
                System.out.println(rec[i] + "\t" + rec[i + 1]);
            }
        }
    }

    static void f4(String label) {
        System.out.println(label + "\n\tCsúcsok: ");
        for (int i = 1; i < rec.length - 1; i++) {
            if (rec[i - 1] < rec[i] && rec[i] > rec[i + 1]) {
                System.out.println(rec[i - 1] + "\t" + rec[i] + "\t" + rec[i + 1]);
            }
        }
    }

    public static void main(String[] args) {
        f1("1.feladat");
        f2("2.feladat");
        f3("3.feladat");
        f4("4.feladat");
    }

}
