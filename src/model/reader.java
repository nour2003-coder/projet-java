/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class reader {
    private String cin;
    private String firstname;
    private String lastname;
    private int phonenumber;
    private String email;
    private int book_count=5;
    private int status=1;
    public reader(String fname,String lastname,int phonenumber,String cin,String email,int status,int book){ 
        this.firstname=fname;
        this.lastname=lastname;
        this.cin=cin;
        this.phonenumber=phonenumber;
        this.email=email;
        this.status=status;
        this.book_count=book;
        
        
    }
    public String getcin(){
        return(this.cin);
    }
    public int getstatues(){
        return(this.status);
    }
    public String getfirstname(){
        return(this.firstname);
    }
    public String getlastname(){
        return(this.lastname);
    }
    public int getphone(){
        return(this.phonenumber);
    }
    public String getemail(){
        return(this.email);
    }
    public int getbook(){
        return(this.book_count);
    }
    public void setbook(int i){
        this.book_count=i;   
    }
    
    

    
}
