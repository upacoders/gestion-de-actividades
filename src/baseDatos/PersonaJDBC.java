package baseDatos;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class PersonaJDBC {

    public static boolean cuentaYaRegistrada;
	private Conexion con = new Conexion();
	private Connection conexion;

	/**
	 * Constructor: cuando se instancia, se crea la conexion con la base de datos
	 */
	public PersonaJDBC() throws Exception {
		this.con.crearConexion();

		// se vuelve a tomar la conexi�n
		this.conexion = con.getConexion();
	}

	private String insertSQL = "insert into persona(nombre, apellido, correo, contrasea)" + " values(?,?,?,?)"; // usuario

	public boolean existeEmail(String email) {

		// se crea la consulta sql para verificar si el email recibido como par�metro
		// pertenece a algun usuario
		String consultaSql = "select id_persona from persona" + " where correo like '" + email + "';";

		// se verifica si la consulta tiene al menos un registro
		boolean emailRegistrado;
		emailRegistrado = con.existeAlgunRegistro(consultaSql);

		if (emailRegistrado) // si el email pertenece a algun usuario
		{
			return true; // retorna true
		} else {
			return false; // retorna false
		}
	}

	public boolean verificarUsuarioYContrasenia(String email, String contrasenia) {

		try {
			// se crea la consulta
			String consultaSql = "Select count(*) as cantidad_registros from persona" + " where correo like '"
					+ email + "'" + " and contrasea like '" + contrasenia + "'";
			// System.out.println(consultaSql);
			Statement statement = null;
			statement = conexion.createStatement();
			// se ejecuta la consulta y se guarda el resultado en un ResultSet
			ResultSet resultSet = statement.executeQuery(consultaSql);
			// se recorre todos los registros de los resultados de la consulta
			while (resultSet.next()) // mientras exista un registro siguiente en el resultSet
			{ // se verifica que hayan registros
				if (resultSet.getInt("cantidad_registros") > 0) // si hay mas de 0 usuarios con este usuario y
																// contrasenia
				{
					// se avisa que existe usuario con los datos recibidos como parametros
					return true;
				} else // si no existe ningun usuario con este usuario y contrase�a
				{
					return false;
				}
			}
		} catch (Exception e) // si hay un error al ejecutar la consulta
		{
			e.printStackTrace();

		}

		// se cierra la conexion con la base de datos
		try {

		} catch (Exception e) {

			e.printStackTrace();
		}

		// si no se retorno true ni false, predeterminado se retorna false
		return false;

	}

	public int getIdUsuario(String correo, String contrasenia)
	{
		String consultaSQL = "select id_persona from usuario where correo like '" 
				+ correo + "' " + " and contrasea like '" + contrasenia + "'";
		int id_usuario = 0;
		
		try {
			Statement statement = null;
			statement = this.conexion.createStatement();
			// se ejecuta la consulta y se guarda el resultado en un ResultSet
			ResultSet resultSet = statement.executeQuery(consultaSQL);
			
			// se guarda la informacion de la cuenta en el vector
			resultSet.next();
			id_usuario = resultSet.getInt(1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return id_usuario;
		
	}
	
	
	/**
	 * Esta funcion retorna true si existe ya una cuenta con el usuario e email que
	 * recibe como parametros
	 * 
	 * @param usuario
	 * @param email
	 * @return
	 */
	public boolean cuentaYaRegistrada(String email) {
		// se crea la consulta sql para verificar si ya hay un usuario con el email y
		// usuario recibidos
		String consultaSql = "select id_persona from persona" + " where correo like '" + email + "'";

		// se debe ver si la consulta muestra algun registro
		boolean cuentaYaExiste = con.existeAlgunRegistro(consultaSql);

		// si ya existe alguna cuenta con el correo y usuario recibidos como parametros
		if (cuentaYaExiste) {
			return true;
		}

		// redeterminado retorna falso
		return false;
	}

	/**
	 * Inserta un registro en la tabla usuario de la base de datos.
	 * 
	 * @param nombre
	 * @param apellido
	 * @param email
	 * @param contraseña
	 * @param confirmacionContraseña
	 * @return true si el usuario pudo registrarse, false si el usuario no pudo
	 *         registrarse
	 */
	public boolean insert(String nombre, String apellido, String email, String contrasenia) {
		try {
			PreparedStatement sentencia_preparada = null;
			sentencia_preparada = this.conexion.prepareStatement(this.insertSQL);

			sentencia_preparada.setString(1, nombre);
			sentencia_preparada.setString(2, apellido);
			sentencia_preparada.setString(3, email);
			sentencia_preparada.setString(4, contrasenia);
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
	
	public int getIdUsuarioConCorreo(String correo)
	{
		String consultaSQL = "select id_persona from persona where correo like '" 
				+ correo + "'";
		int id_usuario = 0;;
		
		try {
			Statement statement = null;
			statement = this.conexion.createStatement();
			// se ejecuta la consulta y se guarda el resultado en un ResultSet
			ResultSet resultSet = statement.executeQuery(consultaSQL);
			
			// se guarda la informacion de la cuenta en el vector
			resultSet.next();
			id_usuario = resultSet.getInt(1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return id_usuario;
		
	}
	
	public String[] recuperarCuenta(int id_usuario)
	{
		String consultaSQL = "select correo, contrasea from persona where id_persona = " 
				+ id_usuario + "";
		String informacionCuenta[] = new String[2];
		
		try {
			Statement statement = null;
			statement = this.conexion.createStatement();
			// se ejecuta la consulta y se guarda el resultado en un ResultSet
			ResultSet resultSet = statement.executeQuery(consultaSQL);
			
			// se guarda la informacion de la cuenta en el vector
			resultSet.next();
			informacionCuenta[0] = resultSet.getString("correo");
			informacionCuenta[1] = resultSet.getString("contrasea");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return informacionCuenta;
	}
        public boolean confPerfil(String nombre, String apellido) {
		try {
                    
                    String updateSQL = "update persona set nombre = ?, apellido = ? where id_persona = " + Guardar_id.id;
			
                    PreparedStatement sentencia_preparada = null;
			sentencia_preparada = this.conexion.prepareStatement(updateSQL);

			sentencia_preparada.setString(1, nombre);
			sentencia_preparada.setString(2, apellido);
			
			// se ejecuta la sentencia
			sentencia_preparada.executeUpdate();
			// se cierra sentencia_preparada
			sentencia_preparada.close();
			// si el try no tomo una excepcion hasta aqui, se avisa que se creo el usuario
			JOptionPane.showMessageDialog(null, "El perfil ha sido configurado con exito");

			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			// se notifica que no puedo crearse el usuario
			JOptionPane.showMessageDialog(null,
					"Ha ocurrido un error y no se pudo" + " guardar los cambios. Error: " + e.getStackTrace() + "", "Error",
					JOptionPane.ERROR_MESSAGE);
		}

		return false;
	}
        public void guardar(String ruta){
        String insert = "update foto from persona where id = " + Guardar_id.id + " (foto) values(?)";
        FileInputStream fi = null;
        PreparedStatement ps = null;
        try{
            File file = new File(ruta);
            fi = new FileInputStream(file);
           
            ps = this.conexion.prepareStatement(insert);
            ps.setBinaryStream(1, fi);
           
            ps.executeUpdate();
        }catch(Exception ex){
            System.out.println("Error al agregar la foto "+ex.getMessage());
        }

   }
}
