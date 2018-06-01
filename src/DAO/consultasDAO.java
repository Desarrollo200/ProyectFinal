/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import modelo.Ciudadano;
import modelo.Aseguradora;


import modelo.CDA;

import modelo.ClaseVehiculo;
import modelo.Color;
import modelo.Conexion;
import modelo.EstadoV;
import modelo.Marca;
import modelo.ModeloVehiculo;
import modelo.Propieatario;
import modelo.Propietario2;
import modelo.TipoCombustible;
import modelo.TipoSeguro;
import modelo.TipoServicio;
import modelo.Vehiculo;
import vista.FrmCDA;

/**
 *
 * @author nicolasgarcia
 */
public class consultasDAO extends Conexion{

    Ciudadano ciu = new Ciudadano();
    Aseguradora ase = new Aseguradora();
    TipoServicio ts = new TipoServicio();
     ClaseVehiculo cv = new ClaseVehiculo();
     ModeloVehiculo mv = new ModeloVehiculo();
     EstadoV ev = new EstadoV();
     Color co = new Color();
     TipoCombustible  tc = new TipoCombustible();
     Marca marca = new Marca();
     Propieatario pro = new Propieatario();
     Propietario2 pro2 = new Propietario2();
     TipoSeguro tipoSeguro = new TipoSeguro();
     CDA cda = new CDA();
     Vehiculo veh = new Vehiculo();
    
    
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
         public Aseguradora consultaAseguradora(String nombre, String tabla) {
        String consulta = "select nit from poryectofinaldesarrollo."+tabla+" where nombre ='" + nombre + "'";
        System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        try {
            if (resultadoDB.next()) {

                ase.setNit(resultadoDB.getInt("nit"));

            }
        } catch (SQLException ex) {
            System.out.println("Esto se tosto buscar");
        }
        return ase;
    }
         public TipoSeguro consultaTipoSeguro(String nombre, String tabla) {
        String consulta = "select id from poryectofinaldesarrollo."+tabla+" where nombre ='" + nombre + "'";
        System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        try {
            if (resultadoDB.next()) {

                tipoSeguro.setId(resultadoDB.getInt("id"));

            }
        } catch (SQLException ex) {
            System.out.println("Esto se tosto buscar");
        }
        return tipoSeguro;
    }
        public CDA consultaNitCda(String nombre) {
        String consulta = "select nit from poryectofinaldesarrollo.cda where usuario ='" + nombre + "'";
        System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        try {
            if (resultadoDB.next()) {

                cda.setNit(resultadoDB.getInt("nit"));

            }
        } catch (SQLException ex) {
            System.out.println("Esto se tosto buscar");
        }
        return cda;
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
     public Vehiculo consultaFechaMatriculaVehiculo(String placa) {
        String consulta = "select fecha_matricula from poryectofinaldesarrollo.vehiculo where placa ='" + placa + "'";
        System.out.println(consulta);
        super.ejecutarRetorno(consulta);
        try {
            if (resultadoDB.next()) {

                veh.setFecha_matricula(resultadoDB.getString("fecha_matricula"));

            }
        } catch (SQLException ex) {
            System.out.println("Esto se tosto buscar");
        }
        return veh;
    }

     public DefaultTableModel vehiculosPorPlaca(String placa) {
         DefaultTableModel modelTabla;
        String nombreColumnas[] = {"Placa", "Licencia Transito", "Tipo Servicio", "Clase", "Estado", "Modelo", "Color", "Chasis", "Cilindrage", "Conbustible", "Fecha Matricula","Num Pasajeros", "Poliza", "Seguro", "Propietario"};
        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas);

        String consulta = "select v.placa,v.licencia_transito,ts.nombre,cv.nombre,ev.nombre,m.nombre,c.nombre,v.numero_chasis,v.cilindrage,tc.nombre,v.fecha_matricula,v.num_pasajeros,v.numero_poliza,tse.nombre,v.propietario_id from vehiculo v join tipo_servicio ts on ts.id=v.tipo_servicio join clase_vehiculo cv on v.clase_vehiculo=cv.id join estado_vehiculo ev on v.estado_vehiculo=ev.id join modelo m on v.modelo_id=m.id join color c on v.color_id=c.id join tipo_combustible tc on tc.id=v.tipo_combustible_id join seguro s on s.numero_poliza=v.numero_poliza join tipo_seguro tse on s.tipo_seguro=tse.id join propietario pro on pro.id=v.propietario_id join ciudadano ciu on ciu.numero_identidad=pro.ciudadano where v.placa='"+placa+"';";
    
        super.ejecutarRetorno(consulta);

        try {
            while (resultadoDB.next()) {
                modelTabla.addRow(new Object[]{
                    resultadoDB.getString("v.placa"),
                    resultadoDB.getString("v.licencia_transito"),
                    resultadoDB.getString("ts.nombre"),
                    resultadoDB.getString("cv.nombre"),
                    resultadoDB.getString("ev.nombre"),
                    resultadoDB.getString("m.nombre"),
                    resultadoDB.getString("c.nombre"),
                    resultadoDB.getString("v.numero_chasis"),
                    resultadoDB.getString("v.cilindrage"),
                    resultadoDB.getString("tc.nombre"),
                    resultadoDB.getString("v.fecha_matricula"),
                    resultadoDB.getString("v.num_pasajeros"),
                    resultadoDB.getString("v.numero_poliza"),
                    resultadoDB.getString("tse.nombre"),
                    resultadoDB.getString("v.propietario_id")
                    });
            }
        } catch (SQLException ex) {
            System.out.println("Esto se tosto");
            ex.printStackTrace();
        }
        return modelTabla;
    }
     
     public DefaultTableModel vehiculosPorClase(String clase) {
         DefaultTableModel modelTabla;
        String nombreColumnas[] = {"Placa", "Licencia Transito", "Tipo Servicio", "Clase", "Estado", "Modelo", "Color", "Chasis", "Cilindrage", "Conbustible", "Fecha Matricula","Num Pasajeros", "Poliza", "Seguro", "Propietario"};
        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas);

        String consulta = "select v.placa,v.licencia_transito,ts.nombre,cv.nombre,ev.nombre,m.nombre,c.nombre,v.numero_chasis,v.cilindrage,tc.nombre,v.fecha_matricula,v.num_pasajeros,v.numero_poliza,tse.nombre,v.propietario_id from vehiculo v join tipo_servicio ts on ts.id=v.tipo_servicio join clase_vehiculo cv on v.clase_vehiculo=cv.id join estado_vehiculo ev on v.estado_vehiculo=ev.id join modelo m on v.modelo_id=m.id join color c on v.color_id=c.id join tipo_combustible tc on tc.id=v.tipo_combustible_id join seguro s on s.numero_poliza=v.numero_poliza join tipo_seguro tse on s.tipo_seguro=tse.id join propietario pro on pro.id=v.propietario_id join ciudadano ciu on ciu.numero_identidad=pro.ciudadano where cv.nombre='"+clase+"';";
    
        super.ejecutarRetorno(consulta);

        try {
            while (resultadoDB.next()) {
                modelTabla.addRow(new Object[]{
                    resultadoDB.getString("v.placa"),
                    resultadoDB.getString("v.licencia_transito"),
                    resultadoDB.getString("ts.nombre"),
                    resultadoDB.getString("cv.nombre"),
                    resultadoDB.getString("ev.nombre"),
                    resultadoDB.getString("m.nombre"),
                    resultadoDB.getString("c.nombre"),
                    resultadoDB.getString("v.numero_chasis"),
                    resultadoDB.getString("v.cilindrage"),
                    resultadoDB.getString("tc.nombre"),
                    resultadoDB.getString("v.fecha_matricula"),
                    resultadoDB.getString("v.num_pasajeros"),
                    resultadoDB.getString("v.numero_poliza"),
                    resultadoDB.getString("tse.nombre"),
                    resultadoDB.getString("v.propietario_id")
                    });
            }
        } catch (SQLException ex) {
            System.out.println("Esto se tosto");
            ex.printStackTrace();
        }
        return modelTabla;
    }
     
      public DefaultTableModel vehiculosPorEstado(String estado) {
         DefaultTableModel modelTabla;
        String nombreColumnas[] = {"Placa", "Licencia Transito", "Tipo Servicio", "Clase", "Estado", "Modelo", "Color", "Chasis", "Cilindrage", "Conbustible", "Fecha Matricula","Num Pasajeros", "Poliza", "Seguro", "Propietario"};
        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas);

        String consulta = "select v.placa,v.licencia_transito,ts.nombre,cv.nombre,ev.nombre,m.nombre,c.nombre,v.numero_chasis,v.cilindrage,tc.nombre,v.fecha_matricula,v.num_pasajeros,v.numero_poliza,tse.nombre,v.propietario_id from vehiculo v join tipo_servicio ts on ts.id=v.tipo_servicio join clase_vehiculo cv on v.clase_vehiculo=cv.id join estado_vehiculo ev on v.estado_vehiculo=ev.id join modelo m on v.modelo_id=m.id join color c on v.color_id=c.id join tipo_combustible tc on tc.id=v.tipo_combustible_id join seguro s on s.numero_poliza=v.numero_poliza join tipo_seguro tse on s.tipo_seguro=tse.id join propietario pro on pro.id=v.propietario_id join ciudadano ciu on ciu.numero_identidad=pro.ciudadano where ev.nombre='"+estado+"';";
    
        super.ejecutarRetorno(consulta);

        try {
            while (resultadoDB.next()) {
                modelTabla.addRow(new Object[]{
                    resultadoDB.getString("v.placa"),
                    resultadoDB.getString("v.licencia_transito"),
                    resultadoDB.getString("ts.nombre"),
                    resultadoDB.getString("cv.nombre"),
                    resultadoDB.getString("ev.nombre"),
                    resultadoDB.getString("m.nombre"),
                    resultadoDB.getString("c.nombre"),
                    resultadoDB.getString("v.numero_chasis"),
                    resultadoDB.getString("v.cilindrage"),
                    resultadoDB.getString("tc.nombre"),
                    resultadoDB.getString("v.fecha_matricula"),
                    resultadoDB.getString("v.num_pasajeros"),
                    resultadoDB.getString("v.numero_poliza"),
                    resultadoDB.getString("tse.nombre"),
                    resultadoDB.getString("v.propietario_id")
                    });
            }
        } catch (SQLException ex) {
            System.out.println("Esto se tosto");
            ex.printStackTrace();
        }
        return modelTabla;
    }
      
       public DefaultTableModel vehiculosPorColor(String color) {
         DefaultTableModel modelTabla;
        String nombreColumnas[] = {"Placa", "Licencia Transito", "Tipo Servicio", "Clase", "Estado", "Modelo", "Color", "Chasis", "Cilindrage", "Conbustible", "Fecha Matricula","Num Pasajeros", "Poliza", "Seguro", "Propietario"};
        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas);

        String consulta = "select v.placa,v.licencia_transito,ts.nombre,cv.nombre,ev.nombre,m.nombre,c.nombre,v.numero_chasis,v.cilindrage,tc.nombre,v.fecha_matricula,v.num_pasajeros,v.numero_poliza,tse.nombre,v.propietario_id from vehiculo v join tipo_servicio ts on ts.id=v.tipo_servicio join clase_vehiculo cv on v.clase_vehiculo=cv.id join estado_vehiculo ev on v.estado_vehiculo=ev.id join modelo m on v.modelo_id=m.id join color c on v.color_id=c.id join tipo_combustible tc on tc.id=v.tipo_combustible_id join seguro s on s.numero_poliza=v.numero_poliza join tipo_seguro tse on s.tipo_seguro=tse.id join propietario pro on pro.id=v.propietario_id join ciudadano ciu on ciu.numero_identidad=pro.ciudadano where c.nombre='"+color+"';";
    
        super.ejecutarRetorno(consulta);

        try {
            while (resultadoDB.next()) {
                modelTabla.addRow(new Object[]{
                    resultadoDB.getString("v.placa"),
                    resultadoDB.getString("v.licencia_transito"),
                    resultadoDB.getString("ts.nombre"),
                    resultadoDB.getString("cv.nombre"),
                    resultadoDB.getString("ev.nombre"),
                    resultadoDB.getString("m.nombre"),
                    resultadoDB.getString("c.nombre"),
                    resultadoDB.getString("v.numero_chasis"),
                    resultadoDB.getString("v.cilindrage"),
                    resultadoDB.getString("tc.nombre"),
                    resultadoDB.getString("v.fecha_matricula"),
                    resultadoDB.getString("v.num_pasajeros"),
                    resultadoDB.getString("v.numero_poliza"),
                    resultadoDB.getString("tse.nombre"),
                    resultadoDB.getString("v.propietario_id")
                    });
            }
        } catch (SQLException ex) {
            System.out.println("Esto se tosto");
            ex.printStackTrace();
        }
        return modelTabla;
    }
       
        public DefaultTableModel vehiculosPorTipoCombustible (String tipoCombus) {
         DefaultTableModel modelTabla;
        String nombreColumnas[] = {"Placa", "Licencia Transito", "Tipo Servicio", "Clase", "Estado", "Modelo", "Color", "Chasis", "Cilindrage", "Conbustible", "Fecha Matricula","Num Pasajeros", "Poliza", "Seguro", "Propietario"};
        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas);

        String consulta = "select v.placa,v.licencia_transito,ts.nombre,cv.nombre,ev.nombre,m.nombre,c.nombre,v.numero_chasis,v.cilindrage,tc.nombre,v.fecha_matricula,v.num_pasajeros,v.numero_poliza,tse.nombre,v.propietario_id from vehiculo v join tipo_servicio ts on ts.id=v.tipo_servicio join clase_vehiculo cv on v.clase_vehiculo=cv.id join estado_vehiculo ev on v.estado_vehiculo=ev.id join modelo m on v.modelo_id=m.id join color c on v.color_id=c.id join tipo_combustible tc on tc.id=v.tipo_combustible_id join seguro s on s.numero_poliza=v.numero_poliza join tipo_seguro tse on s.tipo_seguro=tse.id join propietario pro on pro.id=v.propietario_id join ciudadano ciu on ciu.numero_identidad=pro.ciudadano where tc.nombre='"+tipoCombus+"';";
    
        super.ejecutarRetorno(consulta);

        try {
            while (resultadoDB.next()) {
                modelTabla.addRow(new Object[]{
                    resultadoDB.getString("v.placa"),
                    resultadoDB.getString("v.licencia_transito"),
                    resultadoDB.getString("ts.nombre"),
                    resultadoDB.getString("cv.nombre"),
                    resultadoDB.getString("ev.nombre"),
                    resultadoDB.getString("m.nombre"),
                    resultadoDB.getString("c.nombre"),
                    resultadoDB.getString("v.numero_chasis"),
                    resultadoDB.getString("v.cilindrage"),
                    resultadoDB.getString("tc.nombre"),
                    resultadoDB.getString("v.fecha_matricula"),
                    resultadoDB.getString("v.num_pasajeros"),
                    resultadoDB.getString("v.numero_poliza"),
                    resultadoDB.getString("tse.nombre"),
                    resultadoDB.getString("v.propietario_id")
                    });
            }
        } catch (SQLException ex) {
            System.out.println("Esto se tosto");
            ex.printStackTrace();
        }
        return modelTabla;
    }
        
         public DefaultTableModel vehiculosPorModelo(String modelo) {
         DefaultTableModel modelTabla;
        String nombreColumnas[] = {"Placa", "Licencia Transito", "Tipo Servicio", "Clase", "Estado", "Modelo", "Color", "Chasis", "Cilindrage", "Conbustible", "Fecha Matricula","Num Pasajeros", "Poliza", "Seguro", "Propietario"};
        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas);

        String consulta = "select v.placa,v.licencia_transito,ts.nombre,cv.nombre,ev.nombre,m.nombre,c.nombre,v.numero_chasis,v.cilindrage,tc.nombre,v.fecha_matricula,v.num_pasajeros,v.numero_poliza,tse.nombre,v.propietario_id from vehiculo v join tipo_servicio ts on ts.id=v.tipo_servicio join clase_vehiculo cv on v.clase_vehiculo=cv.id join estado_vehiculo ev on v.estado_vehiculo=ev.id join modelo m on v.modelo_id=m.id join color c on v.color_id=c.id join tipo_combustible tc on tc.id=v.tipo_combustible_id join seguro s on s.numero_poliza=v.numero_poliza join tipo_seguro tse on s.tipo_seguro=tse.id join propietario pro on pro.id=v.propietario_id join ciudadano ciu on ciu.numero_identidad=pro.ciudadano where m.nombre='"+modelo+"';";
    
        super.ejecutarRetorno(consulta);

        try {
            while (resultadoDB.next()) {
                modelTabla.addRow(new Object[]{
                    resultadoDB.getString("v.placa"),
                    resultadoDB.getString("v.licencia_transito"),
                    resultadoDB.getString("ts.nombre"),
                    resultadoDB.getString("cv.nombre"),
                    resultadoDB.getString("ev.nombre"),
                    resultadoDB.getString("m.nombre"),
                    resultadoDB.getString("c.nombre"),
                    resultadoDB.getString("v.numero_chasis"),
                    resultadoDB.getString("v.cilindrage"),
                    resultadoDB.getString("tc.nombre"),
                    resultadoDB.getString("v.fecha_matricula"),
                    resultadoDB.getString("v.num_pasajeros"),
                    resultadoDB.getString("v.numero_poliza"),
                    resultadoDB.getString("tse.nombre"),
                    resultadoDB.getString("v.propietario_id")
                    });
            }
        } catch (SQLException ex) {
            System.out.println("Esto se tosto");
            ex.printStackTrace();
        }
        return modelTabla;
    }
         
 public DefaultTableModel CiudadanoPorID(String cedula) {
         DefaultTableModel modelTabla;
        String nombreColumnas[] = {"Identificacion", "Nombre", "Apellido", "Ciudad", "Genero"};
        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas);

        String consulta = "select c.numero_identidad,c.nombre,c.apellido,m.nombre,g.nombre from ciudadano c join municipio m on c.municipio_nacimiento=m.id join genero g on g.id=c.genero_id where c.numero_identidad='"+cedula+"';";
    
        super.ejecutarRetorno(consulta);

        try {
            while (resultadoDB.next()) {
                modelTabla.addRow(new Object[]{
                    resultadoDB.getString("c.numero_identidad"),
                    resultadoDB.getString("c.nombre"),
                    resultadoDB.getString("c.apellido"),
                    resultadoDB.getString("m.nombre"),
                    resultadoDB.getString("g.nombre")
                    });
            }
        } catch (SQLException ex) {
            System.out.println("Esto se tosto");
            ex.printStackTrace();
        }
        return modelTabla;
    }
 
 public DefaultTableModel CiudadanoPorCiudad(String ciudad) {
         DefaultTableModel modelTabla;
        String nombreColumnas[] = {"Identificacion", "Nombre", "Apellido", "Ciudad", "Genero"};
        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas);

        String consulta = "select c.numero_identidad,c.nombre,c.apellido,m.nombre,g.nombre from ciudadano c join municipio m on c.municipio_nacimiento=m.id join genero g on g.id=c.genero_id where m.nombre='"+ciudad+"';";
    
        super.ejecutarRetorno(consulta);

        try {
            while (resultadoDB.next()) {
                modelTabla.addRow(new Object[]{
                    resultadoDB.getString("c.numero_identidad"),
                    resultadoDB.getString("c.nombre"),
                    resultadoDB.getString("c.apellido"),
                    resultadoDB.getString("m.nombre"),
                    resultadoDB.getString("g.nombre")
                    });
            }
        } catch (SQLException ex) {
            System.out.println("Esto se tosto");
            ex.printStackTrace();
        }
        return modelTabla;
    }
 
 public DefaultTableModel CiudadanoPorGenero(String genero) {
         DefaultTableModel modelTabla;
        String nombreColumnas[] = {"Identificacion", "Nombre", "Apellido", "Ciudad", "Genero"};
        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas);

        String consulta = "select c.numero_identidad,c.nombre,c.apellido,m.nombre,g.nombre from ciudadano c join municipio m on c.municipio_nacimiento=m.id join genero g on g.id=c.genero_id where g.nombre='"+genero+"';";
    
        super.ejecutarRetorno(consulta);

        try {
            while (resultadoDB.next()) {
                modelTabla.addRow(new Object[]{
                    resultadoDB.getString("c.numero_identidad"),
                    resultadoDB.getString("c.nombre"),
                    resultadoDB.getString("c.apellido"),
                    resultadoDB.getString("m.nombre"),
                    resultadoDB.getString("g.nombre")
                    });
            }
        } catch (SQLException ex) {
            System.out.println("Esto se tosto");
            ex.printStackTrace();
        }
        return modelTabla;
    }

 
 public DefaultTableModel CiudadanosTodos() {
         DefaultTableModel modelTabla;
        String nombreColumnas[] = {"Identificacion", "Nombre", "Apellido", "Ciudad", "Genero"};
        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas);

        String consulta = "select c.numero_identidad,c.nombre,c.apellido,m.nombre,g.nombre from ciudadano c join municipio m on c.municipio_nacimiento=m.id join genero g on g.id=c.genero_id;";
    
        super.ejecutarRetorno(consulta);

        try {
            while (resultadoDB.next()) {
                modelTabla.addRow(new Object[]{
                    resultadoDB.getString("c.numero_identidad"),
                    resultadoDB.getString("c.nombre"),
                    resultadoDB.getString("c.apellido"),
                    resultadoDB.getString("m.nombre"),
                    resultadoDB.getString("g.nombre")
                    });
            }
        } catch (SQLException ex) {
            System.out.println("Esto se tosto");
            ex.printStackTrace();
        }
        return modelTabla;
    }
 
 
 public DefaultTableModel listarLicenciNumLicencia(String numero) {
      DefaultTableModel modelTabla;
        String nombreColumnas[] = {"Numero Licencia", "Fecha Expedicion", "Restricion del Conductor", "Organismo Expedidor", "Cedula Ciudadano"};
        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas);

        String consulta = "select num_licencia_cond,fecha_expedicion,restriccion_conductor,organismo_expedidor,numero_identidad_ciudadano from licencia_conduccion where num_licencia_cond='"+numero+"';";
    
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
 
 public DefaultTableModel listarLicenciasFechaExp(String fecha) {
      DefaultTableModel modelTabla;
        String nombreColumnas[] = {"Numero Licencia", "Fecha Expedicion", "Restricion del Conductor", "Organismo Expedidor", "Cedula Ciudadano"};
        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas);

        String consulta = "select num_licencia_cond,fecha_expedicion,restriccion_conductor,organismo_expedidor,numero_identidad_ciudadano from licencia_conduccion where fecha_expedicion='"+fecha+"';";
    
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
  
   public DefaultTableModel listarComparendosMunicipio(String municipio) {
         DefaultTableModel modelTabla;
        String nombreColumnas[] = {"Id Comparendo", "Tipo Comparendo", "Municipio", "Departamento", "Fecha y Hora", "Licencia de Conduccion"};
        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas);

        String consulta = "select c.id,ti.nombre, m.nombre,d.nombre,c.fecha_hora,c.licencia_cond_num_lic_cond from comparendo c join tipo_infraccion ti on ti.id=c.id join municipio m on m.id=c.municipio join departamento d on d.id=m.id where m.nombre='"+municipio+"';";
    
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
   
    public DefaultTableModel listarComparendosFecha(String fecha) {
         DefaultTableModel modelTabla;
        String nombreColumnas[] = {"Id Comparendo", "Tipo Comparendo", "Municipio", "Departamento", "Fecha y Hora", "Licencia de Conduccion"};
        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas);

        String consulta = "select c.id,ti.nombre, m.nombre,d.nombre,c.fecha_hora,c.licencia_cond_num_lic_cond from comparendo c join tipo_infraccion ti on ti.id=c.id join municipio m on m.id=c.municipio join departamento d on d.id=m.id where c.fecha_hora='"+fecha+"';";
    
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
    
     public DefaultTableModel listarComparendosNumLic(String num) {
         DefaultTableModel modelTabla;
        String nombreColumnas[] = {"Id Comparendo", "Tipo Comparendo", "Municipio", "Departamento", "Fecha y Hora", "Licencia de Conduccion"};
        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas);

        String consulta = "select c.id,ti.nombre, m.nombre,d.nombre,c.fecha_hora,c.licencia_cond_num_lic_cond from comparendo c join tipo_infraccion ti on ti.id=c.id join municipio m on m.id=c.municipio join departamento d on d.id=m.id where c.licencia_cond_num_lic_cond='"+num+"';";
    
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
