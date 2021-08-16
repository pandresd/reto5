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
public class Requerimiento1 {
    
    
    private Integer id_lider;
    private String nombre;
    private String apellido;
    private String ciudad;
    
    
    public Requerimiento1() {
    }


    public Requerimiento1(Integer id_lider, String nombre, String apellido, String ciudad) {
        this.id_lider = id_lider;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
    }


    public Integer getId_lider() {
        return id_lider;
    }


    public void setId_lider(Integer id_lider) {
        this.id_lider = id_lider;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getCiudad() {
        return ciudad;
    }


    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    
}
