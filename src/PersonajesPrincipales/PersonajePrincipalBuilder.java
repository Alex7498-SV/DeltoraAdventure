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
public abstract class PersonajePrincipalBuilder {
    protected PersonajePrincipal personajePrincipal;
    
    public PersonajePrincipal getPersonajePrincipal(){
        return personajePrincipal;
    }
    
    public abstract void BuildVida(int vida);
    public abstract void BuildAtaque(int ataque);
    public abstract void BuildNivel(int nivel);
    public abstract void BuildPuntosExperiencia(int puntosExperiencia);
    public abstract void BuildNombre(String nombre);
    public abstract void BuildTipo(String tipo);
    
    ///////////////// MODIFICAR VALORES DEL PERSONAJE /////////////////
    
    public abstract void aumentarVida(int suma);
    public abstract void restarVida(int resta);
    public abstract void aumentarAtaque(int sumaAtaque);
    
}
