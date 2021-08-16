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
public class Requerimiento_3Dao {
    public ArrayList<Requerimiento3> requerimiento3() throws SQLException {


        ArrayList<Requerimiento3> respuesta = new ArrayList<Requerimiento3>();
        Connection conexion = JDBCUtilities.getConnection();

        try {

            String consulta = "select ID_Proyecto , Constructora , Numero_Habitaciones , Ciudad  from Proyecto where Clasificacion='Casa Campestre' and Ciudad IN ('Santa Marta', 'Cartagena', 'Barranquilla');";
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(consulta);

            while (resultSet.next()){

                Requerimiento3 requerimiento3 = new Requerimiento3();

                requerimiento3.setId_proyecto(resultSet.getInt("ID_Proyecto"));
                requerimiento3.setConstructora(resultSet.getString("Constructora"));
                requerimiento3.setHabitaciones(resultSet.getInt("Numero_Habitaciones"));
                requerimiento3.setCiudad(resultSet.getString("Ciudad"));

                respuesta.add(requerimiento3);

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
