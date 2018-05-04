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
public class Poliza {
    int id;
    int numero_poliza;
    String placa_vehiculo;

    public Poliza(int id, int numero_poliza, String placa_vehiculo) {
        this.id = id;
        this.numero_poliza = numero_poliza;
        this.placa_vehiculo = placa_vehiculo;
    }

    public Poliza() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero_poliza() {
        return numero_poliza;
    }

    public void setNumero_poliza(int numero_poliza) {
        this.numero_poliza = numero_poliza;
    }

    public String getPlaca_vehiculo() {
        return placa_vehiculo;
    }

    public void setPlaca_vehiculo(String placa_vehiculo) {
        this.placa_vehiculo = placa_vehiculo;
    }
    
    
}
