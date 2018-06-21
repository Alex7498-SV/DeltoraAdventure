
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
    public void buildResistencia() {

        armas.setResistencia((int) (armas.getResistencia() + (armas.getResistencia()*0.7)));
        
    } 

    @Override
    public void buildCantAtaque() {
        armas.setValorAtaque((int) (armas.getValorAtaque()+(armas.getValorAtaque()*0.8)));
    }
    
    
    
}
