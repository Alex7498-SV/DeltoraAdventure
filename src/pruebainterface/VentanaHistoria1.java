/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebainterface;

import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class VentanaHistoria1 extends JFrame {
    
    private JLabel lblTitulo, lblHistoria, lblFondo;
    
    public VentanaHistoria1(){
        super("Historia del personaje 1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        VentanaDeHistoria();
        Container container =  getContentPane();
        container.add(lblTitulo);
        container.add(lblHistoria);
        container.add(lblFondo);
        setSize(600, 600);
        this.setLocationRelativeTo(null);
    }
    
    public final void VentanaDeHistoria(){
        
        lblTitulo = new JLabel();
        lblHistoria = new JLabel();
        lblFondo = new JLabel();
        
        lblTitulo = new JLabel("MAGO DE CHERNOBYL");
        lblTitulo.setBounds(50, 20, 500, 500);
        
        lblTitulo.setFont(new java.awt.Font("Georgia", 3, 18));
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        
        lblHistoria = new JLabel("HISTORIAAAAA");
        lblHistoria.setBounds(250, 200, 500, 500);
        
        lblHistoria.setForeground(new java.awt.Color(255, 255, 255));
        lblHistoria.setFont(new java.awt.Font("Georgia", 3, 12));
        
        lblFondo.setBounds(0, 0, 600, 600);
        
        //Fondo de la historia del personaje 1
        lblFondo.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/bosque1.jpg")));
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaHistoria1().setVisible(true);
            }
        });
    }
    
}
