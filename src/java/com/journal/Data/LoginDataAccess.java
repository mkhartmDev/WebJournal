/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.journal.Data;


import com.journal.models.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Matt
 */
public class LoginDataAccess 
{
    
    //Database server credentials
    String DataUsername = "root";
    String DataPassword = "password";
    
    
    public boolean check (String uname, String pass) throws SQLException
    {
        String sql = "select * from login where username=? and password=?";
        String url = "jdbc:mysql://localhost:3306/journal";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, DataUsername, DataPassword);
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, uname);
            statement.setString(2, pass);
            ResultSet rs = statement.executeQuery();
            if(rs.next())
            {
                return true;
            }
            
            
                    } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    public void addnew (User usr) throws SQLException{
        
         String sql = "insert into login (username, password, email) values (?,?,?);";
         String url = "jdbc:mysql://localhost:3306/journal";
        
        // Database server login credentials 
        String username = "root";
        String password = "password";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, DataUsername, DataPassword);
            
            //check if user already exists
            // for now we will just send a redirect back to signup
            
            
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, usr.getUsername());
            statement.setString(2, usr.getPassword());
            statement.setString(3, usr.getEmail());
            statement.executeUpdate();
            
            
                    } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public boolean checkUsr(User user) throws SQLException{
        
        String sql = "select * from login where username=?";
        String url = "jdbc:mysql://localhost:3306/journal";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, DataUsername, DataPassword);
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, user.getUsername());
            ResultSet rs = statement.executeQuery();
            if(rs.next())
            {
                return true;
            }
            
             } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
            
        }
        
        
            
        
    }
  
