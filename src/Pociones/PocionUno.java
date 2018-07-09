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
public class PocionUno extends PocionesBuilder{
    
    Personaje p = new Personaje();
    
    public int sumarVida = 50;
    public int sumarAtaque = 25;//25 del jugador + 25 pocion total ataca con 50

    public PocionUno(){
        super.pociones = new Pociones();
    }
    
    @Override
    public void buildTipo() {
        pociones.setTipo("Pocion uno suma vida?");
    }
    
    @Override
    public void sumarVida(){

        System.out.println(p.getNombre());
        System.out.println("Vida: "+p.getVida());
        System.out.println("Ataque: "+p.getAtaque());
        
        p.setVida(p.getVida() + sumarVida);
        p.setAtaque(p.getAtaque()+sumarAtaque);
        
        System.out.println("Vida nueva: "+p.getVida());
        System.out.println("Nuevo Ataque: "+p.getAtaque());
       
        
//        System.out.println("Vida: "+p.getVida());
//        System.out.println("se ha sumado "+sumarVida+" a la vida del personaje"+p.getNombre());
//        p.setVida(p.getVida()+sumarVida);
//        System.out.println("La nueva vida es: "+p.getVida());
//        
//        
//        p.getVida();
//        System.out.println(p.getVida());
//        System.out.println("Se ha sumado " + sumarVida + " a la vida del personaje");
//        p.sumarVida(sumarVida);
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
    public void sumarFullVida() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void restarVida() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
