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
import modelo.LicenciaCategorias;
import modelo.Seguro;

/**
 *
 * @author nicolasgarcia
 */
public class ctlSeguro {
     String comparacion = "numero_poliza";
    String nombreTabla = "seguro";
    Conexion conexion = new Conexion();
    JsonObject objeto;
    Gson gson = new Gson();
    JsonParser parser = new JsonParser();

    
    
 public String convertirGson(Seguro seguro) {
        Gson gson = new Gson();
        String objeto = gson.toJson(seguro);
        return objeto;
    }

    public boolean SolicitudGuardar(int numero_poliza, String fecha_expedicion, String fecha_inicio, String fecha_final, String estado, int aseguradora, int tipo_seguro) {
      Seguro seguro = new Seguro(numero_poliza, fecha_expedicion, fecha_inicio, fecha_final, estado, aseguradora, tipo_seguro);
        genericDAO genDAO = new genericDAO();
        String json = convertirGson(seguro);

        return genDAO.guardar(json, nombreTabla);
    }
    
}
