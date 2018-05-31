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
import modelo.Admin;
import modelo.Aseguradora;
import modelo.Conexion;

/**
 *
 * @author nicolasgarcia
 */
public class ctlAdmin {
     String comparacion = "nit";
    String nombreTabla = "administrador";
    Conexion conexion = new Conexion();
    JsonObject objeto;
    Gson gson = new Gson();
    JsonParser parser = new JsonParser();

    
    
 public String convertirGson(Admin admin) {
        Gson gson = new Gson();
        String objeto = gson.toJson(admin);
        return objeto;
    }

    public boolean SolicitudGuardar(int idAdmin, String nombre, String apellido, String usuario) {
      Admin admin = new Admin(idAdmin, nombre, apellido, usuario);
        genericDAO genDAO = new genericDAO();
        String json = convertirGson(admin);

        return genDAO.guardar(json, nombreTabla);
    }
    
}
