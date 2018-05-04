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
import modelo.RevisionTecno;

/**
 *
 * @author nicolasgarcia
 */
public class ctlRevision {
    
      String comparacion = "id";
    String nombreTabla = "revision_tecno";
    Conexion conexion = new Conexion();
    JsonObject objeto;
    Gson gson = new Gson();
    JsonParser parser = new JsonParser();

    
    
 public String convertirGson(RevisionTecno revision) {
        Gson gson = new Gson();
        String objeto = gson.toJson(revision);
        return objeto;
    }

    public boolean SolicitudGuardar(int id, int cda_nit, String fecha_expedicion, String fecha_final, String vigencia, String vehiculo_placa) {
       RevisionTecno revision = new RevisionTecno(id, cda_nit, fecha_expedicion, fecha_final, vigencia, vehiculo_placa);
        genericDAO genDAO = new genericDAO();
        String json = convertirGson(revision);

        return genDAO.guardar(json, nombreTabla);
    }
    
}
