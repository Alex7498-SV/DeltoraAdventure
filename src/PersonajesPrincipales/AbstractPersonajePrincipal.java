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
public class AbstractPersonajePrincipal {
    
    public PersonajePrincipal getPersonajePrincipal(int personaje){
        
        int vida;
        int ataque;
        int nivel;
        int puntosExperiencia;
        String nombre;
        String tipo;
        
        PasadoDificil entrenador = new PasadoDificil();
        Nathan nathan =  new Nathan();
        Veneficus veneficus = new Veneficus();
        
        switch (personaje){
            case 1:
                entrenador.setPersonajeBuilder(nathan);
                entrenador.crearPersonaje(vida = 100, ataque = 100, nivel = 0, puntosExperiencia = 0, nombre = "Nathan", tipo = "fisico");
                return entrenador.getPersonajePrincipal();
            case 2:
                entrenador.setPersonajeBuilder(veneficus);
                entrenador.crearPersonaje(vida = 85, ataque = 115, nivel = 0, puntosExperiencia = 0, nombre = "Veneficus", tipo = "magico");
                return entrenador.getPersonajePrincipal();
        }
        return null;
    }
}
