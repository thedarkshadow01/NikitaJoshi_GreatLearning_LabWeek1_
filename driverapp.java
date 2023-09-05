/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gl.app;
import com.gl.service.empCredentialsImpl;
import com.gl.model.employee;
import java.util.*;
/**
 *
 * @author Nikita
 */
public class driverapp {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Please enter Employee First Name");
        String f= s.next();
        System.out.println("Please enter Employee Last Name");
        String l= s.next();
        
        employee emp= new employee(f,l);
        empCredentialsImpl cred= new empCredentialsImpl();
        
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. HR");
        System.out.println("4. Legal");
        System.out.println("Please choose your department");
        int choice= s.nextInt();
        
        String email="";
        String password="";
        
        switch(choice){
            case 1:
                email=cred.generateEmailId(emp.getfname().toLowerCase(), emp.getlname().toLowerCase(), "Technical");
                break;
            case 2:
                email=cred.generateEmailId(emp.getfname().toLowerCase(), emp.getlname().toLowerCase(), "Admin");
                break;
            case 3:
                email=cred.generateEmailId(emp.getfname().toLowerCase(), emp.getlname().toLowerCase(), "HR");
                break;
            case 4:
                cred.generateEmailId(emp.getfname().toLowerCase(), emp.getlname().toLowerCase(), "Legal");
                break;
            default:
                System.out.println("Please select valid input");
                break;
        }
        password= cred.generatePassword();
        emp.setemailID(email);
        emp.setpassword(password);
        cred.showDetails(emp);
    }
}
