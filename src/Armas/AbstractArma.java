
package Armas;

public class AbstractArma {
    
    public Armas getNuevaArma(int selec){
        Armeria ar =  new Armeria();
        Hacha h = new Hacha();
        Lanza l = new Lanza();
        Caldero c = new Caldero();
        VaritaSauco vS = new VaritaSauco();
        
        switch(selec){
            case 1:
                ar.setArmaBuild(h);
                ar.crearArma();
                return ar.getArma();
            case 2:
                ar.setArmaBuild(l);
                ar.crearArma();
                return ar.getArma();
            case 3:
                ar.setArmaBuild(c);
                ar.crearArma();
                return ar.getArma();
            case 4:
                ar.setArmaBuild(vS);
                ar.crearArma();
                return ar.getArma();
        }
        return null;
    }
}
