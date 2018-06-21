
package Villanos;

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
    public void buildVida(float inc) {
        if (inc < 1){
            enemigo.setVida((int) (enemigo.getVida()+ (enemigo.getVida()*inc)));
        }else{
            System.out.println("Valor de incremento invalido");
        }
        
    }

    @Override
    public void buildAtaque(float inc) {
        if(inc < 0.75){
            enemigo.setAtaque((int) (enemigo.getAtaque()+ (enemigo.getAtaque()*inc)));
        }else{
            System.out.println("Valor de incremento invalido");
        }
    }

    @Override
    public void buildTipoRecompensa(String recom) {
        enemigo.setRecompensa(recom);
    }
   
    
}
