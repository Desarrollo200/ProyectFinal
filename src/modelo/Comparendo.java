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
public class Comparendo {
    int id;
    int tipo_infraccion;
    int municipio;
    String fecha_hora;
    int licencia_conduccion;

    public Comparendo(int id, int tipo_infraccion, int municipio, String fecha_hora, int licencia_conduccion) {
        this.id = id;
        this.tipo_infraccion = tipo_infraccion;
        this.municipio = municipio;
        this.fecha_hora = fecha_hora;
        this.licencia_conduccion = licencia_conduccion;
    }
public Comparendo() {
        this.id = 0;
        this.tipo_infraccion = 0;
        this.municipio = 0;
        this.fecha_hora = "";
        this.licencia_conduccion = 0;

    }
    public Comparendo(int id){
         this.id = id;
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipo_infraccion() {
        return tipo_infraccion;
    }

    public void setTipo_infraccion(int tipo_infraccion) {
        this.tipo_infraccion = tipo_infraccion;
    }

    public int getMunicipio() {
        return municipio;
    }

    public void setMunicipio(int municipio) {
        this.municipio = municipio;
    }

    public String getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(String fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public int getLicencia_conduccion() {
        return licencia_conduccion;
    }

    public void setLicencia_conduccion(int licencia_conduccion) {
        this.licencia_conduccion = licencia_conduccion;
    }
    
    
}
