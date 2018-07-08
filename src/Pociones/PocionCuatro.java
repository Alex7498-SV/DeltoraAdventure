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
public class PocionCuatro extends PocionesBuilder{

    Personaje personajePrincipal = new Personaje();
    
    public int sumarVidaFull = 500;
    
    public PocionCuatro() {
        super.pociones = new Pociones();
    }

    @Override
    public void buildTipo() {
        pociones.setTipo("Pocion Cuatro sumar full vida?");
    }
    
    @Override
    public void sumarFullVida(){
        Personaje pp = new Personaje();
        
        System.out.println("Vida: "+pp.getVida());
        System.out.println("Se ha sunado "+ sumarVidaFull+" a la vida del jugador");
        pp.setVida(pp.getVida()+sumarVidaFull);
        System.out.println("La nueva vida es: "+pp.getVida());
        
        
//        System.out.println("Se ha sumado " + sumarVidaFull + " a la vida del jugador");
//        pp.sumarVida(sumarVidaFull);
    }

    @Override
    public void sumarVida() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sumarDanio() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pocionMisteriosa() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void restarVida() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
