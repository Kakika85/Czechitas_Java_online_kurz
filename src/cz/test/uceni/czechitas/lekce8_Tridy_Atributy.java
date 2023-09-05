package cz.test.uceni.czechitas;

import moje.tridy.Auto;

import java.awt.*;

public class lekce8_Tridy_Atributy {

    public static void main(String[] args) {
        Auto hyundaiIoniq5 = new Auto();
        hyundaiIoniq5.trida = "5";
        hyundaiIoniq5.barva = new Color(156, 155, 133);
        hyundaiIoniq5.spz = "EL618AR";
        hyundaiIoniq5.pocetMist = 5;
        hyundaiIoniq5.pocetIsoFix = 2;

        //změna či přidání atributů u nového auta
        Auto hyundaiIoniq = new Auto();
        hyundaiIoniq.trida = null;
        hyundaiIoniq.barva = new Color(255, 255, 255);
        hyundaiIoniq.spz = "EL246AD";
        hyundaiIoniq.statusVozidla = "ojeté";
        hyundaiIoniq.pocetMist = 5;
        hyundaiIoniq.pocetIsoFix = 2;

        System.out.println(hyundaiIoniq5.barva);
        System.out.println(hyundaiIoniq.barva);

        System.out.println(hyundaiIoniq.spz + "; " + hyundaiIoniq5.spz);

        System.out.println(hyundaiIoniq.statusVozidla);
        System.out.println(hyundaiIoniq5.statusVozidla);
    }
}
