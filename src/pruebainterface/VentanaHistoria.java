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
public class VentanaHistoria extends JFrame {
    
    private JLabel lblHistoria, lblFondo;
    
    public VentanaHistoria(){
        super("Historia del juego");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        VentanaDeHistoria();
        Container container =  getContentPane();
        container.add(lblHistoria);
        container.add(lblFondo);
        setSize(600, 600);
        this.setLocationRelativeTo(null);
    }
    
    public final void VentanaDeHistoria(){
        lblHistoria = new JLabel();
        lblFondo = new JLabel();
        
               
        lblHistoria = new JLabel("PUTO EL QUE LO LEA");
        lblHistoria.setBounds(250, 200, 500, 500);
        
        lblFondo.setBounds(0, 0, 600, 600);
        
        lblFondo.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/fondoprueba.jpg")));
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaHistoria().setVisible(true);
            }
        });
    }
    
}
