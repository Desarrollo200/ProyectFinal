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
import modelo.Vehiculo;

/**
 *
 * @author nicolasgarcia
 */
public class ctlLicenciaCategoria {
          String comparacion = "id";
    String nombreTabla = "licencia_categorias";
    Conexion conexion = new Conexion();
    JsonObject objeto;
    Gson gson = new Gson();
    JsonParser parser = new JsonParser();

    
    
 public String convertirGson(LicenciaCategorias licenciaC) {
        Gson gson = new Gson();
        String objeto = gson.toJson(licenciaC);
        return objeto;
    }

    public boolean SolicitudGuardar(int id, String licencia_cond_num_lica_cond, String categorias_licencia_id) {
      LicenciaCategorias licenciaC = new LicenciaCategorias(id, licencia_cond_num_lica_cond, categorias_licencia_id);
        genericDAO genDAO = new genericDAO();
        String json = convertirGson(licenciaC);

        return genDAO.guardar(json, nombreTabla);
    }
    
}
