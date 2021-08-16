/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Requerimiento1;
import modelo.Requerimiento2;
import modelo.Requerimiento3;
import modelo.Requerimiento_1Dao;
import modelo.Requerimiento_2Dao;
import modelo.Requerimiento_3Dao;

/**
 *
 * @author pad
 */
public class ControladorRequerimientosReto4 {
   private final Requerimiento_1Dao requerimiento1Dao;
    private final Requerimiento_2Dao requerimiento2Dao;
    private final Requerimiento_3Dao requerimiento3Dao;
    


    public ControladorRequerimientosReto4(){
        
        this.requerimiento1Dao = new Requerimiento_1Dao();
        this.requerimiento2Dao = new Requerimiento_2Dao();
        this.requerimiento3Dao = new Requerimiento_3Dao();

    }

    public ArrayList<Requerimiento1> consultarRequerimiento_1() throws SQLException {

        return this.requerimiento1Dao.requerimiento1();
        
    }
    
    public ArrayList<Requerimiento2> consultarRequerimiento_2() throws SQLException {
        return this.requerimiento2Dao.requerimiento2();
    }

    public ArrayList<Requerimiento3> consultarRequerimiento_3() throws SQLException {
        return this.requerimiento3Dao.requerimiento3();
    } 
}
