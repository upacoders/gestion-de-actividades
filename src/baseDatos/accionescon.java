/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class accionescon {

    public static Connection conDB() {
        try {
            Class.forName("org.postgresql.Driver");
            String usuario = "postgres";
            String pass = "12345678";
            String url = "jdbc:postgresql://localhost:5432/Euclick";
            Connection con = DriverManager.getConnection(usuario, pass, url);

            return con;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }

}
