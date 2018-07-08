
package Personajes;


public class CreadorPersonajes {
    
    private BuilderPersonaje bPersonaje;
    
    public void setPersonajeBuilder(BuilderPersonaje bP){
        this.bPersonaje = bP;
    }
    
    public Personaje getPersonaje(){
        return bPersonaje.getPersonaje();
    }
    
     
    
   public void entrenar_personaje(int v, int a, String name){
       bPersonaje.buildVida(v);
       bPersonaje.buildAtaque(a);
       bPersonaje.buildNombre(name);
       
   } 
    
}
