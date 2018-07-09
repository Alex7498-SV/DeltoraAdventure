
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
public class VentanaPeleaMagoBoss extends JFrame {
    
   
    public JLabel mago, enemigo, atacar,lblvidaEnemigo, vidaEnemigo, lblvidaPer, vidaPer, atacaEne, finalPer, finalEne;
    
    AbstractVillano Av = new AbstractVillano();
    AbstractPersonaje Ap = new AbstractPersonaje();
    Enemigo e;
    Personaje p;
    
    private boolean play = true;
    private int turno = 1;
    int dannioE;// = e.getAtaque();
    int dannioP;
    

    public VentanaPeleaMagoBoss(){
        super("Pelea");
        
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/music/HL1_song26.wav"));
        sonido.play();
        
        e = Av.getNuevoEnemigo(2);
        this.dannioE = e.getAtaque();
        p = Ap.getPersonaje(1);
        this.dannioP = p.getAtaque();
        
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        VentanaDePelea();
        Container container = getContentPane();
        container.add(mago);
        container.add(enemigo);
        container.add(atacar);
        container.add(atacaEne);
        container.add(vidaEnemigo);
        container.add(vidaPer);
        container.add(lblvidaEnemigo);
        container.add(lblvidaPer);
        container.add(finalEne);
        container.add(finalPer);
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
        
        atacaEne = new JLabel("ATAQUE JEFE");
        atacaEne.setBounds(230, 100, 120, 40);
        atacaEne.setFont(new java.awt.Font("Miriam Fixed", 0, 16));
        atacaEne.setForeground(Color.red);
       
        lblvidaEnemigo = new JLabel("Vida Enemigo");
        lblvidaEnemigo.setBounds(270, 40, 200, 40);
        lblvidaEnemigo.setFont(new java.awt.Font("Miriam Fixed", 0, 12));
        lblvidaEnemigo.setForeground(Color.yellow);  
        
        vidaEnemigo = new JLabel(Integer.toString(e.getVida()));
        vidaEnemigo.setBounds(285, 60, 70, 40);
        vidaEnemigo.setFont(new java.awt.Font("Miriam Fixed", 0, 12));
        vidaEnemigo.setForeground(Color.yellow);
        
        finalEne = new JLabel(Integer.toString(e.getVida()));
        finalEne.setBounds(285, 80, 70, 40);
        finalEne.setFont(new java.awt.Font("Miriam Fixed", 0, 12));
        finalEne.setForeground(Color.yellow); 
        
        lblvidaPer = new JLabel("Vida Veneficus");
        lblvidaPer.setBounds(120, 140, 200, 40);
        lblvidaPer.setFont(new java.awt.Font("Miriam Fixed", 0, 12));
        lblvidaPer.setForeground(Color.yellow);
        
        vidaPer = new JLabel(Integer.toString(p.getVida()));
        vidaPer.setBounds(130, 160, 70, 40);
        vidaPer.setFont(new java.awt.Font("Miriam Fixed", 0, 12));
        vidaPer.setForeground(Color.yellow);
        
        finalPer = new JLabel(Integer.toString(p.getVida()));
        finalPer.setBounds(120, 180, 70, 40);
        finalPer.setFont(new java.awt.Font("Miriam Fixed", 0, 12));
        finalPer.setForeground(Color.yellow);

    }
        
    
    public void events(){
        atacar.addMouseListener(new GUI.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent ev) {
                if(e.getVida()<= 0){
                    JOptionPane.showMessageDialog(null, "Haz ganado la batalla!");
                    enemigo.setVisible(false);
                    vidaEnemigo.setVisible(false);
                    finalEne.setText(Integer.toString(e.getVida()));
                    
                }else{
                    restarVidaEnemigo(dannioE);
                    if (e.getVida() <= 0) {
//                        int a = 0;
                        vidaEnemigo.setText(Integer.toString(0));
                        JOptionPane.showMessageDialog(null, "Haz ganado la batalla!");
                        enemigo.setVisible(false);
                        vidaEnemigo.setVisible(false);
                        finalEne.setText(Integer.toString(0));
                        dispose();
                        new VentanaWin().setVisible(true);
                    } else {
                        vidaEnemigo.setText(Integer.toString(e.getVida()));
                        finalEne.setText(Integer.toString(e.getVida()));
                    }
                    System.out.println(e.getVida());
                }
            }
        });
        
        atacaEne.addMouseListener(new GUI.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent ev) {
                if(p.getVida()<= 0){
                    JOptionPane.showMessageDialog(null, "Ha ganado la batalla el JEFE");
                    mago.setVisible(false);
                    vidaPer.setVisible(false);
                    finalPer.setText(Integer.toString(p.getVida()));
                }else{
                    restarVidaPersonaje(dannioP);
                    if (p.getVida() <= 0) {
                        vidaPer.setText(Integer.toString(0));
                        JOptionPane.showMessageDialog(null, "Ha ganado la batalla el JEFE");
                        mago.setVisible(false);
                        vidaPer.setVisible(false);
                        finalPer.setText(Integer.toString(0));
                        dispose();
                        new VentanaGameOver().setVisible(true);
                    } else {
                        vidaPer.setText(Integer.toString(p.getVida()));
                        finalPer.setText(Integer.toString(p.getVida()));
                    }
                    System.out.println(p.getVida());
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
                new VentanaPeleaMagoEnemigo().setVisible(true);
            }
        });
        VentanaPeleaMagoEnemigo reproducir = new VentanaPeleaMagoEnemigo();
        reproducir.setVisible(true);
    }

}



