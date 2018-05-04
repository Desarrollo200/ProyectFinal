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
public class Seguro {
    int numero_poliza;
    String fecha_expedicion;
    String fecha_inicio;
    String fecha_final;
    String estado;
    int aseguradora;
    int tipo_seguro;

    public Seguro(int numero_poliza, String fecha_expedicion, String fecha_inicio, String fecha_final, String estado, int aseguradora, int tipo_seguro) {
        this.numero_poliza = numero_poliza;
        this.fecha_expedicion = fecha_expedicion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
        this.estado = estado;
        this.aseguradora = aseguradora;
        this.tipo_seguro = tipo_seguro;
    }

    public Seguro() {
    }

    public int getNumero_poliza() {
        return numero_poliza;
    }

    public void setNumero_poliza(int numero_poliza) {
        this.numero_poliza = numero_poliza;
    }

    public String getFecha_expedicion() {
        return fecha_expedicion;
    }

    public void setFecha_expedicion(String fecha_expedicion) {
        this.fecha_expedicion = fecha_expedicion;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_final() {
        return fecha_final;
    }

    public void setFecha_final(String fecha_final) {
        this.fecha_final = fecha_final;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(int aseguradora) {
        this.aseguradora = aseguradora;
    }

    public int getTipo_seguro() {
        return tipo_seguro;
    }

    public void setTipo_seguro(int tipo_seguro) {
        this.tipo_seguro = tipo_seguro;
    }

    
    
    
}
