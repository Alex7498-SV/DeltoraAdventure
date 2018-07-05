
package Armas;

public class AbstractArma {
    
    public Armas getNuevaArma(int selec){
        Armeria ar =  new Armeria();
        Hacha h = new Hacha();
        Lanza l = new Lanza();
        Caldero c = new Caldero();
        VaraDeBamboo vS = new VaraDeBamboo();
        Espada es = new Espada();
        Libro lb = new Libro();
        
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
            case 5:
                ar.setArmaBuild(es);
                ar.crearArma();
                return ar.getArma();
            case 6:
                ar.setArmaBuild(lb);
                ar.crearArma();
                return ar.getArma();
        }
        return null;
    }
    
}
