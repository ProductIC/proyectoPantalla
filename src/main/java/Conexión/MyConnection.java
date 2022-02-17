/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexión;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author AlumnadoManana
 */
public class MyConnection {
    private Connection con = null;
    
    private String CLASS = "com.mysql.jdbc.Driver";
    private String DATABASE = "jdbc:mysql://localhost/pantalla";
    private String USER = "usuario";
    private String PASSWORD = "";
    public MyConnection() throws ClassNotFoundException {
        try {
            Class.forName(CLASS);
            con = DriverManager.getConnection(DATABASE, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.print("Error: con la Base de Datos:" + e);
        }
    }

    public Connection getCon(){
        return con;
    }
}
