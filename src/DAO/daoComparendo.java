/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.Departamento;
import modelo.Municipio;
import modelo.Pais;
import modelo.TipoInfraccion;
import vista.FrmAdmin;

/**
 *
 * @author XgioserX
 */
public class daoComparendo extends Conexion {
    
      Municipio municipio = new Municipio();
   Pais pais = new Pais();
   Departamento depar = new Departamento();
    TipoInfraccion tipoInfra = new TipoInfraccion();
    
    public TipoInfraccion consultaTipoInfrac(String nombre) {
        String consulta = "select id from tipo_infraccion where nombre ='" + nombre + "'";
        System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        try {
            if (resultadoDB.next()) {

                tipoInfra.setId(resultadoDB.getInt("id"));

            }
        } catch (SQLException ex) {
            System.out.println("Esto se tosto buscar");
        }
        return tipoInfra;
    }
    
    
    public Municipio consultaMuni(String nombre) {
        String consulta = "select id from municipio where nombre ='" + nombre + "'";
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
        String consulta = "Select nombre from departamento where pais_id ='"+pais_id+"'";
        super.ejecutarRetorno(consulta);

        try {
            while (resultadoDB.next()) {
             FrmAdmin.cbDeparAse.addItem(resultadoDB.getString("nombre"));
                
            }
        }catch(SQLException e){
            System.out.println(e);
            
        }
        
     }
       public Pais consultaPais(String nombre) {
        String consulta = "select id from pais where nombre ='" + nombre + "'";
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
        String consulta = "Select nombre from municipio where departamento_id ='"+departamento_id+"'";
        super.ejecutarRetorno(consulta);

        try {
            while (resultadoDB.next()) {
             FrmAdmin.cbMuniAse.addItem(resultadoDB.getString("nombre"));
                
            }
        }catch(SQLException e){
            System.out.println(e);
            
        }
        
     }
         public Departamento consultaDepar(String nombre) {
        String consulta = "select id from departamento where nombre ='" + nombre + "'";
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

    public DefaultTableModel listarComparendos() {
         DefaultTableModel modelTabla;
        String nombreColumnas[] = {"Id Comparendo", "Tipo Comparendo", "Municipio", "Departamento", "Fecha y Hora", "Licencia de Conduccion"};
        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas);

        String consulta = "select c.id,ti.nombre, m.nombre,d.nombre,c.fecha_hora,c.licencia_cond_num_lic_cond from comparendo c join tipo_infraccion ti on ti.id=c.id join municipio m on m.id=c.municipio join departamento d on d.id=m.id;";
    
        super.ejecutarRetorno(consulta);

        try {
            while (resultadoDB.next()) {
                modelTabla.addRow(new Object[]{
                    resultadoDB.getString("c.id"),
                    resultadoDB.getString("ti.nombre"),
                    resultadoDB.getString("m.nombre"),
                    resultadoDB.getString("d.nombre"),
                    resultadoDB.getString("c.fecha_hora"),
                    resultadoDB.getString("c.licencia_cond_num_lic_cond")
                    });
            }
        } catch (SQLException ex) {
            System.out.println("Esto se tosto");
            ex.printStackTrace();
        }
        return modelTabla;
    }
    
    public DefaultTableModel listarComparendosDeCiudadanos(String cedula) {
         DefaultTableModel modelTabla;
        String nombreColumnas[] = {"Id Comparendo", "Tipo Comparendo", "Municipio", "Departamento", "Fecha y Hora", "Licencia de Conduccion"};
        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas);

        String consulta = "select c.id,ti.nombre, m.nombre,d.nombre,c.fecha_hora,c.licencia_cond_num_lic_cond from comparendo c join tipo_infraccion ti on ti.id=c.id join municipio m on m.id=c.municipio join departamento d on d.id=m.id join comparendo_usuario cu on cu.comparendo_id=c.id join ciudadano ciu on ciu.numero_identidad=cu.usuario_numero_iden where ciu.numero_identidad="+cedula+";";
    
        super.ejecutarRetorno(consulta);

        try {
            while (resultadoDB.next()) {
                modelTabla.addRow(new Object[]{
                    resultadoDB.getString("c.id"),
                    resultadoDB.getString("ti.nombre"),
                    resultadoDB.getString("m.nombre"),
                    resultadoDB.getString("d.nombre"),
                    resultadoDB.getString("c.fecha_hora"),
                    resultadoDB.getString("c.licencia_cond_num_lic_cond")
                    });
            }
        } catch (SQLException ex) {
            System.out.println("Esto se tosto");
            ex.printStackTrace();
        }
        return modelTabla;
    }
}
