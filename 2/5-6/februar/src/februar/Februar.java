/*
 * Made by Andrea Mate.
 * For practice.
 * This is the way!
 */
package februar;

import java.util.Scanner;

/**
 *
 * @author Máté Andrea
 */
public class Februar {

    static Scanner bill=new Scanner(System.in);
    static int feb[]={2,1,5,-3,3,2,8,-5,1,2,2,-5,0,5,-3,5,-3,3,-21,1,-9,-2,1,1,-9,-12,0,-5};
    static double atlag(){
        int osszeg=0;
        for (int elem: feb) {
            osszeg+=elem;
        }return (double)osszeg/feb.length;
    }
    static int minimum(){
        int mini=0;
        for (int i=0;i<feb.length;i++){
            if (feb[i]<feb[mini]) {
                mini=i;
            }
        }return mini;
    }
    static int maximum(){
        int maxi=0;
        for (int i=0;i<feb.length;i++){
            if (feb[i]>feb[maxi]) {
                maxi=i;
            }
        }return maxi;
    }
    static int keres(int mit){
        for (int i = 0; i < feb.length; i++) {
            if (feb[i]==mit) {
                return i;
            }
        }return -1;
    }
    static int fagy(){
        int nap=0;
        for (int elem : feb) {
            if (elem<=0) {
                nap++;
            }
        }return nap;
    }
    static void javit(){
        System.out.print("Mennyit változtassak? ");
        int mennyi=bill.nextInt();bill.nextLine();
        for (int i = 0; i < feb.length; i++) {
            feb[i]+=mennyi;
        }
    }
    static String chart_assist(int x,String s){
        String txt="";
        for (int i = 0; i <x; i++) {
            txt+=s;
        }return txt;
    }
    static void diagram(){
        for (int elem : feb) {
            if (elem<0) {
                System.out.print(chart_assist(feb[minimum()]*(-1)+elem," ")+chart_assist(elem*(-1),"*"));
            }else if(elem>0){
                    System.out.print(chart_assist(feb[minimum()]*(-1)," ")+chart_assist(elem,"*"));
            }else{
                    System.out.print(chart_assist(feb[minimum()]*(-1)," ")+"|");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        char v;
        boolean kilep=false;
        do {            
            System.out.println("1-Átlag 2-Min 3-Max 4-Fagy 5-Javít 6-Diagram 0-Kilép");
            System.out.print("Válaszás: ");
            v=bill.nextLine().charAt(0);
            switch(v){
                case '1':
                    System.out.println("Átlag: "+atlag());
                    break;
                case '2':
                    System.out.println("Min: "+feb[minimum()]+"\nLeghidegebb nap: "+(keres(feb[minimum()])+1));
                    break;
                case '3':
                    System.out.println("Max: "+feb[maximum()]+"\nLegmelegebb nap: "+(keres(feb[maximum()])+1));
                    break;
                case '4':
                    System.out.println("Fagyos napok: "+fagy());
                    break;
                case '5':
                    javit();
                    System.out.println("Javítás kész. ");
                    break;
                case '6':
                    System.out.println("Diagram: ");
                    diagram();
                    break;
                default:
                    kilep=true;
                    break;
            }
        } while (!kilep);
    }
    
}
