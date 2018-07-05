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
public class PasadoDificil {
    protected PersonajePrincipalBuilder personajeBuilder;
    
    public void setPersonajeBuilder(PersonajePrincipalBuilder personajePrincipalBuilder){
        this.personajeBuilder = personajePrincipalBuilder;
    }
    
    public PersonajePrincipal getPersonajePrincipal(){
        return personajeBuilder.getPersonajePrincipal();
    }
    
    public void crearPersonaje(int vida, int ataque, int nivel, int puntosExperiencia, String nombre, String tipo){
        personajeBuilder.BuildVida(vida);
        personajeBuilder.BuildAtaque(ataque);
        personajeBuilder.BuildNivel(nivel);
        personajeBuilder.BuildPuntosExperiencia(puntosExperiencia);
        personajeBuilder.BuildNombre(nombre);
        personajeBuilder.BuildTipo(tipo);
    }
    
}
