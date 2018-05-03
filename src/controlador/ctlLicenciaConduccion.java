/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAO.genericDAO;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import modelo.Conexion;
import modelo.LicenciaConduccion;
import modelo.Vehiculo;

/**
 *
 * @author nicolasgarcia
 */
public class ctlLicenciaConduccion {
      String comparacion = "num_licencia_cond";
    String nombreTabla = "licencia_conduccion";
    Conexion conexion = new Conexion();
    JsonObject objeto;
    Gson gson = new Gson();
    JsonParser parser = new JsonParser();
    
    public String convertirGson(LicenciaConduccion licencia) {
        Gson gson = new Gson();
        String objeto = gson.toJson(licencia);
        return objeto;
    }

    public boolean SolicitudGuardar(String num_licencia_cond, String fecha_expedicion, String restriccion_conductor, String organismo_expedidor, String numero_identidad_ciudadano) {
      LicenciaConduccion licencia = new LicenciaConduccion(num_licencia_cond, fecha_expedicion, restriccion_conductor, organismo_expedidor, numero_identidad_ciudadano);
        genericDAO genDAO = new genericDAO();
        String json = convertirGson(licencia);

        return genDAO.guardar(json, nombreTabla);
    }
    
}
