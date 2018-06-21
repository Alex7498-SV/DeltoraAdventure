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
public class Veneficus implements PersonajePrincipal.PersonajeBase{
    private String nombre;
    private String tipo;
    private int nivel;
    private int vida;
    private int ataque;

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setTipo(String tipo) {
       this.tipo = tipo;
    }

    @Override
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    
    public String toString(){
        return "El guerrero creado es: " + nombre + "con nivel: " + nivel + "su vida es: " + vida  + "su ataque: " + ataque + "y sus tipos de ataques son: " +  tipo;
    }
    
}
