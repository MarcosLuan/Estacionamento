<%-- 
    Document   : cabecalho
    Created on : 08/06/2017, 10:48:45
    Author     : marcos_laís
--%>

<%@page import="java.lang.String"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
  <head>
    <title>Estacionamento Online</title>
    <meta charset="UTF-8">
    <meta name="google-signin-scope" content="profile email">
    <meta name="google-signin-client_id" content="939508598651-b77pcu0efq78mcgrd592t9jjh6s0sskq.apps.googleusercontent.com">
    <script src="https://apis.google.com/js/platform.js" async defer></script>
    <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/Principal.css"/>
    <link rel="SHORTCUT ICON" href="img/favicon.ico"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  </head>
  <body>    
    <!-- Static navbar -->
    <nav class="navbar navbar-default">
      <div class="container-fluid nav-cabeca">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Estacionamento Online</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            <li><a href="indexx.jsp"><span class = "glyphicon glyphicon-home"></span> Home</a></li>
              <%//verifica se a sessao do usuario é válida
                if ("admin@admin.com".equals((String) session.getAttribute("user"))) {%>
            <li id="admin" class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Admininstrador<span class="caret"></span></a>
              <ul  class="dropdown-menu">
                <li><a href="VagaConsultaServlet">Relatorios</a></li>
                <li role="separator" class="divider"></li>
                <li class="dropdown-header">Historico</li>
                <li><a href="#">configuracoes</a></li>
              </ul>
            </li>
            <%}
              if (session.getAttribute("user") != null) {%>

            <li id="vagas" class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Vagas<span class="caret"></span></a>
              <ul  class="dropdown-menu">
                <li><a href="VagaAtualizarServlet">Verificar vagas</a></li>
              </ul>
            </li>
            <li  id="pagam" class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"> <span class = "glyphicon glyphicon-usd"></span> Pagamento <span class="caret"></span></a>
              <ul  class="dropdown-menu">
                <li><a href="telaPagamento.jsp">Registrar saída e efetuar pagamento</a></li>
                <li role="separator" class="divider"></li>
                <li class="dropdown-header">Historico</li>
                <li><a href="VagaConsUsuServlet">histórico de Pagamento</a></li>
              </ul>
            </li>

            <li id="Pontuação" class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"> <span class = "glyphicon glyphicon-star-empty"></span> Pontuação<span class="caret"></span></a>
              <ul  class="dropdown-menu">
                <li><a href="bonus.jsp">Bônus Acumulado</a></li>
                <li><a href="helpPontos.jsp">Como Ganhar Pontos</a></li>
                <li><a href="xxxxxxxxxxxxx">Indicar amigos</a></li>
              </ul>
            </li>
            <ul class="nav navbar-nav navbar-left " style="padding: 15px; border-left: 1px solid #1f8620" >
              <li class="progress" style="margin-bottom: 0 !important" >
                
                <div class="progress-bar progress-bar-striped active" 
                     role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 45%; color: black;height: 20px; ">
                  <span id="progress_info">0</span>% Complete"
                </div>
              </li>
            </ul>
            <ul>  <li><span id="tempo"></span> minutos estacionados</li></ul>

            <%}%>
          </ul>
          <ul id="Login" class="nav navbar-nav navbar-right">                            
          </ul>
        </div><!--/.nav-collapse -->
      </div><!--/.container-fluid -->
    </nav>
    <main class="container">
      <%--script type="text/javascript">
          document.getElementById("vagas").style.display = "none";
          document.getElementById("pagam").style.display = "none";
      </script--%>
