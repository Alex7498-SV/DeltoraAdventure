
package Armas;

public class Armeria {
    
    private ArmasBuilder aBuilder;
    
    public void setArmaBuild(ArmasBuilder abuilder){
        aBuilder = abuilder;
    }
    
    public Armas getArma(){
        return aBuilder.getArma();
    }
    
    public void crearArma(){
        aBuilder.buildTipo();
        aBuilder.buildCantAtaque();
    }
}
