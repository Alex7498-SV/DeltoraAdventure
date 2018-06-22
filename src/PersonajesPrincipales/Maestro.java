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
public interface Maestro {
    public  void darNombre();
    public  void darTipo();
    public  void darNivel();
    public  void darPuntosExperiencia();
    public  void darVida();
    public  void darAtaque();
    public PersonajePrincipal getPersonajePrincipal();
}
