/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author nicolasgarcia
 */
public class Propietario2 {
     int id;
    String ciudadano;

    public Propietario2() {
         this.id = 0;
        this.ciudadano = "";
    }

    public Propietario2(int id, String ciudadano) {
        this.id = id;
        this.ciudadano = ciudadano;
    }
    
    public Propietario2(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCiudadano() {
        return ciudadano;
    }

    public void setCiudadano(String ciudadano) {
        this.ciudadano = ciudadano;
    }
    
    
    
}
