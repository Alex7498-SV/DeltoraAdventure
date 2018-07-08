/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

/**
 *
 * @author Dell-Studio1558
 */
public abstract class BuilderPersonaje{
    
    protected  Personaje personaje;
    
    public Personaje getPersonaje(){
        return personaje;
    }
    
    public abstract void buildVida(int a);
    public abstract void buildAtaque(int b);
    public abstract void buildNombre(String name);
    
}
