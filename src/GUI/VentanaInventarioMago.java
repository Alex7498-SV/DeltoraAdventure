/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Armas.AbstractArma;
import General.Usuario;
import Personajes.AbstractPersonaje;
import Pociones.AbstractPocion;
import Pociones.*;
import Pociones.Pociones;
import Villanos.Enemigo;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
//aallaallla
/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class VentanaInventarioMago extends JFrame{
    
    private JLabel libro, varita, caldero, nomLibro, nomVarita, nomCaldero,
            pocion1, pocion2, pocion3, pocion4, nomPo1, nomPo2, nomPo3, nomPo4;
    
    AbstractPersonaje Ap = new AbstractPersonaje();
    Enemigo e;
    
    public VentanaInventarioMago(){
        super("Inventario Mago");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        VentanaDeInventario();
        Container container =  getContentPane();
        container.add(libro);
        container.add(varita);
        container.add(caldero);
        container.add(nomLibro);
        container.add(nomVarita);
        container.add(nomCaldero);
        container.add(pocion1);
        container.add(pocion2);
        container.add(pocion3);
        container.add(pocion4);
        container.add(nomPo1);
        container.add(nomPo2);
        container.add(nomPo3);
        container.add(nomPo4);
        setSize(500, 500);
        events();
        this.setLocationRelativeTo(null);
    }

    private void VentanaDeInventario() {
        this.getContentPane().setBackground(Color.gray);
        
        nomLibro = new JLabel("ESCAPPINI DE VALDOR");
        nomLibro.setBounds(30, 40, 150, 40);
        nomLibro.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12));
        nomLibro.setForeground(Color.white);
        
        libro = new JLabel();
        libro.setBounds(40, 75, 100, 100);
        libro.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/libroMagico.png")));
        
        nomVarita = new JLabel("VARITA DE SAUCO");
        nomVarita.setBounds(190, 40, 150, 40);
        nomVarita.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12));
        nomVarita.setForeground(Color.white);
        
        varita = new JLabel();
        varita.setBounds(190, 75, 100, 100);
        varita.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/varaDeBamboo.png")));
        
        nomCaldero = new JLabel("CALDERO DEL DEMONIO");
        nomCaldero.setBounds(330, 40, 150, 40);
        nomCaldero.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12));
        nomCaldero.setForeground(Color.white);
        
        caldero = new JLabel();
        caldero.setBounds(340, 75, 100, 100);
        caldero.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/caldero.png")));
        
        //pociones
        nomPo1 = new JLabel("POCION UNO");
        nomPo1.setBounds(25, 250, 150, 40);
        nomPo1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12));
        nomPo1.setForeground(Color.white);
        
        pocion1 = new JLabel();
        pocion1.setBounds(30, 300, 100, 100);
        pocion1.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/pocion1.png")));
        
        nomPo2 = new JLabel("POCION DOS");
        nomPo2.setBounds(140, 250, 150, 40);
        nomPo2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12));
        nomPo2.setForeground(Color.white);
        
        pocion2 = new JLabel();
        pocion2.setBounds(145, 300, 100, 100);
        pocion2.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/pocion2.png")));
        
        nomPo3 = new JLabel("POCION TRES");
        nomPo3.setBounds(255, 250, 150, 40);
        nomPo3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12));
        nomPo3.setForeground(Color.white);
        
        
        pocion3 = new JLabel();
        pocion3.setBounds(260, 300, 100, 100);
        pocion3.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/pocion3.png")));
        
        nomPo4 = new JLabel("POCION CUATRO");
        nomPo4.setBounds(370, 250, 150, 40);
        nomPo4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12));
        nomPo4.setForeground(Color.white);
        
        pocion4 = new JLabel();
        pocion4.setBounds(375, 300, 100, 100);
        pocion4.setIcon(new ImageIcon(getClass().getResource("/personajeimagen/pocion4.png")));

    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaInventarioMago().setVisible(true);
            }
        });
    }
    
    public void events(){
        libro.addMouseListener(new GUI.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                AbstractArma abs = new AbstractArma();
                System.out.println("Arma libro elegida");
                Usuario.inventarioArmas.add(abs.getNuevaArma(6));//numero del arma en AbstractArma 'case 6'
                System.out.println("Arma: "+Usuario.inventarioArmas.get(Usuario.inventarioArmas.size()-1).getTipo()+". Ataque: "+Usuario.inventarioArmas.get(Usuario.inventarioArmas.size()-1).getValorAtaque());
                JOptionPane.showMessageDialog(null, libro);
                System.out.println("Num de elem en lista inventario armas "+Usuario.inventarioArmas.size());
                //agregarle el arma al personaje
                //solo toma una pos y esa es la pos 0 que es en donde se guarda la primera arma a la que se le de click
            }
        });
        
        varita.addMouseListener(new GUI.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                AbstractArma abs = new AbstractArma();
                System.out.println("Arma varita elegida");
                Usuario.inventarioArmas.add(abs.getNuevaArma(4));
                System.out.println("Arma: "+Usuario.inventarioArmas.get(Usuario.inventarioArmas.size()-1).getTipo()+". Ataque: "+Usuario.inventarioArmas.get(Usuario.inventarioArmas.size()-1).getValorAtaque());
                JOptionPane.showMessageDialog(null, varita);
                System.out.println("Num de elem en lista inventario armas "+Usuario.inventarioArmas.size());
                //agregarle el arma al personaje
            }
        });
        
        caldero.addMouseListener(new GUI.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                AbstractArma abs = new AbstractArma();
                System.out.println("Arma caldero elegida");
                Usuario.inventarioArmas.add(abs.getNuevaArma(3));
                
                System.out.println("Arma: "+Usuario.inventarioArmas.get(Usuario.inventarioArmas.size()-1).getTipo()+". Ataque: "+Usuario.inventarioArmas.get(Usuario.inventarioArmas.size()-1).getValorAtaque());
                JOptionPane.showMessageDialog(null, caldero);
                System.out.println("Num de elem en lista inventario armas "+Usuario.inventarioArmas.size());
                //agregarle el arma al personaje
            }
        });
        
        pocion1.addMouseListener(new GUI.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                AbstractPocion abs = new AbstractPocion();
                System.out.println("Pocion uno elegida");
                Usuario.inventarioPociones.add(abs.getNuevaPocion(1));
                System.out.println("Pocion: "+Usuario.inventarioPociones.get(Usuario.inventarioPociones.size()-1).getTipo());
                //System.out.println(Pociones.PocionUno);
                PocionUno pocionUno = new PocionUno();
                pocionUno.sumarVida();
                JOptionPane.showMessageDialog(null, pocion1);
                System.out.println("Num de elem en lista inventario armas "+Usuario.inventarioPociones.size());
            }
        });
        
        pocion2.addMouseListener(new GUI.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                AbstractPocion abs = new AbstractPocion();
                System.out.println("Pocion dos elegida");
                Usuario.inventarioPociones.add(abs.getNuevaPocion(2));
                System.out.println("Pocion: "+Usuario.inventarioPociones.get(Usuario.inventarioPociones.size()-1).getTipo());
                PocionDos pocionDos = new PocionDos();
                pocionDos.pocionMisteriosa();
                JOptionPane.showMessageDialog(null, pocion2);
                System.out.println("Num de elem en lista inventario armas "+Usuario.inventarioPociones.size());
            }
        });
        
        pocion3.addMouseListener(new GUI.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                AbstractPocion abs = new AbstractPocion();
                System.out.println("Pocion tres elegida");
                Usuario.inventarioPociones.add(abs.getNuevaPocion(3));
                System.out.println("Pocion: "+Usuario.inventarioPociones.get(Usuario.inventarioPociones.size()-1).getTipo());
                PocionTres pocionTres = new PocionTres();
                pocionTres.sumarDanio();
                JOptionPane.showMessageDialog(null, pocion3);
                System.out.println("Num de elem en lista inventario armas "+Usuario.inventarioPociones.size());
            }
        });
        
        pocion4.addMouseListener(new GUI.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                AbstractPocion abs = new AbstractPocion();
                System.out.println("Pocion cuatro elegida");
                Usuario.inventarioPociones.add(abs.getNuevaPocion(4));
                System.out.println("Pocion: "+Usuario.inventarioPociones.get(Usuario.inventarioPociones.size()-1).getTipo());
                PocionCuatro pocionCuatro = new PocionCuatro();
                pocionCuatro.sumarFullVida();
                JOptionPane.showMessageDialog(null, pocion4);
                System.out.println("Num de elem en lista inventario armas "+Usuario.inventarioPociones.size());
            }
        });
    }
}
