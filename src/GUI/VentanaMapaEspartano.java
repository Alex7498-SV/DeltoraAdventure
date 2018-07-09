/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import hilosdenemigos.HiloAEspartano1;
import hilosdenemigos.HiloAEspartano11;
import hilosdenemigos.HiloAEspartano6;
import hilosdenemigos.HiloAEspartano7;
import hilosdenemigos.HiloArribaAbajo;
import hilosdenemigos.HiloDEspartano3;
import hilosdenemigos.HiloDEspartano9;
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
public class VentanaMapaEspartano extends JFrame {

    private JLabel[] labels;
    private JLabel lblFondo;
    static JLabel personaje = new JLabel();
    static private int x = 80, y = 80;
    static private int alto = 40, ancho = 40;

    Container container = getContentPane();

    public VentanaMapaEspartano() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(new TAdapter());
        setLayout(null);
        //events();
        labels = new JLabel[12];
        lblFondo = new JLabel();
        lblFondo.setBounds(0, 0, 1080, 700);
        lblFondo.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/mapaf.jpg")));

        personaje.setBounds(x, y, ancho, alto);
        personaje.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/nathanFrontal.png")));
        setTitle("Deltora´s World.");

        for (int i = 0; i <= 12; i++) {

            if (i == 1) {
                labels[i] = new JLabel();
                labels[i].setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanF.png")));
                labels[i].setBounds(200, 400, 40, 40);
                container.add(labels[i]);
            }

            if (i == 3) {
                labels[i] = new JLabel();
                labels[i].setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanF.png")));
                labels[i].setBounds(300, 540, 40, 40);
                container.add(labels[i]);
            }

            if (i == 6) {
                labels[i] = new JLabel();
                labels[i].setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanF.png")));
                labels[i].setBounds(900, 380, 40, 40);
                container.add(labels[i]);
            }
            if (i == 7) {
                labels[i] = new JLabel();
                labels[i].setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanF.png")));
                labels[i].setBounds(825, 175, 40, 40);
                container.add(labels[i]);
            }

            if (i == 9) {
                labels[i] = new JLabel();
                labels[i].setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanF.png")));
                labels[i].setBounds(625, 55, 40, 40);
                container.add(labels[i]);
            }

            if (i == 11) {
                labels[i] = new JLabel();
                labels[i].setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/enemigoNathanF.png")));
                labels[i].setBounds(500, 270, 40, 40);
                container.add(labels[i]);
            }

        }

        HiloAEspartano1 enemigo1 = new HiloAEspartano1("enemigo1", 425, labels[1], personaje, labels[1].getX(), labels[1].getY());
        HiloDEspartano3 enemigo3 = new HiloDEspartano3("enemigo3", 325,  labels[3],personaje, labels[3].getX(), labels[3].getY());

        HiloAEspartano6 enemigo6 = new HiloAEspartano6("enemigo6", 450, labels[6], personaje, labels[6].getX(), labels[6].getY());

        HiloAEspartano7 enemigo7 = new HiloAEspartano7("enemigo7", 200, labels[7],personaje, labels[7].getX(), labels[7].getY());
        HiloDEspartano9 enemigo9 = new HiloDEspartano9("enemigo9", 650, labels[9],personaje, labels[9].getX(), labels[9].getY());

        HiloAEspartano11 enemigo11 = new HiloAEspartano11("enemigo11", 300, labels[11], personaje, labels[11].getX(), labels[11].getY());

        enemigo1.start();    
        enemigo3.start();  
        enemigo6.start();
        enemigo7.start();
        enemigo9.start();   
        enemigo11.start();
//        personaje.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("ventana inventario");
//                new VentanaInventarioSpartano().setVisible(true);
//            }
//        });
        container.add(personaje);
        container.add(lblFondo);
        setSize(1080, 740);
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaMapaEspartano().setVisible(true);
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
            System.out.println(e.getKeyText(e.getKeyCode()));
            String action = e.getKeyText(e.getKeyCode());
            int key = e.getKeyCode();
            if (personaje.getX() == 80 && y == 200) {
                //860, 540
                x = 900;
                y = 600;
                personaje.setBounds(x, y, ancho, alto);
            }
            if (personaje.getX() == 925 && personaje.getY() == 600) {
                //860, 540
                x = 80;
                y = 150;
                personaje.setBounds(x, y, ancho, alto);
            }

            if ((personaje.getX() < 45 || personaje.getX() > 990) || (personaje.getY() < 45 || personaje.getY() > 620)) {
                JOptionPane.showMessageDialog(null, "You Died in the fire");
                x = 80;
                y = 70;
                personaje.setBounds(x, y, ancho, alto);
            } else if ((personaje.getX() >= 275 && personaje.getX() <= 378) && (personaje.getY() >= 45 && personaje.getY() <= 432)) {
                //JOptionPane.showMessageDialog(null, "You dont go in this way");
                if (personaje.getY() == 430) {
                    personaje.setBounds(personaje.getX(), personaje.getY() - 15, ancho, alto);
                } else if (personaje.getX() == 375) {
                    personaje.setBounds(personaje.getX() + 15, personaje.getY(), ancho, alto);
                } else {
                    personaje.setBounds(personaje.getX() - 15, personaje.getY(), ancho, alto);
                }
            } else if ((personaje.getX() >= 210 && personaje.getX() <= 375) && (personaje.getY() >= 180 && personaje.getY() <= 378)) {
                //JOptionPane.showMessageDialog(null, "You dont go in this way");
                if (personaje.getY() == 375) {
                    personaje.setBounds(personaje.getX(), personaje.getY() + 5, ancho, alto);
                } else if (personaje.getY() == 180) {
                    personaje.setBounds(personaje.getX(), personaje.getY() - 5, ancho, alto);
                } else if (personaje.getX() == 375) {
                    personaje.setBounds(personaje.getX() + 5, personaje.getY(), ancho, alto);
                } else {
                    personaje.setBounds(personaje.getX() - 5, personaje.getY(), ancho, alto);
                }
            } else if ((personaje.getX() >= 90 && personaje.getX() <= 195) && (personaje.getY() >= 180 && personaje.getY() <= 378)) {
                //JOptionPane.showMessageDialog(null, "You dont go in this way");
                if (y == 375) {
                    personaje.setBounds(personaje.getX(), personaje.getY() + 15, ancho, alto);
                } else if (personaje.getX() == 195) {
                    personaje.setBounds(personaje.getX() + 15, personaje.getY(), ancho, alto);
                } else if (personaje.getY() == 180) {
                    personaje.setBounds(personaje.getX(), personaje.getY() - 15, ancho, alto);
                } else {
                    personaje.setBounds(personaje.getX() - 15, personaje.getY(), ancho, alto);
                }
            } else if ((personaje.getX() >= 45 && personaje.getX() <= 195) && (personaje.getY() >= 240 && personaje.getY() <= 315)) {
                //JOptionPane.showMessageDialog(null, "You dont go in this way");
                if (personaje.getY() == 315) {
                    personaje.setBounds(personaje.getX(), personaje.getY() + 5, ancho, alto);
                } else if (personaje.getX() == 195) {
                    personaje.setBounds(personaje.getX() + 5, personaje.getY(), ancho, alto);
                } else if (personaje.getY() == 240) {
                    personaje.setBounds(personaje.getX(), personaje.getY() - 5, ancho, alto);
                } else {
                    personaje.setBounds(personaje.getX() - 5, personaje.getY(), ancho, alto);
                }
            } else if ((personaje.getX() >= 275 && personaje.getX() <= 750) && (personaje.getY() >= 345 && personaje.getY() <= 432)) {
                //JOptionPane.showMessageDialog(null, "You dont go in this way");
                if (personaje.getY() == 430) {
                    personaje.setBounds(personaje.getX(), personaje.getY() + 5, ancho, alto);
                } else if (personaje.getX() == 750) {
                    personaje.setBounds(personaje.getX() + 5, personaje.getY(), ancho, alto);
                } else if (personaje.getY() == 345) {
                    personaje.setBounds(personaje.getX(), personaje.getY() - 5, ancho, alto);
                } else {
                    personaje.setBounds(personaje.getX() - 5, personaje.getY(), ancho, alto);
                }
            } else if ((personaje.getX() >= 660 && personaje.getX() <= 750) && (personaje.getY() >= 135 && personaje.getY() <= 540)) {
                //JOptionPane.showMessageDialog(null, "You dont go in this way");
                if (personaje.getY() == 540) {
                    personaje.setBounds(personaje.getX(), personaje.getY() + 5, ancho, alto);
                } else if (personaje.getX() == 750) {
                    personaje.setBounds(personaje.getX() + 5, personaje.getY(), ancho, alto);
                } else if (personaje.getY() == 135) {
                    personaje.setBounds(personaje.getX(), personaje.getY() - 5, ancho, alto);
                } else {
                    personaje.setBounds(personaje.getX() - 5, personaje.getY(), ancho, alto);
                }
            } else if ((personaje.getX() >= 660 && personaje.getX() <= 750) && (personaje.getY() >= 135 && personaje.getY() <= 540)) {
                //JOptionPane.showMessageDialog(null, "You dont go in this way");
                if (personaje.getY() == 540) {
                    personaje.setBounds(personaje.getX(), personaje.getY() + 5, ancho, alto);
                } else if (personaje.getX() == 750) {
                    personaje.setBounds(personaje.getX() + 5, personaje.getY(), ancho, alto);
                } else if (personaje.getY() == 135) {
                    personaje.setBounds(personaje.getX(), personaje.getY() - 5, ancho, alto);
                } else {
                    personaje.setBounds(personaje.getX() - 5, personaje.getY(), ancho, alto);
                }
            } else if ((personaje.getX() >= 590 && personaje.getX() <= 825) && (personaje.getY() >= 450 && personaje.getY() <= 540)) {
                //  JOptionPane.showMessageDialog(null, "You dont go in this way");
                if (personaje.getY() == 540) {
                    personaje.setBounds(personaje.getX(), personaje.getY() + 5, ancho, alto);
                } else if (personaje.getX() == 825) {
                    personaje.setBounds(personaje.getX() + 5, personaje.getY(), ancho, alto);
                } else if (personaje.getY() == 450) {
                    personaje.setBounds(personaje.getX(), personaje.getY() - 5, ancho, alto);
                } else {
                    personaje.setBounds(personaje.getX() - 5, personaje.getY(), ancho, alto);
                }
            } else if ((personaje.getX() >= 590 && personaje.getX() <= 825) && (personaje.getY() >= 555 && personaje.getY() <= 700)) {
                // JOptionPane.showMessageDialog(null, "You dont go in this way");
                if (personaje.getY() == 700) {
                    personaje.setBounds(personaje.getX(), personaje.getY() + 5, ancho, alto);
                } else if (personaje.getX() == 825) {
                    personaje.setBounds(personaje.getX() + 5, personaje.getY(), ancho, alto);
                } else if (personaje.getY() == 555) {
                    personaje.setBounds(personaje.getX(), personaje.getY() - 5, ancho, alto);
                } else {
                    personaje.setBounds(personaje.getX() - 5, personaje.getY(), ancho, alto);
                }
            } else if ((personaje.getX() >= 460 && personaje.getX() <= 750) && (personaje.getY() >= 135 && personaje.getY() <= 210)) {
                //JOptionPane.showMessageDialog(null, "You dont go in this way");
                if (personaje.getY() == 210) {
                    personaje.setBounds(personaje.getX(), personaje.getY() + 5, ancho, alto);
                } else if (personaje.getX() == 750) {
                    personaje.setBounds(personaje.getX() + 5, personaje.getY(), ancho, alto);
                } else if (personaje.getY() == 135) {
                    personaje.setBounds(personaje.getX(), personaje.getY() - 5, ancho, alto);
                } else {
                    personaje.setBounds(personaje.getX() - 5, personaje.getY(), ancho, alto);
                }
            } else if ((personaje.getX() >= 375 && personaje.getX() <= 445) && (personaje.getY() >= 135 && personaje.getY() <= 210)) {
                // JOptionPane.showMessageDialog(null, "You dont go in this way");
                if (personaje.getY() == 210) {
                    personaje.setBounds(personaje.getX(), personaje.getY() + 5, ancho, alto);
                } else if (personaje.getX() == 445) {
                    personaje.setBounds(personaje.getX() + 5, personaje.getY(), ancho, alto);
                } else if (personaje.getY() == 135) {
                    personaje.setBounds(personaje.getX(), personaje.getY() - 5, ancho, alto);
                } else {
                    personaje.setBounds(personaje.getX() - 5, personaje.getY(), ancho, alto);
                }
            } else if ((personaje.getX() >= 750 && personaje.getX() <= 895) && (personaje.getY() >= 240 && personaje.getY() <= 315)) {
                //  JOptionPane.showMessageDialog(null, "You dont go in this way");
                if (personaje.getY() == 315) {
                    personaje.setBounds(personaje.getX(), personaje.getY() + 5, ancho, alto);
                } else if (personaje.getX() == 895) {
                    personaje.setBounds(personaje.getX() + 5, personaje.getY(), ancho, alto);
                } else if (personaje.getY() == 240) {
                    personaje.setBounds(personaje.getX(), personaje.getY() - 5, ancho, alto);
                } else {
                    personaje.setBounds(personaje.getX() - 5, personaje.getY(), ancho, alto);
                }
            } else if ((personaje.getX() >= 905 && personaje.getX() <= 1080) && (personaje.getY() >= 240 && personaje.getY() <= 315)) {
                //JOptionPane.showMessageDialog(null, "You dont go in this way");
                if (personaje.getY() == 315) {
                    personaje.setBounds(personaje.getX(), personaje.getY() + 15, ancho, alto);
                } else if (personaje.getX() == 1080) {
                    personaje.setBounds(personaje.getX() + 15, personaje.getY(), ancho, alto);
                } else if (personaje.getY() == 240) {
                    personaje.setBounds(personaje.getX(), personaje.getY() - 15, ancho, alto);
                } else {
                    personaje.setBounds(personaje.getX() - 15, personaje.getY(), ancho, alto);
                }
            } else {
                if (action.equalsIgnoreCase("Arriba")) {

                    personaje.setBounds(personaje.getX(), personaje.getY() - 5, ancho, alto);
                    personaje.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/nathanTrasera.png")));
                }
                if (action.equalsIgnoreCase("Abajo")) {
                    
                    personaje.setBounds(personaje.getX(), personaje.getY() + 5, ancho, alto);
                    personaje.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/nathanFrontal.png")));
                }
                if (action.equalsIgnoreCase("Izquierda")) {

                    personaje.setBounds(personaje.getX() - 5, personaje.getY(), ancho, alto);
                    personaje.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/nathanIzquierda.png")));
                }
                if (action.equalsIgnoreCase("Derecha")) {

                    personaje.setBounds(personaje.getX() + 5, personaje.getY(), ancho, alto);
                    personaje.setIcon(new ImageIcon(getClass().getResource("/imagenesEspartano/nathanDerecha.png")));
                }
                if (action.equalsIgnoreCase("I")) {
                    new VentanaInventarioSpartano().setVisible(true);
                }
            }
        }
    }
}
