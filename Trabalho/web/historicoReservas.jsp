<%-- 
    Document   : historicoReservas
    Created on : 28/06/2017, 19:56:58
    Author     : Marcos_Laís
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@include file="/cabecalho.jsp" %>
<h1>Listando todas as Reservas</h1>

        <table class="table table-striped table-bordered table-responsive">
            <thead>
                <tr>

                    <th>Placa</th>
                    <th>Nome</th>
                    <th>Entrada</th>
                    <th>Saída</th>
                    <th>Custo</th>
                    <th>Tempo</th>
                    <%--<th>Vreservada</th>--%>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="vaga" items="${lista}">
                    <tr>
                        <td>${vaga.VPlaca}</td>
                        <td>${vaga.VNome}</td>
                        <td>${vaga.VHentrada}</td>
                        <td>${vaga.VHsaida}</td>
                        <td>${vaga.VHcusto}</td>
                        <td>${vaga.tempo}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>



 <%@include file="/rodape.jsp" %>
