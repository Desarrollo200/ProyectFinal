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
public class RevisionTecno {
    int id;
    int cda_nit;
    String fecha_expedicion;
    String fecha_final;
    String vigencia;
    String vehiculo_placa;

    public RevisionTecno() {
    }

    public RevisionTecno(int id, int cda_nit, String fecha_expedicion, String fecha_final, String vigencia, String vehiculo_placa) {
        this.id = id;
        this.cda_nit = cda_nit;
        this.fecha_expedicion = fecha_expedicion;
        this.fecha_final = fecha_final;
        this.vigencia = vigencia;
        this.vehiculo_placa = vehiculo_placa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCda_nit() {
        return cda_nit;
    }

    public void setCda_nit(int cda_nit) {
        this.cda_nit = cda_nit;
    }

    public String getFecha_expedicion() {
        return fecha_expedicion;
    }

    public void setFecha_expedicion(String fecha_expedicion) {
        this.fecha_expedicion = fecha_expedicion;
    }

    public String getFecha_final() {
        return fecha_final;
    }

    public void setFecha_final(String fecha_final) {
        this.fecha_final = fecha_final;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    public String getVehiculo_placa() {
        return vehiculo_placa;
    }

    public void setVehiculo_placa(String vehiculo_placa) {
        this.vehiculo_placa = vehiculo_placa;
    }
    
    
    
}
