<%-- 
    Document   : CadastroUsuario
    Created on : 07/06/2017, 21:13:06
    Author     : Marcos_Laís
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/cabecalho.jsp" %>

<h1>Atualizar Dados</h1>
<form action="UsuarioAtualizarServlet" method="POST">
     <input type="hidden" name="email" value="${usuario.email}">

    <label for="nome">Nome: </label><br>
    <input type="text" class="form-control"  id="nome" name="nome" value="${usuario.nome}"    autofocus required />

    <br>
    <label for="senha">Senha: </label><br>
    <input type="password" class="form-control" id="senha" name="senha" placeholder="senha com 6 números" value="${usuario.senha}" required/>
    <br>
    <label for="placacar">Placa do Carro: </label><br>
    <input type="text" class="form-control" id="placacar" name="placacar" value ="${usuario.placacar}" required/>
    <br>
    <label for="modelocar">Modelo do Carro: </label><br>
    <input type="text" class="form-control" id="modelocar" name="modelocar" value ="${usuario.modelocar}"required/>
    <br>
    <br>
    <%--<input type="submit" class="btn btn-primary" value="Atualizar" />--%>
    <button class="btn btn-primary glyphicon glyphicon-floppy-disk btn-salvar"> Salvar</button>
</form>
<%@include file="/rodape.jsp" %>
