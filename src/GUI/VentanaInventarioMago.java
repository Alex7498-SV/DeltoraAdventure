/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Container;
import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
//aallaallla
/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class VentanaInventarioMago extends JFrame{
    
    private JLabel libro, varita, caldero, nomLibro, nomVarita, nomCaldero,
            pocion1, pocion2, pocion3, pocion4, nomPo1, nomPo2, nomPo3, nomPo4;
    
    public VentanaInventarioMago(){
        super("Inventario");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        VentanaDeInventario();
        Container container =  getContentPane();
        container.add(libro);
        container.add(varita);
        container.add(caldero);
        container.add(nomLibro);
        container.add(nomVarita);
        container.add(nomCaldero);
        container.add(pocion1);
//        container.add(pocion2);
//        container.add(pocion3);
//        container.add(pocion4);
//        container.add(nomPo1);
//        container.add(nomPo2);
//        container.add(nomPo3);
//        container.add(nomPo4);
        setSize(500, 500);
        //events();
        this.setLocationRelativeTo(null);
    }

    private void VentanaDeInventario() {
        this.getContentPane().setBackground(Color.gray);
        
        nomLibro = new JLabel("ESCAPPINI DE VALDOR");
        nomLibro.setBounds(30, 40, 150, 40);
        nomLibro.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12));
        nomLibro.setForeground(Color.white);
        
        libro = new JLabel();
        libro.setBounds(40, 75, 100, 100);
        libro.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/libroMagico.png")));
        
        nomVarita = new JLabel("VARITA DE SAUCO");
        nomVarita.setBounds(190, 40, 150, 40);
        nomVarita.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12));
        nomVarita.setForeground(Color.white);
        
        varita = new JLabel();
        varita.setBounds(190, 75, 100, 100);
        varita.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/varaDeBamboo.png")));
        
        nomCaldero = new JLabel("CALDERO DEL DEMONIO");
        nomCaldero.setBounds(330, 40, 150, 40);
        nomCaldero.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12));
        nomCaldero.setForeground(Color.white);
        
        caldero = new JLabel();
        caldero.setBounds(340, 75, 100, 100);
        caldero.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/caldero.png")));
        
        //pociones
//        nomPo1 = new JLabel("POCION UNO");
//        nomPo1.setBounds(30, 40, 150, 40);
//        nomPo1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12));
//        nomPo1.setForeground(Color.white);
        
        pocion1 = new JLabel();
        pocion1.setBounds(40, 300, 100, 100);
        pocion1.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/pocion1.png")));

    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaInventarioMago().setVisible(true);
            }
        });
    }
}

