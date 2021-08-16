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
public class Requerimiento3 {
    private Integer id_proyecto;
    private String constructora;
    private Integer habitaciones;
    private String ciudad;

    
    public Requerimiento3() {
    }


    public Requerimiento3(Integer id_proyecto, String constructora, Integer habitaciones, String ciudad) {
        this.id_proyecto = id_proyecto;
        this.constructora = constructora;
        this.habitaciones = habitaciones;
        this.ciudad = ciudad;
    }


    public Integer getId_proyecto() {
        return id_proyecto;
    }


    public void setId_proyecto(Integer id_proyecto) {
        this.id_proyecto = id_proyecto;
    }


    public String getConstructora() {
        return constructora;
    }


    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }


    public Integer getHabitaciones() {
        return habitaciones;
    }


    public void setHabitaciones(Integer habitaciones) {
        this.habitaciones = habitaciones;
    }


    public String getCiudad() {
        return ciudad;
    }


    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
