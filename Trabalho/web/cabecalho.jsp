<%-- 
    Document   : cabecalho
    Created on : 08/06/2017, 10:48:45
    Author     : andersonfrare
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
                            
                                                        <%
                            //verifica se a sessao do usuario é válida
                            if ("admin@admin.com".equals( (String) session.getAttribute("user") ) ){
                                out.print("<li id='admin' class='dropdown'>"
                                + " <a href='#' class='dropdown-toggle' data-toggle='dropdown' role='button' aria-haspopup='true' aria-expanded='false'>Admininstrador<span class='caret'></span></a>"
                                +" <ul  class='dropdown-menu'>"
                                 + "   <li><a href='VagaConsultaServlet'>Relatorios</a></li>"
                                   + " <li role='separator' class='divider'></li>"
                                   + " <li class='dropdown-header'>Historico</li>"
                                    + "<li><a href='#'>configuracoes</a></li>" 
                               + " </ul>"
                            + "</li>");
                            }
                            if (session.getAttribute("user") != null){
                              
                            out.print("<li id='vagas' class='dropdown'>"
                                + " <a href='#' class='dropdown-toggle' data-toggle='dropdown' role='button' aria-haspopup='true' aria-expanded='false'>Vagas<span class='caret'></span></a>"
                                +" <ul  class='dropdown-menu'>"
                                 + "   <li><a href='VagaAtualizarServlet'>Verificar vagas</a></li>"
                                   + " <li role='separator' class='divider'></li>"
                                   + " <li class='dropdown-header'>Historico</li>"
                                    + "<li><a href='VagaConsUsuServlet'>Verificar histórico de reservas</a></li>" 
                               + " </ul>"
                            + "</li>");
                            out.print("<li  id='pagam' class='dropdown'>"
                                + "<a href='#' class='dropdown-toggle' data-toggle='dropdown' role='button' aria-haspopup='true' aria-expanded='false'>Pagamento <span class='caret'></span></a>"
                                + "<ul  class='dropdown-menu'>"
                                  + "  <li><a href='telaPagamento.jsp'>Registrar saída e efetuar pagamento</a></li>" 
                                
                               +" </ul>"
                            +" </li>");
                            

                            }
                            %>
                            
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
