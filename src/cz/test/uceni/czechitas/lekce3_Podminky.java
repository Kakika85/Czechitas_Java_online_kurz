package cz.test.uceni.czechitas;

public class lekce3_Podminky {
    public static void main(String[] args) {
        pannaNeboOrel();
        vekoveSkupiny();
        mesice();
    }

    /*
  Do promenne nahodneCislo vygeneruj nahodne cislo (pomoci Math.random). Pokud je cislo mensi nez 0.5 vypis Orel jinak Panna.
  */
    private static void pannaNeboOrel() {
        double pannaNeboOrel = Math.random();
        if (pannaNeboOrel < 0.5) {
            System.out.println("orel");
        } else if (pannaNeboOrel > 0.5) {
            System.out.println("Panna");
        } else if (pannaNeboOrel == 0.5) {
            System.out.println("na hraně");
        } else {
            // konec a nebo tam být nemusí a pak je to taky konec
        }
    }

    /*
    Do promenne vek prirad libovolne cele cislo.
    Pokud je vek mensi nez 6, vypis Predskolni vek,
    pokud je vek v rozmezi 6 az 15 let, vypis Zak zakladni skoly,
    pokud je vek v rozmezi 16 az 19 let, vypis Nejspis zak stredni skoly,
    pokud je vek v rozmezi 20 az 26 let, vypis Nejspis vysokoskolsky student,
    pokud je vek vetsi nez 26 let, vypis Nejspis pracujici.

    Priklad vystupniho formatu:
    25 let = Nejspis vysokoskolsky student
    */
    private static void vekoveSkupiny() {
        int vek = 5;

        if (vek < 0) {
            throw new RuntimeException("Nejspíše nenarozene dite");
        }

        if (vek < 6) {
            System.out.println("Predskolni vek");
        } else if (vek >= 6 && vek <= 15) {
            System.out.println("Zak zakladni skoly");
        } else if (vek >= 16 && vek <= 19) {
            System.out.println("Nejspis zak stredni skoly");
        } else if (vek >= 20 && vek <= 26) {
            System.out.println("Nejspis vysokoskolsky student");
        } else {
            System.out.println("Nejspis pracujici");
        }
    }

    /*
    Do promenne cisloMesice prirad cislo mesice, podle ktereho nasledne vypis slovni nazev mesice.
    Pokud cisloMesice neodpovida zadnemu mesici, vypis {cisloMesice}. mesic neni :).

    Priklad vystupniho formatu:
    5. mesic je kveten
    */
    private static void mesice() {
        int cisloMesice = 5;

        if (cisloMesice == 1) {
            System.out.println(cisloMesice + ". měsíc je leden");
        } else if (cisloMesice == 2) {
            System.out.println(cisloMesice + ". měsíc je únor");
        } else if (cisloMesice == 3) {
            System.out.println(cisloMesice + ". měsíc je březen");
        } else if (cisloMesice == 4) {
            System.out.println(cisloMesice + ". měsíc je duben");
        } else if (cisloMesice == 5) {
            System.out.println(cisloMesice + ". měsíc je květen");
        } else if (cisloMesice == 6) {
            System.out.println(cisloMesice + ". měsíc je červen");
        } else if (cisloMesice == 7) {
            System.out.println(cisloMesice + ". měsíc je červenec");
        } else if (cisloMesice == 8) {
            System.out.println(cisloMesice + ". měsíc je srpen");
        } else if (cisloMesice == 9) {
            System.out.println(cisloMesice + ". měsíc je září");
        } else if (cisloMesice == 10) {
            System.out.println(cisloMesice + ". měsíc je říjen");
        } else if (cisloMesice == 11) {
            System.out.println(cisloMesice + ". měsíc je listopad");
        } else if (cisloMesice == 12) {
            System.out.println(cisloMesice + ". měsíc je prosinec");
        } else
            System.out.println(cisloMesice + ". měsíc není");
    }

}


