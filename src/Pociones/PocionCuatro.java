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
//    
//    public void sumarFullVida(){
//        System.out.println("Se ha sumado " + sumarVidaFull + " a la vida del jugador");
//        personajePrincipal.sumarVida(sumarVidaFull);
//    }
}
