/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pociones;

/**
 *
 * @author HugoJr. <Hugo Rivera at 00161417@uca.edu.sv>
 */
public class PocionDos implements Pocion {
    //public int sumaVida = 10;
    public int restaVida = 20;

    @Override
    public void sumarDanio() {
        //System.out.println("Sumar danio");
    }

    @Override
    public void sumarVida() {
        //System.out.println(sumaVida);
    }

    @Override
    public void restarVida() {
        System.out.println(restaVida);
    }
    
}
