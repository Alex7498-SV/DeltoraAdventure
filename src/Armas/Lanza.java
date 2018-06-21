
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
    public void buildResistencia(int res) {
        armas.setResistencia(res);
    } 

    @Override
    public void buildCantAtaque(int ataque) {
        armas.setValorAtaque(ataque);
    }
}
