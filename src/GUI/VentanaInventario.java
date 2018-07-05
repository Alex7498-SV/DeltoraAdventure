/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Container;
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
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        VentanaDeInventario();
        Container container =  getContentPane();
//        container.add(caldero);
//        container.add(espada);
//        container.add(hacha);
//        container.add(lanza);
//        container.add(libro);
//        container.add(varaDeBamboo);
        setSize(500, 500);
        //events();
        this.setLocationRelativeTo(null);
    }

    private void VentanaDeInventario() {
    
        this.getContentPane().setBackground(Color.gray);
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

