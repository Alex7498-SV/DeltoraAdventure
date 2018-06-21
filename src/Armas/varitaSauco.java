
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
    public void buildResistencia(int res) {
        armas.setResistencia(res);
    } 

    @Override
    public void buildCantAtaque(int ataque) {
        armas.setValorAtaque(ataque);
    }
}
