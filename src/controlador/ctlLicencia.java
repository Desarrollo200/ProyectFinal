/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAO.daoLicencia;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author XgioserX
 */
public class ctlLicencia {
    
    
     public DefaultTableModel solicitudListar() {
       daoLicencia licenciaDAO = new daoLicencia();
        return licenciaDAO.listarLicencia();  
    }
}
