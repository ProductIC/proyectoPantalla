/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Conexión.MyConnection;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author AlumnadoManana
 */
public class GestionNoticias {
    private Connection connection;
    
    public GestionNoticias(){
        MyConnection miCon;
        try{
             miCon=new MyConnection();
            connection=miCon.getCon();
            
        }catch(ClassNotFoundException ex){
        System.out.println("Error: con la base de datos"+ex);
        }
    }
    public boolean insertNoticia(Noticia noti){
        try{
            PreparedStatement stmt= connection.prepareStatement("INSERT into noticias(url,fecha,duracion)VALUES(?,?,?)");
        }catch(SQLException ex){
            System.out.println("Error al insertar noticia");
            return false;
        }
    }
}
