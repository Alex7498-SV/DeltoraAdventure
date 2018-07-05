
package pruebainterface;

import General.Usuario;
import PersonajesPrincipales.Creador;
import PersonajesPrincipales.MaestroNathan;
import PersonajesPrincipales.MaestroVeneficus;
import PersonajesPrincipales.PersonajePrincipal;
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
import PersonajesPrincipales.*;
import java.awt.Color;
import javax.swing.JOptionPane;


/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class VentanaDeInicio extends JFrame {
    
    SeleccionarPersonaje sP = new SeleccionarPersonaje();
    
    Usuario usuario = new Usuario();
    
  //  public JLabel = lblAlias;
    

    
//    public JButton = inicio;
    private JLabel lblAlias, lblNombrePersonaje1, lblNombrePersonaje2, imagen1, imagen2, nombreJuego, fondo;
    public JTextField alias;
    private JButton inicio;

     
    private static final int  ALTO = 40;
    
    public VentanaDeInicio(){
        
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
        
        imagen1.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/mago.png")));
        imagen2.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/guerrero1.png")));
        fondo.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/minimapa.jpg")));
       
        
    }

    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaDeInicio().setVisible(true);
            }
        });
    }
    
    
    int seleccion = 0;
    private void eventos() {
        
        
        inicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Pasa a ventana de juego");
                sP.elegirPersonaje(seleccion);
                //new VentanaHistoria2().setVisible(true);
                
//                usuario.setNombre(alias.getText());
                System.out.println("El nombre de usuario ingresado es: " + alias.getText());
                if(usuario.setNombre(alias.getText())){
                    
                    if (seleccion == 1){
                        dispose();
                       new VentanaHistoria1().setVisible(true);
                       //new VentanaMapa().setVisible(true);
                    }
                    if (seleccion == 2){
                        dispose();
                        //new VentanaHistoria2().setVisible(true);
                        new VentanaMapa().setVisible(true);
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
        imagen1.addMouseListener( new pruebainterface.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Personaje 1 elegido");
                seleccion = 1;
                imagen1.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/mago1.png")));
                imagen2.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/guerrero1.png")));
            }
            
            /**
             * Quiero que cuanto entre, semmuestre mi otra imagen que tengo pensado que sea un .gif
             * @param e 
             */
            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Entered");

                imagen1.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/mago1.png")));
                
            }
            
            /**
             * No me tira la imagen base cuando sale
             * Lo mismo para la imagen 2
             * @param e 
             */
            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Exited");
                if (seleccion == 1){
                    imagen1.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/mago1.png")));
                } else{
                    imagen1.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/mago.png")));
                }
            }
        });
        
        imagen2.addMouseListener(new pruebainterface.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Personaje 2 elegido");
                seleccion = 2;
                imagen2.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/guerreroSi.png")));
                imagen1.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/mago.png")));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Entered");
                
                imagen2.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/guerreroSi.png")));

            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Exited");
                if (seleccion == 2){
                    imagen2.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/guerreroSi.png")));
                } else{
                imagen2.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/guerrero1.png")));
                }
            }
            
            
        });
        
        
        
        
        /**
         * Si les quito el comentario en el Exit, si me voy a la primera imagen me aparece la imagen diferente y 
         * despues a la segunda, en la segunda no me aparece la imagen diferente, sino que la misma de base y cambia de pos.
         * pero si me voy primero a la 2da imagen me aparece la imagen diferente y
         * despues a la primera, no me cambia la imagen por la diferente
         * 
         * la imagen diferente es la que deberia de aparecer si entra
         * 
         */
        
    }
}

