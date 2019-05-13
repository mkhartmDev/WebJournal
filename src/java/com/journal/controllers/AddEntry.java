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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Matt
 */
@WebServlet(name = "AddEntry", urlPatterns = {"/AddEntry"})
public class AddEntry extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.getSession();
        String title = request.getParameter("title"); 
        String entry = request.getParameter("jent"); 
        String user = (String)request.getSession().getAttribute("username");
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        
        Entry ent = new Entry();
        ent.setEntry(entry);
        ent.setUser(user);
        ent.setTs(ts);
        ent.setTitle(title);
        
        EntryDataAccess dao = new EntryDataAccess();
        try {
            dao.add(ent);
            response.sendRedirect("welcome.jsp");
        } catch (SQLException ex) {
            Logger.getLogger(AddEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
       
       
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
