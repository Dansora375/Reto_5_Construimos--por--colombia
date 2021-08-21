/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Requerimiento_1;
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
public class Requerimiento_1Dao {
    
    // Metodo que devuelve una lista con los requerimientos 1
    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
        
        ArrayList<Requerimiento_1> respuesta = new ArrayList<Requerimiento_1>();
        
        Connection conexion = JDBCUtilities.getConnection();
        String consulta ="SELECT p.Constructora , p.Ciudad , p.Banco_Vinculado , p.Porcentaje_Cuota_Inicial , p.Clasificacion , p.Fecha_Inicio FROM Proyecto p WHERE Ciudad = 'Pereira' ;";
        

        try {

            Statement statement = conexion.createStatement();
            ResultSet results = statement.executeQuery(consulta);
            // Recorrer los registros en los VO específicos
            while(results.next()){
                // Instanciando un objeto de tipo Requerimiento_1 (ENCONTRADO EN EL VO) para darle valores a las variables de la clase Requerimeinto 1.VO
                Requerimiento_1 requerimiento_1=new Requerimiento_1();

                requerimiento_1.setConstructora(results.getString("Constructora"));
                requerimiento_1.setCiudad(results.getString("Ciudad"));
                requerimiento_1.setBanco(results.getString("Banco_Vinculado"));
                requerimiento_1.setPorcentaje(results.getDouble("Porcentaje_Cuota_Inicial"));
                requerimiento_1.setClasificacion(results.getString("Clasificacion"));
                requerimiento_1.setFecha(results.getString("Fecha_inicio"));
                // Se agrega un objeto con sus valoes establecidos a cada campo de la lista,  en cada ciclo del while
                respuesta.add(requerimiento_1);
            }
            results.close();
            statement.close();
            
        } catch (SQLException e) {

            // System.out.println("Error al consultar los datos de la primera consulta");
            // e.printStackTrace();

        } finally {
            
            if(conexion!= null){
                    conexion.close();
            }
        
            }    
        // Retornar la colección de vo's
            return respuesta;
            
    }
    
}
