/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author keigo
 */
/**
 *
 * @author nani
 */
public class TareasJDBC {

    private Conexion con;
    private Connection conexion;
    int id_estado;

    public TareasJDBC() throws Exception {
        this.con = new Conexion();
//es un constructor y no un metodo

        this.con.crearConexion();

        // se vuelve a tomar la conexi�n
        this.conexion = con.getConexion();
    }

    public int Idestado(String estado) {
        try {
            String updateSQL = "select id_estado where nombre_estado = ´'" + estado + "'";
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

    /**
     *
     * @param nombre
     * @param fechainicio
     * @param fechalimite
     * @param descripcion
     * @param estado
     * @param id_accion
     * @return
     */
    public boolean insert(String nombre, String fechainicio, String fechalimite, String descripcion, int estado, int id_accion) {
        try {
            
            String insertSQL = "insert into tareas(nombre_actividad, fecha_inicio, fecha_limite, descripcion, id_estado, id_accion)" + " values(?,?,?,?,?,?)";
            PreparedStatement sentencia_preparada = null;
            sentencia_preparada = this.conexion.prepareStatement(insertSQL);
            sentencia_preparada.setString(1, nombre);
            sentencia_preparada.setString(2, fechainicio);
            sentencia_preparada.setString(3, fechalimite);
            sentencia_preparada.setString(4, descripcion);
            sentencia_preparada.setInt(5, estado);
            sentencia_preparada.setInt(6, id_accion);
            // se ejecuta la sentencia
            sentencia_preparada.executeUpdate();
            // se cierra sentencia_preparada
            sentencia_preparada.close();
            // si el try no tomo una excepcion hasta aqui, se avisa que se creo el usuario
            JOptionPane.showMessageDialog(null, "Tarea agregada con éxito creado con éxito");

            return true;

        } catch (Exception e) {
            e.printStackTrace();
            // se notifica que no puedo crearse el usuario
            JOptionPane.showMessageDialog(null,
                    "Ha ocurrido un error y no se pudo" + " crear la cuenta. Error: " + e.getStackTrace() + "", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

        return false;
    }

    private final String insertSQL = "insert into tarea(nombre_tarea, fecha_inicio, fecha_limite, descripcion, id_estado)" + " values(?,?,?,?,?)"; // usuario

    public boolean AgregarTarea() {

        return false;

    }  
   
}
