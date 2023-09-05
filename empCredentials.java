/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gl.service;

import com.gl.model.employee;

/**
 *
 * @author Nikita
 */
public interface empCredentials {
    String generateEmailId(String fname, String lname, String dept);
    String generatePassword();
    void showDetails(employee e);
}

