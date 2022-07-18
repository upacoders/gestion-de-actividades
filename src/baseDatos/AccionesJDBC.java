/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseDatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class AccionesJDBC {

    private Conexion con = new Conexion();
    private Connection conexion;
    int id_estado;

    public AccionesJDBC() throws Exception {
        this.con.crearConexion();

        this.conexion = con.getConexion();
    }

    public int Idestado(String estado) {
        try {
            String updateSQL = "select id_estado from estado where nombre_estado = '" + estado + "'";
            Statement statement = null;
            statement = this.conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(updateSQL);
            resultSet.next();
            id_estado = resultSet.getInt(1);

        } catch (Exception e) {
            e.printStackTrace();
            // se notifica que no puedo crearse el usuario
            JOptionPane.showMessageDialog(null,
                    "Ha ocurrido un error y no se pudo" + " guardar la tarea Error: " + e.getStackTrace() + "", "Error",
                    JOptionPane.ERROR_MESSAGE);

        }
        return id_estado;
    }

    public boolean insertarAcc(String nombre_accion, String fecha_inicio, String fecha_limite, int id_actividad, int id_estado) {
        try {
            String insertSQL = "insert into accion (nombre_accion, fecha_inicio, fecha_limite, id_estado, id_actividad) values (?,?,?,?,?)";

            PreparedStatement sentencia = null;

            sentencia = this.conexion.prepareStatement(insertSQL);
            sentencia.setString(1, nombre_accion);
            sentencia.setString(2, fecha_inicio);
            sentencia.setString(3, fecha_limite);
            sentencia.setInt(4, id_estado);
            sentencia.setInt(5, id_actividad);

            sentencia.executeUpdate();
            sentencia.close();

            JOptionPane.showMessageDialog(null, "se ha guardado con exito el nombre y la fecha de trabajo de la accion");
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
