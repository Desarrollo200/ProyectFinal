/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAO.consultasDAO;
import DAO.daoVehiculo;
import DAO.genericDAO;
import DAO.vehiculoDAO;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.Vehiculo;

/**
 *
 * @author nicolasgarcia
 */
public class ctlVehiculo {
    
      String comparacion = "placa";
    String nombreTabla = "vehiculo";
    Conexion conexion = new Conexion();
    JsonObject objeto;
    Gson gson = new Gson();
    JsonParser parser = new JsonParser();

    
    
 public String convertirGson(Vehiculo vehiculo) {
        Gson gson = new Gson();
        String objeto = gson.toJson(vehiculo);
        return objeto;
    }

    public boolean SolicitudGuardar(String placa, String licencia_transito, int tipo_servicio, int clase_vehiculo, int estado_vehiculo, int modelo_id, int color_id, String numero_chasis, String cilindrage, 
            int tipo_combustible_id, String fecha_matricula, String num_pasajeros, int numero_poliza, int propietario_id) {
      Vehiculo vehiculo = new Vehiculo(placa, licencia_transito, tipo_servicio, clase_vehiculo, estado_vehiculo, modelo_id, color_id, numero_chasis, cilindrage,
              tipo_combustible_id, num_pasajeros, fecha_matricula, numero_poliza, propietario_id);
        genericDAO genDAO = new genericDAO();
        String json = convertirGson(vehiculo);

        return genDAO.guardar(json, nombreTabla);
    }
   
    public DefaultTableModel SolicitudListar() {
      Vehiculo vehiculo = new Vehiculo();
        String json = convertirGson(vehiculo);
        genericDAO genDAO = new genericDAO();
        return genDAO.listar(json, nombreTabla);
    
    }
    public boolean SolicitudModificar(String placa, int propietario_id) {
     Vehiculo vehiculo = new Vehiculo(placa, propietario_id);
        vehiculoDAO vehDAO = new vehiculoDAO();
        return vehDAO.modificarVeh(vehiculo);
    }
    
     public DefaultTableModel solicitudListarAll() {
       daoVehiculo vehiculoDAO = new daoVehiculo();
        return vehiculoDAO.listarVehiculo();  
    }
     
     public DefaultTableModel solicitudListarDeCiudadano(String cedula) {
       daoVehiculo vehiculoDAO = new daoVehiculo();
        return vehiculoDAO.listarVehiculoCiudadano(cedula);  
    }
     
       public DefaultTableModel solicitudListarVehiPlaca(String placa) {
       consultasDAO daoConsultas = new consultasDAO();
       return daoConsultas.vehiculosPorPlaca(placa);  
    }
       
       public DefaultTableModel solicitudListarVehiClase(String clase) {
       consultasDAO daoConsultas = new consultasDAO();
       return daoConsultas.vehiculosPorClase(clase);  
    }
       
       public DefaultTableModel solicitudListarVehiColor(String color) {
       consultasDAO daoConsultas = new consultasDAO();
       return daoConsultas.vehiculosPorColor(color);  
    }
       
       public DefaultTableModel solicitudListarVehiEstado(String estado) {
       consultasDAO daoConsultas = new consultasDAO();
       return daoConsultas.vehiculosPorEstado(estado);  
    }
       
       public DefaultTableModel solicitudListarVehiModelo(String modelo) {
       consultasDAO daoConsultas = new consultasDAO();
       return daoConsultas.vehiculosPorModelo(modelo);  
    }
       
       public DefaultTableModel solicitudListarVehitipoCombus(String tipoComb) {
       consultasDAO daoConsultas = new consultasDAO();
       return daoConsultas.vehiculosPorTipoCombustible(tipoComb);  
    }
}
