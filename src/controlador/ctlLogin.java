/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAO.genericDAO;
import com.google.gson.Gson;
import java.util.ArrayList;
import modelo.Login;

/**
 *
 * @author XgioserX
 */
public class ctlLogin {
    
    String nombreTabla = "login";
    String comparacion = "usuario";
    public Login logueado;
    
    
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
    
    
    //Este metodo me permite iniciar sesion con un ciudadano
    public Login SolicitudIniciarSesionCiudadano(String usuario, String contrasena) {
        Login logCiu = new Login("","", 0);
        genericDAO ciudadanoDAO = new genericDAO();
        String objeto = convertirGson(logCiu);
        ArrayList<String> confirmado = ciudadanoDAO.iniciarSesion(objeto, nombreTabla, "usuario", "contrasena", usuario, contrasena);
        if(Integer.parseInt(confirmado.get(2))==3){
            logueado = new Login(confirmado.get(0), confirmado.get(1), Integer.parseInt(confirmado.get(2)));
            return logueado;
        } else{
            return null;
        }
    }
    
    //Este metodo me permite iniciar sesion con un CDA
    public Login SolicitudIniciarSesionCDA(String usuario, String contrasena) {
        Login logCDA = new Login("","", 0);
        genericDAO cdaDAO = new genericDAO();
        String objeto = convertirGson(logCDA);
        ArrayList<String> confirmado = cdaDAO.iniciarSesion(objeto, nombreTabla, "usuario", "contrasena", usuario, contrasena);
        if(Integer.parseInt(confirmado.get(2))==2){
            logueado = new Login(confirmado.get(0), confirmado.get(1), Integer.parseInt(confirmado.get(2)));
            return logueado;
        } else{
            return null;
        }
    }
    
    //Este metodo me permite iniciar sesion con un administrador
    public Login SolicitudIniciarSesionAdmin(String usuario, String contrasena) {
        Login logAdmin = new Login("","", 0);
        genericDAO adminDAO = new genericDAO();
        String objeto = convertirGson(logAdmin);
        ArrayList<String> confirmado = adminDAO.iniciarSesion(objeto, nombreTabla, "usuario", "contrasena", usuario, contrasena);
        if(Integer.parseInt(confirmado.get(2))==5){
            logueado = new Login(confirmado.get(0), confirmado.get(1), Integer.parseInt(confirmado.get(2)));
            return logueado;
        } else{
            return null;
        }
    }
    
    //Este metodo me permite iniciar sesion con un aseguradora
    public Login SolicitudIniciarSesionAseguradora(String usuario, String contrasena) {
        Login logAseg = new Login("","", 0);
        genericDAO asegDAO = new genericDAO();
        String objeto = convertirGson(logAseg);
        ArrayList<String> confirmado = asegDAO.iniciarSesion(objeto, nombreTabla, "usuario", "contrasena", usuario, contrasena);
        if(Integer.parseInt(confirmado.get(2))==1){
            logueado = new Login(confirmado.get(0), confirmado.get(1), Integer.parseInt(confirmado.get(2)));
            return logueado;
        } else{
            return null;
        }
    }
    
    //Este metodo me permite iniciar sesion con un consencionario
    public Login SolicitudIniciarSesionConsencionario(String usuario, String contrasena) {
        Login logCons = new Login("","", 0);
        genericDAO conseDAO = new genericDAO();
        String objeto = convertirGson(logCons);
        ArrayList<String> confirmado = conseDAO.iniciarSesion(objeto, nombreTabla, "usuario", "contrasena", usuario, contrasena);
        if(Integer.parseInt(confirmado.get(2))==4){
            logueado = new Login(confirmado.get(0), confirmado.get(1), Integer.parseInt(confirmado.get(2)));
            return logueado;
        } else{
            return null;
        }
    }
    
   
}
