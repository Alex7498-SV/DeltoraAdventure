
package pruebainterface;

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

/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class VentanaDeInicio extends JFrame {
    
  //  public JLabel = lblAlias;
    
//    public JButton = inicio;
    private JLabel lblAlias, lblNombrePersonaje1, lblNombrePersonaje2;
    public JTextField alias;
    private JButton inicio;
    public JLabel imagen1, imagen2;
     
    private static final int  ALTO = 40;
    
    public VentanaDeInicio(){
        super("Ventana Alias");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        agregarLabels();
        Ventana();
        Container container = getContentPane();
        container.add(inicio);
        container.add(lblAlias);
        container.add(lblNombrePersonaje1);
        container.add(lblNombrePersonaje2);
        container.add(alias);
        container.add(imagen1);
        container.add(imagen2);
        setSize(500, 500);
        eventos();
        this.setLocationRelativeTo(null);
    }    

    private final void agregarLabels() {
        lblAlias = new JLabel("NickName :");
        lblNombrePersonaje1 = new JLabel("VENEFICUS");
        lblNombrePersonaje2 = new JLabel("NATHAN");
        lblAlias.setBounds(50, 350, 90, ALTO);
        lblNombrePersonaje1.setBounds(110, 50, 90, ALTO);
        lblNombrePersonaje2.setBounds(320, 50, 90, ALTO);
    }
    
    public final void Ventana() {
        alias = new JTextField();
        
        inicio = new JButton("Iniciar");
        
        imagen1 = new JLabel();
        imagen2 = new JLabel();

        
        alias.setBounds(130, 360, 200, 20);
        
        inicio.setBounds(350, 350, 70, ALTO);
        
        imagen1.setBounds(90, 150, 100, 100);
        imagen2.setBounds(300, 150, 100, 100);
        
        
        
        imagen1.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/mago.jpg")));
        imagen2.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/guerrero.jpg")));
        
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaDeInicio().setVisible(true);
            }
        });
    }

    private void eventos() {
        inicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Pasa a ventana de juego");
                
                new VentanaHistoria1().setVisible(true);
                
            }
        });
        
        /**
         * Aqui se utiliza el metodo eliminado en la clase MouseListener
         */
        imagen1.addMouseListener( new pruebainterface.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                System.out.println("Personaje 1 elegido");
                MaestroVeneficus entrenadorVeneficus = new MaestroVeneficus();
                Creador creadorVeneficus =  new Creador(entrenadorVeneficus);
                creadorVeneficus.crearPersonaje();
                PersonajePrincipal Veneficus =  creadorVeneficus.getPersonajePrincipal();

                System.out.println(Veneficus.toString());
                
            }
            
            /**
             * Quiero que cuanto entre, semmuestre mi otra imagen que tengo pensado que sea un .gif
             * @param e 
             */
            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Entered");

                imagen1.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/mago1.jpg")));
                Container container = getContentPane();
                container.add(imagen1);
                imagen1 = new JLabel();
                imagen1.setBounds(90, 150, 100, 100);
            }
            
            /**
             * No me tira la imagen base cuando sale
             * Lo mismo para la imagen 2
             * @param e 
             */
            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Exited");
                
                imagen1.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/mago.jpg")));
                Container container = getContentPane();
                container.add(imagen1);
                imagen1 = new JLabel();
                imagen1.setBounds(90, 150, 100, 100);

            }
        });
        
        imagen2.addMouseListener(new pruebainterface.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Personaje 2 elegido");
                MaestroNathan entrenadorNathan = new MaestroNathan();
                Creador creadorNathan =  new Creador(entrenadorNathan);
                creadorNathan.crearPersonaje();
                PersonajePrincipal Nathan =  creadorNathan.getPersonajePrincipal();

                System.out.println(Nathan.toString());
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Entered");
                
                imagen2.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/guerreroSi.jpg")));
                Container container = getContentPane();
                container.add(imagen2);
                imagen2 = new JLabel();
                imagen2.setBounds(300, 150, 100, 100);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Exited");
                
//                imagen1.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/P51D.jpg")));
//                Container container = getContentPane();
//                container.add(imagen1);
//                imagen1 = new JLabel();
//                imagen1.setBounds(90, 150, 100, 100);
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

