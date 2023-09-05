package cz.test.uceni.czechitas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

public class ProcvicovaniOkna {

    public static void main(String[] args) {
        JFrame okno = new JFrame("Moje první okénko :-)");
        okno.setVisible(true);
        okno.setSize(500,400);
        okno.setLocationRelativeTo(null);
        okno.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //Mimo zadání, ale štvalo mě, že po uzavíraní okna "x" musím dát stop :-)
        okno.setLayout(null);

        JButton klik = new JButton("KLIK");
        klik.setBounds(200,305, 100,50);
        okno.add(klik);

        // pokus o přidání akce tlačítku v podobě vypsání do console
        klik.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println ("LEK :o");
            }
        });

        JButton klik2 = new JButton("KLIK2");
        klik2.setBounds(50,305, 100,50);
        okno.add(klik2);

        // pokus o přidání akce tlačítku v podobě vypsání do console
        // pokus o přepsaní přes Lambdu
        klik2.addActionListener(e -> System.out.println ("LEK :o"));


        JLabel zprava = new JLabel("BAF!!!");
        zprava.setSize(500, 300);
        okno.add(zprava);
        zprava.setHorizontalAlignment(SwingConstants.CENTER);
        zprava.setVerticalAlignment(SwingConstants.NORTH);

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

