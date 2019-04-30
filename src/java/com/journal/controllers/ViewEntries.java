/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.journal.controllers;

import com.journal.Data.EntryDataAccess;
import com.journals.Entry;
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
 * @author EliteDev
 */
@WebServlet(name = "ViewEntries", urlPatterns = {"/ViewEntries"})
public class ViewEntries extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getSession();
        String user = (String)request.getSession().getAttribute("username");
        EntryDataAccess dao = new EntryDataAccess();
        ArrayList<Entry> arr = new ArrayList<Entry>();
        
        try {
            arr = dao.retrieve(user);
            request.getServletContext().setAttribute("entryList", arr);
            response.sendRedirect("viewentries.jsp");
        } catch (SQLException ex) {
            Logger.getLogger(AddEntry.class.getName()).log(Level.SEVERE, null, ex);
    }

    }
}
