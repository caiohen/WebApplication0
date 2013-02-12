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
                    <li><a href="#" class="active">Pedido com foward e Redirect</a> <span class="divider">/</span></li>
                </ul>
            </div>
            <div class="container">
                <h3>Ao enviar o pedido, o servlet responderá com o que ele receber.</h3>
                <form action="Controlador?type=foward" method="POST" name="formularioFoward">
                    <input type="text" placeholder="String" name="string" />
                    <button class="btn">Enviar com Foward</button>
                </form>
                <form action="Controlador?type=redirect" method="POST" name="formularioRedirect">
                    <input type="text" placeholder="String" name="string" />
                    <button class="btn">Enviar com Redirect</button>
                </form>
            </div>
        </div>
    </body>
</html>