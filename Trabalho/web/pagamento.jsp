<%-- 
    Document   : pagamento
    Created on : 29/05/2017, 15:55:30
    Author     : Erik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="js/jquery-3.2.1.js"></script>
        <script type="text/javascript" src="js/appv-js.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Total a pagar: R$${valor}</h1>
        <br>
        <label for="nome">Informe sua senha: </label><br>
            <input type="password" id="senha">
            <br>
            <br>
            <button id="btn1">Efetuar pagamento</button>
            <div id="div1"></div>
            <br>
            <br><a href='indexx.html'>sair</a>
        
    </body>
</html>
