
package Armas;

public class varitaSauco extends ArmasBuilder{
    
    public varitaSauco() {
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
