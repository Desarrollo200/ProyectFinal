/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;

/**
 *
 * @author XgioserX
 */
public class daoLicencia extends Conexion  {
    
    public DefaultTableModel listarLicencias() {
      DefaultTableModel modelTabla;
        String nombreColumnas[] = {"Numero Licencia", "Fecha Expedicion", "Restricion del Conductor", "Organismo Expedidor", "Cedula Ciudadano"};
        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas);

        String consulta = "select num_licencia_cond,fecha_expedicion,restriccion_conductor,organismo_expedidor,numero_identidad_ciudadano from licencia_conduccion;";
    
        super.ejecutarRetorno(consulta);

        try {
            while (resultadoDB.next()) {
                modelTabla.addRow(new Object[]{
                    resultadoDB.getString("num_licencia_cond"),
                    resultadoDB.getString("fecha_expedicion"),
                    resultadoDB.getString("restriccion_conductor"),
                    resultadoDB.getString("organismo_expedidor"),
                    resultadoDB.getString("numero_identidad_ciudadano")
                    });
            }
        } catch (SQLException ex) {
            System.out.println("Esto se tosto");
            ex.printStackTrace();
        }
        return modelTabla;
    }
    
    public DefaultTableModel listarLicenciasDeCiudadano(String cedula) {
      DefaultTableModel modelTabla;
        String nombreColumnas[] = {"Numero Licencia", "Fecha Expedicion", "Restricion del Conductor", "Organismo Expedidor", "Cedula Ciudadano"};
        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas);

        String consulta = "select lc.num_licencia_cond,lc.fecha_expedicion,lc.restriccion_conductor,lc.organismo_expedidor,lc.numero_identidad_ciudadano from licencia_conduccion lc join ciudadano c on c.numero_identidad=lc.numero_identidad_ciudadano where c.numero_identidad="+cedula+";";
    
        super.ejecutarRetorno(consulta);

        try {
            while (resultadoDB.next()) {
                modelTabla.addRow(new Object[]{
                    resultadoDB.getString("lc.num_licencia_cond"),
                    resultadoDB.getString("lc.fecha_expedicion"),
                    resultadoDB.getString("lc.restriccion_conductor"),
                    resultadoDB.getString("lc.organismo_expedidor"),
                    resultadoDB.getString("lc.numero_identidad_ciudadano")
                    });
            }
        } catch (SQLException ex) {
            System.out.println("Esto se tosto");
            ex.printStackTrace();
        }
        return modelTabla;
    }
}
