/*
 * Made by Andrea Mate.
 * For practice.
 * This is the way!
 */
package kektura;

/**
 * Kéktúra szakaszai
 *
 * @author Máté Andrea
 */
public class Szakasz {

    private String eleje, vege;
    private double tav;
    private int emelkedes, lejtes;
    private boolean pecsethely;

    /**
     * osztály konstrukora
     *
     * @param sor beolvasott
     */
    public Szakasz(String sor) {
        String[] s = sor.split(";");
        eleje = s[0];
        vege = s[1];
        tav = Double.parseDouble(s[2].replace(",", "."));
        emelkedes = Integer.parseInt(s[3]);
        lejtes = Integer.parseInt(s[4]);
        pecsethely = s[5].equals("i");
    }

    /**
     * szakasz → Str
     *
     * @return adatok egy sorban
     */
    @Override
    public String toString() {
        return String.format("%s;%s;%.3f;%d;%d;%s", eleje, vege, tav, emelkedes, lejtes, pecsethely ? "i" : "n");
    }

    /**
     * szakasz hossza
     *
     * @return tav
     */
    public double getTav() {
        return tav;
    }
    /**
     * emelkedés és lejtés kül a szakaszon
     * @return szintváltozás
     */
public int szintvaltozas(){
    return emelkedes-lejtes;
}
/**
 * hiányos vp név vizsgálat
 * @return i/h
 */
public boolean hianyos(){
    return pecsethely && !vege.contains("pecsetlelohely");
}
public void javit(){
    if(hianyos()){
        vege+=" pecsetlelohely";
    }
}
    public static void main(String[] args) {
        Szakasz sz1 = new Szakasz("Sumeg, vasutallomas;Sumeg, buszpalyaudvar;1,208;16;6;n");
        System.out.println(sz1);
        System.out.println("Hiányos: "+sz1.hianyos());
        Szakasz sz2 = new Szakasz("Sumeg, vasutallomas;Sumeg, buszpalyaudvar;1,208;16;6;i");
        System.out.println(sz2);
        System.out.println("Hiányos: "+sz2.hianyos());
        sz2.javit();
        System.out.println(sz2);
        System.out.println("Hiányos: "+sz2.hianyos());
        Szakasz sz3 = new Szakasz("Sumeg, vasutallomas;Sumeg, buszpalyaudvar pecsetlelohely;1,208;16;6;i");
        System.out.println(sz3);
        System.out.println("Hiányos: "+sz3.hianyos());
    }
}
