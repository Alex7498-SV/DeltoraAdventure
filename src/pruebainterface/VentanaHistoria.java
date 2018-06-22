/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebainterface;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class VentanaHistoria extends JFrame {
    
    private JLabel lblHistoria;
    
    public VentanaHistoria(){
        super("Historia del juego");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        VentanaDeHistoria();
        Container container =  getContentPane();
        container.add(lblHistoria);
        setSize(600, 600);
        this.setLocationRelativeTo(null);
    }
    
    public final void VentanaDeHistoria(){
        lblHistoria = new JLabel();
        
        lblHistoria = new JLabel("NickName :");
        lblHistoria.setBounds(50, 350, 90, 90);
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
