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
public class GestionUsuarios {
    private Connection connection;
    
    public GestionUsuarios(){
        MyConnection miCon;
        try{
            miCon=new MyConnection();
            connection=miCon.getCon();
            
        }catch(ClassNotFoundException ex){
        System.out.println("Error: con la base de datos"+ex);
        }
    }
    
    public boolean insertUsuario (Usuario usuario){
        try{
            PreparedStatement stmt=connection.prepareStatement("INSERT into usuarios(usuario,contraseña)VALUES(?,?)");
            stmt.setString(1,usuario.getUsuario());
            stmt.setString(2, usuario.getContrasena());
            stmt.executeUpdate();
            return true;
        }catch(SQLException ex){
            System.out.println("Error al insertar usuario"+ ex);
            return false;
        }
    }
    public boolean eliminarUsuario(int id){
        try{
            PreparedStatement pstmt=connection.prepareStatement("Delete from usuarios where id=?");
            pstmt.setInt(1,id);
            pstmt.executeUpdate();
            return true;
            
        }catch(SQLException ex){
            System.out.println("Error al eliminar el usuario : "+ex);
            return false;
        }
    }
    
}
