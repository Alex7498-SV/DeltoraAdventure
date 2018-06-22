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
public class FactoryPocion implements AbstractFactory {

    @Override
    public Pocion getPocion(String type) {
        switch(type){
            case "PocionUno":
                return new PocionUno();
            case "PocionDos":
                return new PocionDos();
            case "PocionTres":
                return new PocionTres();
            case "PocionCuatro":
                return new PocionCuatro();
        }
        return null;
    }
    
}
