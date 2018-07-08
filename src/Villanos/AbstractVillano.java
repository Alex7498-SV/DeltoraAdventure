
package Villanos;

public class AbstractVillano {
    
    public Enemigo getNuevoEnemigo(int selec){
        ClanEnemigos cE = new ClanEnemigos();
        EnemigoNormal en = new EnemigoNormal();
        Boss bs = new Boss();

        switch(selec){
            case 1:
                cE.setVillanoBuilder(en);
                cE.crearEnemigo(50, 25);
                return cE.getEnemigo();
            case 2:
                cE.setVillanoBuilder(bs);
                cE.crearEnemigo(250, 75);
                return cE.getEnemigo();
        }
        return null;
    }
}
