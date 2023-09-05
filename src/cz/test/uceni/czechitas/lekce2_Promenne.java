package cz.test.uceni.czechitas;

import java.time.LocalDate;

public class lekce2_Promenne {
    public static void main(String[] args) {
        pozdrav();
        husyAKralici();
        prevodHodinNaSekundy();
        prevodRokuNaVek();
    }

    /*
    Vytvor promenne jmeno, prijmeni typu String. Do techto promennych prirad sve jmeno a prijmeni.
    Vypis pozdrav ve tvaru:
    Ahoj, zdravi te {jmeno} {prijmeni}!
    */
    private static void pozdrav() {
        String jmeno = "Karolina";
        String prijmeni = "Frolikova";
        System.out.println("Ahoj, zdravi te" + " " + jmeno + " " + prijmeni + "!");
    }

    /*
    Vytvor dve ciselne promenne pocetHus a pocetKraliku. Hus je 20 a kraliku je o 5 mene nez hus.
    Do promennych pocetZvirat a pocetNohou vypocitej spravne hodnoty podle poctu hus a kraliku.

    Format vypisu:
    Na farme je {pocetZvirat} zvirat a maji {pocetNohou} nohou.
    */
    private static void husyAKralici() {
        int pocetHus = 12;
        int pocetKraliku = pocetHus - 5;
        int pocetZvirat = pocetHus + pocetKraliku;
        int pocetNohou = pocetHus * 2 + pocetKraliku * 4;
        System.out.println ("Na farme je" + " " + pocetZvirat + " " + "zvirat a maji" + " " + pocetNohou + " " + "nohou.");
    }

    /*
    Naprogramuj jednoduchy prevodnik hodin na sekundy. Do promenne pocetHodin prirad pocet hodin, ktery spravne prevedes na sekundy a vysledek ulozis do promenne pocetSekund.

    Format vypisu:
    {pocetHodin} hodin je {pocetSekund} sekund.
    */
    private static void prevodHodinNaSekundy() {
        int početHodin = 12;
        int prevodHodinNaSekundy = početHodin * 3600;
        System.out.println(početHodin + " " + "hodin je" + " " + prevodHodinNaSekundy + " " + "sekund.");

    }

    /*
    Vytvor promennou rokNarozeni, do ktere priradis rok narozeni. Podle nej vypocti do promenne vek aktualni vek a vysledek vypis.

    Format vypisu:
    Lidem narozenym v roce {rokNarozeni} je nyni {vek} let nebo o rok mene.
    */
    private static void prevodRokuNaVek () {
        int rokNarození = 1985;
        LocalDate datum = LocalDate.now();

        int prevodRokuNaVek = datum.getYear() - rokNarození;
        System.out.println(prevodRokuNaVek);
    }
}