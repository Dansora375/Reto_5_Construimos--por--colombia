/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Util.JDBCUtilities;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author Administrador
 */
public class Requerimiento_2Dao {
    
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        // Su código

        ArrayList<Requerimiento_2> respuesta = new ArrayList<Requerimiento_2>();

        Connection conexion = JDBCUtilities.getConnection();
        
        String query="SELECT c.Proveedor , p.Constructora , c.Pagado FROM Compra c INNER JOIN Proyecto p ON c.ID_Proyecto = p.ID_Proyecto WHERE c.Pagado = 'Si' AND c.Proveedor IN ('Homecenter', 'JUMBO') AND p.Constructora LIKE '%S.A.' ORDER BY c.Proveedor;" ;
        

        try {

            Statement statement = conexion.createStatement();
            ResultSet results= statement.executeQuery(query);

            while(results.next()){

                Requerimiento_2 requerimiento_2=new Requerimiento_2();

                requerimiento_2.setProveedor(results.getString("Proveedor"));
                requerimiento_2.setConstructora(results.getString("Constructora"));
                requerimiento_2.setPagado(results.getString("Pagado"));

                respuesta.add(requerimiento_2);
            }

            results.close();
            statement.close();
            // Recorrer los registros en los VO específicos
        } catch (SQLException e) {

            // System.out.println("Error al ejecutar los consultas del requerimeineto 2");
        } finally {
            
            if(conexion!=null){
                conexion.close();
            }

        }

        // Retornar la colección de vo's
        return respuesta;

    }
    
    
}
