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
public class Departamento {
    int id;
    String nombre;
    int pais_id;

    public Departamento() {
    }

    public Departamento(int id, String nombre, int pais_id) {
        this.id = id;
        this.nombre = nombre;
        this.pais_id = pais_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPais_id() {
        return pais_id;
    }

    public void setPais_id(int pais_id) {
        this.pais_id = pais_id;
    }
    
    
    
}
