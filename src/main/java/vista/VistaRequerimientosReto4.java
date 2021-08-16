/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorRequerimientosReto4;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Requerimiento1;
import modelo.Requerimiento2;
import modelo.Requerimiento3;

/**
 *
 * @author pad
 */
public class VistaRequerimientosReto4 {
    
    public static final ControladorRequerimientosReto4 controlador = new ControladorRequerimientosReto4();

    public static void requerimiento1(){
    
	System.out.println("*** Asesor por Ciudad ***");


        try{
            

		ArrayList<Requerimiento1> rankingAsesorPorCiudad = controlador.consultarRequerimiento_1();

        for (Requerimiento1 proyecto : rankingAsesorPorCiudad) {

            System.out.printf("El asesor con Id %d se llama %s %s y reside en %s ", proyecto.getId_lider(), proyecto.getNombre(), proyecto.getApellido(), proyecto.getCiudad()); 
            System.out.println();

        }

        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

    public static void requerimiento2(){     

        System.out.println("*** Compras por Proveedor ***");


        try{
            ArrayList<Requerimiento2> rankingComprasPorProyecto = controlador.consultarRequerimiento_2();

            for (Requerimiento2 proyecto : rankingComprasPorProyecto) {
    
                System.out.printf("La compra %d del proveedor %s para la constructora %s del banco %s ubicado en %s ", proyecto.getId_compra(), proyecto.getProveedor(), proyecto.getConstructora(), proyecto.getBanco_vinculado(),  proyecto.getCiudad()); 
                System.out.println();

        }
        
    }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

    public static void requerimiento3(){

        System.out.println("*** Proyectos Casa Campestre ***");

         try{
            ArrayList<Requerimiento3> rankingComprasCasaCampestre = controlador.consultarRequerimiento_3();

            for (Requerimiento3 proyecto : rankingComprasCasaCampestre) {
    
                System.out.printf("El proyecto con ID %d de la constructora: %s tiene %d habitaciones y esta ubicado en %s ", proyecto.getId_proyecto(), proyecto.getConstructora(), proyecto.getHabitaciones(),  proyecto.getCiudad()); 
                System.out.println();
                
            }
        
         }catch(SQLException e){
             System.err.println("Ha ocurrido un error!"+e.getMessage());
         }
    }
}
