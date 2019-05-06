/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.journal.Data;

import com.journals.Entry;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Matt
 */
public class EntryDataAccess {
    
    public void add (Entry ent) throws SQLException {
        
        String sql = "insert into entry (User, EDate, Title, Entry) values (?, current_timestamp(), ?, ?)";
        String url = "jdbc:mysql://localhost:3306/journal";
        
        // Database server login credentials 
        String username = "root";
        String password = "password";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, ent.getUser());
            statement.setString(2, ent.getTitle());
            statement.setString(3, ent.getEntry());
            statement.executeUpdate();
            
            
                    } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public ArrayList<Entry> retrieve (String user) throws SQLException
    {
       // table scan, not good for time complexity. could be improved with index
        String sql =  "select * from entry where User = ?";
        String url = "jdbc:mysql://localhost:3306/journal";
        
        // Database server login credentials 
        String username = "root";
        String password = "password";
        
        ArrayList<Entry> arr = new ArrayList<Entry>();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, user);
            ResultSet rs = statement.executeQuery();
            
            while (rs.next()) {
            Entry ent = new Entry();
            ent.setUser(rs.getString("User"));
            ent.setEntry(rs.getString("Entry"));
            ent.setTs(rs.getTimestamp("EDAte"));
            ent.setTitle(rs.getString("Title"));
            ent.setEntryid(rs.getInt("RefNo"));
            arr.add(ent);
            }
           
                    } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return arr;
        
    }
    
    public void delete (Entry ent) throws SQLException {
        
        String sql = " delete from entry where RefNo = ?";
        String url = "jdbc:mysql://localhost:3306/journal";
        
        // Database server login credentials 
        String username = "root";
        String password = "password";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, ent.getEntryid());
            statement.executeUpdate();
            
            
                    } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
}
