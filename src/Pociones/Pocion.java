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
public interface Pocion {
    void sumarDanio();
    void sumarVida();
    void restarVida();
    void sumarFullVida();
}


//Codigo para crear las pociones

//factory = FactoryProducer.getPocion("Pocion");
//Pocion pocionUno = factory.getPocion("Pocion Uno");
//pocionUno.sumarVida;

//factory = FactoryProducer.getPocion("Pocion");
//Pocion pocionDos = factory.getPocion("Pocion Dos"):
//pocionDos.restarVida;

//factory = FactoryProducer.getPocion("Pocion");
//Pocion pocionTres = factory.getPocion("Pocion Tres"):
//pocionTres.sumarDanio;

//factory = FactoryProducer.getPocion("Pocion");
//Pocion pocionTres = factory.getPocion("Pocion Cuatro"):
//pocionCuatro.sumarDanio;