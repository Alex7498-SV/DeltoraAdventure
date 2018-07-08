/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pociones;

import PersonajesPrincipales.AbstractPersonajePrincipal;
import PersonajesPrincipales.Nathan;
import PersonajesPrincipales.PersonajePrincipal;

/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class PocionUno extends PocionesBuilder{
    
//    PersonajePrincipal personajePrincipal = new PersonajePrincipal();
    
    public int sumarVida = 50;

    public PocionUno(){
        super.pociones = new Pociones();
    }
    
    @Override
    public void buildTipo() {
        pociones.setTipo("Pocion uno suma vida?");
    }
    
    @Override
    public void sumarVida(){
        PersonajePrincipal Pp;
        AbstractPersonajePrincipal pp = new AbstractPersonajePrincipal();
        Pp = pp.getPersonajePrincipal(1);
        
        System.out.println(Pp.getNombre());
        System.out.println("Vida: "+Pp.getVida());
        System.out.println("Ataque: "+Pp.getAtaque());
        
        Pp.setVida(Pp.getVida() + sumarVida);
        
        System.out.println("Vida1: "+Pp.getVida());
        
//        System.out.println("Vida: "+pp.getVida());
//        System.out.println("se ha sumado "+sumarVida+" a la vida del personaje"+pp.getNombre());
//        pp.setVida(pp.getVida()+sumarVida);
//        System.out.println("La nueva vida es: "+pp.getVida());
        
//        
//        personajePrincipal.getVida();
//        System.out.println(personajePrincipal.getVida());
//        System.out.println("Se ha sumado " + sumarVida + " a la vida del personaje");
//        personajePrincipal.sumarVida(sumarVida);
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
