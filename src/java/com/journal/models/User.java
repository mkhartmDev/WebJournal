/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.journal.models;

/**
 *
 * @author Matt
 */
public class User {
    
    private String username;
    private String password;
    private String email;
    
    public User(String u, String p, String e){
        this.username = u;
        this.password = p;
        this.email = e;
    }

    /**
     * @return the login
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param login the login to set
     */
    public void setUsername(String user) {
        this.username = user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
}
