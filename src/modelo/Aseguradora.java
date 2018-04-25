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
public class Aseguradora {
    int nit=0;
    String representante_legal, nombre, direccion, telefono, celular,correo;
    String usuario;
    int municipio;

    

    public Aseguradora(int nit, String representante_legal, String nombre, String direccion, String telefono, String celular, String correo, String usuario, int municipio) {
        this.nit = nit;
        this.representante_legal = representante_legal;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
        this.correo = correo;
        this.usuario = usuario;
        this.municipio = municipio;
    }
    public Aseguradora() {
        this.nit = 0;
        this.representante_legal = "";
        this.nombre = "";
        this.direccion = "";
        this.telefono = "";
        this.celular = "";
        this.correo = "";
        this.usuario = "";
        this.municipio = 0;
    }
    public Aseguradora(int nit){
         this.nit = nit;
    }
    

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getRepresentante_legal() {
        return representante_legal;
    }

    public void setRepresentante_legal(String representante_legal) {
        this.representante_legal = representante_legal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getMunicipio() {
        return municipio;
    }

    public void setMunicipio(int municipio) {
        this.municipio = municipio;
    }
    
    
    
    
}
