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
public class Vehiculo {
    int placa;
    String licencia_transito;
    int tipo_servicio;
    int clase_vehiculo;
    int estado_vehiculo;
    int modelo_id;
    int color_id;
    String numero_chasis;
    String cilindrage;
    int tipo_combustible_id;
    String fecha_matricula;
    String num_pasajeros;
    int numero_poliza;
    int propietario_id;

    public Vehiculo() {
    }

    public Vehiculo(int placa, String licencia_transito, int tipo_servicio, int clase_vehiculo, int estado_vehiculo, int modelo_id, int color_id, String numero_chasis, String cilindrage, int tipo_combustible_id, String fecha_matricula, String num_pasajeros, int numero_poliza, int propietario_id) {
        this.placa = placa;
        this.licencia_transito = licencia_transito;
        this.tipo_servicio = tipo_servicio;
        this.clase_vehiculo = clase_vehiculo;
        this.estado_vehiculo = estado_vehiculo;
        this.modelo_id = modelo_id;
        this.color_id = color_id;
        this.numero_chasis = numero_chasis;
        this.cilindrage = cilindrage;
        this.tipo_combustible_id = tipo_combustible_id;
        this.fecha_matricula = fecha_matricula;
        this.num_pasajeros = num_pasajeros;
        this.numero_poliza = numero_poliza;
        this.propietario_id = propietario_id;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public String getLicencia_transito() {
        return licencia_transito;
    }

    public void setLicencia_transito(String licencia_transito) {
        this.licencia_transito = licencia_transito;
    }

    public int getTipo_servicio() {
        return tipo_servicio;
    }

    public void setTipo_servicio(int tipo_servicio) {
        this.tipo_servicio = tipo_servicio;
    }

    public int getClase_vehiculo() {
        return clase_vehiculo;
    }

    public void setClase_vehiculo(int clase_vehiculo) {
        this.clase_vehiculo = clase_vehiculo;
    }

    public int getEstado_vehiculo() {
        return estado_vehiculo;
    }

    public void setEstado_vehiculo(int estado_vehiculo) {
        this.estado_vehiculo = estado_vehiculo;
    }

    public int getModelo_id() {
        return modelo_id;
    }

    public void setModelo_id(int modelo_id) {
        this.modelo_id = modelo_id;
    }

    public int getColor_id() {
        return color_id;
    }

    public void setColor_id(int color_id) {
        this.color_id = color_id;
    }

    public String getNumero_chasis() {
        return numero_chasis;
    }

    public void setNumero_chasis(String numero_chasis) {
        this.numero_chasis = numero_chasis;
    }

    public String getCilindrage() {
        return cilindrage;
    }

    public void setCilindrage(String cilindrage) {
        this.cilindrage = cilindrage;
    }

    public int getTipo_combustible_id() {
        return tipo_combustible_id;
    }

    public void setTipo_combustible_id(int tipo_combustible_id) {
        this.tipo_combustible_id = tipo_combustible_id;
    }

    public String getFecha_matricula() {
        return fecha_matricula;
    }

    public void setFecha_matricula(String fecha_matricula) {
        this.fecha_matricula = fecha_matricula;
    }

    public String getNum_pasajeros() {
        return num_pasajeros;
    }

    public void setNum_pasajeros(String num_pasajeros) {
        this.num_pasajeros = num_pasajeros;
    }

    public int getNumero_poliza() {
        return numero_poliza;
    }

    public void setNumero_poliza(int numero_poliza) {
        this.numero_poliza = numero_poliza;
    }

    public int getPropietario_id() {
        return propietario_id;
    }

    public void setPropietario_id(int propietario_id) {
        this.propietario_id = propietario_id;
    }

   
    
    
}
