/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Villanos;

import Pociones.AbstractPocion;
import Pociones.PocionUno;
import Pociones.Pociones;

/**
 *
 * @author Dell-Studio1558
 */
public class Boss extends VillanoBuilder{

    public Boss() {
        super.enemigo = new Enemigo();
    }

    
    
    @Override
    public void buildVida(int inc) {

        enemigo.setVida(enemigo.getVida()+ inc);

        
    }

    @Override
    public void buildAtaque(int inc) {
        if(inc < 1.25){
            enemigo.setAtaque(enemigo.getAtaque()+ inc);
        }else{
            System.out.println("Valor de incremento invalido");
        }
    }

    @Override
    public void buildTipoRecompensa() {
        PocionUno pocionUno = new PocionUno();
        pocionUno.sumarVida();
        
    }
    
}
