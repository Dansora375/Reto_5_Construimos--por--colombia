/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Administrador
 */

import Util.JDBCUtilities;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Requerimiento_3Dao {
    
    
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        
        ArrayList<Requerimiento_3> respuesta = new ArrayList<Requerimiento_3>();
        
        Connection conexion = JDBCUtilities.getConnection();
        
        String url="SELECT l.Cargo , MAX(l.Salario) FROM Lider l GROUP BY l.Cargo HAVING MAX(l.Salario)>700000;";

        try{
            Statement statement= conexion.createStatement();
            ResultSet rs=statement.executeQuery(url);
            // Recorrer los registros en los VO específicos

            while (rs.next()){

                Requerimiento_3 requerimiento_3 = new Requerimiento_3();

                requerimiento_3.setCargo(rs.getString("Cargo"));
                requerimiento_3.setMaxSalario(rs.getInt("MAX(l.Salario)"));

                respuesta.add(requerimiento_3);
            }
            rs.close();
            statement.close();

        } catch (SQLException e) {

            System.out.println("Error al realizar las consultas del requerimiento 3");

        } finally {

            if(conexion!=null){
                conexion.close();
            }

        }

        // Retornar la colección de vo's
        return respuesta;

    }
}
