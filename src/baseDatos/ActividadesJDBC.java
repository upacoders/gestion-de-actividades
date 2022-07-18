package baseDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ActividadesJDBC {
    //esta parte es igual para todos porque es la conexion
    //Primero se llama a la clase conexion
	private Conexion con = new Conexion();
	private Connection conexion;
        int id_estado;
        
    	public ActividadesJDBC() throws Exception { //es un constructor y no un metodo
		this.con.crearConexion();

		// se vuelve a tomar la conexi�n
		this.conexion = con.getConexion();
	}
        public int Idestado(String estado){
            try{
                String updateSQL = "select id_estado from estado where nombre_estado = ´'" + estado + "'";
                Statement statement = null;
                statement = this.conexion.createStatement();
                ResultSet resultSet = statement.executeQuery(updateSQL);
                resultSet.next();
                id_estado = resultSet.getInt(1);
                
            }catch(Exception e) {
			e.printStackTrace();
			// se notifica que no puedo crearse el usuario
			JOptionPane.showMessageDialog(null,
					"Ha ocurrido un error y no se pudo" + " guardar la tarea Error: " + e.getStackTrace() + "", "Error",
					JOptionPane.ERROR_MESSAGE);
                        
            }
            return id_estado; 
        }
       
        public boolean insert(String nombre, String fechainicio, String fechalimite, int estado) {
            int id_tablero = 1;
		try {
                    String insertSQL = "insert into tareas(nombre_actividad, fecha_inicio, fecha_limite, id_tablero, id_estado)" + " values(?,?,?,?)";
			PreparedStatement sentencia_preparada = null;
			sentencia_preparada = this.conexion.prepareStatement(insertSQL);
			sentencia_preparada.setString(1, nombre);
			sentencia_preparada.setString(2, fechainicio);
			sentencia_preparada.setString(3, fechalimite);
			sentencia_preparada.setInt(4, id_tablero);
                        sentencia_preparada.setInt(4, estado);
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
}
