
package Villanos;

public class AbstractVillano {
    
    public Enemigo getNuevoEnemigo(int selec, int incv, int incat, String objeto){
        ClanEnemigos cE = new ClanEnemigos();
        EnemigoNivel1 en1 = new EnemigoNivel1();
        EnemigoNivel2 en2 = new EnemigoNivel2();
        EnemigoNivel3 en3 = new EnemigoNivel3();
        EnemigoNivel4 en4 = new EnemigoNivel4();

        switch(selec){
            case 1:
                cE.setVillanoBuilder(en1);
                cE.crearEnemigo(incv, incat, objeto);
                return cE.getEnemigo();
            case 2:
                cE.setVillanoBuilder(en2);
                cE.crearEnemigo(incv, incat, objeto);
                return cE.getEnemigo();
            case 3:
                cE.setVillanoBuilder(en3);
                cE.crearEnemigo(incv, incat, objeto);
                return cE.getEnemigo();
            case 4:
                cE.setVillanoBuilder(en4);
                cE.crearEnemigo(incv, incat, objeto);
                return cE.getEnemigo();
            
       }
        return null;
    }
}
