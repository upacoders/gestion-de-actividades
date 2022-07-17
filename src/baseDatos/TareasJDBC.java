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
 * @author user
 */
public class TareasJDBC {
    private Conexion con;
	private Connection conexion;
        
    	public TareasJDBC() throws Exception { this.con = new Conexion();
//es un constructor y no un metodo
		this.con.crearConexion();

		// se vuelve a tomar la conexi�n
		this.conexion = con.getConexion();
	}
        private final String insertSQL = "insert into tarea(nombre_tarea, fecha_inicio, fecha_limite, descripcion, id_estado)" + " values(?,?,?,?,?)"; // usuario
        public boolean AgregarTarea(){
            
        return false;
            
        }
    public boolean insert(String nombre, String fechainicio, String fechalimite, String descripcion, int id_estado) {
        try {
            PreparedStatement sentencia_preparada = null;
            sentencia_preparada = this.conexion.prepareStatement(this.insertSQL);

            sentencia_preparada.setString(1, nombre);
            sentencia_preparada.setString(2, fechainicio);
            sentencia_preparada.setString(3, fechalimite);
            sentencia_preparada.setString(4, descripcion);
            sentencia_preparada.setInt(5, id_estado);
            // se ejecuta la sentencia
            sentencia_preparada.executeUpdate();
            // se cierra sentencia_preparada
            sentencia_preparada.close();
            // si el try no tomo una excepcion hasta aqui, se avisa que se creo el usuario
            JOptionPane.showMessageDialog(null, "El usuario ha sido creado con éxito");

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

    public void insert(String nombreTarea, String fechainicio, String fechalimite, String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
