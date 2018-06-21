
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
