<%-- 
    Document   : viewentries
    Created on : Apr 27, 2019, 3:50:26 PM
    Author     : Matt
--%>

<%@page import="com.journals.Entry"%>
<%@page import="java.util.ArrayList"%>
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
        <h1>Journal Entries</h1>
            <%
            ArrayList<Entry> arrayList = new ArrayList<Entry>();
            if(request.getServletContext().getAttribute("entryList") != null){
                arrayList = (ArrayList<Entry>)request.getServletContext().getAttribute("entryList");
                if(!arrayList.isEmpty()){
                    for(Entry item : arrayList) { %>
                    <div class="list-group">
                        <li class="list-group-item list-group-item flex-column align-items-start">
                        <div class="d-flex w-100 justify-content-between">
                            <h5 class="mb-1"><%=item.getUser()%></h5>
                            <small class="text-muted">3 days ago</small>
                        </div>
                        <p class="mb-1"><%=item.getEntry()%></p>
                        <small class="text-muted">Donec id elit non mi porta.</small>
                        </li>
                    </div>
            <%  }
                }
                }
            %>
       </div>
    </body>
</html>