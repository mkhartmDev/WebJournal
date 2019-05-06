<%-- 
    Document   : welcome
    Created on : Apr 20, 2019, 3:55:21 PM
    Author     : Matt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Online Journal</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link href="css/global.css" type="text/css" rel="stylesheet">
        <script src="libs/jquery-3.4.0.js"></script>
        <script src="libs/bootstrap.min.js"></script>
    </head>
    <body>
        <%
            // security measure so secure page wont be visible after logout
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
            
           if(session.getAttribute("username")==null)
           {
               response.sendRedirect("index.jsp");
           }
         %>
         
         <div class="col-md-8 col-sm-12 col-xs-10">
        <div style="background-color: transparent;" class="jumbotron">
            <h1 class="display-5">Welcome, ${username}</h1>
            <hr class="my-4">
            <div class="container">
            <form action="ViewEntries">
                <input class="btn btn-primary btn-lg btn-block" type="submit" class="btn btn-outline-dark" value="View Journal Entries">
            </form>
            </div>
            <br>
            <div class="container">
            <a class="btn btn-primary btn-lg btn-block" href="newentry.jsp" role="button">New Journal Entry</a>
            </div>
        </div>
        <div class="container">
            <form action="Logout">
                <input type="submit" class="btn btn-outline-dark" value="Logout">
            </form>
        </div>
        </div>

    </body>
</html>
