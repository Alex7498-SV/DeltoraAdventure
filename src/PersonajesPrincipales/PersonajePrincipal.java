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
public class PersonajePrincipal implements PersonajesPrincipales.PersonajeBase{
    private String nombre;
    private String tipo;
    private int nivel = 0;
    private int puntosExperiencia = 0;
    private int vida = 0;
    private int ataque = 0;
    
    

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
    public void setPuntosExperiencia(int puntosExperiencia) {
        this.puntosExperiencia = puntosExperiencia;
    }
    
    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }
    
    @Override
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    
    @Override
    public String toString(){
        return "El guerrero creado es: " + getNombre() + " con nivel: " + getNivel() + " sus puntos de experiencia son: " + getPuntosExperiencia() + " su vida es: " + getVida()  + " su ataque: " + getAtaque() + " y ataques son de tipo: " +  getTipo();
    }

    ////////////////////////////////////////////////////////// SUMAR Y RESTAR VIDA Y ATAQUE /////////////////////////////////////////////////
    
    @Override
    public void sumarVida(int suma) {
        vida = getVida() + suma;
        System.out.println("La vida es: " + vida);
    }

    @Override
    public void restarVida(int resta) {
        this.vida = getVida() - resta;
        System.out.println("La vida es: " + this.vida);
    }
    
    @Override
    public void sumarDanio(int danio) {
        this.ataque = this.ataque + danio;
        System.out.println("El nuevo ataque es: " + this.ataque);
    }
    
    ////////////////////////////////////////////////////////// GETTERS /////////////////////////////////////////////////
    
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public int getAtaque() {
        return ataque;
    }

    @Override
    public int getNivel() {
        return nivel;
    }

    @Override
    public int getPuntosExperiencia() {
        return puntosExperiencia;
    }
}
