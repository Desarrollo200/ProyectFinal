/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.SQLException;
import modelo.Aseguradora;
import modelo.Conexion;
import modelo.Municipio;

/**
 *
 * @author nicolasgarcia
 */
public class daoAseguradora extends Conexion {

   Municipio municipio = new Municipio();

    //    
    public Municipio consulta(String nombre) {
        String consulta = "select id from poryectofinaldesarrollo.municipio where nombre ='" + nombre + "'";
        System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        try {
            if (resultadoDB.next()) {

                municipio.setId(resultadoDB.getInt("id"));

            }
        } catch (SQLException ex) {
            System.out.println("Esto se tosto buscar");
        }
        return municipio;
    }

}
