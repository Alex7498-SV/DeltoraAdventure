/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Villanos;

/**
 *
 * @author Dell-Studio1558
 */
public class ClanEnemigos {
    private VillanoBuilder vBuilder;
 
    public void setVillanoBuilder(VillanoBuilder vb){
        vBuilder = vb;
    }
    
    public Enemigo getEnemigo(){
        return vBuilder.getEnemigo();
    }
    
    public void crearEnemigo(int incv, int  incat, String recom){
        vBuilder.buildVida(incv);
        vBuilder.buildAtaque(incat);
        vBuilder.buildTipoRecompensa(recom);
    }
}