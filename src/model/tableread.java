/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.Icon;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author user
 */
public class tableread extends AbstractTableModel{
    private String[] columns;
    private Object[][] rows;
    
    public tableread (){}
    public tableread (Object [][] data,String [] columnsName){
        this.columns=columnsName;
        this.rows=data;
        
    }

    public int getRowCount() {
        return(this.rows.length);
    }

    
    public int getColumnCount() {
        return(this.columns.length);
        
    }
   

   
    public Object getValueAt(int rowIndex, int columnIndex) {
        return(this.rows[rowIndex][columnIndex]);
        
    }
    public String getColumnName(int col){
        return(this.columns[col]);
    }
    
}
