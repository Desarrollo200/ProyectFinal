/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAO.genericDAO;
import com.google.gson.Gson;
import modelo.Login;

/**
 *
 * @author nicolasgarcia
 */
public class ctlLogin {
    
    String nombreTabla = "login";
    String comparacion = "usuario";
    
    public String convertirGson(Login login) {
        Gson gson = new Gson();
        String objeto = gson.toJson(login);
        return objeto;
    }

    public boolean SolicitudGuardar (String usuario, String contraseña, int tipo_usuario) {
       Login login = new Login(usuario, contraseña, tipo_usuario);
        genericDAO genDAO = new genericDAO();
        String json = convertirGson(login);

        return genDAO.guardar(json, nombreTabla);
    }
    public boolean SolicitudModificar(String usuario, String contraseña, int tipo_usuario) {
        Login login = new Login(usuario, contraseña, tipo_usuario);
        genericDAO genDAO = new genericDAO();
        String json = convertirGson(login);

        return genDAO.modificar(json, nombreTabla, comparacion);
    }
    
}
