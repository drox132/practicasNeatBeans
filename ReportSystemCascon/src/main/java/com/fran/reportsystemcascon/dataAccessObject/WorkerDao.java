package com.fran.reportsystemcascon.dataAccessObject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Francisco
 */
public class WorkerDao {
        public Connection connection (){
        //son las variables para elaborar la URL para conectarnos a la base de datos
        
    String baseDeDatos= "report_system_cascon";
    String usuario="root";
    String password = "";
    String host ="localhost";
    String puerto= "3306";
    String driver="com.mysql.jdbc.Driver";
    
    String conexionUrl = "jdbc:mysql://"+ host+ ":"+ puerto+ "/"+ baseDeDatos+""+ "?uscSSL=false";
    
    Connection connection = null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(conexionUrl, usuario, password);
        } catch (Exception ex) {
            Logger.getLogger(WorkerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
        
        
    
}
