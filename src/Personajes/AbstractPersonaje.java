
package Personajes;

public class AbstractPersonaje {
    
    public Personaje getPersonaje(int selec){
        CreadorPersonajes Cpersonajes = new CreadorPersonajes();
        Nathan n = new Nathan();
        Veneficus v = new Veneficus();
        
        switch(selec){
            case 1:
                Cpersonajes.setPersonajeBuilder(v);
                Cpersonajes.entrenar_personaje(0, 0, "veneficus");
                return Cpersonajes.getPersonaje();
            case 2:
                Cpersonajes.setPersonajeBuilder(n);
                Cpersonajes.entrenar_personaje(0, 0, "nathan");
                return Cpersonajes.getPersonaje();
                
        }
        return null;
    }
}
