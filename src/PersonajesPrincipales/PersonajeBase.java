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
public interface PersonajeBase {
    public void setNombre(String nombre);
    public void setTipo(String tipo);
    public void setNivel(int nivel);
    public void setPuntosExperiencia(int puntosExperiencia);
    public void setVida(int vida);
    public void setAtaque(int ataque);
}
