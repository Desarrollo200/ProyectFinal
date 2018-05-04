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
import modelo.ComparendoUsuario;
import modelo.Conexion;

/**
 *
 * @author XgioserX
 */
public class ctlComparendoUsuario {
    String comparacion = "id";
    String nombreTabla = "comparendo_usuario";
    Conexion conexion = new Conexion();
    JsonObject objeto;
    Gson gson = new Gson();
    JsonParser parser = new JsonParser();

    
    
 public String convertirGson(ComparendoUsuario comparendoUs) {
        Gson gson = new Gson();
        String objeto = gson.toJson(comparendoUs);
        return objeto;
    }

    public boolean SolicitudGuardar(int id, int usuario_numero_iden, int comparendo_id) {
       ComparendoUsuario comparendoUs = new ComparendoUsuario(id, usuario_numero_iden, comparendo_id);
        genericDAO genDAO = new genericDAO();
        String json = convertirGson(comparendoUs);
        return genDAO.guardar(json, nombreTabla);
    } 
}
