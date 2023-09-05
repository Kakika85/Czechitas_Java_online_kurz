package cz.test.uceni.czechitas;

public class lekce1_Funkce {
    public static void main(String[] args) {

        základní();
        počítámePlus();
        počítámeMínus();
        počítámeDělení();
        počítámeNásobení();
        počítámeDruháMocnina();
        počítámeDruháOdmocnina();
    }


    public static void základní() {
        System.out.println("Hello World! :)"); // Display the string.
        System.out.println("jak se máš");
    }

    public static void počítámePlus() {
        Kalkulator obyč = new Kalkulator();
        int součet = obyč.sčítání(4, 6);
        System.out.println(součet);
    }

    public static void počítámeMínus() {
        Kalkulator obyč = new Kalkulator();
        int rozdíl = obyč.odečítání(4, 6);
        System.out.println(rozdíl);
    }

    public static void počítámeDělení() {
        Kalkulator obyč = new Kalkulator();
        int podíl = obyč.dělení(4, 2);
        System.out.println(podíl);
    }

    public static void počítámeNásobení() {
        Kalkulator obyč = new Kalkulator();
        int součin = obyč.násobení(-2, -6);
        System.out.println(součin);
    }

    public static void počítámeDruháMocnina() {
        Kalkulator obyč = new Kalkulator();
        int druháMocnina = obyč.druháMocnina(2);
        System.out.println(druháMocnina);
    }

    public static void počítámeDruháOdmocnina() {
        Kalkulator obyč = new Kalkulator();
        int druháOdmocnina = obyč.druháOdmocnina(16);
        System.out.println(druháOdmocnina);
    }
}
