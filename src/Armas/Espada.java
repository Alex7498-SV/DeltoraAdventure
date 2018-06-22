
package Armas;

public class Espada extends ArmasBuilder{

    public Espada() {
        super.armas = new Armas();
    }

    @Override
    public void buildTipo() {
        armas.setTipo("Espablo Escobar");
    }

    @Override
    public void buildCantAtaque() {
        armas.setValorAtaque((int) (armas.getValorAtaque()+(armas.getValorAtaque()*0.8)));
    }
    
    
    
}
