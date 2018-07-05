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
public class PocionMake {
    private PocionesBuilder pociBuilder;
    
    public void setPocionBuild(PocionesBuilder pocibuilder){
        pociBuilder = pocibuilder;
    }
    
    public Pociones getPocion(){
        return pociBuilder.getPociones();
    }
    
    public void crearPocion(){
        pociBuilder.buildTipo();
    }
}
