/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fran.tablasjaladasdebasededatos;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Francisco
 */
public class MarcoInformation extends JFrame {
    ConnectionSql connectionSql =new ConnectionSql();
    

    public MarcoInformation() {
        
        setTitle("Informacion Consorcial");
        setBounds(250,200,1000,300);
       
        JPanel superior = new JPanel();
        nameTable= new JComboBox();
        
        
        try{
            connection= connectionSql.connection();
            datosDB=connection.getMetaData();
            rs=datosDB.getTables(null, null, null, null);
            
            
            while(rs.next()){
            
                nameTable.addItem(rs.getString("TABLE_NAME"));
            }
        }catch(Exception e){
        e.printStackTrace();
        }
     
        
            nameTable.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String tableSelected= (String)nameTable.getSelectedItem();
                String sql =" SELECT * FROM " + tableSelected;
             try{   
                sentencia=connection.createStatement();
                rs=sentencia.executeQuery(sql);
                /*
                while(rs.next()){
                System.out.println(rs.getString("name"));
                }
                */
                
                model = new ResultSetToTableModel(rs);
                JTable table= new JTable(model);
                add(new JScrollPane(table),BorderLayout.CENTER);
                validate(); 
                
             }catch(Exception e2){
                 e2.printStackTrace(); 
            }
                
            }
        
        
            });
        
        
       
        superior.add(nameTable);
        add(superior, BorderLayout.NORTH);
        
        
  
    }
    private JComboBox nameTable;
    private DatabaseMetaData datosDB;
    private ResultSet rs;
    private Connection connection;
    private Statement sentencia;
    private ResultSetToTableModel model; 
}
