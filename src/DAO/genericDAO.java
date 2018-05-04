/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.Departamento;
import modelo.Municipio;
import modelo.Pais;
import vista.FrmAdmin;

/**
 *
 * @author nicolasgarcia
 */
public class genericDAO extends Conexion{
    
     Municipio municipio = new Municipio();
   Pais pais = new Pais();
   Departamento depar = new Departamento();
     public boolean guardar(String json, String nombreTabla) {
        System.out.println(json);

        JsonParser parser = new JsonParser();//json parcer se utiliza para poder parsear el json a objeto
        JsonObject jobject = parser.parse(json).getAsJsonObject();//obtener objeto de json convertido
        Set<String> keys = jobject.keySet();// //obtiene el nombre de los atributos

        ArrayList<String> listCampos = new ArrayList(keys);//  se guardan en diferentes array los campos de los atributos
        ArrayList<String> listValores = new ArrayList();//Se guardan los valores
        for (int i = 0; i < listCampos.size(); i++) {
            System.out.println(listCampos.get(i));
            listValores.add(jobject.get(listCampos.get(i)).getAsString());
        }
        for (int i = 0; i < listValores.size(); i++) {
            System.out.println(listValores.get(i));
        }
        String consulta = "insert into " + nombreTabla + "(";
        Iterator<String> itrCampos = listCampos.iterator();//coge uno por uno y lo retorna

        while (itrCampos.hasNext()) { //mientras el iterador tenga siguiente
            Object atributo = itrCampos.next();//
            consulta = consulta + "" + atributo.toString().toLowerCase();
            if (itrCampos.hasNext()) { //si el iterador tiene siguiente
                consulta = consulta + ",";
            } else {
                consulta = consulta + ") values (";
            }

        }
        Iterator<String> itrValores = listValores.iterator();
        while (itrValores.hasNext()) { //SI EL ITERADOR TIENE SIGUIENTE AGREGAR EL VALOR
            Object valor = itrValores.next();
            consulta = consulta + "'" + valor;
            if (itrValores.hasNext()) { //AGREGUE LA COMA SI TIENE SGTE
                consulta = consulta + "',";
            } else {
                consulta = consulta + "');"; //FINALICE LA CONSULTA
            }

        }
        System.out.println(consulta);
        return super.ejecutar(consulta);
    }

     public DefaultTableModel listar(String json, String nombreTabla) {
        String consulta = "select * from " + nombreTabla;
        super.ejecutarRetorno(consulta);
        
        JsonParser parser = new JsonParser();
        JsonObject jobject = parser.parse(json).getAsJsonObject();
        Set<String> keys = jobject.keySet();//cortará cualquier cadena en varias partes dependiendo del valor de su argumento de cadena
        
        ArrayList<String> listCampos = new ArrayList(keys);
        String[] campos = new String[listCampos.size()];
        
        for (int i = 0; i < listCampos.size(); i++) {
            campos[i] = listCampos.get(i);
        }
        
        Object[][] matriz = new Object[1][listCampos.size()];
        DefaultTableModel modelo = new DefaultTableModel(matriz, campos);

        try {
            while (resultadoDB.next()) {
                for (int i = 0; i < listCampos.size(); i++) {
                    matriz[0][i] = resultadoDB.getObject(listCampos.get(i));
                }
                modelo.addRow((Object[]) matriz[0]);
            }
            modelo.removeRow(0);
        } catch (SQLException e) {
            System.out.println(e + "error listando");
        }
        return modelo;
    }
      public String[] buscar(String json, String nombreTabla) {

        System.out.println(json);

        JsonParser parser = new JsonParser();
        JsonObject jobject = parser.parse(json).getAsJsonObject();
        Set<String> keys = jobject.keySet();

        ArrayList<String> listCampos = new ArrayList(keys);
        ArrayList<String> listValores = new ArrayList();
        listValores.add(jobject.get(listCampos.get(0)).getAsString());
        String[] valores = new String[listCampos.toArray().length];

        String consulta = "select * from " + nombreTabla + " where " + listCampos.get(0) + "='" + jobject.get(listCampos.get(0)) + "'";

        System.out.println(consulta);

        super.ejecutarRetorno(consulta);

        try {
            if (resultadoDB.next()) {
                for (int i = 0; i < listCampos.size(); i++) {
                    valores[i] = resultadoDB.getString(listCampos.get(i));
                }
            }
        } catch (SQLException e) {
            System.out.println("error en el buscar del dao generico: "+e);
        }

        return valores;
    }

    public boolean eliminar(String json, String nombreTabla, String comparacion) {

        System.out.println(json);

        JsonParser parser = new JsonParser();
        JsonObject jobject = parser.parse(json).getAsJsonObject();
        Set<String> keys = jobject.keySet();
        ArrayList<String> listCampos = new ArrayList(keys);

        String consulta = "delete from " + nombreTabla + " where " + comparacion + "=" + jobject.get(listCampos.get(0)).getAsString() + ";";
        System.out.println(consulta);
        return super.ejecutar(consulta);
    }

    public boolean modificar(String json, String nombreTabla, String comparacion) {
        JsonParser parser = new JsonParser();
        JsonObject jobject = parser.parse(json).getAsJsonObject();
        Set<String> keys = jobject.keySet();

        ArrayList<String> listCampos = new ArrayList(keys);
        ArrayList<String> listValores = new ArrayList();
        for (int i = 1; i < listCampos.size(); i++) {
            System.out.println(listCampos.get(i));
            listValores.add(jobject.get(listCampos.get(i)).getAsString());
        }

        String consulta = "update " + nombreTabla + " set ";
        Iterator<String> itrCampos = listCampos.iterator();
        itrCampos.next();
        Iterator<String> itrValores = listValores.iterator();
        while (itrCampos.hasNext()) {
            Object atributo = itrCampos.next();
            Object valor = itrValores.next();
            consulta = consulta + "" + atributo.toString().toLowerCase() + "='" + valor.toString().toLowerCase();
            if (itrCampos.hasNext()) {
                consulta = consulta + "',";
            } else {
                consulta = consulta + "' where " + comparacion + "='" + jobject.get(listCampos.get(0)).getAsString() + "'";
            }

        }

        System.out.println(consulta);
        return super.ejecutar(consulta);
    }

   

    public void cargarcb(JComboBox<String> cb, String tabla, String nombreCampo) {
        cb.removeAllItems();
        cb.addItem("Seleccione un "+tabla);
        String consulta = "select "+nombreCampo+" from " + tabla;
        System.out.println(consulta);
        String campo = nombreCampo;
        super.ejecutarRetorno(consulta);

        try {
            while (resultadoDB.next() != resultadoDB.wasNull()) {
                cb.addItem(resultadoDB.getString(campo));

            }
        } catch (SQLException e) {
            System.out.println("error cargando cb dao generico");

        }
    }
    
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
    
      public void listarEnComboDepartamentos(JComboBox<String> cb, int pais_id) {
        
         cb.removeAllItems();
      cb.addItem("Seleccione un departamento");
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
         
         
         public ArrayList<String> iniciarSesion(String objeto, String tabla, String variable1, String variable2, String nickname, String clave) {
        JsonParser parser = new JsonParser();
        JsonObject jobject = parser.parse(objeto).getAsJsonObject();
        Set<String> keys = jobject.keySet();

        ArrayList<String> listCampos = new ArrayList(keys);
        String consulta = "select * from " + tabla + " where " + variable1 + "='" + nickname + "' and " + variable2 + "='" + clave + "';";
        super.ejecutarRetorno(consulta);
        ArrayList<String> dao = new ArrayList<>();
        try {
            if (resultadoDB.next()) {
                for (int i = 0; i < listCampos.size(); i++) {
                    dao.add(resultadoDB.getString(listCampos.get(i)));
                }
            }
        } catch (SQLException ex) {
            System.out.println("Se prendio esta mier**");
        }
        return dao;
    }
}
        

    

