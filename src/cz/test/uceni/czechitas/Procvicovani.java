package cz.test.uceni.czechitas;

import java.sql.SQLOutput;

public class Procvicovani {

    public static void main(String[] args) {
        // mesice();
        //vsechnyMesice();
        //x();
        //pokus4();
        //pokus5();
        //pokus6();
        //pokus7();
        pokus8();
    }

    /**
     * Do promenne cisloMesice prirad cislo mesice, podle ktereho nasledne vypis slovni nazev mesice.
     * Pokud cisloMesice neodpovida zadnemu mesici, vypis {cisloMesice}. mesic neni :).
     * <p>
     * zadání z lekce 3, dle mého uvazeni by byla vhodnejsi reseni pomoci pole
     * <p>
     * Priklad vystupniho formatu:
     * 5. mesic je kveten
     */
    private static void mesice() {
        String[] mesice = {"leden", "unor", "brezen", "duben", "kveten", "cerven", "cervenec", "srpen", "zari", "rijen", "listopad", "prosinec"};
        int index = 5;
        String mesic = mesice[index - 1];
        System.out.println(index + ". měsíc je " + mesic);

    }
    // todo přesunout ze lekcí vše nad zadání

    // todo připravit si otázky k videu

    private static void vsechnyMesice() {
        String[] mesice = {"leden", "unor", "brezen", "duben", "kveten", "cerven", "cervenec", "srpen", "zari", "rijen", "listopad", "prosinec"};

        //vytvoření proměnné index (definice proměnné)
        int index;
        String mesic;

        // vložení hodnoty do proměnné
        index = 5;
        mesic = mesice[index - 1];
        System.out.println(index + ". měsíc je " + mesic);

        index = 6;
        mesic = mesice[index - 1];
        System.out.println(index + ". měsíc je " + mesic);

        //vypsání všech měsíců najednou
        int[] poleIndex = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for (int clen : poleIndex) {
            String danyMesic = mesice[clen - 1];
            System.out.println(clen + ". měsíc je " + danyMesic);
        }
        for (int i = 0; i < 12; i = i + 1) {
            String danyMesic = mesice[i];
            System.out.println(i + ". měsíc je " + danyMesic);
        }
    }

    private static void x() {

        //String tuk = "Ťuk!";
        //String penny = "Penny!";

        //System.out.println(tuk);
//        System.out.println(tuk);
//        System.out.println(tuk);
//        System.out.println(penny);
//        System.out.println(tuk);
//        System.out.println(tuk);
//        System.out.println(tuk);
//        System.out.println(penny);
//        System.out.println(tuk);
//        System.out.println(tuk);
//        System.out.println(tuk);
//        System.out.println(penny);

        String[] tukPenny = {"Ťuk!", "Ťuk!", "Ťuk!", "Penny", "Ťuk!", "Ťuk!", "Ťuk!", "Penny", "Ťuk!", "Ťuk!", "Ťuk!", "Penny"};
        for (String clen : tukPenny) {

            System.out.println(clen);
        }
        String[] tukPenny2 = {"Ťuk!", "Ťuk!", "Ťuk!", "Penny!"};
        for (String clen2 : tukPenny2) {

            System.out.println(clen2);

        }

        for (String clen2 : tukPenny2) {

            System.out.println(clen2);
        }

        for (String clen2 : tukPenny2) {

            System.out.println(clen2);
        }
    }

    public static void pokus4(){

        for (int pokus4 = 1; pokus4 <= 3; pokus4++) {

            for (int blbost = 1; blbost <= 3; blbost++) {
                System.out.println("Ťuk!");
            }
            System.out.println("Penny!");
        }
    }
    public static void pokus5(){
        int nasobek = 7;
        for (int pokus5 = 1; pokus5 <= 10; pokus5++) {
            int vynasobeno = pokus5 * nasobek;
            System.out.println(pokus5 + ". násobek čísla " + nasobek + " je: " + vynasobeno);
        }
    }
    public static void pokus6(){
        for (int pokus6 = 1; pokus6 <= 10; pokus6++) {
            int vynasobeno = pokus6 * 7 ;
            System.out.println(pokus6 + ". násobek čísla 7 je: " + vynasobeno);
        }
        for (int i = 1, j = 7; i <= 10; i++, j = j + 7) {
            //System.out.println(i + ". násobek čísla 7 je: " + j);
            System.out.println(i + ". násobek čísla " + (j/i) + " je: " + j);
        }
    }
    public static void pokus7(){
        for (int pokus7 = 0; pokus7 <= 9; pokus7++){
            for (int pokus7_1 = 0; pokus7_1 <= 9; pokus7_1++){
                System.out.println("Výsledky pokusů jsou stejné a to : " + pokus7 + pokus7_1);
            }
        }
    }
    /**string s textem
    println "delka textu je x znaků"
     */
    public static void pokus8(){
        String pokus8 = "běž k šípku";
        System.out.println("Délka textu je " + pokus8.length() + " znaků");
    }
}