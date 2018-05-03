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
public class LicenciaCategorias {
    int id;
    String licencia_cond_num_lica_cond;
    String categorias_licencia_id;

    public LicenciaCategorias() {
    }

    public LicenciaCategorias(int id, String licencia_cond_num_lica_cond, String categorias_licencia_id) {
        this.id = id;
        this.licencia_cond_num_lica_cond = licencia_cond_num_lica_cond;
        this.categorias_licencia_id = categorias_licencia_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLicencia_cond_num_lica_cond() {
        return licencia_cond_num_lica_cond;
    }

    public void setLicencia_cond_num_lica_cond(String licencia_cond_num_lica_cond) {
        this.licencia_cond_num_lica_cond = licencia_cond_num_lica_cond;
    }

    public String getCategorias_licencia_id() {
        return categorias_licencia_id;
    }

    public void setCategorias_licencia_id(String categorias_licencia_id) {
        this.categorias_licencia_id = categorias_licencia_id;
    }
    
    
    
}
