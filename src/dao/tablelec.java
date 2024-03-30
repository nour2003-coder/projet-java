/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

public class tablelec {
    public static void main(String[] args) {
        try {
            String picTable = "CREATE TABLE lecteur (cin INT PRIMARY KEY ,firstname VARCHAR(200) NOT NULL,lastname VARCHAR(200), phonenumber INT NOT NULL,status BOOLEAN NOT NULL,email VARCHAR(200));";
            DbOperations.setDataOrDelete(picTable, "reader table created successfully");
            JOptionPane.showMessageDialog(null, "reader table created successfully");
        } catch (Exception e) {
            // Display error message in console
            e.printStackTrace();
            
            // Display error message in a dialog
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

