/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseDatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class AccionesJDBC {

    private Conexion con = new Conexion();
    private Connection conexion;

    public AccionesJDBC() throws Exception {
        this.con.crearConexion();

        this.conexion = con.getConexion();
    }

    public boolean insertarAcc(String nombre_accion, Date fecha_inicio, Date fecha_limite) {
        try {
            String insertSQL = "insert into acciones (nombre_accion, fecha_inicio, fecha_limite) Values (?,?,?)";

            PreparedStatement sentencia = null;

            sentencia = this.conexion.prepareStatement(insertSQL);
            sentencia.setString(1, nombre_accion);
            sentencia.setDate(2, fecha_inicio);
            sentencia.setDate(3, fecha_limite);

            sentencia.executeUpdate();
            sentencia.close();

            JOptionPane.showMessageDialog(null, "se ha guardado con exito el nombre y la fecha de trabjo de la accion");

            return true;
        } catch (Exception e) {
            e.printStackTrace();

            JOptionPane.showMessageDialog(null, "ha ocurrido un error y no se pudo guardar la accion" + JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    void insertarAcc(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void insertarAcc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
