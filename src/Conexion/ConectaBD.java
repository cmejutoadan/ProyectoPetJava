/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author cmejuto
 */
public class ConectaBD {

    Connection conn; //creamos el objeto conexión

    public ConectaBD() throws SQLException {

        //parámetros de la conexión
        String driver = "jdbc:mysql://";
        //String host = "localhost"; // conectarme desde casa
        String host = "127.0.0.1"; // ip del castelao
        String porto = ":3305";
        String sid = "petfinder"; //bbdd
        String usuario = "root";
        String password = "root";
        String url = driver + host + porto + "/" + sid;

        //establecemos la conexión
        conn = DriverManager.getConnection(url, usuario, password);
        //Statment statment;
        //comprobamos si estamos conectados
        if (!conn.isClosed()) {
            System.out.println("Conectado");
        } else {
            System.out.println("No conectado");
        }

    }

    public Connection getConn() {
        return conn;
    }

}
