
package Armas;

public class Lanza extends ArmasBuilder{
    
    public Lanza() {
        super.armas = new Armas();
    }

    @Override
    public void buildTipo() {
        armas.setTipo("Lanza de la muerte");
    }

    @Override
    public void buildResistencia() {
        armas.setResistencia((int) (armas.getResistencia() + (armas.getResistencia()*0.1)));
        
    } 

    @Override
    public void buildCantAtaque() {
        
        armas.setValorAtaque((int) (armas.getValorAtaque()+(armas.getValorAtaque()*0.3)));
    }
}
