/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author admin
 */
public class AlertaJDBC {
    //esta parte es igual para todos porque es la conexion
    //Primero se llama a la clase conexion
	private Conexion con = new Conexion();
	private Connection conexion;
        
    	public AlertaJDBC() throws Exception { //es un constructor y no un metodo
		this.con.crearConexion();

		// se vuelve a tomar la conexi�n
		this.conexion = con.getConexion();
	}
    public boolean actualizarConfAlerta(int idAlerta) {
		try {
                    //String updateSQL = "update alerta set seleccionada = true where id_alerta = " + idAlerta; Tambien se ppuede hacer asi
                    String updateSQL = "update alerta set seleccionada = true where id_alerta = ?" ;
                   
			PreparedStatement sentencia_preparada = null;
                        
			sentencia_preparada = this.conexion.prepareStatement(updateSQL);

			sentencia_preparada.setInt(1,idAlerta);  //al usar setString, se puede hacer una concatenacion ("" + intValue) p/ que funcione
                                                                 // eso es una cadena vacia
			
			// se ejecuta la sentencia
			sentencia_preparada.executeUpdate();
			// se cierra sentencia_preparada
			sentencia_preparada.close();
			// si el try no tomo una excepcion hasta aqui, se avisa que se creo el usuario
			JOptionPane.showMessageDialog(null, "La alerta ha sido configurada con exito");

			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			// se notifica que no puedo crearse el usuario
			JOptionPane.showMessageDialog(null,
					"Ha ocurrido un error y no se pudo" + " guardar la configuracion. Error: " + e.getStackTrace() + "", "Error",
					JOptionPane.ERROR_MESSAGE);
		}

		return false;
	}
    
    
}
