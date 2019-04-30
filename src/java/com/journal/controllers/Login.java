/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.journal.controllers;

import com.journal.Data.LoginDataAccess;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Matt
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            String uname = request.getParameter("uname");
            String pass = request.getParameter("pass");
            
            LoginDataAccess dao = new LoginDataAccess();
            
            //check against database for login credentials
            if(dao.check(uname, pass))
            {
                HttpSession session = request.getSession();
                session.setAttribute("username", uname);
                response.sendRedirect("welcome.jsp");
            }
            else
            {
                response.sendRedirect("index.jsp");
            }} catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
