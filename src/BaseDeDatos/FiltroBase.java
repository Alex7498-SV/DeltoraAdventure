
package BaseDeDatos;

public class FiltroBase {
    private String nombre;
    private int puntaje;


    public FiltroBase() {
    }

    public FiltroBase(String nombre, int puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
    }
   
    
    public FiltroBase(String nombre) {
        this.nombre = nombre;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

   
}
