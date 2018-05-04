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
public class daoComparendo extends Conexion {

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
    
}
