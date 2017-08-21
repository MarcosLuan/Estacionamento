<%-- 
    Document   : telaPagamento
    Created on : 27/06/2017, 11:04:44
    Author     : andersonfrare
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/cabecalho.jsp" %>
<ol class="breadcrumb">
  <li><a href="indexx.jsp">Home</a></li>
  <li><a href="telaPagamento.jsp">Pagamento</a></li>
  <li class="active">Tela Pagamento</li>
</ol>
        <h1>Tela para Pagamento</h1>
        <form action="VagasSaidaServlet" method="POST">
           <!--<h2>O valor para pagamento é: <text type="" value="VHsaida * 0.05"></h2><br>-->  
            <br>
            <label for="nome">Por favor, informe a placa do veículo</label>
            <br>
            <br>
            <label for="nome">Placa: </label><br>
            <input type="text" id="placa" name="placa" value="<%String placa = (String) session.getAttribute("placa");
                   out.print(placa);%>"/>
            <br>
            <br>
            <input type="submit" value="OK"/>
            <br><br><a href='indexx.jsp'>voltar</a>
        </form>
 <%@include file="/rodape.jsp" %>

