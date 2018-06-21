
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
    public void buildResistencia(float res) {
        if (res<1){
            armas.setResistencia((int) (armas.getResistencia() + (armas.getResistencia()*res)));
        }
        
    } 

    @Override
    public void buildCantAtaque(float ataque) {
        if(ataque<1)
        armas.setValorAtaque((int) (armas.getValorAtaque()+(armas.getValorAtaque()*ataque)));
    }
}
