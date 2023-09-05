package cz.test.uceni.czechitas;

public class lekce4_Cykly {

    public static void main(String[] args) {
        odpocet();
        kralici();
        soucet();
        nasobky();
    }

    /*
    Napis cyklus, ktery bude simulovat odpocet zacinajici cislem 10. Format vystupu:
    10
    9
    8
    7
    6
    5
    4
    3
    2
    1
    */
    private static void odpocet() {
        for (int odpocet = 10; odpocet >= 1; odpocet--) {
            System.out.println(odpocet);
        }

        // vždy musím začít "int"
        // i = 10; kde vyhledávání začíná ("inicializace začátku cyklu")
        // i > 0; kde vyhledávání končí ("podmínka která když je splněna tak cyklus pořád běží") - toto je boolean!!! (true/false)
        // i = i - 2 co se má provést ("inkrement cyklu")
        for (int i = 10; i > 0; i = i - 2) {
            System.out.println(i);
        }

    }

    /*
    Vytvor program, ktery pomoci cyklu vypise:
    1. kralik
    2. kralik
    3. kralik
    4. kralik
    */
    private static void kralici() {
        for (int kralici = 1; kralici <= 4; kralici++) {
            System.out.println(kralici + ". kralik");
        }
    }

    /*
    S pouzitim while cyklu napis program,
    ktery vypocita soucet vsech cisel od 1 do 100. Vysledny soucet vypis do konzole.
    */
    private static void soucet() {
        int krok = 1;
        int vyslednySoucet = 0;
        while (krok <= 100){
           System.out.println(krok);
           vyslednySoucet = vyslednySoucet + krok;
           krok = krok + 1;
        }
        System.out.println(vyslednySoucet);

    }

    /*
    S pouzitim cyklu vypis 5 nasobku libovolneho cisla.

    Format vystupu:
    1. nasobek: 5
    2. nasobek: 10
    3. nasobek: 15
    4. nasobek: 20
    5. nasobek: 25
    */
    private static void nasobky() {
        /*for (int i = 1; i <= 5; i++) {
        //for (int j = 1; i2 <= 200; j = j + 5) {
            System.out.println(i + ".nasobek:" + i * 3);
        }*/

        for (int i = 1, j = 3; i <= 5; i++, j = j + 3) {
            System.out.println(i + ".nasobek:" + j);
        }
    }
}
//- u posledniho zkusit obrácenou variantu (odečítání)
