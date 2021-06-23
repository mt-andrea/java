package kocka;
import java.util.Random;
import java.util.Scanner;
public class Kocka {
static int dobas(int db){
    Random kocka=new Random();
    int ossz=0;
    for (int i = 0; i < db; i++) {
        ossz+=kocka.nextInt(6)+1;
    }return ossz;
}
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        int jatekos, gep;
        do {
            jatekos = dobas(10);
            System.out.println("A játékos dobása: " + jatekos);
            gep = dobas(10);
            System.out.println("A gép dobása: " + gep);
            if (jatekos > gep) {
                System.out.println("A játékos nyert!");
            } else if (jatekos < gep) {
                System.out.println("A gép nyert!");
            }
            else {
                System.out.println("Döntetlen!");
            }
            System.out.print("Még egy játék (i/n)? ");
        } while (bill.nextLine().charAt(0) != 'n');
    }
}
