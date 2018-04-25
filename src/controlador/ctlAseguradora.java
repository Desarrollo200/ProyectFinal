/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAO.daoAseguradora;
import DAO.genericDAO;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import javax.swing.table.DefaultTableModel;
import modelo.Aseguradora;
import modelo.Conexion;
import modelo.Municipio;

/**
 *
 * @author nicolasgarcia
 */
public class ctlAseguradora {
      String comparacion = "nit";
    String nombreTabla = "aseguradora";
    Conexion conexion = new Conexion();
    JsonObject objeto;
    Gson gson = new Gson();
    JsonParser parser = new JsonParser();

    
    
 public String convertirGson(Aseguradora aseguradora) {
        Gson gson = new Gson();
        String objeto = gson.toJson(aseguradora);
        return objeto;
    }

    public boolean SolicitudGuardar(int nit, String representante_legal, String nombre, String direccion, String telefono, String celular, String correo, String usuario, int municipio) {
       Aseguradora aseguradora = new Aseguradora(nit, representante_legal, nombre, direccion, telefono, celular, correo, usuario, municipio);
        genericDAO genDAO = new genericDAO();
        String json = convertirGson(aseguradora);

        return genDAO.guardar(json, nombreTabla);
    }
   
    public DefaultTableModel SolicitudListar() {
        Aseguradora aseguradora = new Aseguradora();
        String json = convertirGson(aseguradora);
        genericDAO genDAO = new genericDAO();
        return genDAO.listar(json, nombreTabla);
    }
      public String[] SolicitudBuscar(int nit) {
        Aseguradora aseguradora = new Aseguradora(nit," "," "," "," "," ", " "," ",0);
        genericDAO genDAO = new genericDAO();
        String json = convertirGson(aseguradora);

        return genDAO.buscar(json, nombreTabla);
    }
      public boolean solicitudEliminar(int nit) {

         Aseguradora aseguradora = new Aseguradora(nit);
        String json = convertirGson(aseguradora);
        genericDAO genDAO = new genericDAO();

        return genDAO.eliminar(json, nombreTabla, comparacion);
    }

    public boolean SolicitudModificar(int nit, String representante_legal, String nombre, String direccion, String telefono, String celular, String correo, String usuario, int municipio) {
       Aseguradora aseguradora = new Aseguradora(nit, representante_legal, nombre, direccion, telefono, celular, correo, usuario, municipio);
        genericDAO genDAO = new genericDAO();
        String json = convertirGson(aseguradora);

        return genDAO.modificar(json, nombreTabla, comparacion);
    }
    public Municipio consulta (String nombre){
        daoAseguradora daoAse = new daoAseguradora();
          return daoAse.consulta(nombre);
        
    }
}
    

