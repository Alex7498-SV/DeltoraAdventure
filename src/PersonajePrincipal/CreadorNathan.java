/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonajePrincipal;

/**
 *
 * @author uca
 */
public class CreadorNathan {
    private MaestroNathan maestroNathan;
    
    public CreadorNathan(MaestroNathan maestroNathan){
        this.maestroNathan = maestroNathan;
    }
    
    public void crearVeneficus(){
        this.maestroNathan.darNombre();
        this.maestroNathan.darTipo();
        this.maestroNathan.darNivel();
        this.maestroNathan.darVida();
        this.maestroNathan.darAtaque();
    }
    
    public Nathan getNathan(){
        return this.maestroNathan.getNathan();
    }
}
