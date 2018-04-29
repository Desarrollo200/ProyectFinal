/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.SQLException;
import javax.swing.JComboBox;
import modelo.Conexion;
import modelo.Departamento;
import modelo.Genero;
import modelo.Municipio;
import modelo.Pais;
import modelo.TipoSangre;
import vista.FrmAdmin;

/**
 *
 * @author nicolasgarcia
 */
public class daoCiudadano extends Conexion{
     Municipio municipio = new Municipio();
   Pais pais = new Pais();
   Departamento depar = new Departamento();
    TipoSangre tp = new TipoSangre();
    Genero gn = new Genero();
    //    
    public Municipio consultaMuni(String nombre) {
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
    
      public void listarEnComboDepartamentos(JComboBox<String> cb, int pais_id) {
        
         cb.removeAllItems();
      cb.addItem("Seleccione un departamento");
        String consulta = "Select nombre from poryectofinaldesarrollo.departamento where pais_id ='"+pais_id+"'";
        super.ejecutarRetorno(consulta);

        try {
            while (resultadoDB.next()) {
            cb.addItem(resultadoDB.getString("nombre"));
                
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
       
       public void listarEnComboMunicipios(JComboBox<String> cb, int departamento_id) {
        
          cb.removeAllItems();
       cb.addItem("Seleccione un municipio");
        String consulta = "Select nombre from poryectofinaldesarrollo.municipio where departamento_id ='"+departamento_id+"'";
        super.ejecutarRetorno(consulta);

        try {
            while (resultadoDB.next()) {
            cb.addItem(resultadoDB.getString("nombre"));
                
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
         public TipoSangre consultaTipoSangre(String nombre) {
        String consulta = "select id from poryectofinaldesarrollo.tipo_sangre where nombre ='" + nombre + "'";
        System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        try {
            if (resultadoDB.next()) {

                tp.setId(resultadoDB.getInt("id"));

            }
        } catch (SQLException ex) {
            System.out.println("Esto se tosto buscar");
        }
        return tp;
    }
         public Genero consultaGenero(String nombre) {
        String consulta = "select id from poryectofinaldesarrollo.genero where nombre ='" + nombre + "'";
        System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        try {
            if (resultadoDB.next()) {

                gn.setId(resultadoDB.getInt("id"));

            }
        } catch (SQLException ex) {
            System.out.println("Esto se tosto buscar");
        }
        return gn;
    }
         

    
}
