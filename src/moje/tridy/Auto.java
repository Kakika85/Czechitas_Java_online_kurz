package moje.tridy;

import java.awt.*;

public class Auto {

    public static final int MAX_MIST = 5;
    public String znacka;
    public String model = "Ioniq";
    public String trida;
    public Color barva;
    public String spz;
    public String statusVozidla = "nové";
    public int pocetMist;
    public int pocetIsoFix;
    private int cena;

    public int pocetKm;

    public Auto() {
    }

    public Auto(String znackaVozu) {
        znacka = znackaVozu;
    }

    public Auto(int cenaVozu) {
        cena = cenaVozu;
    }

    public Auto(String spzVozu, int pocetMistObsazene, int pocetKm) {
        spz = spzVozu;
        pocetMist = pocetMistObsazene;
        this.pocetKm = pocetKm;

    }

    public void jedVPred100km() {
        pocetKm = pocetKm + 100;
    }

    public void jed(int kolikUjel) {
        pocetKm = pocetKm + kolikUjel;
    }

    public void jedABerStopare(double kolikUjel) {
        //každých 100km 1 stopař
        pocetKm += kolikUjel;
        while (kolikUjel >= 100) {
            if (pocetMist >= MAX_MIST) {
                System.out.println("Auto je již zaplněné");
                break;
            }
            pocetMist += 1;
            kolikUjel -= 100;
        }
    }

    //public void clear() {
        //pocetMist = 1;
    //}

    public void jedABerStopare2 (double kolikUjel) {
        //každých 200 km = 1 stopař
        pocetKm += kolikUjel;
        while (kolikUjel >= 200) {
            if (pocetMist >= MAX_MIST) {
                System.out.println("Už nemám místo!");
                break;
            }
            pocetMist += 1;
            kolikUjel -= 200;
        }
    }
}
