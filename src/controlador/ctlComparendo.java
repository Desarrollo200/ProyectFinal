/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import javax.swing.table.DefaultTableModel;
import DAO.daoComparendo;
import DAO.genericDAO;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import modelo.Comparendo;
import modelo.Conexion;
import modelo.Municipio;
import modelo.TipoInfraccion;

/**
 *
 * @author XgioserX
 */
public class ctlComparendo {
     String comparacion = "id";
    String nombreTabla = "comparendo";
    Conexion conexion = new Conexion();
    JsonObject objeto;
    Gson gson = new Gson();
    JsonParser parser = new JsonParser();

    
    
 public String convertirGson(Comparendo comparendo) {
        Gson gson = new Gson();
        String objeto = gson.toJson(comparendo);
        return objeto;
    }

    public boolean SolicitudGuardar(int id, int tipo_infraccion, int municipio, String fecha_hora, int licencia_cond_num_lic_cond) {
       Comparendo comparendo = new Comparendo(id, tipo_infraccion, municipio, fecha_hora, licencia_cond_num_lic_cond);
        genericDAO genDAO = new genericDAO();
        String json = convertirGson(comparendo);

        return genDAO.guardar(json, nombreTabla);
    }
    
    
     
     public Municipio consultaMuni (String nombre){
        daoComparendo daoComp = new daoComparendo();
          return daoComp.consultaMuni(nombre);
        
    }
      public TipoInfraccion consultaTipoInfrac (String nombre){
        daoComparendo daoComp = new daoComparendo();
          return daoComp.consultaTipoInfrac(nombre);
        
    }
       public DefaultTableModel solicitudListar() {
       daoComparendo comparendoDAO = new daoComparendo();
        return comparendoDAO.listarComparendos();  
    }
     public DefaultTableModel solicitudListarDeCiudadano(String cedula) {
       daoComparendo comparendoDAO = new daoComparendo();
        return comparendoDAO.listarComparendosDeCiudadanos(cedula);  
    }
     
}
