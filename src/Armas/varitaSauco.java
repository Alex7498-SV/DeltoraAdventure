
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
    public void buildResistencia() {
        armas.setResistencia((int) (armas.getResistencia() + (armas.getResistencia()*0.8)));
        
    } 

    @Override
    public void buildCantAtaque() {

        armas.setValorAtaque((int) (armas.getValorAtaque()+(armas.getValorAtaque()*0.99)));
    }
}
