package dao;

import conexion.Conexion;
import dto.FabricanteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author Gianfranco
 */
public class FabricanteDAO {

    private FabricanteDAO() {
        throw new IllegalStateException("Clase de utilidad");
    }

    /**
     *
     * @param nuevo Usuario ha registrar en la base de datos
     */
    public static void insertar(FabricanteDTO nuevo) {
        String sql = "INSERT INTO tbl_fabricante(nombre) VALUES(?)";
        Connection conn = Conexion.getInstance().getConn();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, nuevo.getNombre());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Clase FabricanteDAO.insertar:\n" + ex);
        }
    }

    /**
     *
     * @param modificado Usuario ha modificar en la base de datos
     */
    public static void modificar(FabricanteDTO modificado) {
        String sql = "UPDATE tbl_fabricante SET nombre=? WHERE id_fabricante=?";
        Connection conn = Conexion.getInstance().getConn();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, modificado.getNombre());
            pst.setInt(2, modificado.getIdFabricante());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Clase FabricanteDAO.modificar:\n" + ex);
        }
    }

    /**
     *
     * @param eliminar Usuario ha eliminar en la base de datos
     */
    public static void eliminar(FabricanteDTO eliminar) {//Quizas solo pedir la id
        String sql = "DELETE FROM tbl_fabricante WHERE id_fabricante=?";
        Connection conn = Conexion.getInstance().getConn();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, eliminar.getIdFabricante());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Clase FabricanteDAO.eliminar:\n" + ex);
        }
    }

    /**
     *
     * @param id ID con el que se registro el Fabricante
     * @return El DTO del fabricante
     */
    public static FabricanteDTO buscar(int id) {
        String sql = "SELECT * FROM tbl_fabricante WHERE id_fabricante=?";
        Connection conn = Conexion.getInstance().getConn();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, id);
            ResultSet rst = pst.executeQuery();
            if (rst.next()) {
                return new FabricanteDTO(rst.getInt(1), rst.getString(2));
            }
        } catch (SQLException ex) {
            System.err.println("Clase FabricanteDAO.eliminar:\n" + ex);
        }
        return null;
    }

    public static FabricanteDTO buscar(String nombre) {
        String sql = "SELECT * FROM tbl_fabricante WHERE nombre=?";
        Connection conn = Conexion.getInstance().getConn();
        try ( PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, nombre);
            ResultSet rst = pst.executeQuery();
            if (rst.next()) {
                return new FabricanteDTO(rst.getInt(1), rst.getString(2));
            }
        } catch (SQLException ex) {
            System.err.println("Clase FabricanteDAO.eliminar:\n" + ex);
        }
        return null;
    }

}
