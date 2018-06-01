/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.SQLException;
import modelo.Aseguradora;
import modelo.Conexion;
import modelo.Departamento;
import modelo.Municipio;
import modelo.Pais;
import vista.FrmAdmin;
import vista.FrmConsecionario;

/**
 *
 * @author nicolasgarcia
 */
public class daoAseguradora extends Conexion {

   Municipio municipio = new Municipio();
   Pais pais = new Pais();
   Departamento depar = new Departamento();
    //    
    public Municipio consulta(String nombre) {
        String consulta = "select id from poryectofinaldesarrollo.municipio where nombre ='" + nombre + "'";
        System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        try {
            if (resultadoDB.next()) {

                municipio.setId(resultadoDB.getInt("id"));

            }
        } catch (SQLException ex) {
            System.out.println("Esto se tosto buscar");
        }
        return municipio;
    }
    
      public void listarEnComboDepartamentos(int pais_id) {
        
          FrmAdmin.cbDeparAse.removeAllItems();
       FrmAdmin.cbDeparAse.addItem("Seleccione un departamento");
        String consulta = "Select nombre from poryectofinaldesarrollo.departamento where pais_id ='"+pais_id+"'";
        super.ejecutarRetorno(consulta);

        try {
            while (resultadoDB.next()) {
             FrmAdmin.cbDeparAse.addItem(resultadoDB.getString("nombre"));
                
            }
        }catch(SQLException e){
            System.out.println(e);
            
        }
      }
          public void listarEnComboDepartamentosCon(int pais_id) {
        
         FrmConsecionario.cbDeparComparendo.removeAllItems();
       FrmConsecionario.cbDeparComparendo.addItem("Seleccione un departamento");
        String consulta = "Select nombre from poryectofinaldesarrollo.departamento where pais_id ='"+pais_id+"'";
        super.ejecutarRetorno(consulta);

        try {
            while (resultadoDB.next()) {
             FrmConsecionario.cbDeparComparendo.addItem(resultadoDB.getString("nombre"));
                
            }
        }catch(SQLException e){
            System.out.println(e);
            
        }
        
     }
           public void listarEnComboDepartamentosCon1(int pais_id) {
        
         FrmAdmin.cbDeparComparendo.removeAllItems();
       FrmAdmin.cbDeparComparendo.addItem("Seleccione un departamento");
        String consulta = "Select nombre from poryectofinaldesarrollo.departamento where pais_id ='"+pais_id+"'";
        super.ejecutarRetorno(consulta);

        try {
            while (resultadoDB.next()) {
             FrmAdmin.cbDeparComparendo.addItem(resultadoDB.getString("nombre"));
                
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
        
          FrmAdmin.cbMuniAse.removeAllItems();
       FrmAdmin.cbMuniAse.addItem("Seleccione un municipio");
        String consulta = "Select nombre from poryectofinaldesarrollo.municipio where departamento_id ='"+departamento_id+"'";
        super.ejecutarRetorno(consulta);

        try {
            while (resultadoDB.next()) {
             FrmAdmin.cbMuniAse.addItem(resultadoDB.getString("nombre"));
                
            }
        }catch(SQLException e){
            System.out.println(e);
            
        }
        
     }
       
       public void listarEnComboMunicipiosCon(int departamento_id) {
        
          FrmConsecionario.cbMunicipioComparendo.removeAllItems();
       FrmConsecionario.cbMunicipioComparendo.addItem("Seleccione un municipio");
        String consulta = "Select nombre from poryectofinaldesarrollo.municipio where departamento_id ='"+departamento_id+"'";
        super.ejecutarRetorno(consulta);

        try {
            while (resultadoDB.next()) {
             FrmConsecionario.cbMunicipioComparendo.addItem(resultadoDB.getString("nombre"));
                
            }
        }catch(SQLException e){
            System.out.println(e);
            
        }
        
     }
       public void listarEnComboMunicipiosCon1(int departamento_id) {
        
          FrmAdmin.cbMunicipioComparendo.removeAllItems();
       FrmAdmin.cbMunicipioComparendo.addItem("Seleccione un municipio");
        String consulta = "Select nombre from poryectofinaldesarrollo.municipio where departamento_id ='"+departamento_id+"'";
        super.ejecutarRetorno(consulta);

        try {
            while (resultadoDB.next()) {
             FrmAdmin.cbMunicipioComparendo.addItem(resultadoDB.getString("nombre"));
                
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
