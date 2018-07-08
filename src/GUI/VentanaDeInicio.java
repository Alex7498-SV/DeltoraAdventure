
package GUI;

import General.Usuario;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import Personajes.*;
import java.applet.AudioClip;
import java.awt.Color;
import javax.swing.JOptionPane;


/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class VentanaDeInicio extends JFrame {
    
    AbstractPersonaje sP = new AbstractPersonaje();
    
    Usuario usuario = new Usuario();
    
  //  public JLabel = lblAlias;
    

    
//    public JButton = inicio;
    private JLabel lblAlias, lblNombrePersonaje1, lblNombrePersonaje2, imagen1, imagen2, nombreJuego, fondo;
    public JTextField alias;
    private JButton inicio;

     
    private static final int  ALTO = 40;
    
    public VentanaDeInicio(){
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/music/HL1_song14.wav"));
        sonido.play();
        this.getContentPane().setBackground(Color.black);
        
        //super("Ventana Alias");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        agregarLabels();
        Container container = getContentPane();

        container.add(nombreJuego);
        container.add(inicio);
        container.add(lblAlias);
        container.add(lblNombrePersonaje1);
        container.add(lblNombrePersonaje2);
        container.add(alias);
        container.add(imagen1);
        container.add(imagen2);
        container.add(fondo);
        
        setSize(430, 270);
        eventos();
        this.setLocationRelativeTo(null);
    }    

    private final void agregarLabels() {
        lblAlias = new JLabel("NickName :");
        lblNombrePersonaje1 = new JLabel("VENEFICUS");
        lblNombrePersonaje2 = new JLabel("NATHAN");
        nombreJuego = new JLabel("Deltora's Adventure");
        alias = new JTextField();
        inicio = new JButton("Iniciar");
        imagen1 = new JLabel();
        imagen2 = new JLabel();
        fondo = new JLabel();
        
        lblAlias.setBounds(30, 180, 90, ALTO);
        lblNombrePersonaje1.setBounds(80, 30, 90, ALTO);
        lblNombrePersonaje2.setBounds(260, 30, 90, ALTO);
        nombreJuego.setBounds(150, 10, 200, 10);
        fondo.setBounds(0, 0, 430, 270);
        alias.setBounds(110, 190, 200, 20);
        inicio.setBounds(315, 190, 70, 20);
        imagen1.setBounds(60, 70, 100, 100);
        imagen2.setBounds(230, 70, 100, 100);
        
        lblAlias.setForeground(Color.white);
        lblNombrePersonaje1.setForeground(Color.white);
        lblNombrePersonaje2.setForeground(Color.white);
        nombreJuego.setForeground(Color.white);
        alias.setBackground(Color.BLACK);
        alias.setForeground(Color.WHITE);
        
        imagen1.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/veneficuspPlano.png")));
        imagen2.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/nathanpPlano.png")));
        fondo.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/minimapa.jpg")));
       
        
    }

    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaDeInicio().setVisible(true);
            }
        });
        VentanaDeInicio reproducir = new VentanaDeInicio();
        reproducir.setVisible(true);
    }
    
    
    int seleccion = 0;
    private void eventos() {
        
        
        inicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Pasa a ventana de juego");
                sP.getPersonaje(seleccion);
                //new VentanaHistoria2().setVisible(true);
                
//                usuario.setNombre(alias.getText());
                System.out.println("El nombre de usuario ingresado es: " + alias.getText());
                if(usuario.setNombre(alias.getText())){
                    
                    if (seleccion == 1){
                        dispose();
                        new VentanaHistoriaEspartano().setVisible(true);//abre ventana historia MAGOwtf
                       //new VentanaMapa().setVisible(true);
                        AudioClip sonido;
                        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/music/battle_loop2.wav"));
                        sonido.play();
                        //cuando sa clic en inicio, la musica de ventana inicio no para y tampoco para al dar click en jugar
                    }
                    if (seleccion == 2){
                        dispose();
                        new VentanaHistoriaMago().setVisible(true);//abre ventana historia ESPARTANO wtf.
                        //new VentanaMapa().setVisible(true);
                        AudioClip sonido;
                        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/music/HL1_song26.wav"));
                        sonido.play();
                    }if(seleccion == 0) JOptionPane.showMessageDialog(null, "Debes escojer un personaje antes de seguir.");
                    
                }else{
                    alias.setText("");
                    JOptionPane.showMessageDialog(null, "Nombre Invalido, escoge otro.\nTu nombre debe contener como minimo 3 caracteres\nY como maximo 12 caracteres");
                }
            }
        });
        
        /**
         * Aqui se utiliza el metodo eliminado en la clase MouseListener
         */
        imagen1.addMouseListener(new GUI.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Personaje 1 elegido");
                seleccion = 1;
                imagen1.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/veneficuspPlanoselec.png")));
                imagen2.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/nathanpPlano.png")));
                AudioClip sonido;
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/music/yes.wav"));
                sonido.play();
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Entered");

                imagen1.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/veneficuspPlanoselec.png")));
                
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Exited");
                if (seleccion == 1){
                    imagen1.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/veneficuspPlanoselec.png")));
                } else{
                    imagen1.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/veneficuspPlano.png")));
                }
            }
        });
        
        imagen2.addMouseListener(new GUI.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Personaje 2 elegido");
                seleccion = 2;
                imagen2.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/nathanpPlanoselec.png")));
                imagen1.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/veneficuspPlano.png")));
                AudioClip sonido;
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/music/9.wav"));
                sonido.play();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Entered");
                
                imagen2.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/nathanpPlanoselec.png")));

            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Exited");
                if (seleccion == 2){
                    imagen2.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/nathanpPlanoselec.png")));
                } else{
                imagen2.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/nathanpPlano.png")));
                }
            }
            
            
        });
    }
}

