<%-- 
    Document   : login
    Created on : Apr 20, 2019, 3:45:25 PM
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
        <div class="container-fluid">
            <div class="row">
            <div class="col-md-4 col-sm-4 col-xs-12"></div>
            <div class="col-md-4 col-sm-4 col-xs-10">
                
                <h1>My Online Journal</h1><br>
                <h3>Login</h3><br>
            
            <form action="Login" method="post">
            <div class="form-group">
                <label for="Username">Username</label>
                <input type="text" class="form-control" name="uname"><br>
            </div>
            <div class="form-group">
                <label for="Password">Password</label>
                <input type="password" class="form-control" name="pass"><br>
            </div>
            <input type="submit" class="btn btn-outline-dark" value = "login">
            </form>
        </div>   
    </body>
</html>
