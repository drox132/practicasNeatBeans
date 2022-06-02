package com.fran.reportsystemcascon.dataAccessObject;

import com.fran.reportsystemcascon.model.Inspector;
import com.mysql.jdbc.StringUtils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Francisco
 */
public class InspectorDao {
    
    
      public void add (Inspector inspector){
      
        try {
            Connection conexion= connection();
            String sql = "INSERT INTO `inpector` (`id`, `name`, `phone`, `email`) "
                    + "VALUES (NULL, '"+inspector.getName()+"', '"
                    +inspector.getPhone()+"', '"
                    +inspector.getEmail()+"');";
            
            Statement statement = conexion.createStatement();
            statement.execute(sql);
            
        } catch (Exception ex) {
            Logger.getLogger(InspectorDao.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
      
      
      
      
      
    public List<Inspector> getAll (){
      
    List<Inspector> getAllInspector = new ArrayList<>();
    
    
        try {
            Connection conexion= connection();
            String sql = "SELECT * FROM `inpector`";
            
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            
            while(resultSet.next()){
            Inspector particularInspector = new Inspector();
            particularInspector.setId(resultSet.getInt("id"));
            particularInspector.setName(resultSet.getString("name"));
            particularInspector.setPhone(resultSet.getString("phone"));
            particularInspector.setEmail(resultSet.getString("email"));
            getAllInspector.add(particularInspector);
            }
   
        } catch (Exception ex) {
            Logger.getLogger(InspectorDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return getAllInspector;
    }
    
     public void update (Inspector inspector){
      
        try {
            Connection conexion= connection();
            String sql = "UPDATE `inpector` SET `name` = '"+inspector.getName()
                    +"', `phone` = '"+inspector.getPhone()
                    +"', `email` = '"+inspector.getEmail()
                    +"' WHERE `inpector`.`id` = "+inspector.getId()+ ";";
            
            Statement statement = conexion.createStatement();
            statement.execute(sql);
            
        } catch (Exception ex) {
            Logger.getLogger(InspectorDao.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    
    public void delete (int id){
        
    
        try {
            Connection conexion= connection();
            String sql = "DELETE FROM `inpector` WHERE `inpector`.`id` = "+ id;
            
            Statement statement = conexion.createStatement();
            statement.execute(sql);
            
        } catch (Exception ex) {
            Logger.getLogger(InspectorDao.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    
    
    public Connection connection (){
        //son las variables para elaborar la URL para conectarnos a la base de datos
        
    String baseDeDatos= "report_system_cascon";
    String usuario="root";
    String password = "";
    String host ="localhost";
    String puerto= "3306";
    String driver="com.mysql.jdbc.Driver";
    
    String conexionUrl = "jdbc:mysql://"+ host+ ":"+ puerto+ "/"+ baseDeDatos+""+ "?uscSSL=false";
    
    Connection conexion = null;
    
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(conexionUrl, usuario, password);
            
            
        } catch (Exception ex) {
            Logger.getLogger(InspectorDao.class.getName()).log(Level.SEVERE, null, ex);
        }  
        return conexion;
    }
    
    

    
    
}
