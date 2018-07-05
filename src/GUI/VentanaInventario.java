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
public class VentanaInventario extends JFrame{
    
    private JLabel caldero, espada, hacha, lanza, libro, varaDeBamboo;
    
    public VentanaInventario(){
        super("Inventario");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        VentanaDeInventario();
        Container container =  getContentPane();
        container.add(caldero);
        container.add(espada);
        container.add(hacha);
        container.add(lanza);
        container.add(libro);
        container.add(varaDeBamboo);
        setSize(500, 500);
        //events();
        this.setLocationRelativeTo(null);
    }

    private void VentanaDeInventario() {
    
        this.getContentPane().setBackground(Color.gray);
        
        caldero = new JLabel();
        caldero.setBounds(0, 0, 100, 100);
        caldero.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/HistoriaSpartano.jpg")));
        
        espada = new JLabel();
        espada.setBounds(WIDTH, WIDTH, WIDTH, HEIGHT);
        espada.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/HistoriaSpartano.jpg")));
        
        hacha = new JLabel();
        hacha.setBounds(WIDTH, WIDTH, WIDTH, HEIGHT);
        hacha.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/HistoriaSpartano.jpg")));
        
        lanza = new JLabel();
        lanza.setBounds(WIDTH, WIDTH, WIDTH, HEIGHT);
        lanza.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/HistoriaSpartano.jpg")));
        
        libro = new JLabel();
        libro.setBounds(WIDTH, WIDTH, WIDTH, HEIGHT);
        libro.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/HistoriaSpartano.jpg")));
        
        varaDeBamboo = new JLabel();
        varaDeBamboo.setBounds(WIDTH, WIDTH, WIDTH, HEIGHT);
        varaDeBamboo.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/HistoriaSpartano.jpg")));
        
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaInventario().setVisible(true);
            }
        });
    }
}

