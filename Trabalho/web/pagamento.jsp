<%-- 
    Document   : pagamento
    Created on : 29/05/2017, 15:55:30
    Author     : Erik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/cabecalho.jsp" %>

    
        <h1>Total a pagar: R$${valor}</h1>
        <br>
        <label for="nome">Informe sua senha: </label><br>
            <input type="password" id="senha">
            <br>
            <br>
            <button id="btn1">Efetuar pagamento</button>
            <div id="div1"></div>
            <br>
            <br><a href='indexx.jsp'>sair</a>
            <%@include file="/rodape.jsp" %>
