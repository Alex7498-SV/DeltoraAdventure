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
    
//    public void sumarDanio(){
//        System.out.println("Se ha sumado " + sumarDanio + " al ataque del jugador");
//        personajePrincipal.sumarDanio(sumarDanio);
//    }
    
}
