<%-- 
    Document   : el
    Created on : Jan 8, 2013, 9:14:30 PM
    Author     : CaioHen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
        <title>JSP Page</title>
    </head>
    <body>
        <%@ include file="header.html" %>
        
        <h3>Impressão com expression language, uma única página</h3>
        <form action="#" method="POST" />
        <input type="text" name="string" placeholder="String" value="${param.string}" /> <button class="btn" type="submit"> Enviar </button> <br />
        <p>String digitada -> <strong> ${param.string} </strong> </p>
        </form>
        
        
        <%@ include file="footer.html" %>
    </body>
</html>
