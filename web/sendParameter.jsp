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
                    <li><a href="#" class="active">Enviando Param entre Servlets</a> <span class="divider">/</span></li>
                </ul>
            </div>
            <div class="container">
                <h4>Ao enviar, a informação implementará um objeto que será enviado a uma servlet impressora.<br /> A servlet impressora capta o objeto, por parametros, e imprime suas propriedades.</h4>
                <form action="parameterReader" method='POST' name="formParameterReader">
                    <input name="firstName" type="text" class="span3" placeholder="Primeiro Nome" /> 
                    <input name="lastName" type="text" class="span3" placeholder="Ultimo Nome" /> <br />
                    <input name="nickname" type="text" class="span3" placeholder="Apelido" /> 
                    <input name="age" type="text" class="span2" placeholder="idade" /> <br />
                    <input name="email" type="text" class="span4" placeholder="Email" /> <br />
                    <input name="address" type="text" class="span4" placeholder="Endereco" /> <br />
                    <button name="submit" type="submit" class="btn"> Enviar </button>
                </form>
            </div>
        </div>
    </body>
</html>