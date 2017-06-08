<%-- 
    Document   : login
    Created on : 07/06/2017, 21:09:35
    Author     : Marcos_Laís
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/cabecalho.jsp" %>

<h1 class="text-center">Login</h1>
<br>
<div class="row">
    <div class="col-md-8 col-sm-8">
        <form action="VerificacaoServlet" method="post" class="form-horizontal">
            <div class="form-group">
                <label for="nome" class="col-md-2 col-sm-2 control-label">E-mail: </label>
                <div class="col-md-6 col-sm-6">
                    <input type="email"  class=" form-control" id="email" name="email"required/>
                </div>
            </div>
            <div class="form-group">
                <label for="nome" class="col-md-2 col-sm-2 control-label">Senha: </label>
                <div class="col-md-6 col-sm-6">
                    <input type="password" class="form-control" id="senha" name="senha"required/>
                </div>
            </div>
            <div class="col-sm-offset-2 col-md-6 col-sm-6">
                <input id="btnLogar" type="submit" class="btn btn-lg btn-primary btn-block" value="Logar" />
                <a href="#">Esqueceu a senha?</a>
            </div>
        </form>
    </div>


    <div class="col-md-4 col-sm-4">
        <h3>Não é cadastrado?</h3>
        <div class="col-sm-offset-1 col-md-2 col-sm-2">
            <form action="CadastroUsuario.jsp" method="get">
                <input class="btn btn-success" type="submit" value="Criar novo Usuario" />
            </form>
        </div>
    </div>
    <%@include file="/rodape.jsp" %>
