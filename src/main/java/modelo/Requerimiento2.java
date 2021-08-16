/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author pad
 */
public class Requerimiento2 {
    private Integer id_compra;
    private String proveedor;
    private String constructora;
    private String banco_vinculado;
    private String ciudad;

    
    public Requerimiento2() {
    }


    public Requerimiento2(Integer id_compra, String proveedor, String constructora, String banco_vinculado,
            String ciudad) {
        this.id_compra = id_compra;
        this.proveedor = proveedor;
        this.constructora = constructora;
        this.banco_vinculado = banco_vinculado;
        this.ciudad = ciudad;
    }


    public Integer getId_compra() {
        return id_compra;
    }


    public void setId_compra(Integer id_compra) {
        this.id_compra = id_compra;
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


    public String getBanco_vinculado() {
        return banco_vinculado;
    }


    public void setBanco_vinculado(String banco_vinculado) {
        this.banco_vinculado = banco_vinculado;
    }


    public String getCiudad() {
        return ciudad;
    }


    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
