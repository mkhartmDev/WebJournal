<%-- 
    Document   : thanks
    Created on : May 12, 2019, 4:49:10 PM
    Author     : Matt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Online Journal Login</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link href="css/global.css" type="text/css" rel="stylesheet">
        <script src="libs/jquery-3.4.0.js"></script>
        <script src="libs/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="col-md-8 col-sm-12 col-xs-10">
        <h1>You are now registered for My Online Journal!</h1>
        
        
        <br>
        <h2>Here is your login information</h2>
        <br>

        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
        
        <label>Email:</label>
        <span><c:out value="${user.email}" /></span>
        <br>
        
        <label>User Name:</label>
        <span><c:out value="${user.username}" /></span>
        <br>
        
        <label>Password:</label>
        <span><c:out value="${user.password}" /></span>
        <br>
        
        <br>
        <a class="btn btn-outline-dark" href="index.jsp" role="button">Go to Login</a>
        
        
        </div>
    </body>
</html>
