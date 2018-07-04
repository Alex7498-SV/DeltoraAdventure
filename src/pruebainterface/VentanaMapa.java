/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebainterface;

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
public class VentanaMapa extends JFrame {
    
    private JLabel lblFondo;
    private JButton personaje;
    private int x = 80;
    private int y = 70;
    private final int alto = 25;
    private final int ancho = 25;
    
    Container container =  getContentPane();
    
    public VentanaMapa(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        lblFondo = new JLabel();
        lblFondo.setBounds(0, 0, 1080, 700);
        lblFondo.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/mapaf.jpg")));
        
        personaje = new JButton(":v");
        personaje.setBounds(x, y, ancho, alto);
        
        personaje.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyText(e.getKeyCode()));
                String action = e.getKeyText(e.getKeyCode());
                if((y >= 35 && y <= 650)&&(x >= 45 && x <= 1025)) {
                    if(action.equalsIgnoreCase("Arriba")){
                        y -= 5;
                        personaje.setBounds(x, y, ancho, alto);
                    }
                    if(action.equalsIgnoreCase("Abajo")){
                        y += 5;
                        personaje.setBounds(x, y, ancho, alto);
                    }
                    if(action.equalsIgnoreCase("Izquierda")){
                        x -= 5;
                        personaje.setBounds(x, y, ancho, alto);
                    }
                    if(action.equalsIgnoreCase("Derecha")){
                        x += 5;
                        personaje.setBounds(x, y, ancho, alto);
                    }
                }else{
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
                new VentanaMapa().setVisible(true);
            }
        });
    }
    
}