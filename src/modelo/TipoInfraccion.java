/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author XgioserX
 */
public class TipoInfraccion {
     int id;
    String nombre;
    int costo;
    boolean inmovilizacion_licencia;
    boolean suspencion_licencia;
    
    public TipoInfraccion() {
    }

    public TipoInfraccion(int id, String nombre, int costo, boolean inmovilizacion_licencia, boolean suspencion_licencia) {
        this.id = id;
        this.nombre = nombre;
        this.costo = costo;
        this.inmovilizacion_licencia = inmovilizacion_licencia;
        this.suspencion_licencia = suspencion_licencia;
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

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public boolean isInmovilizacion_licencia() {
        return inmovilizacion_licencia;
    }

    public void setInmovilizacion_licencia(boolean inmovilizacion_licencia) {
        this.inmovilizacion_licencia = inmovilizacion_licencia;
    }

    public boolean isSuspencion_licencia() {
        return suspencion_licencia;
    }

    public void setSuspencion_licencia(boolean suspencion_licencia) {
        this.suspencion_licencia = suspencion_licencia;
    }
    
    
}

