<%-- 
    Document   : index
    Created on : Jan 7, 2013, 5:45:03 PM
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
        <div class="container">
            <div class="page-header">
                Treinando Java
            </div>
            <div class="nav">
                <ul class="breadcrumb">
                    <li><a href="index.jsp" class="">Index</a> <span class="divider">/</span></li>
                    <li><a href="#" class="active">sendRedirect</a> <span class="divider">/</span></li>
                </ul>
            </div>
            <div class="container">
                <h4>Ao clicar em redirecionar, a servlet utilizará o sendRedirect para redirecionar a pagina</h4>
                
                <a href="sendRedirect"><button class="btn btn-primary btn-large" name="redirect"> REDIRECIONAR </button></a>
                
            </div>
        </div>
    </body>
</html>