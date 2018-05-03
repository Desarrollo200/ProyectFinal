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
public class LicenciaConduccion {
    String num_licencia_cond;
    String fecha_expedicion;
    String restriccion_conductor;
    String organismo_expedidor;
    String numero_identidad_ciudadano;

    public LicenciaConduccion() {
    }

    public LicenciaConduccion(String num_licencia_cond, String fecha_expedicion, String restriccion_conductor, String organismo_expedidor, String numero_identidad_ciudadano) {
        this.num_licencia_cond = num_licencia_cond;
        this.fecha_expedicion = fecha_expedicion;
        this.restriccion_conductor = restriccion_conductor;
        this.organismo_expedidor = organismo_expedidor;
        this.numero_identidad_ciudadano = numero_identidad_ciudadano;
    }

    public String getNum_licencia_cond() {
        return num_licencia_cond;
    }

    public void setNum_licencia_cond(String num_licencia_cond) {
        this.num_licencia_cond = num_licencia_cond;
    }

    public String getFecha_expedicion() {
        return fecha_expedicion;
    }

    public void setFecha_expedicion(String fecha_expedicion) {
        this.fecha_expedicion = fecha_expedicion;
    }

    public String getRestriccion_conductor() {
        return restriccion_conductor;
    }

    public void setRestriccion_conductor(String restriccion_conductor) {
        this.restriccion_conductor = restriccion_conductor;
    }

    public String getOrganismo_expedidor() {
        return organismo_expedidor;
    }

    public void setOrganismo_expedidor(String organismo_expedidor) {
        this.organismo_expedidor = organismo_expedidor;
    }

    public String getNumero_identidad_ciudadano() {
        return numero_identidad_ciudadano;
    }

    public void setNumero_identidad_ciudadano(String numero_identidad_ciudadano) {
        this.numero_identidad_ciudadano = numero_identidad_ciudadano;
    }
    
    
    
    
}
