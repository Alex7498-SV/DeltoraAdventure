
package Villanos;


public class EnemigoNivel2 extends VillanoBuilder{
    
    public EnemigoNivel2() {
        super.enemigo = new Enemigo();
    }

    @Override
    public void buildVida(float inc) {
        enemigo.setVida((int) (enemigo.getVida()+ (enemigo.getVida()*inc)));
        
    }

    @Override
    public void buildAtaque(float inc) {
        enemigo.setAtaque((int) (enemigo.getAtaque()+ (enemigo.getAtaque()*inc)));
    }

    @Override
    public void buildTipo(String type) {
        enemigo.setTipo(type);
    }

    @Override
    public void buildTipoRecompensa(String recom) {
        enemigo.setRecompensa(recom);
    }
   
    
    
}
