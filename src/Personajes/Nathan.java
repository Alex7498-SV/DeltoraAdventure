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
public class Nathan extends BuilderPersonaje{

    public Nathan() {
        super.personaje = new Personaje();
    }

    @Override
    public void buildVida(int a) {
        personaje.setVida(personaje.getVida() + a);
    }

    @Override
    public void buildAtaque(int b) {
        personaje.setAtaque(personaje.getAtaque() + b);
    }

    @Override
    public void buildNombre(String name) {
        personaje.setNombre(name);
    }
    
}
