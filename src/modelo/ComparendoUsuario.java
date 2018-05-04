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
public class ComparendoUsuario {
    int id;
    int usuario_numero_iden;
    int comparendo_id;
    
    public ComparendoUsuario() {
    }

    public ComparendoUsuario(int id, int usuario_numero_iden, int comparendo_id) {
        this.id = id;
        this.usuario_numero_iden = usuario_numero_iden;
        this.comparendo_id = comparendo_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuario_numero_iden() {
        return usuario_numero_iden;
    }

    public void setUsuario_numero_iden(int usuario_numero_iden) {
        this.usuario_numero_iden = usuario_numero_iden;
    }

    public int getComparendo_id() {
        return comparendo_id;
    }

    public void setComparendo_id(int comparendo_id) {
        this.comparendo_id = comparendo_id;
    }
    
    
}
