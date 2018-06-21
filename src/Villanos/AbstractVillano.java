
package Villanos;

public class AbstractVillano {
    
    public Enemigo getNuevoEnemigo(int selec, int incv, int incat, String objeto){
        ClanEnemigos cE = new ClanEnemigos();
        EnemigoNormal en = new EnemigoNormal();
        Boss bs = new Boss();

        switch(selec){
            case 1:
                cE.setVillanoBuilder(en);
                cE.crearEnemigo(incv, incat, objeto);
                return cE.getEnemigo();
            case 2:
                cE.setVillanoBuilder(bs);
                cE.crearEnemigo(incv, incat, objeto);
                return cE.getEnemigo();
        }
        return null;
    }
}
