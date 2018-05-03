/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import modelo.Conexion;
import modelo.Vehiculo;

/**
 *
 * @author nicolasgarcia
 */
public class vehiculoDAO extends Conexion{
    
    
     public boolean modificarVeh(Vehiculo vehDAO) {
        String consulta = "update poryectofinaldesarrollo.vehiculo set propietario_id='" + vehDAO.getPropietario_id()+ "' where placa=" + vehDAO.getPlaca();
         System.out.println(consulta);
        return super.ejecutar(consulta);
         
    }
     
     
    
}
