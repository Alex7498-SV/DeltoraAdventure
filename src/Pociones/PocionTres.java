/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pociones;

import Personajes.Personaje;

/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class PocionTres extends PocionesBuilder{
    
    Personaje personajePrincipal = new Personaje();
    
    public int sumarDanio = 15;
    
    public PocionTres() {
        super.pociones = new Pociones();
    }
    
    @Override
    public void buildTipo() {
        pociones.setTipo("Pocion Tres sumar danio?");
    }
    
    
    
    @Override
    public void sumarDanio(){
        Personaje pp = new Personaje();
        
        System.out.println("Ataque: "+pp.getAtaque());
        System.out.println("Se ha sumado " + sumarDanio + " al ataque del jugador");
        pp.setAtaque(pp.getAtaque()+sumarDanio);
        System.out.println("Ataque nuevo: "+ pp.getAtaque());
    }

    @Override
    public void sumarVida() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pocionMisteriosa() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sumarFullVida() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void restarVida() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
