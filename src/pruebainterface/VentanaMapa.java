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
public class VentanaMapa extends JFrame {
    
    private JLabel lblFondo;
    
    public VentanaMapa(){
        super("Historia del personaje 1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        VentanaDeHistoria();
        Container container =  getContentPane();
        container.add(lblFondo);
        setSize(1280, 768);
        this.setLocationRelativeTo(null);
    }
    
    public final void VentanaDeHistoria(){        

        lblFondo = new JLabel();
        
        lblFondo.setBounds(0, 0, 1280, 768);
        
        //Fondo de la historia del personaje 1
        lblFondo.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/MapaPrincipal.jpg")));
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaMapa().setVisible(true);
            }
        });
    }
    
}
