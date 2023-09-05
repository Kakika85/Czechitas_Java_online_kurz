package cz.test.uceni.czechitas;

import moje.tridy.Auto;

import java.awt.*;

public class lekce9_Konstruktory {

    public static void main(String[] args) {
        Auto hyundaiIoniq5 = new Auto("Hyundai");
        hyundaiIoniq5.trida = "5";
        hyundaiIoniq5.barva = new Color(156, 155, 133);
        hyundaiIoniq5.spz = "EL618AR";
        hyundaiIoniq5.pocetMist = 5;
        hyundaiIoniq5.pocetIsoFix = 2;

        //změna či přidání atributů u nového auta
        Auto hyundaiIoniq = new Auto("Hyundai");
        hyundaiIoniq.trida = null;
        hyundaiIoniq.barva = new Color(255, 255, 255);
        hyundaiIoniq.spz = "EL246AD";
        hyundaiIoniq.statusVozidla = "ojeté";
        hyundaiIoniq.pocetMist = 5;
        hyundaiIoniq.pocetIsoFix = 2;

        Auto kiaEV9 = new Auto(1900000);

        System.out.println(hyundaiIoniq5.barva);
        System.out.println(hyundaiIoniq.barva);

        System.out.println(hyundaiIoniq.spz + "; " + hyundaiIoniq5.spz);

        System.out.println(hyundaiIoniq.statusVozidla);
        System.out.println(hyundaiIoniq5.statusVozidla);

        System.out.println(hyundaiIoniq.znacka);
        System.out.println(hyundaiIoniq5.znacka);

        //System.out.println(kiaEV9.cena);  - toto nelze z důvodu privatniho atributu "cena"
    }

}
