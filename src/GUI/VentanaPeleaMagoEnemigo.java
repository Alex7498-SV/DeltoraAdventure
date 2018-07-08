/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Personajes.AbstractPersonaje;
import Personajes.Personaje;
import Pociones.PocionUno;
import Villanos.AbstractVillano;
import Villanos.Boss;
import Villanos.Enemigo;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class VentanaPeleaMagoEnemigo extends JFrame {
    
    public JLabel mago, enemigo, atacar,vidaEnemigo, ceroVida;
    
    public int restarVida = 40;
    
    public VentanaPeleaMagoEnemigo(){
        
        super("Pelea");
        
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/music/HL1_song26.wav"));
        sonido.play();
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        VentanaDePelea();
        Container container = getContentPane();
        container.add(mago);
        container.add(enemigo);
        container.add(atacar);
        container.add(vidaEnemigo);
        container.add(ceroVida);
        setSize(400, 300);
        events();
        this.setLocationRelativeTo(null);
    }
    
    public void VentanaDePelea(){
        
        this.getContentPane().setBackground(Color.black);
                
        mago = new JLabel();
        mago.setBounds(30, 180, 40, 40);        
        mago.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/veneficusTrasera.png")));
        
        enemigo = new JLabel();
        enemigo.setBounds(140, 60, 40, 40);
        enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoVeneficusF.png")));
        
        atacar = new JLabel("ATACAR");
        atacar.setBounds(280, 200, 70, 40);
        atacar.setFont(new java.awt.Font("Miriam Fixed", 0, 16));
        atacar.setForeground(Color.red);
        
        AbstractVillano Av = new AbstractVillano();
        
        Enemigo Ee = new Enemigo();
        Ee.getVida();
        //Ee = Av.getNuevoEnemigo(1, 0, 0.50);//selec, vida, ataq, recom
        //respecto al selec, se refiere al enemigo, selec 1 = enem normal
        //selec 2 = boss
        
        //da error porque quite todos los String recom en el paquete ya que
        //en buildTipoRecompensa() creo una pocion
        
//        Boss bs = new Boss();
//        bs.buildTipoRecompensa();
        
        AbstractPersonaje Ap = new AbstractPersonaje();
        Personaje Pp;
        Pp = Ap.getPersonaje(1);
        
        
        vidaEnemigo = new JLabel(Integer.toString(Ee.getVida()));
        vidaEnemigo.setBounds(295, 40, 70, 40);
        vidaEnemigo.setFont(new java.awt.Font("Miriam Fixed", 0, 12));
        vidaEnemigo.setForeground(Color.yellow);
        
        Ee.setVida(Ee.getVida()-restarVida);
        
        ceroVida = new JLabel(Integer.toString(Ee.getVida()-restarVida));
        ceroVida.setBounds(310, 40, 70, 40);
        ceroVida.setFont(new java.awt.Font("Miriam Fixed", 0, 12));
        ceroVida.setForeground(Color.yellow);
        ceroVida.setVisible(false);

    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaPeleaMagoEnemigo().setVisible(true);
            }
        });
        VentanaPeleaMagoEnemigo reproducir = new VentanaPeleaMagoEnemigo();
        reproducir.setVisible(true);
    }
    
    public void events(){
        atacar.addMouseListener(new GUI.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //restarVida();
                Enemigo Ee = new Enemigo();
                if(Ee.getVida()<=0){
                    JOptionPane.showMessageDialog(null, "Haz ganado la batalla campeón");
                    enemigo.setVisible(false);
                    vidaEnemigo.setVisible(false);
                    ceroVida.setVisible(false);
                }
            }
        });
    }
                
//    public void restarVida(){
//        AbstractVillano Av = new AbstractVillano();
//        Enemigo e;
//        e = Av.getNuevoEnemigo(1, 50, 25);
//        
//        System.out.println(e.getAtaque());
//        System.out.println(e.getVida());
//
//        
////        Enemigo enem = new Enemigo();
////        //int diez = 5;
////        System.out.println(enem.getVida());
////        System.out.println("se ha restado "+restarVida+" a la vida del enemigo");
////        enem.setVida(enem.getVida()-restarVida);
////        System.out.println("La nueva vida es "+enem.getVida());
//////        System.out.println("se ha restado "+diez+" a la vida del enemigo");
//////        enem.setVida(enem.getVida()-diez);
//////        System.out.println("La nueva vida es "+enem.getVida());
////        
//    }
//    

}