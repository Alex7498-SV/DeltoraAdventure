package BaseDeDatos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Filtro implements metodos<FiltroBase>{
        
    private static final String SQL_INSERT = "INSERT INTO dato_usuario (usuario, puntaje) VALUES(?,?)";
    private static final String SQL_UPDATE = "UPDATE dato_usuario SET  puntaje = ? WHERE usuario = ?";
    private static final String SQL_READ = "SELECT * FROM dato_usuario WHERE usuario = ?";
    private static final String SQL_READALL = "SELECT * FROM dato_usuario";
    private static final Conexion conexioncita = Conexion.conectar();

    @Override
    public boolean create(FiltroBase g) {
        PreparedStatement ps;
        try{
            ps = conexioncita.getCnx().prepareStatement(SQL_INSERT);
            ps.setString(1, g.getNombre());
            ps.setInt(2, g.getPuntaje());
            if (ps.executeUpdate() > 0) {
                return true;
            }
            
        } catch (SQLException ex) {
            System.out.println("nel");
            Logger.getLogger(Filtro.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            conexioncita.cerrarConexion();
        }
        return false;
    }

    @Override
    public boolean update(FiltroBase c) {
                PreparedStatement ps;
        try{
            ps = conexioncita.getCnx().prepareStatement(SQL_UPDATE);
            ps.setString(1, c.getNombre());
            ps.setInt(2, c.getPuntaje());
            if (ps.executeUpdate() > 0) {
                return true;
            }
            
        } catch (SQLException ex) {
            System.out.println("nel");
            Logger.getLogger(Filtro.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            conexioncita.cerrarConexion();
        }
        return false;
    }

    @Override
    public FiltroBase read(Object key) {
        FiltroBase f = null;
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            ps = conexioncita.getCnx().prepareStatement(SQL_READ);
            ps.setString(1, key.toString());
            rs = ps.executeQuery();

            while (rs.next()) {
                f = new FiltroBase(rs.getString(1), rs.getInt(2));
            }
            rs.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(Filtro.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexioncita.cerrarConexion();
        }
        return f;
    }

    @Override
    public ArrayList<FiltroBase> readAll() {
        ArrayList<FiltroBase> all =  new ArrayList();
        Statement s;
        ResultSet rs;
        
        try{
            s = conexioncita.getCnx().prepareStatement(SQL_READALL);
            rs = s.executeQuery(SQL_READALL);
            
            while (rs.next()){
                all.add(new FiltroBase(rs.getString(1), rs.getInt(2)));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Filtro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return all;
    }
    
    
    }
