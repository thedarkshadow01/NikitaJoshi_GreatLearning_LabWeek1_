/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gl.service;
import com.gl.model.employee;
import com.gl.service.empCredentials;
import java.util.*;
/**
 *
 * @author Nikita
 */
public class empCredentialsImpl implements empCredentials{

    @Override
    public String generateEmailId(String fname, String lname, String dept) {
        return fname+lname+"@"+dept+".gl.com";
    }

    @Override
    public String generatePassword() {
       String caps= "ABCDEFGIJKLMNOPQRSTUVWXYZ";
       String low= "abcdefghijklmnopqrstuvwxyz";
       String num= "1234567890";
       String spl= "!@#$%^&*()";
       String combine= caps+low+num+spl;
       String pass="";
       Random r= new Random();
       for(int i=0;i<8;i++){
          pass= pass+ String.valueOf(combine.charAt(r.nextInt(combine.length()))); 
       }       
       return pass;
    }

    @Override
    public void showDetails(employee e) {
        System.out.println("Employee Firstname is "+e.getfname());
        System.out.println("Employee Lastname is "+ e.getlname());
        System.out.println("Employee Email is "+ e.getemailID());
        System.out.println("Employee Password is "+e.getpassword());
    }
    
}
