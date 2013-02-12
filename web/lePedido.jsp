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
                    <li><a href="#" class="active">lePedido</a> <span class="divider">/</span></li>
                </ul>
            </div>
            <div class="container">
                <h2>Ao enviar, a servlet lerá o pedido</h2>
                <form name="lePedido" action="lePedido" method="POST">
                    <label for="selectCategoria"> Categoria </label>
                    <select name="selectCategoria" id="selectCategoria">
                        <option>Book</option>
                        <option>CD</option>
                        <option>DVD</option>
                    </select>
                    
                    <label for="productField"> Product </label>
                    <input type="text" name="product" id="productField" class="span3" />
                    
                    <label for="payment"> Payment </label>
                    <input type="radio" name="payment" id="payment" value="1" /> Boleto
                    <input type="radio" name="payment" id="payment" value="2" /> Cartão
                    
                    <label for="optionals"> Opcionals </label>
                    <input type="checkbox" name="presentPackage" id="embrulhoOptionals" value="embrulho"/>Embrulho para Presente<br />
                    <input type="checkbox" name="presentPackage" id="cartaoOptionals" value="cartao"/>Cartão<br /><br /><br />
                    
                    <button type="submit" class="btn"> Submit All </button>
                </form>
            </div>
        </div>
    </body>
</html>