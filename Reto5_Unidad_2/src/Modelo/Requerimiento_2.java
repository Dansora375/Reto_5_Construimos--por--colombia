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
public class Requerimiento_2 {
    
    private String proveedor;
    private String constructora;
    private String pagado;
    
    

    public Requerimiento_2(){

    }



    public Requerimiento_2(String proveedor, String constructora, String pagado) {
        this.proveedor = proveedor;
        this.constructora = constructora;
        this.pagado = pagado;
    }



    public String getProveedor() {
        return proveedor;
    }



    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }



    public String getConstructora() {
        return constructora;
    }



    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }



    public String getPagado() {
        return pagado;
    }



    public void setPagado(String pagado) {
        this.pagado = pagado;
    }



    // @Override
    // public String toString() {
    //     return  proveedor + "" +constructora+ "" + pagado  ;
    // }
    
    
    
    
    

    
}
