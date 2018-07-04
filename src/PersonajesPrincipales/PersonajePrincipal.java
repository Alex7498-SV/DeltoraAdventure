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
    private int nivel;
    private int puntosExperiencia;
    private int vida = 0;
    private int ataque = 0;
    public int vidaP;
    
    

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
        vidaP = this.vida;
    }
    
    @Override
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    
    @Override
    public String toString(){
        return "El guerrero creado es: " + nombre + " con nivel: " + nivel + " sus puntos de experiencia son: " + puntosExperiencia + " su vida es: " + vida  + " su ataque: " + ataque + " y ataques son de tipo: " +  tipo;
    }

//    @Override
    public void sumarVida(int suma) {
//      this.vida = vida + suma;
        vidaP = vidaP + suma;
        System.out.println("La vida es: " + vidaP);
    }

//    @Override
    public void restarVida(int resta) {
        this.vida = vida - resta;
        System.out.println("La vida es: " + this.vida);
    }
    
//    @Override
    public void sumarDanio(int danio) {
        this.ataque = this.ataque + danio;
        System.out.println("El nuevo ataque es: " + this.ataque);
    }
}
