/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

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
public class VentanaMapaEspartano extends JFrame {

    private JLabel lblFondo;
    private JButton personaje;
    private int x = 80;
    private int y = 70;
    private final int alto = 40;
    private final int ancho = 40;
    
    Container container =  getContentPane();

    
    public VentanaMapaEspartano(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        //events();
        
        lblFondo = new JLabel();
        lblFondo.setBounds(0, 0, 1080, 700);
        lblFondo.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/mapaf.jpg")));
                
        personaje = new JButton(":v");
        personaje.setBounds(x, y, ancho, alto);
        personaje.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/mago1.jpg")));
            setTitle("Deltora´s World.");
        
        personaje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ventana inventario");
                new VentanaInventario().setVisible(true);
            }
        });
            
        personaje.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
//////////////////////////////54 a lo ancho y 64 a lo largo //////////////////////
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyText(e.getKeyCode()));
                String action = e.getKeyText(e.getKeyCode());
                
                if((x < 45 || x > 990) || (y < 45 || y > 620)){
                    JOptionPane.showMessageDialog(null, "You Died in the fire");
                    x = 80;
                    y = 70;
                    personaje.setBounds(x, y, ancho, alto);
                } else if ((x >= 275 && x <= 378) && (y >= 45 && y <= 432)){
                    JOptionPane.showMessageDialog(null, "You dont go in this way");
                    if (y == 430 ){
                        y += 5;
                    } else if (x == 375){
                        x += 5;
                    } 
                    else{
                    x -= 5;
                    }
                } else if ((x >= 210 && x <= 375) && (y >= 180 && y <= 378)){
                    JOptionPane.showMessageDialog(null, "You dont go in this way");
                    if (y == 375 ){
                        y += 5;
                    } else if(y == 180){
                        y -= 5;
                    } else if(x == 375){
                        x += 5;
                    }
                    else{
                    x -= 5;
                    } 
                } else if ((x >= 90 && x <= 195) && (y >= 180 && y <= 378)){
                    JOptionPane.showMessageDialog(null, "You dont go in this way");
                    if (y == 375 ){
                        y += 5;
                    } else if(x == 195){
                        x += 5;
                    } else if(y == 180){
                        y -= 5;
                    } 
                    else{
                    x -= 5;
                    } 
                } else if ((x >= 45 && x <= 195) && (y >= 240 && y <= 315)){
                    JOptionPane.showMessageDialog(null, "You dont go in this way");
                    if (y == 315 ){
                        y += 5;
                    } else if(x == 195){
                        x += 5;
                    } else if(y == 240){
                        y -= 5;
                    } 
                    else{
                    x -= 5;
                    }
                } else if ((x >= 275 && x <= 750) && (y >= 345 && y <= 432)){
                    JOptionPane.showMessageDialog(null, "You dont go in this way");
                    if (y == 430 ){
                        y += 5;
                    } else if(x == 750){
                        x += 5;
                    } else if(y == 345){
                        y -= 5;
                    } 
                    else{
                    x -= 5;
                    }
                } else if ((x >= 660 && x <= 750) && (y >= 135 && y <= 540)){
                    JOptionPane.showMessageDialog(null, "You dont go in this way");
                    if (y == 540 ){
                        y += 5;
                    } else if(x == 750){
                        x += 5;
                    } else if(y == 135){
                        y -= 5;
                    } 
                    else{
                    x -= 5;
                    }
                } else if ((x >= 660 && x <= 750) && (y >= 135 && y <= 540)){
                    JOptionPane.showMessageDialog(null, "You dont go in this way");
                    if (y == 540 ){
                        y += 5;
                    } else if(x == 750){
                        x += 5;
                    } else if(y == 135){
                        y -= 5;
                    } 
                    else{
                    x -= 5;
                    }
                } 
                else {
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
                }
//                if((y >= 45 && y <= 620)&&(x >= 45 && x <= 990)) {
//                    if(action.equalsIgnoreCase("Arriba")){
//                        y -= 5;
//                        personaje.setBounds(x, y, ancho, alto);
//                    }
//                    if(action.equalsIgnoreCase("Abajo")){
//                        y += 5;
//                        personaje.setBounds(x, y, ancho, alto);
//                    }
//                    if(action.equalsIgnoreCase("Izquierda")){
//                        x -= 5;
//                        personaje.setBounds(x, y, ancho, alto);
//                    }
//                    if(action.equalsIgnoreCase("Derecha")){
//                        x += 5;
//                        personaje.setBounds(x, y, ancho, alto);
//                    }
//                }else {
//                    JOptionPane.showMessageDialog(null, "You Died");
//                    x = 80;
//                    y = 70;
//                    personaje.setBounds(x, y, ancho, alto);
//                }
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
                new VentanaMapaEspartano().setVisible(true);
            }
        });
    }
    
//    private void events(){
//        personaje.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("ventana inventario");
//            }
//        });
//    }
}