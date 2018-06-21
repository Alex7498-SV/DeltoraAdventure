/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Villanos;

/**
 *
 * @author Alex
 */
public abstract class VillanoBuilder {
    protected Enemigo enemigo;
    
    public Enemigo getEnemigo(){
        return enemigo;
    }
    
    public abstract  void buildVida(float inc);
    public abstract  void buildAtaque(float inc);
    public abstract  void buildTipoRecompensa(String recom);
}
