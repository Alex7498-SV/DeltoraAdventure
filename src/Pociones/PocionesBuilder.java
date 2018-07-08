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
public abstract class PocionesBuilder {
    protected Pociones pociones;

    public Pociones getPociones() {
        return pociones;
    }
    
    public abstract void buildTipo();
    public abstract void sumarVida();
    public abstract void sumarDanio();
    public abstract void pocionMisteriosa();
    public abstract void sumarFullVida();
    public abstract void restarVida();
}
