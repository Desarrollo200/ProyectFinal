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
public class Ciudadano {
    String numero_identidad;
    String nombre;
    String apellido;
    String fecha_nacimiento;
    int municipio_nacimiento;
    String fecha_exp_identidad;
    int tipo_sangre_id;
    int genero_id;
    String estatura;
    int municipio_residencia;
    String direccion;
    String correo;
    String telefono;
    String celular;
    String usuario;


    public Ciudadano(String numero_identidad, String nombre, String apellido, String fecha_nacimiento, int municipio_nacimiento, String fecha_exp_identidad, int tipo_sangre_id, int genero_id, String estatura, int municipio_residencia, String direccion, String correo, String telefono, String celular, String usuario) {
        this.numero_identidad = numero_identidad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.municipio_nacimiento = municipio_nacimiento;
        this.fecha_exp_identidad = fecha_exp_identidad;
        this.tipo_sangre_id = tipo_sangre_id;
        this.genero_id = genero_id;
        this.estatura = estatura;
        this.municipio_residencia = municipio_residencia;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.celular = celular;
        this.usuario = usuario;
    }
    
    
    public Ciudadano() {
         this.numero_identidad = "";
        this.nombre = "";
        this.apellido = "";
        this.fecha_nacimiento = "";
        this.municipio_nacimiento =0;
        this.fecha_exp_identidad = "";
        this.tipo_sangre_id = 0;
        this.genero_id = 0;
        this.estatura = "";
        this.municipio_residencia = 0;
        this.direccion = "";
        this.correo = "";
        this.telefono = "";
        this.celular = "";
        this.usuario = "";
    }
    public Ciudadano(String numero_identidad){
         this.numero_identidad = numero_identidad;
    }

    public String getNumero_identidad() {
        return numero_identidad;
    }

    public void setNumero_identidad(String numero_identidad) {
        this.numero_identidad = numero_identidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getMunicipio_nacimiento() {
        return municipio_nacimiento;
    }

    public void setMunicipio_nacimiento(int municipio_nacimiento) {
        this.municipio_nacimiento = municipio_nacimiento;
    }

    public String getFecha_exp_identidad() {
        return fecha_exp_identidad;
    }

    public void setFecha_exp_identidad(String fecha_exp_identidad) {
        this.fecha_exp_identidad = fecha_exp_identidad;
    }

    public int getTipo_sangre_id() {
        return tipo_sangre_id;
    }

    public void setTipo_sangre_id(int tipo_sangre_id) {
        this.tipo_sangre_id = tipo_sangre_id;
    }

    public int getGenero_id() {
        return genero_id;
    }

    public void setGenero_id(int genero_id) {
        this.genero_id = genero_id;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

    public int getMunicipio_residencia() {
        return municipio_residencia;
    }

    public void setMunicipio_residencia(int municipio_residencia) {
        this.municipio_residencia = municipio_residencia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
   
    
    
    
}
