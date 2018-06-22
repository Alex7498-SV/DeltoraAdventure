/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebainterface;

import java.awt.event.MouseEvent;

/**
 * Clase creadad para no tener todos los metodos del MouseListener dentro del
 * metodo "evento()" que esta en la clase VentanaDeInicio
 * que este MouseListener es utilizado por las imagenes de los persojanes
 * donde se selecciona el personaje
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */

/**
 * En esta clase MouseListener se utiliza 'abstract' y se elimina el metodo que se usara en la 
 * calse VentanaDeInicio que me sirve para seleccionar los personajes. estando ya en la clase que utiliza el metodo eliminado 
 * aqui, se agrega y esta lista para ejecutarla
 * 
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */

public abstract class MouseListener implements java.awt.event.MouseListener{
    
    //Aqui va el metodo eliminado "mouseClicked(MouseEvent e)"

     @Override
    public void mousePressed(MouseEvent e) {
 //       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
   //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
