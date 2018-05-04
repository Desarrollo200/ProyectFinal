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
import javax.swing.table.DefaultTableModel;
import modelo.LicenciaConduccion;
import modelo.Conexion;

/**
 *
 * @author XgioserX
 */
public class ctlLicencia {
    
    String comparacion = "num_licencia_cond";
    String nombreTabla = "licencia_conduccion";
    Conexion conexion = new Conexion();
    JsonObject objeto;
    Gson gson = new Gson();
    JsonParser parser = new JsonParser();
   
    public String convertirGson(LicenciaConduccion licenciaConduccion) {
        Gson gson = new Gson();
        String objeto = gson.toJson(licenciaConduccion);
        return objeto;
    }
    
    public DefaultTableModel SolicitudListar() {
        LicenciaConduccion licenciaConduccion= new LicenciaConduccion();
        String json = convertirGson(licenciaConduccion);
        genericDAO genDAO = new genericDAO();
        return genDAO.listar(json, nombreTabla);
    }
}
