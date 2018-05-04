/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.SQLException;
import javax.swing.JComboBox;
import modelo.Ciudadano;
import modelo.ClaseVehiculo;
import modelo.Color;
import modelo.Conexion;
import modelo.EstadoV;
import modelo.Marca;
import modelo.ModeloVehiculo;
import modelo.Propieatario;
import modelo.Propietario2;
import modelo.TipoCombustible;
import modelo.TipoServicio;

/**
 *
 * @author nicolasgarcia
 */
public class consultasDAO extends Conexion{
    Ciudadano ciu = new Ciudadano();
    TipoServicio ts = new TipoServicio();
     ClaseVehiculo cv = new ClaseVehiculo();
     ModeloVehiculo mv = new ModeloVehiculo();
     EstadoV ev = new EstadoV();
     Color co = new Color();
     TipoCombustible  tc = new TipoCombustible();
     Marca marca = new Marca();
     Propieatario pro = new Propieatario();
     
     Propietario2 pro2 = new Propietario2();
    
    
     public TipoServicio consultaTS(String nombre, String tabla) {
        String consulta = "select id from poryectofinaldesarrollo."+tabla+" where nombre ='" + nombre + "'";
        System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        try {
            if (resultadoDB.next()) {

                ts.setId(resultadoDB.getInt("id"));

            }
        } catch (SQLException ex) {
            System.out.println("Esto se tosto buscar");
        }
        return ts;
    }
    
      public ClaseVehiculo consultaCV(String nombre, String tabla) {
        String consulta = "select id from poryectofinaldesarrollo."+tabla+" where nombre ='" + nombre + "'";
        System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        try {
            if (resultadoDB.next()) {

                cv.setId(resultadoDB.getInt("id"));

            }
        } catch (SQLException ex) {
            System.out.println("Esto se tosto buscar");
        }
        return cv;
    }
        public EstadoV consultaEV(String nombre, String tabla) {
        String consulta = "select id from poryectofinaldesarrollo."+tabla+" where nombre ='" + nombre + "'";
        System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        try {
            if (resultadoDB.next()) {

                ev.setId(resultadoDB.getInt("id"));

            }
        } catch (SQLException ex) {
            System.out.println("Esto se tosto buscar");
        }
        return ev;
    }
      public ModeloVehiculo consultaMV(String nombre, String tabla) {
        String consulta = "select id from poryectofinaldesarrollo."+tabla+" where nombre ='" + nombre + "'";
        System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        try {
            if (resultadoDB.next()) {

                mv.setId(resultadoDB.getInt("id"));

            }
        } catch (SQLException ex) {
            System.out.println("Esto se tosto buscar");
        }
        return mv;
    }
      
       public Color consultaCO(String nombre, String tabla) {
        String consulta = "select id from poryectofinaldesarrollo."+tabla+" where nombre ='" + nombre + "'";
        System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        try {
            if (resultadoDB.next()) {

                co.setId(resultadoDB.getInt("id"));

            }
        } catch (SQLException ex) {
            System.out.println("Esto se tosto buscar");
        }
        return co;
    }
       public TipoCombustible consultaTC(String nombre, String tabla) {
        String consulta = "select id from poryectofinaldesarrollo."+tabla+" where nombre ='" + nombre + "'";
        System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        try {
            if (resultadoDB.next()) {

                tc.setId(resultadoDB.getInt("id"));

            }
        } catch (SQLException ex) {
            System.out.println("Esto se tosto buscar");
        }
        return tc;
    }
       
        public Marca consultaMarca(String nombre) {
        String consulta = "select id from poryectofinaldesarrollo.marca where nombre ='" + nombre + "'";
        System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        try {
            if (resultadoDB.next()) {

                marca.setId(resultadoDB.getInt("id"));

            }
        } catch (SQLException ex) {
            System.out.println("Esto se tosto buscar");
        }
        return marca;
    }
         public void listarEnComboGenericoConsul(JComboBox<String> cb, String tabla, String tabla2, int id) {
        
          cb.removeAllItems();
       cb.addItem("Seleccione un "+tabla);
        String consulta = "Select nombre from poryectofinaldesarrollo."+tabla+" where "+tabla2+" ='"+id+"'";
        super.ejecutarRetorno(consulta);

        try {
            while (resultadoDB.next()) {
            cb.addItem(resultadoDB.getString("nombre"));
                
            }
        }catch(SQLException e){
            System.out.println(e);
            
        }
       
     
}
          public void listarEnComboNumeroPoliza(JComboBox<String> cb, String tabla, String datoBusqueda) {
        
          cb.removeAllItems();
       cb.addItem("Seleccione un "+tabla);
        String consulta = "Select numero_poliza from poryectofinaldesarrollo."+tabla+" where estado = 'Inactivo'";
              System.out.println(consulta);
        super.ejecutarRetorno(consulta);

        try {
            while (resultadoDB.next()) {
            cb.addItem(resultadoDB.getInt("numero_poliza")+"");
                
            }
        }catch(SQLException e){
            System.out.println(e);
            
        }
          }
        
        public Propieatario consultaPropietario(String ciudadano) {
        String consulta = "select id from poryectofinaldesarrollo.propietario where ciudadano ='" + ciudadano + "'";
        System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        try {
            if (resultadoDB.next()) {

                pro.setId(resultadoDB.getInt("id"));

            }
        } catch (SQLException ex) {
            System.out.println("Esto se tosto buscar");
        }
        return pro;
    }
         public Propietario2 consultaPropietario2(String ciudadano) {
        String consulta = "select id from poryectofinaldesarrollo.propietario where ciudadano ='" + ciudadano + "'";
        System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        try {
            if (resultadoDB.next()) {

                pro2.setId(resultadoDB.getInt("id"));

            }
        } catch (SQLException ex) {
            System.out.println("Esto se tosto buscar");
        }
        return pro2;
    }
       
     public Ciudadano consultaCeduCiuPorUs(String usuario) {
        String consulta = "select c.numero_identidad from ciudadano c join login l on c.usuario='" + usuario + "'";
        System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        try {
            if (resultadoDB.next()) {
                ciu.setNumero_identidad(resultadoDB.getString("c.numero_identidad"));
            }
        } catch (SQLException ex) {
            System.out.println("Esto se tosto buscar");
        }
        return ciu;
    }

}
