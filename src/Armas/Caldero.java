
package Armas;


public class Caldero extends ArmasBuilder{
    
    public Caldero(){
        super.armas = new Armas();
    }

    @Override
    public void buildTipo() {
        armas.setTipo("El caldero del demonio");
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
