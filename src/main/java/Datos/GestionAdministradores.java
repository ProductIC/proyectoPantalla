/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Conexión.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author AlumnadoManana
 */
public class GestionAdministradores {
    private Connection connection;
    
    public GestionAdministradores(){
        MyConnection miCon;
        try{
            miCon=new MyConnection();
            connection=miCon.getCon();
        }catch(ClassNotFoundException ex){
            System.out.println("Error con la base de datos" + ex);
        }
    }
    public boolean insertAdministrador(Administrador admin){
        try{
            PreparedStatement stmt=connection.prepareStatement("INSERT into adminsitradores(usuario,contraseña) VALUES(?,?) ");
            stmt.setString(1,admin.getUsuario());
            stmt.setString(2,admin.getContrasena());
            stmt.executeUpdate();
            return true;
        }catch(SQLException ex){
            System.out.println("Error al inserta usuario"+ex);
            return false;
        }
    }
    public boolean eliminarAdministrador(int id){
        try{
            PreparedStatement pstmt= connection.prepareStatement("DELETE from administradores where id=?");
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            return true;
        }catch(SQLException ex){
            System.out.println("Error al liminar administrador" +ex);
            return false;
        }
    }
}
