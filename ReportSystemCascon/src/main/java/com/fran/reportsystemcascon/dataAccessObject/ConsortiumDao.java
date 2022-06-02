/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fran.reportsystemcascon.dataAccessObject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Francisco
 */
public class ConsortiumDao {
    public void conectar (){
        //son las variables para elaborar la URL para conectarnos a la base de datos
        
    String baseDeDatos= "report_system_cascon";
    String usuario="root";
    String password = "";
    String host ="localhost";
    String puerto= "3306";
    String driver="com.mysql.jdbc.Driver";
    
    String conexionUrl = "jdbc:mysql://"+ host+ ":"+ puerto+ "/"+ baseDeDatos+""+ "?uscSSL=false";
    
    Connection conexion =null;
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(conexionUrl, usuario, password);
        } catch (Exception ex) {
            Logger.getLogger(ConsortiumDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
