
package com.fran.tablasjaladasdebasededatos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;


public class ResultSetToTableModel extends AbstractTableModel{
    
    
    public ResultSetToTableModel(ResultSet oneResultSet){
    rsRegister=oneResultSet;
    
        try {
            rsMetaData=rsRegister.getMetaData();
        } catch (SQLException ex) {
            Logger.getLogger(ResultSetToTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    

    @Override
    public int getColumnCount() {
        
        try {
            return rsMetaData.getColumnCount();
        } catch (SQLException ex) {
            Logger.getLogger(ResultSetToTableModel.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        
    }
    @Override
    public int getRowCount() {
       
        try {
            rsRegister.last();
            return rsRegister.getRow();
        } catch (SQLException ex) {
            Logger.getLogger(ResultSetToTableModel.class.getName()).log(Level.SEVERE, null, ex);
         return 0;
        }
       
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        try {
            rsRegister.absolute( rowIndex + 1);
            return rsRegister.getObject(columnIndex +1);
        } catch (SQLException ex) {
            Logger.getLogger(ResultSetToTableModel.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }                                                                 
    }
    
    public String getColumnName(int columnName){
        try{
            return rsMetaData.getColumnName(columnName + 1);
        }catch(Exception e){
        e.printStackTrace();
        return null;
        }
    }
    
   private ResultSet rsRegister; 
   private ResultSetMetaData rsMetaData;
    
}
