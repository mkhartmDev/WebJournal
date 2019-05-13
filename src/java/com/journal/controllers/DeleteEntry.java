/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.journal.controllers;

import com.journal.Data.EntryDataAccess;
import com.journal.models.Entry;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Matt
 */
public class DeleteEntry extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         request.getSession();
        String user = (String)request.getSession().getAttribute("username");
        String EntID = request.getParameter("delete"); 
        
        Entry ent = new Entry();
        ent.setEntryid(Integer.parseInt(EntID));
        
        EntryDataAccess dao = new EntryDataAccess();
        try {
            dao.delete(ent);
            response.sendRedirect("welcome.jsp");
        } catch (SQLException ex) {
            Logger.getLogger(AddEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
}
