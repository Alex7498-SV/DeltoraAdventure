
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
public class VentanaPeleaGuerreroEnemigo extends JFrame {
    
    public JLabel mago, enemigo, atacar,vidaEnemigo;
    
    AbstractVillano Av = new AbstractVillano();
    AbstractPersonaje Ap = new AbstractPersonaje();
    Enemigo e;
    Personaje p;
    private boolean play = true;
    private int turno = 1;
    int dannio = e.getAtaque();
        

    public VentanaPeleaGuerreroEnemigo(){
        
        super("Pelea");
        
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/music/HL1_song26.wav"));
        sonido.play();
        e = Av.getNuevoEnemigo(1);
        p = Ap.getPersonaje(2);
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
        mago.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/nathanTrasera.png")));
        
        enemigo = new JLabel();
        enemigo.setBounds(140, 60, 40, 40);
        enemigo.setIcon(new ImageIcon(getClass().getResource("/imagenesMago/enemigoNathanF.png")));
        
        atacar = new JLabel("ATACAR");
        atacar.setBounds(280, 200, 70, 40);
        atacar.setFont(new java.awt.Font("Miriam Fixed", 0, 16));
        atacar.setForeground(Color.red);
       
//        vidaEnemigo = new JLabel(Integer.toString(Ee.getVida()));
//        vidaEnemigo.setBounds(295, 40, 70, 40);
//        vidaEnemigo.setFont(new java.awt.Font("Miriam Fixed", 0, 12));
//        vidaEnemigo.setForeground(Color.yellow);
        

    }
        
    
    public void events(){
        atacar.addMouseListener(new GUI.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent ev) {
                if(e.getVida()<= 0){
                    JOptionPane.showMessageDialog(null, "Haz ganado la batalla campeón");
                    enemigo.setVisible(false);
                    vidaEnemigo.setVisible(false);
                }else{
                    restarVidaEnemigo(dannio);
                    System.out.println(e.getVida());
                }
            }
        });
    }
      
    public void pelea(){
        while(play){
            if(p.getVida() > 0 && e.getVida() > 0){
                if (turno == 1){
                    events();
                    turno = 2;
                }else if(turno == 2){
                    restarVidaPersonaje(e.getAtaque());
                    turno = 1;
                }
            }
            
        }
    }
    
    public void restarVidaEnemigo(int rest){    
        e.setVida(e.getVida()-rest);
    }
    
    public void restarVidaPersonaje(int rest){
        p.setVida(p.getVida()- rest);
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaPeleaGuerreroEnemigo().setVisible(true);
            }
        });
        VentanaPeleaGuerreroEnemigo reproducir = new VentanaPeleaGuerreroEnemigo();
        reproducir.setVisible(true);
    }

}