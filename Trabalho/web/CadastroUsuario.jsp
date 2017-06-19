<%-- 
    Document   : CadastroUsuario
    Created on : 07/06/2017, 21:13:06
    Author     : Marcos_Laís
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/cabecalho.jsp" %>

<h1>Cadastrar Usuario</h1>
<form action="UsuarioAtuazarServlet" method="POST">

    <label for="nome">Nome: </label><br>
    <input type="text" class="form-control"  id="nome" name="nome" autofocus required />

    <br>

    <label for="email">E-mail: </label><br>
    <input type="email" class="form-control" id="email" name="email"required/>
    <br>
    <label for="senha">Senha: </label><br>
    <input type="password" class="form-control" id="senha" name="senha" placeholder="senha com 6 números" required/>
    <br>
    <label for="placacar">Placa do Carro: </label><br>
    <input type="text" class="form-control" id="placacar" name="placacar"required/>
    <br>
    <label for="modelocar">Modelo do Carro: </label><br>
    <input type="text" class="form-control" id="modelocar" name="modelocar"required/>
    <br>
    <br>
    <input type="submit" class="btn btn-primary" value="Cadastrar" />
</form>
<%@include file="/rodape.jsp" %>