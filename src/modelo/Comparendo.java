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
    int licencia_cond_num_lic_cond;

    public Comparendo(int id, int tipo_infraccion, int municipio, String fecha_hora, int licencia_cond_num_lic_cond) {
        this.id = id;
        this.tipo_infraccion = tipo_infraccion;
        this.municipio = municipio;
        this.fecha_hora = fecha_hora;
        this.licencia_cond_num_lic_cond = licencia_cond_num_lic_cond;
    }


public Comparendo() {
        this.id = 0;
        this.tipo_infraccion = 0;
        this.municipio = 0;
        this.fecha_hora = "";
        this.licencia_cond_num_lic_cond = 0;

   
    
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

    public int getLicencia_cond_num_lic_cond() {
        return licencia_cond_num_lic_cond;
    }

    public void setLicencia_cond_num_lic_cond(int licencia_cond_num_lic_cond) {
        this.licencia_cond_num_lic_cond = licencia_cond_num_lic_cond;
    }
}