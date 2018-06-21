
package Villanos;


public class EnemigoNivel2 extends VillanoBuilder{
    /**
     * La clase EnemigoNivel2 se encarga de crear un tipo de enemigo con stats moderadas
     * un enemigo de este nivel sera facil de derrotar y no infringira tanto daño
     */
    public EnemigoNivel2() {
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

//    @Override
//    public void buildTipo(String type) {
//        enemigo.setTipo(type);
//    }

    @Override
    public void buildTipoRecompensa(String recom) {
        enemigo.setRecompensa(recom);
    }
   
    
    
}
