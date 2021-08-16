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
public class Requerimiento_2Dao {
    public ArrayList<Requerimiento2> requerimiento2() throws SQLException {


        ArrayList<Requerimiento2> respuesta = new ArrayList<Requerimiento2>();
        Connection conexion = JDBCUtilities.getConnection();

        try {

            String consulta = "select ID_Compra, Proveedor , Constructora, Banco_Vinculado, Ciudad from Compra NATURAL JOIN Proyecto where Ciudad='Salento' and Proveedor='Homecenter';";
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(consulta);

            while (resultSet.next()){

                Requerimiento2 requerimiento2 = new Requerimiento2();

                requerimiento2.setId_compra(resultSet.getInt("ID_Compra"));
                requerimiento2.setProveedor (resultSet.getString("Proveedor"));
                requerimiento2.setConstructora(resultSet.getString("Constructora"));
                requerimiento2.setBanco_vinculado(resultSet.getString("Banco_Vinculado"));
                requerimiento2.setCiudad(resultSet.getString("Ciudad"));

                respuesta.add(requerimiento2);

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
