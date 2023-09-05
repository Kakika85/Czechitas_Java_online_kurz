package cz.test.uceni.czechitas;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class lekce7_OkenniAplikace {

    public static void main(String[] args) {
        JFrame okno = new JFrame("Moje první okénko :-)");
        okno.setVisible(true);
        okno.setSize(500,400);
        okno.setLocationRelativeTo(null);
        okno.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //Mimo zadání, ale štvalo mě, že po uzavíraní okna "x" musím dát stop :-)

        JLabel zprava = new JLabel("BAF!!!");
        zprava.setSize(200, 100);
        okno.add(zprava);
        zprava.setHorizontalAlignment(SwingConstants.CENTER);

        Font vetsiPismo = new Font("Arial", Font.BOLD,60);
        zprava.setFont(vetsiPismo);

        Random generatorNahodnychCisel = new Random();
        int cervenaSlozka = generatorNahodnychCisel.nextInt(256);
        int zelenaSlozka = generatorNahodnychCisel.nextInt(256);
        int modraSlozka = generatorNahodnychCisel.nextInt(256);

        Color nahodnaBarvaPisma = new Color(cervenaSlozka, zelenaSlozka, modraSlozka);
        zprava.setForeground(nahodnaBarvaPisma);

        int cervena = generatorNahodnychCisel.nextInt(256);
        int zelena = generatorNahodnychCisel.nextInt(256);
        int modra = generatorNahodnychCisel.nextInt(256);

        Color nahodnaBarvaPozadi = new Color(cervena, zelena, modra);
        zprava.setBackground(nahodnaBarvaPozadi);
        zprava.setOpaque(true);
    }
}

