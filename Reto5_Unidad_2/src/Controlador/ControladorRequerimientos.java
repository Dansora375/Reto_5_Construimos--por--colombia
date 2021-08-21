/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Requerimiento_1;
import Modelo.Requerimiento_1Dao;
import Modelo.Requerimiento_2;
import Modelo.Requerimiento_2Dao;
import Modelo.Requerimiento_3Dao;
import Modelo.Requerimiento_3;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Administrador
 */
public class ControladorRequerimientos {
    
    private final Requerimiento_1Dao requerimiento1Dao;
    private final Requerimiento_2Dao requerimiento2Dao;
    private final Requerimiento_3Dao requerimiento3Dao;

    // Controlador sin parametros (tiene la funcipon de instanciamiento de esta forma: Requerimiento_1Da requerimiento1Dao = new Requerimiento_1Dao() )
    public ControladorRequerimientos() {
        // Instanciando objetos de una clase dentro de un constructor 
        this.requerimiento1Dao = new Requerimiento_1Dao();
        this.requerimiento2Dao = new Requerimiento_2Dao();
        this.requerimiento3Dao = new Requerimiento_3Dao();

    }

    public ArrayList<Requerimiento_1> consultarRequerimiento1() throws SQLException {
        
        return requerimiento1Dao.requerimiento1();


    }

    public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
        
        return requerimiento2Dao.requerimiento2();

    }

    public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
        
        return requerimiento3Dao.requerimiento3();

    }
    
}
