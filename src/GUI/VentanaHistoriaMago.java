/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class VentanaHistoriaMago extends JFrame {
    
    private JLabel lblFondo;
    private JButton Jugar;
    
    public VentanaHistoriaMago(){
        super("Historia del personaje 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        VentanaDeHistoria();
        Container container =  getContentPane();
        container.add(lblFondo);
        container.add(Jugar);
        setSize(600, 600);
        events();
        this.setLocationRelativeTo(null);
    }
    
    public final void VentanaDeHistoria(){

        lblFondo = new JLabel();
        lblFondo.setBounds(0, 0, 600, 600);        
        lblFondo.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/HistoriaSpartano.jpg")));
        
        Jugar = new JButton("Jugar");
        Jugar.setBounds(500, 500, 70, 40);
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaHistoriaMago().setVisible(true);
            }
        });
    }
    
    public void events(){
        Jugar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VentanaMapaEspartano().setVisible(true);
            }
        });
    }
}
