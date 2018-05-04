/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAO.genericDAO;
import DAO.vehiculoDAO;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import modelo.Conexion;
import modelo.LicenciaCategorias;
import modelo.Propieatario;

/**
 *
 * @author nicolasgarcia
 */
public class ctlPropietario {
        String comparacion = "id";
    String nombreTabla = "propietario";
    Conexion conexion = new Conexion();
    JsonObject objeto;
    Gson gson = new Gson();
    JsonParser parser = new JsonParser();

    
    
 public String convertirGson(Propieatario propietario) {
        Gson gson = new Gson();
        String objeto = gson.toJson(propietario);
        return objeto;
    }

    public boolean SolicitudGuardar(int id, String ciudadano) {
    Propieatario propietario = new Propieatario(id, ciudadano);
        genericDAO genDAO = new genericDAO();
        String json = convertirGson(propietario);

        return genDAO.guardar(json, nombreTabla);
    }
     public String[] SolicitudBuscar(int id) {
       Propieatario propietario = new Propieatario(id, "");
        genericDAO genDAO = new genericDAO();
        String json = convertirGson(propietario);

        return genDAO.buscar(json, nombreTabla);
    }
      public Propieatario SolicitudBuscar2(int id) {
          vehiculoDAO vehDAO = new vehiculoDAO();
        return vehDAO.buscarDoc(id);
    }
      public boolean SolicitudBuscar3(int id) {
          vehiculoDAO vehDAO = new vehiculoDAO();
        return vehDAO.buscarCiu(id);
    }

    
    
}
