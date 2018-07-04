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
public class PocionDos implements Pocion {

    public int sumaDanio = 10;
    public int sumaVida = 50;
    public int restaVida = 30;
    public int sumaFullVida = 100;

    @Override
    public void sumarDanio() {
        //System.out.println(sumaDanio);
    }

    @Override
    public void sumarVida() {
        PersonajesPrincipales.PersonajePrincipal personajePrincipal = new PersonajePrincipal();
        System.out.println(personajePrincipal.vidaP);
        personajePrincipal.sumarVida(sumaVida);
        System.out.println(sumaVida);
    }

    @Override
    public void restarVida() {
        //System.out.println(restaVida);
    }

    @Override
    public void sumarFullVida() {
        //System.out.println(sumaFullVida);
    }
    
}
