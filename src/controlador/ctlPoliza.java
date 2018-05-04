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
import modelo.Poliza;

/**
 *
 * @author nicolasgarcia
 */
public class ctlPoliza {
    
      String comparacion = "id";
    String nombreTabla = "poliza";
    Conexion conexion = new Conexion();
    JsonObject objeto;
    Gson gson = new Gson();
    JsonParser parser = new JsonParser();

    
    
 public String convertirGson(Poliza poliza) {
        Gson gson = new Gson();
        String objeto = gson.toJson(poliza);
        return objeto;
    }

    public boolean SolicitudGuardar(int id, int numero_poliza, String placa_vehiculo) {
        Poliza poliza = new Poliza(id, numero_poliza, placa_vehiculo);
        genericDAO genDAO = new genericDAO();
        String json = convertirGson(poliza);

        return genDAO.guardar(json, nombreTabla);
    }
    
}
