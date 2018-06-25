
package Armas;

public class VaritaSauco extends ArmasBuilder{
    
    public VaritaSauco() {
        super.armas = new Armas();
    }

    @Override
    public void buildTipo() {
        armas.setTipo("Varita de Sauco");
    }

    @Override
    public void buildCantAtaque() {

        armas.setValorAtaque((int) (armas.getValorAtaque()+(armas.getValorAtaque()*0.99)));
    }
}
