/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.table.DefaultTableModel;
import DAO.daoComparendo;

/**
 *
 * @author XgioserX
 */
public class ctlComparendo {
    
     public DefaultTableModel solicitudListar() {
       daoComparendo comparendoDAO = new daoComparendo();
        return comparendoDAO.listarComparendos();  
    }
     
     
}
