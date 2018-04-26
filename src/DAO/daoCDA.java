/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.SQLException;
import modelo.Conexion;
import modelo.Departamento;
import modelo.Municipio;
import modelo.Pais;
import vista.FrmAdmin;

/**
 *
 * @author nicolasgarcia
 */
public class daoCDA extends Conexion{
   
     Municipio municipio = new Municipio();
   Pais pais = new Pais();
   Departamento depar = new Departamento();
    //    
   
    
      public void listarEnComboDepartamentos(int pais_id) {
        
          FrmAdmin.cbDeparCda.removeAllItems();
       FrmAdmin.cbDeparCda.addItem("Seleccione un departamento");
        String consulta = "Select nombre from poryectofinaldesarrollo.departamento where pais_id ='"+pais_id+"'";
        super.ejecutarRetorno(consulta);

        try {
            while (resultadoDB.next()) {
             FrmAdmin.cbDeparCda.addItem(resultadoDB.getString("nombre"));
                
            }
        }catch(SQLException e){
            System.out.println(e);
            
        }
        
     }
       public Pais consultaPais(String nombre) {
        String consulta = "select id from poryectofinaldesarrollo.pais where nombre ='" + nombre + "'";
        System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        try {
            if (resultadoDB.next()) {

                pais.setId(resultadoDB.getInt("id"));

            }
        } catch (SQLException ex) {
            System.out.println("Esto se tosto buscar");
        }
        return pais;
    }
       
       public void listarEnComboMunicipios(int departamento_id) {
        
          FrmAdmin.cbMunicipioCda.removeAllItems();
       FrmAdmin.cbMunicipioCda.addItem("Seleccione un municipio");
        String consulta = "Select nombre from poryectofinaldesarrollo.municipio where departamento_id ='"+departamento_id+"'";
        super.ejecutarRetorno(consulta);

        try {
            while (resultadoDB.next()) {
             FrmAdmin.cbMunicipioCda.addItem(resultadoDB.getString("nombre"));
                
            }
        }catch(SQLException e){
            System.out.println(e);
            
        }
        
     }
         public Departamento consultaDepar(String nombre) {
        String consulta = "select id from poryectofinaldesarrollo.departamento where nombre ='" + nombre + "'";
        System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        try {
            if (resultadoDB.next()) {

                depar.setId(resultadoDB.getInt("id"));

            }
        } catch (SQLException ex) {
            System.out.println("Esto se tosto buscar");
        }
        return depar;
    }
}
