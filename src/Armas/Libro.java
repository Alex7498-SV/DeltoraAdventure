
package Armas;

public class Libro extends ArmasBuilder{
    
    public Libro() {
        super.armas = new Armas();
    }

    @Override
    public void buildTipo() {
        armas.setTipo("Escappini de Baldor");
    }

    @Override
    public void buildCantAtaque() {

        armas.setValorAtaque((int) (armas.getValorAtaque()+(armas.getValorAtaque()*0.99)));
    }
}
