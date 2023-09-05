package cz.test.uceni.czechitas;

import moje.tridy.Auto;

public class lekce10_Metody {
    public static void main(String[] args) {
        Auto hyundaiIoniq5 = new Auto("el618ar", 1, 123);

        System.out.println(hyundaiIoniq5.pocetKm);

        hyundaiIoniq5.jedVPred100km();
        System.out.println(hyundaiIoniq5.pocetKm);

        hyundaiIoniq5.jed(321);
        System.out.println(hyundaiIoniq5.pocetKm);

        hyundaiIoniq5.jedABerStopare(1400);
        System.out.println(hyundaiIoniq5.pocetKm);
        System.out.println(hyundaiIoniq5.pocetMist);

        //hyundaiIoniq5.clear();

        hyundaiIoniq5.jedABerStopare2(2000);
        System.out.println(hyundaiIoniq5.pocetKm);
        System.out.println(hyundaiIoniq5.pocetMist);
    }
}
