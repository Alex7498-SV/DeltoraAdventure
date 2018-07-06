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

/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class VentanaInventarioSpartano extends JFrame{
    
    private JLabel espada, hacha, lanza, nomEspada, nomHacha, nomLanza;
    
    public VentanaInventarioSpartano(){
        super("Inventario");
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
        setSize(500, 500);
        //events();
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
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaInventarioSpartano().setVisible(true);
            }
        });
    }
}
    

