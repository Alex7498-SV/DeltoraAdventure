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
public class GuardarPocionesLista {
    //factory = FactoryProducer.getPocion("Pocion");
    //Pocion pocionUno = factory.getPocion("Pocion Uno");
    //pocionUno.sumarVida();

    //factory = FactoryProducer.getPocion("Pocion");
    //Pocion pocionDos = factory.getPocion("Pocion Dos");
    //pocionDos.restarVida();

    //factory = FactoryProducer.getPocion("Pocion");
    //Pocion pocionTres = factory.getPocion("Pocion Tres");
    //pocionTres.sumarDanio();

    //factory = FactoryProducer.getPocion("Pocion");
    //Pocion pocionTres = factory.getPocion("Pocion Cuatro");
    //pocionCuatro.sumarFullVida();
    
    //AbstractFactory factory;
    
    public int guardarPocion(int a){
        AbstractFactory factory;
        int pocion = 0;
        switch(pocion) {
            case 1:
                factory = FactoryProducer.getPocion("Pocion");
                Pocion pocionUno = factory.getPocion("Pocion Uno");
                pocionUno.sumarVida();
                return pocion = 1;
            case 2:
                factory = FactoryProducer.getPocion("Pocion");
                Pocion pocionDos = factory.getPocion("Pocion Dos");
                pocionDos.restarVida();
                return 2;
            case 3:
                factory = FactoryProducer.getPocion("Pocion");
                Pocion pocionTres = factory.getPocion("Pocion Tres");
                pocionTres.sumarDanio();   
                return 3;
            case 4:
                factory = FactoryProducer.getPocion("Pocion");
                Pocion pocionCuatro = factory.getPocion("Pocion Cuatro");
                pocionCuatro.sumarFullVida();  
                return 4;
        }
        return a;
    }
}
