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
public class AbstractPocion {
    public Pociones getNuevaPocion(int selec){
        PocionMake pm =  new PocionMake();
        PocionUno p1 = new PocionUno();
        PocionDos p2 = new PocionDos();
        PocionTres p3 = new PocionTres();
        PocionCuatro p4 = new PocionCuatro();
        switch(selec){
            case 1:
                pm.setPocionBuild(p1);
                pm.crearPocion();
                return pm.getPocion();
            case 2:
                pm.setPocionBuild(p2);
                pm.crearPocion();
                return pm.getPocion();
            case 3:
                pm.setPocionBuild(p3);
                pm.crearPocion();
                return pm.getPocion();
            case 4:
                pm.setPocionBuild(p4);
                pm.crearPocion();
                return pm.getPocion();
        }
        return null;
    }
}