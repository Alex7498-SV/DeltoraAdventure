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
public class PersonajePrincipal {
    private int vida = 0;
    private int puntosExperiencia = 0;
    private int nivel = 0;
    private int ataque = 0;
    private String nombre = "";
    private String tipo = "";
//    private boolean atacando = false;

    /////////////////////////////// SETTERS ///////////////////////////////
    
    public void setVida(int vida) {
        this.vida = vida;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public void setPuntosExperiencia(int puntosExperiencia) {
        this.puntosExperiencia = puntosExperiencia;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    ///////////////////////////// GETTERS ////////////////////////////////
    
    public int getVida() {
        return vida;
    }
    public int getAtaque() {
        return ataque;
    }
    public int getNivel() {
        return nivel;
    }
    public int getPuntosExperiencia() {
        return puntosExperiencia;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTipo() {
        return nombre;
    }

}
