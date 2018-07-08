/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Personajes.AbstractPersonaje;
import Personajes.Personaje;
import Pociones.PocionUno;
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

/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class VentanaPeleaMagoBoss extends JFrame {
    
    public JLabel mago, enemigo, atacar,vidaEnemigo;
    
    public int restarVida = 40;
    
    public VentanaPeleaMagoBoss(){
        
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
        enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/BossVeneficusF.png")));
        
        atacar = new JLabel("ATACAR");
        atacar.setBounds(280, 200, 70, 40);
        atacar.setFont(new java.awt.Font("Miriam Fixed", 0, 16));
        atacar.setForeground(Color.red);
        
        AbstractPersonaje Ap = new AbstractPersonaje();
        Personaje Pp;
        Pp = Ap.getPersonaje(1);
        
        vidaEnemigo = new JLabel(Integer.toString(Pp.getVida()));
        vidaEnemigo.setBounds(295, 40, 70, 40);
        vidaEnemigo.setFont(new java.awt.Font("Miriam Fixed", 0, 12));
        vidaEnemigo.setForeground(Color.yellow);

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
                restarVida();
            }
        });
    }
                
    public void restarVida(){

        Personaje pp = new Personaje();
        
        System.out.println(pp.getVida());
        System.out.println("se ha restado "+restarVida+" a la vida del personaje"+pp.getNombre());
        pp.setVida(pp.getVida()-restarVida);
        System.out.println("La nueva vida es "+pp.getVida());
    }
}
