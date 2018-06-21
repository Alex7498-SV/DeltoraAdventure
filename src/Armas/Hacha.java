
package Armas;

public class Hacha extends ArmasBuilder{

    public Hacha() {
        super.armas = new Armas();
    }

    @Override
    public void buildTipo() {
        armas.setTipo("Hachin Machin");
    }

    @Override
    public void buildResistencia(int res) {
        armas.setResistencia(res);
    } 

    @Override
    public void buildCantAtaque(int ataque) {
        armas.setValorAtaque(ataque);
    }
    
    
    
}
