/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;
import java.sql.*;
/**
 *
 * @author Administrador
 */
public class JDBCUtilities {
    
    
    
     private static final String DATABASE_LOCATION = "C:\\Users\\Administrador\\Documents\\IMASTER TODO\\programacion Bases de datos\\ProyectosConstruccion.db";

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:" + DATABASE_LOCATION;

        return DriverManager.getConnection(url);
    }
    
}

