/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controlador.ControladorRequerimientos;
import Modelo.Requerimiento_1;
import Modelo.Requerimiento_2;
import Modelo.Requerimiento_3;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class VistaRequerimientos {
    
    // Se crea un objeto de la clase ControladorRequrimientos lamado controlador y se ejecuta el codigo del constructor sin parametros de esta clase
    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1() {

        System.out.println("----------Listado de Proyectos de la ciudad de Pereira----------");
        try 
        {
            // var respuestaReq_1 =controlador.consultarRequerimiento1();
            ArrayList<Requerimiento_1> respuestaReq_1 = controlador.consultarRequerimiento1();
            // Es como escribir : Arraylsit<Requerimiento_1> respuestaReq_1 = controlador.consultarRequerimiento1();

            // Encabezado del resultado
            System.out
                    .println("Constructora Ciudad Banco_Vinculado Porcentaje_Cuota_Inicial Clasificacion Fecha_Inicio");

            // Cada VO cargado, mostrarlo en la vista
            for(Requerimiento_1 show_Req1: respuestaReq_1){

                // Utilizando esta forma de mostrar los datos, se tuvo que implementar el metodo toString en el VO-Requerimiento 1 
                // System.out.println(show_Req1);
                // Sino se desea implementar el metodo toString en VO-Requerimiento 1  se puede escribir el siguiente codigo

          
                System.out.printf("%s %s %s %f %s %s %n",

                        show_Req1.getConstructora(),
                         show_Req1.getCiudad(), 
                         show_Req1.getBanco(), 
                         show_Req1.getPorcentaje(),
                        show_Req1.getClasificacion(), 
                        show_Req1.getFecha());

                }

        } catch (Exception e) {
                System.err.println("Ha ocurrido un error!" + e.getMessage());
                }
    }

    public static void requerimiento2() {
        try {
            
            var results =controlador.consultarRequerimiento2();
            // ArrayList<Requerimiento_2> results = controlador.consultarRequerimiento2();

            System.out.println("----------Listado de compras----------");
            // Encabezado del resultado
            System.out.println("Proveedor Constructora Pagado");
            // Cada VO cargado, mostrarlo en la vista
            for(Requerimiento_2 show_Req2:results){

//                System.out.println(show_Req2);
                 System.out.printf("%s %s %s \n",

                         show_Req2.getProveedor(),
                         show_Req2.getConstructora(),
                         show_Req2.getPagado());
            }
            

        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

    public static void requerimiento3() {
        try {
            
            var results = controlador.consultarRequerimiento3();
            // ArrayList<Requerimiento_3> results = controlador.consultarRequerimiento3();

            System.out.println("----------Cargo y el máximo de los salarios----------");
            // Encabezado del resultado
            System.out.println("Cargo MAX(l.Salario)");

            // Cada VO cargado, mostrarlo en la vista
            for(Requerimiento_3 show_Req3: results){

//                System.out.println(show_Req3);
                 System.out.printf("%s %d \n",
                    
                         show_Req3.getCargo(),
                         show_Req3.getMaxSalario());
            }


        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }
}
