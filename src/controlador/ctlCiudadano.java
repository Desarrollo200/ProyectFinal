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
import modelo.Ciudadano;
import modelo.Conexion;

/**
 *
 * @author nicolasgarcia
 */
public class ctlCiudadano {
    
       String comparacion = "numero_identidad";
    String nombreTabla = "ciudadano";
    Conexion conexion = new Conexion();
    JsonObject objeto;
    Gson gson = new Gson();
    JsonParser parser = new JsonParser();

    
    
 public String convertirGson(Ciudadano ciudadano) {
        Gson gson = new Gson();
        String objeto = gson.toJson(ciudadano);
        return objeto;
    }

    public boolean SolicitudGuardar(String numero_identidad, String nombre, String apellido, String fecha_nacimiento, int municipio_nacimiento, String fecha_exp_identidad, int tipo_sangre_id, int genero_id, String estatura, int municipio_residencia, String direccion, String correo, String telefono, String celular, String usuario) {
      Ciudadano ciudadano = new Ciudadano(numero_identidad, nombre, apellido, fecha_nacimiento, municipio_nacimiento, fecha_exp_identidad, tipo_sangre_id, genero_id, estatura, municipio_residencia, direccion, correo, telefono, celular, usuario);
        genericDAO genDAO = new genericDAO();
        String json = convertirGson(ciudadano);

        return genDAO.guardar(json, nombreTabla);
    }
    
  

}
