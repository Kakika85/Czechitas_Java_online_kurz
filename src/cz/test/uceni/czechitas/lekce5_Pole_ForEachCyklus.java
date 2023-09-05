package cz.test.uceni.czechitas;

import java.util.Arrays;

public class lekce5_Pole_ForEachCyklus {

    public static void main(String[] args) {
        zelenina();
        nasobky();
        petinasobky();
        ovoce();
    }

    /*
    Vytvor promennou zelenina, ktera bude reprezentovat pole prvku typu String.
    Pole inicializuj hodnotami rajce, mrkev, okurka, salat.
    Prvky pole vypis pomoci cyklu for-each tak, aby vysledek vypadal takto:

    Na poli roste: rajce
    Na poli roste: mrkev
    Na poli roste: okurka
    Na poli roste: salat
    */
    private static void zelenina() {
        String[] zelenina = {"rajce", "mrkev", "okurka", "salat"};
        for(String  clen : zelenina){
            System.out.println("Na poli roste: " + clen);
        }
        // nad rámec úkolu provedeme úpravu pole
        String[] zeleninaUprava = {"rajce", "mrkev", "okurka", "salat"};
        zeleninaUprava[1] = "celer";
        for(String clenUprava : zeleninaUprava) {
            System.out.println("upravena zelenina: " + clenUprava);
        }
    }

    /*
    Vytvor pole, ktere bude obsahovat cisla od 1 do 10.
    S pouzitim for-each cyklu a vytvoreneho pole vypis nasobky cisla 5 tak,
    aby vysledny vypis vypadal takto:

    Nasobky cisla 5:
    5
    10
    15
    20
    25
    30
    35
    40
    45
    50
    */
    private static void nasobky() {
        int[] cisla = {1,2,3,4,5,6,7,8,9,10};
        for(int cislo: cisla){
            System.out.println(cislo + " je " + cislo * 5);
        }
    }

    /*
    Napis program, ktery zmeni pole nasobky2 tak,
    ze kazdy jeho prvek nahradi petinasobkem.
    Vysledne pole vypis.

    Ocekavany vysledek:
    [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

    Napoveda:
    Pro zmenu prvku pole pouzij vhodny cyklus ;)
    Pro vypis pole pouzij metodu Arrays.toString.
    */
    private static void petinasobky() {
        int[] nasobky2 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int nasobkynew=0;

        for(int nasobek2: nasobky2){

          nasobek2 = nasobek2 * 5;
          nasobky2[nasobkynew++] = nasobek2;
        }

        /* nebo použití cyklu pomocí "length"

         for(int i = 0; i < nasobky2.length; i++){
            nasobky2[i] = nasobky2[i] * 5;
        }

         */

        System.out.println(Arrays.toString(nasobky2));
    }

    /**
     *  ukoly nad rámec - procvicovani
     *  výpis lichých hodnot
     */
    private static void ovoce() {
        String[] ovoce = {"pomeranc", "jablko", "grep", "banán", "mandarinka", "maracuja", "jahoda"};
        boolean lichy = true;
        for (String clenOvoce : ovoce) {
            if (lichy==true) {
                System.out.println(clenOvoce);
                lichy=false;                     //přepínač z lichý na sudý
            } else if(lichy==false) {
                lichy=true;
            }

        }
    }
}