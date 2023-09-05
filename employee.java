/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gl.model;

/**
 *
 * @author Nikita
 */
public class employee {
    private String fname;
    private String lname;
    private String emailID;
    private String password;
    public employee(String fname, String lname){
        this.fname= fname;
        this.lname= lname;
    }
    public String getfname(){
        return fname;
    }
    public void setfname(){
        this.fname= fname;
    }
    public String getlname(){
        return lname;
    }
    public void setlname(){
        this.lname= lname;
    }
    public String getemailID(){
        return emailID;
    }
    public void setemailID(String emailID){
        this.emailID= emailID;
    }
    public String getpassword(){
        return password;
    }
    public void setpassword(String password){
        this.password= password;
    }
}
