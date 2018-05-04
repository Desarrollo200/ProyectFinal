/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import modelo.Conexion;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author XgioserX
 */
public class daoVehiculo extends Conexion {

    public DefaultTableModel listarVehiculo() {
      DefaultTableModel modelTabla;
        String nombreColumnas[] = {"Placa", "Licencia Transito", "Tipo Servicio", "Clase", "Estado", "Modelo", "Color", "Chasis", "Cilindrage", "Conbustible", "Fecha Matricula","Num Pasajeros", "Poliza", "Seguro", "Propietario"};
        modelTabla = new DefaultTableModel(new Object[][]{}, nombreColumnas);

        String consulta = "select v.placa,v.licencia_transito,ts.nombre,cv.nombre,ev.nombre,m.nombre,c.nombre,v.numero_chasis,v.cilindrage,tc.nombre,v.fecha_matricula,v.num_pasajeros,v.numero_poliza,tse.nombre,v.propietario_id from vehiculo v join tipo_servicio ts on ts.id=v.tipo_servicio join clase_vehiculo cv on v.clase_vehiculo=cv.id join estado_vehiculo ev on v.estado_vehiculo=ev.id join modelo m on v.modelo_id=m.id join color c on v.color_id=c.id join tipo_combustible tc on tc.id=v.tipo_combustible_id join seguro s on s.numero_poliza=v.numero_poliza join tipo_seguro tse on s.tipo_seguro=tse.id";
    
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
   
}