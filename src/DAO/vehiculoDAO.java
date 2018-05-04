/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.SQLException;
import modelo.Conexion;
import modelo.Propieatario;
import modelo.Vehiculo;

/**
 *
 * @author nicolasgarcia
 */
public class vehiculoDAO extends Conexion{
    
    Propieatario pro = new Propieatario();
     public boolean modificarVeh(Vehiculo vehDAO) {
        String consulta = "update poryectofinaldesarrollo.vehiculo set propietario_id='" + vehDAO.getPropietario_id()+ "' where placa=" + vehDAO.getPlaca();
         System.out.println(consulta);
        return super.ejecutar(consulta);
         
    }
     
      public Propieatario buscarDoc(int id) {
        String consulta = "select ciudadano from poryectofinaldesarrollo.propietario where id='" + id + "'";
        super.ejecutarRetorno(consulta);
        try {
            if (resultadoDB.next()) {
                System.out.println("entro buscar");
                pro.setId(resultadoDB.getInt("id"));
                pro.setCiudadano(resultadoDB.getString("ciudadano"));
               
                
                
            }
        } catch (SQLException ex) {
            System.out.println("Esto se tosto buscar");
        }
        return pro;
    }
     
     
    
}
