package baseDatos;

import java.sql.*;

//finanzas_personales
public class Conexion {
    private String url = "jdbc:postgresql://localhost:5432/Euclick";
	private String usuario = "postgres";
	private String contrasenia = "Keigomitsui77";
	private Connection conexion = null;

    


    public void crearConexion() throws Exception {

        try {
            // se define el driver a utilizar (postgresql) 
            Class.forName("org.postgresql.Driver");
        } catch (Exception e) {
            throw new Exception("El driver no fue encontrado, asegure de haber importado el jar");
        }

        // se crea la conexion
        try {
            //Conexion con la base de datos
            conexion = DriverManager.getConnection(this.url, usuario, contrasenia);
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public Connection getConexion() {
        return conexion;
    }

    /**
     * Esta funcion toma como par�metro una conexion y una consulta sql, y
     * retorna true si esa consulta muestra alg�n registro (por lo menos 1 fila)
     *
     * @param conection
     * @param consultaSql
     * @return
     */
    public boolean existeAlgunRegistro(String consultaSql) {
        // variable para saber la cantidad de registros
        int cantidad_registros = 0;

        try {
            // se crea el Statement para ejecutar la consulta
            Statement statement = null;
            statement = conexion.createStatement();

            // se ejecuta la consulta y se guarda el resultado en un ResultSet
            ResultSet resultSet = statement.executeQuery(consultaSql);

            // se recorre todos los registros
            while (resultSet.next() && cantidad_registros < 1) //mientras exista un registro siguiente en el resultSet 
            // o mientras cantidad_registros sea < 1, para no recorrer todos los registros
            // porque solo necesitamos saber si hay al menos 1 registro	
            {
                // aumenta en 1 la cantidad_registros
                cantidad_registros++;

            }
            resultSet.close();
        } catch (Exception e) { // en el caso de que haya una excepcion, lo toma

            e.printStackTrace(); // muestra el mensaje de error
        }

        // se verifica cuanto vale cantidad_registros
        if (cantidad_registros > 0) { // si cantidad_registros > 0, quiere decir que por lo menos hay un registro
            return true;
        } else // si cantidad_registros no es mayor a 0, quiere decir que no hay ningun registro 
        {
            return false;
        }
    }
	

}
