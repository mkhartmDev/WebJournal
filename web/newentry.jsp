<%-- 
    Document   : newentry
    Created on : Apr 27, 2019, 3:55:52 PM
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
        
        <div class="form-group">
        <label for="addentry1">New Journal Entry</label>
        
        </div>
        <form action="AddEntry" method="post">
        <textarea class="form-control" name="jent" rows="4"></textarea>
        <input type="submit" value = "add to my journal">
        </form>
    </body>
</html>
