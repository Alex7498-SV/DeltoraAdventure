/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import hilosdenemigos.HiloArribaAbajo;
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
    private JButton personaje;
    private int x = 80;
    private int y = 70;
    private final int alto = 40;
    private final int ancho = 40;
    private JLabel[] labels;

    Container container = getContentPane();

    public VentanaMapaMago() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        //events();

        lblFondo = new JLabel();
        lblFondo.setBounds(0, 0, 1080, 700);
        lblFondo.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/mapam.jpg")));

        personaje = new JButton(":v");
        personaje.setBounds(x, y, ancho, alto);
        personaje.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/veneficusFrontal.png")));
        setTitle("Deltora´s World.");

        labels = new JLabel[12];
//aallaallla
        for (int i = 0; i <= 12; i++) {
            if (i == 0) {
                labels[i] = new JLabel();
                labels[i].setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusF.png")));
                labels[i].setBounds(250, 175, 40, 40);
                container.add(labels[i]);
            }
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
            if (i == 3) {
                labels[i] = new JLabel();
                labels[i].setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusD.png")));
                labels[i].setBounds(650, 500, 40, 40);
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
            if (i == 7) {
                labels[i] = new JLabel();
                labels[i].setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusD.png")));
                labels[i].setBounds(500, 150, 40, 40);
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

        HiloArribaAbajo enemigo0 = new HiloArribaAbajo("enemigo0", 200, labels[0], labels[0].getX(), labels[0].getY());
        HiloArribaAbajo enemigo1 = new HiloArribaAbajo("enemigo1", 325, labels[1], labels[1].getX(), labels[1].getY());
        HiloDerechaIzquierda enemigo2 = new HiloDerechaIzquierda("enemigo2", 275, labels[2], labels[2].getX(), labels[2].getY());
        HiloDerechaIzquierda enemigo3 = new HiloDerechaIzquierda("enemigo3", 675, labels[3], labels[3].getX(), labels[3].getY());
        HiloArribaAbajo enemigo4 = new HiloArribaAbajo("enemigo4", 600, labels[4], labels[4].getX(), labels[4].getY());
        HiloDerechaIzquierda enemigo5 = new HiloDerechaIzquierda("enemigo5", 915, labels[5], labels[5].getX(), labels[5].getY());
        HiloDerechaIzquierda enemigo6 = new HiloDerechaIzquierda("enemigo6", 725, labels[6], labels[6].getX(), labels[6].getY());
        HiloDerechaIzquierda enemigo7 = new HiloDerechaIzquierda("enemigo7", 525, labels[7], labels[7].getX(), labels[7].getY());
        HiloArribaAbajo enemigo8 = new HiloArribaAbajo("enemigo8", 325, labels[8], labels[8].getX(), labels[8].getY());
        enemigo0.start();
        enemigo1.start();
        enemigo2.start();
        enemigo3.start();
        enemigo4.start();
        enemigo5.start();
        enemigo6.start();
        enemigo7.start();
        enemigo8.start();

        personaje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ventana inventario");
                new VentanaInventarioMago().setVisible(true);
            }
        });

        personaje.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyText(e.getKeyCode()));
                String action = e.getKeyText(e.getKeyCode());
                if ((y >= 35 && y <= 650) && (x >= 45 && x <= 1025)) {
                    if (action.equalsIgnoreCase("Arriba")) {
                        y -= 5;
                        personaje.setBounds(x, y, ancho, alto);
                        personaje.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/veneficusTrasera.png")));
                    }
                    if (action.equalsIgnoreCase("Abajo")) {
                        y += 5;
                        personaje.setBounds(x, y, ancho, alto);
                        personaje.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/veneficusFrontal.png")));
                    }
                    if (action.equalsIgnoreCase("Izquierda")) {
                        x -= 5;
                        personaje.setBounds(x, y, ancho, alto);
                        personaje.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/veneficusIzquierda.png")));
                    }
                    if (action.equalsIgnoreCase("Derecha")) {
                        x += 5;
                        personaje.setBounds(x, y, ancho, alto);
                        personaje.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/veneficusDerecha.png")));
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You Died");
                    x = 80;
                    y = 70;
                    personaje.setBounds(x, y, ancho, alto);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        container.add(personaje);
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
}
