
package BaseDeDatos;

import java.util.ArrayList;

public interface metodos <Generic>{
    public boolean create(Generic g);
    public boolean update (Generic c);
    public Generic read(Object key);
    public ArrayList<Generic> readAll();
    
}
