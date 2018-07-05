/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pociones;

import PersonajesPrincipales.PersonajePrincipal;

/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class PocionUno extends PocionesBuilder{
    
    PersonajePrincipal personajePrincipal = new PersonajePrincipal();
    
    public int sumarVida = 50;

    public PocionUno(){
        super.pociones = new Pociones();
    }
    
    @Override
    public void buildTipo() {
        pociones.setTipo("Pocion uno suma vida?");
    }
    
    public void sumarVida(){

        System.out.println("Se ha sumado " + sumarVida + " a la vida del personaje");
        personajePrincipal.sumarVida(sumarVida);
    }
    
}
