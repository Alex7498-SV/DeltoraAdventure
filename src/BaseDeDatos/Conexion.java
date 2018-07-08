
package BaseDeDatos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    private String user, pass, driver, nombre_bdd, seguridad;

    private Connection cnx;

    public static Conexion instance;

    public synchronized static Conexion conectar() {
        if (instance == null) {
            return new Conexion();
        }
        return instance;
    }

    private Conexion() {
        cargarCredenciales();

        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (Exception ex) {
            System.out.println("No se pudo completar la conexion");
        }
    }

    private void cargarCredenciales() {
        user = "";
        pass = "";
        driver = "jdbc:sqlserver://DELL-STUDIO\\SQLEXPRESS";
        nombre_bdd = "databseName=DeltoraAdventure";
    }

    public Connection getCnx() {
        try{
            return DriverManager.getConnection(this.driver + this.user + this.nombre_bdd + this.seguridad);
        } catch(SQLException ex){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    

    public void cerrarConexion() {
        instance = null;
    }

}
