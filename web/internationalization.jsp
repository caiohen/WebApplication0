<%-- 
    Document   : internationalization
    Created on : Jan 8, 2013, 8:41:35 PM
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
        <%@include file="header.html" %>
        
        <div class="btn-group">
            <button class="btn">Português</button>
            <button class="btn">Inglês</button>
            <button class="btn">Alemão</button>
            <button class="btn">Chinês</button>
        </div>
        
        <h1>Internacionalização</h1>
        <p>Internacionalização é um processo de desenvolvimento (ou adaptação) de um software em que se busca criar um software internacional, ou seja, com características tais que permitam que ele se adapte mais facilmente a determinadas características regionais, legais, culturais e técnicas. Esta adaptação pode ser automática (de acordo com parâmetros recebidos, tais como fuso horário, formatos de números, sistemas métricos e moedas) ou manual (como a tradução da interface e adaptações específicas demandadas pelo destinatário do software). Este processo manual posterior é conhecido como localização.</p>
        
        <%@include file="footer.html" %>
    </body>
</html>
