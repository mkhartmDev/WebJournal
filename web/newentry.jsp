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
        <div class="col-md-8 col-sm-12 col-xs-10">
        <h1>New Journal Entry</h1>
        <hr class="my-4">
       
        <div class ="container">
        <label for="title">Title</label>
        <form action="AddEntry" method="post">
        <input type="text" class="form-control" name="title" maxlength = "75"><br>
        <label for="jent">Entry</label>
        <textarea class="form-control" name="jent" rows="4"></textarea>
        <br>
        <input class="btn btn-outline-dark" type="submit" value = "Add to Journal">
        </form>
        </div>
        <br>
        <div class="container">
            <a class="btn btn-outline-danger btn-sm" href="welcome.jsp" role="button">Discard</a>
        <div>
        </div>
        
    </body>
</html>
