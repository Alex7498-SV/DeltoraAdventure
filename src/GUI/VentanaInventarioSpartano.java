/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Armas.AbstractArma;
import General.Usuario;
import Pociones.AbstractPocion;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class VentanaInventarioSpartano extends JFrame{
    
    private JLabel espada, hacha, lanza, nomEspada, nomHacha, nomLanza,
            pocion1, pocion2, pocion3, pocion4, nomPo1, nomPo2, nomPo3, nomPo4;
    
    public VentanaInventarioSpartano(){
        super("Inventario Espartano");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        VentanaDeInventario();
        Container container =  getContentPane();
        container.add(espada);
        container.add(hacha);
        container.add(lanza);
        container.add(nomEspada);
        container.add(nomHacha);
        container.add(nomLanza);
        container.add(pocion1);
        container.add(pocion2);
        container.add(pocion3);
        container.add(pocion4);
        container.add(nomPo1);
        container.add(nomPo2);
        container.add(nomPo3);
        container.add(nomPo4);
        setSize(500, 500);
        events();
        this.setLocationRelativeTo(null);
    }

    private void VentanaDeInventario() {
        this.getContentPane().setBackground(Color.gray);
        
        nomEspada = new JLabel("OBDULIANA");
        nomEspada.setBounds(50, 40, 150, 40);
        nomEspada.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12));
        nomEspada.setForeground(Color.white);
        
        espada = new JLabel();
        espada.setBounds(40, 75, 100, 100);
        espada.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/espada.png")));
        
        nomHacha = new JLabel("HACHIN MACHIN");
        nomHacha.setBounds(180, 40, 150, 40);
        nomHacha.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12));
        nomHacha.setForeground(Color.white);
        
        hacha = new JLabel();
        hacha.setBounds(190, 75, 100, 100);
        hacha.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/hacha.png")));
        
        nomLanza = new JLabel("LANZA DE LA MUERTE");
        nomLanza.setBounds(330, 40, 150, 40);
        nomLanza.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12));
        nomLanza.setForeground(Color.white);
        
        lanza = new JLabel();
        lanza.setBounds(340, 75, 100, 100);
        lanza.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/lanza.png")));
        
        nomPo1 = new JLabel("POCION UNO");
        nomPo1.setBounds(25, 250, 150, 40);
        nomPo1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12));
        nomPo1.setForeground(Color.white);
        
        pocion1 = new JLabel();
        pocion1.setBounds(30, 300, 100, 100);
        pocion1.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/pocion1.png")));
        
        nomPo2 = new JLabel("POCION DOS");
        nomPo2.setBounds(140, 250, 150, 40);
        nomPo2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12));
        nomPo2.setForeground(Color.white);
        
        pocion2 = new JLabel();
        pocion2.setBounds(145, 300, 100, 100);
        pocion2.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/pocion2.png")));
        
        nomPo3 = new JLabel("POCION TRES");
        nomPo3.setBounds(255, 250, 150, 40);
        nomPo3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12));
        nomPo3.setForeground(Color.white);
        
        
        pocion3 = new JLabel();
        pocion3.setBounds(260, 300, 100, 100);
        pocion3.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/pocion3.png")));
        
        nomPo4 = new JLabel("POCION CUATRO");
        nomPo4.setBounds(370, 250, 150, 40);
        nomPo4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12));
        nomPo4.setForeground(Color.white);
        
        pocion4 = new JLabel();
        pocion4.setBounds(375, 300, 100, 100);
        pocion4.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/pocion4.png")));
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaInventarioSpartano().setVisible(true);
            }
        });
    }
    
    public void events(){
        espada.addMouseListener(new GUI.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                AbstractArma abs = new AbstractArma();
                System.out.println("Arma espada elegida");
                Usuario.inventarioArmas.add(abs.getNuevaArma(5));//numero del arma en AbstractArma 'case 5'
                System.out.println("Arma: "+Usuario.inventarioArmas.get(0).getTipo()+". Ataque: "+Usuario.inventarioArmas.get(0).getValorAtaque());
                JOptionPane.showMessageDialog(null, espada);
                //agregarle el arma al personaje
                //solo toma una pos y esa es la pos 0 que es en donde se guarda la primera arma a la que se le de click
            }
        });
        
        hacha.addMouseListener(new GUI.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                AbstractArma abs = new AbstractArma();
                System.out.println("Arma hacha elegida");
                Usuario.inventarioArmas.add(abs.getNuevaArma(1));
                System.out.println("Arma: "+Usuario.inventarioArmas.get(1).getTipo()+". Ataque: "+Usuario.inventarioArmas.get(1).getValorAtaque());
                JOptionPane.showMessageDialog(null, hacha);
                //agregarle el arma al personaje
            }
        });
        
        lanza.addMouseListener(new GUI.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                AbstractArma abs = new AbstractArma();
                System.out.println("Arma lanza elegida");
                Usuario.inventarioArmas.add(abs.getNuevaArma(2));
                System.out.println("Arma: "+Usuario.inventarioArmas.get(2).getTipo()+". Ataque: "+Usuario.inventarioArmas.get(2).getValorAtaque());
                JOptionPane.showMessageDialog(null, lanza);
                //agregarle el arma al personaje
            }
        });
        
        pocion1.addMouseListener(new GUI.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                AbstractPocion abs = new AbstractPocion();
                System.out.println("Pocion uno elegida");
                Usuario.inventarioPociones.add(abs.getNuevaPocion(1));
                System.out.println("Pocion: "+Usuario.inventarioPociones.get(0).getTipo());
                JOptionPane.showMessageDialog(null, pocion1);
                //cero por la pos de la pocion en inventarioPociones
            }
        });
        
        pocion2.addMouseListener(new GUI.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                AbstractPocion abs = new AbstractPocion();
                System.out.println("Pocion dos elegida");
                Usuario.inventarioPociones.add(abs.getNuevaPocion(2));
                System.out.println("Pocion: "+Usuario.inventarioPociones.get(1).getTipo());
                JOptionPane.showMessageDialog(null, pocion2);
            }
        });
        
        pocion3.addMouseListener(new GUI.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                AbstractPocion abs = new AbstractPocion();
                System.out.println("Pocion tres elegida");
                Usuario.inventarioPociones.add(abs.getNuevaPocion(3));
                System.out.println("Pocion: "+Usuario.inventarioPociones.get(2).getTipo());
                JOptionPane.showMessageDialog(null, pocion3);
            }
        });
        
        pocion4.addMouseListener(new GUI.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                AbstractPocion abs = new AbstractPocion();
                System.out.println("Pocion cuatro elegida");
                Usuario.inventarioPociones.add(abs.getNuevaPocion(4));
                System.out.println("Pocion: "+Usuario.inventarioPociones.get(3).getTipo());
                JOptionPane.showMessageDialog(null, pocion4);
            }
        });
    }
}
    

