
package Villanos;

public class EnemigoNivel3 extends VillanoBuilder{
    
    public EnemigoNivel3() {
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
