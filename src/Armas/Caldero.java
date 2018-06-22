
package Armas;

//Cambiar nombre de la clase 
public class Caldero extends ArmasBuilder{
    
    public Caldero(){
        super.armas = new Armas();
    }

    @Override
    public void buildTipo() {
        armas.setTipo("El caldero del demonio");
    }

    @Override
    public void buildCantAtaque() {
        armas.setValorAtaque((int) (armas.getValorAtaque()+(armas.getValorAtaque()*0.6)));
    }
}
