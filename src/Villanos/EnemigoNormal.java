
package Villanos;

import Pociones.PocionCuatro;
import Pociones.PocionUno;

/**
 * 
 * @author Alex
 * 
 */
public class EnemigoNormal extends VillanoBuilder {

    /**
     * La clase EnemigoNivel1 se encarga de crear un tipo de enemigo con stats basicas
     * un enemigo de este nivel sera facil de derrotar y no infringira tanto daño
     */
    public EnemigoNormal() {
        super.enemigo = new Enemigo();
    }

    @Override
    public void buildVida(int inc) {
        enemigo.setVida(enemigo.getVida()+ inc);
    }

    @Override
    public void buildAtaque(int inc) {
        enemigo.setAtaque(enemigo.getAtaque()+ inc);

    }

    @Override
    public void buildTipoRecompensa() {
        PocionCuatro pocionCuatro = new PocionCuatro();
        pocionCuatro.sumarFullVida();
    }
   
    
}
