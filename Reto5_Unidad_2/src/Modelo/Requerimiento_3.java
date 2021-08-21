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
public class Requerimiento_3 {
    
    private String cargo;
    private int maxSalario;

    public Requerimiento_3(){

    }

    public Requerimiento_3(String cargo, int maxSalario) {
        this.cargo = cargo;
        this.maxSalario = maxSalario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getMaxSalario() {
        return maxSalario;
    }

    public void setMaxSalario(int maxSalario) {
        this.maxSalario = maxSalario;
    }
    
//    @Override
//    public String toString(){
//
//        return cargo+" "+ maxSalario;
//    }

    

}
