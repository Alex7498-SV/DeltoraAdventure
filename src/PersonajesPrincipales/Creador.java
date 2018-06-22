/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonajesPrincipales;

/**
 *
 * @author uca
 */
public class Creador{
    private Maestro maestro;
    
    public Creador(Maestro maestro){
        this.maestro = maestro;
    }
    
    public void crearPersonaje(){
        this.maestro.darNombre();
        this.maestro.darTipo();
        this.maestro.darNivel();
        this.maestro.darPuntosExperiencia();
        this.maestro.darVida();
        this.maestro.darAtaque();
    }
    
    public PersonajePrincipal getPersonajePrincipal(){
        return this.maestro.getPersonajePrincipal();
    }
}
