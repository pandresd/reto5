/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import util.JDBCUtilities;


/**
 *
 * @author pad
 */
public class Requerimiento_1Dao {
    public ArrayList<Requerimiento1> requerimiento1() throws SQLException {
        // Su código

        ArrayList<Requerimiento1> respuesta = new ArrayList<Requerimiento1>();
        Connection conexion = JDBCUtilities.getConnection();

        try {

            String consulta = "select ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia from Lider where cargo='Asesor' order by Ciudad_Residencia asc;";
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(consulta);

            while (resultSet.next()){

                Requerimiento1 requerimiento1 = new Requerimiento1();

                requerimiento1.setId_lider(resultSet.getInt("ID_Lider"));
                requerimiento1.setNombre(resultSet.getString("Nombre"));
                requerimiento1.setApellido(resultSet.getString("Primer_Apellido"));
                requerimiento1.setCiudad(resultSet.getString("Ciudad_Residencia"));

                respuesta.add(requerimiento1);

            }

            resultSet.close();
            statement.close();



        } catch (SQLException e) {

            System.err.println("Error: " +e );
             
        }

        finally {

            if (conexion != null){

                conexion.close();
            }

        }

        return respuesta;



    }
    
}
