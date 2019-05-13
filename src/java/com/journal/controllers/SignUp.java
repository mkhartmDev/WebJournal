/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.journal.controllers;

import com.journal.Data.LoginDataAccess;
import com.journal.models.User;
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
@WebServlet(name = "SignUp", urlPatterns = {"/SignUp"})
public class SignUp extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            String username = request.getParameter("uname");
            String password = request.getParameter("pass");
            String email = request.getParameter("email");

            User user = new User(username, password, email);
            LoginDataAccess Dao = new LoginDataAccess();
        try {
            if(Dao.checkUsr(user))
            {
                response.sendRedirect("signup.jsp");
            }
            else
            {
                Dao.addnew(user);
                request.setAttribute("user", user);
                getServletContext()
                .getRequestDispatcher("/thanks.jsp")
                .forward(request, response);
            }
          
            
        } catch (SQLException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        
    }

}
