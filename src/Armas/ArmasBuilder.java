
package Armas;

public abstract class ArmasBuilder {
    
    protected Armas armas;
    
    public Armas getArma(){
        return armas;
    }
    
    public abstract  void buildTipo();
    public abstract  void buildCantAtaque();
}
