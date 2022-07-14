/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

//finanzas_personales

public class ConexionPerfil {
    
    private Conexion con = new Conexion();
	private Connection conexion;
    
    public ConexionPerfil() throws Exception {
		this.con.crearConexion();

		// se vuelve a tomar la conexi�n
		this.conexion = con.getConexion();
	}



	
        
        public static void main (String arg[]) throws Exception{
            
        }
        
	}

	