package cz.test.uceni.czechitas;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class lekce6_Objekty {

    public static void main(String[] args) {
        VypisDataVanoc();
        VypisVanocnihoMesice();
        NahodnaBarva();

    }

    public static void VypisDataVanoc() {
        // Vytvor promennou s datem letosnich Vanoc (objekt typu LocalDate)
        // a datum z teto promenne vypis ve formatu {den}. {mesic}. {rok}.
        // System.out.print("Jezisek letos prijde ");
        // VypisDataVanoc();

        LocalDate VypisDataVanoc = LocalDate.of (2023, 12, 24);
        System.out.println(VypisDataVanoc.getDayOfMonth() + "." + VypisDataVanoc.getMonthValue() + "." + VypisDataVanoc.getYear());
        System.out.println(VypisDataVanoc.getDayOfMonth() + "." + VypisDataVanoc.getMonth() + " " + VypisDataVanoc.getYear());
        System.out.println(VypisDataVanoc.getDayOfMonth() + "." + VypisDataVanoc.getMonth().getValue() + "." + VypisDataVanoc.getYear());
    }

    public static void VypisVanocnihoMesice() {
        // Tento rok budeme mit stedrovecerni veceri 24. 12. 2019 v 18:00.
        // Tuto informaci uloz do promenne datumACasStedrovecerniVecere typu LocalDateTime.
        // Z promenne ziskej datum a z nej vypis mesic.
        // System.out.print("Vanoce byvaji v tomto mesici: ");
        // VypisVanocnihoMesice();

        LocalDateTime datumACasStedrovecerniVecere = LocalDateTime.of(2023, 12, 24, 18,00);
        System.out.println("Vanoce bývaji v tomto měsíci: " + datumACasStedrovecerniVecere.getMonth());
    }

    public static void NahodnaBarva() {
        // Vytvor promennou generatorNahodnychCisel typu Random,
        // z nej pak vygeneruj 3 nahodna cisla predstavujici slozky RGB barvy typu Color.
        // Vyslednou barvu vypis do konzole.
        // System.out.print("Vytvorena nahodna barva je: ");
        // NahodnaBarva();
        Random generatorNahodnychCisel = new Random();
        int cervena = generatorNahodnychCisel.nextInt(256);
        int zelena = generatorNahodnychCisel.nextInt(256);
        int modra = generatorNahodnychCisel.nextInt(256);


        Color NahodnaBarva = new Color(cervena, zelena, modra);

        System.out.println("Vytvorena nahodna barva je: " + NahodnaBarva);

    }
}




