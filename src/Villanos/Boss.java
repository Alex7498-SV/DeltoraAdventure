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
public class Boss extends VillanoBuilder{

    public Boss() {
        super.enemigo = new Enemigo();
    }

    
    
    @Override
    public void buildVida(float inc) {
         if(inc < 2){
            enemigo.setVida((int) (enemigo.getVida()+(enemigo.getVida()*inc)));
        }else{
            System.out.println("Valor de incremento invalido");
        }
        
    }

    @Override
    public void buildAtaque(float inc) {
        if(inc < 1.25){
            enemigo.setAtaque((int) (enemigo.getAtaque()+ (enemigo.getAtaque()*inc)));
        }else{
            System.out.println("Valor de incremento invalido");
        }
    }

    @Override
    public void buildTipoRecompensa(String recom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
