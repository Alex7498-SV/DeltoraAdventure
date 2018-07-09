/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import hilosdenemigos.HiloAMago1;
import hilosdenemigos.HiloAMago4;
import hilosdenemigos.HiloAMago8;
import hilosdenemigos.HiloArribaAbajo;
import hilosdenemigos.HiloDMago2;
import hilosdenemigos.HiloDMago5;
import hilosdenemigos.HiloDMago6;
import hilosdenemigos.HiloDerechaIzquierda;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.*;
import java.awt.KeyEventDispatcher;
import javax.swing.JOptionPane;

/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class VentanaMapaMago extends JFrame {

    private JLabel lblFondo;
    static JLabel personaj = new JLabel();
    static private int x = 80;
    static private int y = 80;
    static private int alto = 40;
    static private int ancho = 40;
    private JLabel[] labels;

    Container container = getContentPane();

    public VentanaMapaMago() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        //events();
        addKeyListener(new TAdapter());

        lblFondo = new JLabel();
        lblFondo.setBounds(0, 0, 1080, 700);
        lblFondo.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/mapam.jpg")));

        personaj.setBounds(x, y, ancho, alto);
        personaj.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/veneficusFrontal.png")));
        setTitle("Deltora´s World.");

        labels = new JLabel[10];
//aallaallla
        for (int i = 0; i <= 8; i++) {

            if (i == 1) {
                labels[i] = new JLabel();
                labels[i].setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusF.png")));
                labels[i].setBounds(200, 300, 40, 40);
                container.add(labels[i]);
            }
            if (i == 2) {
                labels[i] = new JLabel();
                labels[i].setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusD.png")));
                labels[i].setBounds(250, 550, 40, 40);
                container.add(labels[i]);
            }

            if (i == 4) {
                labels[i] = new JLabel();
                labels[i].setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusF.png")));
                labels[i].setBounds(770, 575, 40, 40);
                container.add(labels[i]);
            }
            if (i == 5) {
                labels[i] = new JLabel();
                labels[i].setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusD.png")));
                labels[i].setBounds(890, 325, 40, 40);
                container.add(labels[i]);
            }
            if (i == 6) {
                labels[i] = new JLabel();
                labels[i].setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusD.png")));
                labels[i].setBounds(700, 50, 40, 40);
                container.add(labels[i]);
            }
            if (i == 8) {
                labels[i] = new JLabel();
                labels[i].setIcon(new ImageIcon(getClass().getResource("/imagenesMago/BossVeneficusF.png")));
                labels[i].setBounds(500, 300, 40, 40);
                container.add(labels[i]);
            }//aallallla175,300,250,650,600,890,700,500,300
        }
        //aallallla

        HiloAMago1 enemigo1 = new HiloAMago1("Mago1", 325, labels[1], personaj, labels[1].getX(), labels[1].getY());
        HiloDMago2 enemigo2 = new HiloDMago2("Mago2", 275, labels[2], personaj, labels[2].getX(), labels[2].getY());
//        
        HiloAMago4 enemigo4 = new HiloAMago4("Mago4", 600, labels[4], personaj, labels[4].getX(), labels[4].getY());
        HiloDMago5 enemigo5 = new HiloDMago5("Mago5", 915, labels[5], personaj, labels[5].getX(), labels[5].getY());
        HiloDMago6 enemigo6 = new HiloDMago6("Mago6", 725, labels[6], personaj, labels[6].getX(), labels[6].getY());
        HiloAMago8 enemigo8 = new HiloAMago8("Mago8", 325, labels[8], personaj, labels[8].getX(), labels[8].getY());
        enemigo1.start();
        enemigo2.start();
        enemigo4.start();
        enemigo5.start();
        enemigo6.start();
        enemigo8.start();

        container.add(personaj);

        container.add(lblFondo);
        setSize(1080, 740);

        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaMapaMago().setVisible(true);
            }
        });
    }

//    private void events(){
//        personaje.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("ventana inventario");
//            }
//        });
//    }
    private static class TAdapter extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {
//            System.out.println(e.getKeyText(e.getKeyCode()));
            String action = e.getKeyText(e.getKeyCode());

            int key = e.getKeyCode();
            if ((personaj.getX() < 65 || personaj.getX() > 1034) || (personaj.getY() < 40 || personaj.getY() > 680)) {
                JOptionPane.showMessageDialog(null, "Moriste en el vacio DDDD:");
                x = 80;
                y = 70;
                personaj.setBounds(x, y, ancho, alto);
            } else if ((personaj.getX() >= 300 && personaj.getX() <= 360) && (personaj.getY() >= 80 && personaj.getY() <= 250)) {
                if (personaj.getX() == 300) {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                } else {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                }
            } else if ((personaj.getX() >= 350 && personaj.getX() <= 425) && (personaj.getY() >= 180 && personaj.getY() <= 580)) {

                if (personaj.getY() == 350) {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                } else if (personaj.getX() == 425) {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                } else if (personaj.getY() == 580) {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                } else {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                }
            } else if ((personaj.getX() >= 65 && personaj.getX() <= 185) && (personaj.getY() >= 400 && personaj.getY() <= 475)) {

                if (personaj.getY() == 400) {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                } else if (personaj.getX() == 185) {
                    personaj.setBounds(personaj.getX() + 5, personaj.getY(), ancho, alto);
                } else if (personaj.getY() == 475) {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);

                }
            } else if ((personaj.getX() >= 100 && personaj.getX() <= 185) && (personaj.getY() >= 330 && personaj.getY() <= 475)) {
                if (personaj.getY() == 330) {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                } else if (personaj.getX() == 100) {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                } else if (personaj.getY() == 475) {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                } else {
                    personaj.setBounds(personaj.getX() + 5, personaj.getY(), ancho, alto);
                }
            } else if ((personaj.getX() >= 235 && personaj.getX() <= 425) && (personaj.getY() >= 350 && personaj.getY() <= 475)) {

                if (personaj.getY() == 350) {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                } else if (personaj.getX() == 235) {
                    personaj.setBounds(personaj.getX() - 5, personaj.getY(), ancho, alto);
                } else if (personaj.getY() == 475) {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                } else {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                }
            } else if ((personaj.getX() >= 425 && personaj.getX() <= 860) && (personaj.getY() >= 400 && personaj.getY() <= 475)) {

                if (personaj.getY() == 400) {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                } else if (personaj.getX() == 475) {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                } else if (personaj.getY() == 475) {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                } else {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                }
            } else if ((personaj.getX() >= 805 && personaj.getX() <= 870) && (personaj.getY() >= 180 && personaj.getY() <= 310)) {

                if (personaj.getY() == 180) {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                } else if (personaj.getX() == 805) {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                } else if (personaj.getY() == 310) {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                } else {
                    personaj.setBounds(personaj.getX() + 5, personaj.getY(), ancho, alto);
                }
            } else if ((personaj.getX() >= 805 && personaj.getX() <= 870) && (personaj.getY() >= 400 && personaj.getY() <= 580)) {

                if (personaj.getY() == 400) {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                } else if (personaj.getX() == 805) {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                } else if (personaj.getY() == 580) {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                } else {
                    personaj.setBounds(personaj.getX() + 5, personaj.getY(), ancho, alto);
                }
            } else if ((personaj.getX() >= 870 && personaj.getX() <= 945) && (personaj.getY() >= 180 && personaj.getY() <= 260)) {

                if (personaj.getY() == 180) {
                    personaj.setBounds(personaj.getX(), personaj.getY() - 5, ancho, alto);
                    personaj.setBounds(x, y, ancho, alto);
                } else if (personaj.getX() == 870) {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                } else if (personaj.getY() == 240) {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                } else {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                }
            } else if ((personaj.getX() >= 922 && personaj.getX() <= 1025) && (personaj.getY() >= 510 && personaj.getY() <= 580)) {

                if (personaj.getY() == 510) {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                } else if (personaj.getX() == 922) {
                    personaj.setBounds(personaj.getX() - 5, personaj.getY(), ancho, alto);
                } else if (personaj.getY() == 1025) {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                } else {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                }
            } else if ((personaj.getX() >= 425 && personaj.getX() <= 500) && (personaj.getY() >= 510 && personaj.getY() <= 585)) {

                if (personaj.getY() == 510) {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                } else if (personaj.getX() == 425) {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                } else if (personaj.getY() == 585) {
                    personaj.setBounds(personaj.getX(), personaj.getY() - 5, ancho, alto);
                } else {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                }
            } else if ((personaj.getX() >= 675 && personaj.getX() <= 750) && (personaj.getY() >= 180 && personaj.getY() <= 475)) {

                personaj.setBounds(x, y, ancho, alto);
                if (personaj.getY() == 180) {
                    personaj.setBounds(personaj.getX(), personaj.getY() - 5, ancho, alto);
                } else if (personaj.getX() == 675) {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                } else if (personaj.getY() == 475) {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                } else {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                }
            } else if ((personaj.getX() >= 470 && personaj.getX() <= 750) && (personaj.getY() >= 180 && personaj.getY() <= 260)) {

                if (personaj.getY() == 180) {
                    personaj.setBounds(personaj.getX(), personaj.getY() - 5, ancho, alto);
                } else if (personaj.getX() == 470) {
                    personaj.setBounds(personaj.getX() - 5, personaj.getY(), ancho, alto);
                } else if (personaj.getY() == 260) {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                } else {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                }
            } else if ((personaj.getX() >= 550 && personaj.getX() <= 750) && (personaj.getY() >= 80 && personaj.getY() <= 145)) {

                if (personaj.getY() == 80) {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                } else if (personaj.getX() == 550) {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                } else if (personaj.getY() == 145) {
                    personaj.setBounds(personaj.getX(), personaj.getY() + 15, ancho, alto);
                } else {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                }
            } else if ((personaj.getX() >= 550 && personaj.getX() <= 615) && (personaj.getY() >= 10 && personaj.getY() <= 80)) {

                if (personaj.getY() == 10) {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                } else if (personaj.getX() == 550) {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                } else if (personaj.getY() == 80) {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                } else {
                    JOptionPane.showMessageDialog(null, "Moriste en la lava D:");
                    personaj.setBounds(x, y, ancho, alto);
                }
            } else {
                if (action.equalsIgnoreCase("Arriba")) {

                    personaj.setBounds(personaj.getX(), personaj.getY() - 5, ancho, alto);
                    personaj.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/veneficusTrasera.png")));
                }
                if (action.equalsIgnoreCase("Abajo")) {

                    personaj.setBounds(personaj.getX(), personaj.getY() + 5, ancho, alto);
                    personaj.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/veneficusFrontal.png")));
                }
                if (action.equalsIgnoreCase("Izquierda")) {

                    personaj.setBounds(personaj.getX() - 5, personaj.getY(), ancho, alto);
                    personaj.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/veneficusIzquierda.png")));
                }
                if (action.equalsIgnoreCase("Derecha")) {

                    personaj.setBounds(personaj.getX() + 5, personaj.getY(), ancho, alto);
                    personaj.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/veneficusDerecha.png")));
                }
            }
        }

    }

//    private void events(){
//        personaje.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("ventana inventario");
//            }
//        });
//    }
}
