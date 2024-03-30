/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import model.reader;

/**
 *
 * @author user
 */
public class readDao {
    public static void save(reader r){
     String query = "INSERT INTO lecteur (CIN, nom, prenom, phonenumber,book_count, email, status) VALUES ('" + r.getcin() + "', '" + r.getfirstname() + "', '" + r.getlastname() + "', '" + r.getphone() + "', '" + r.getbook() + "', '" + r.getemail() + "', '" + r.getstatues() +"')";

     DbOperations.setDataOrDelete(query,"upload successfully!");
        
    }
    
}
