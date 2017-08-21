<%-- 
    Document   : teste
    Created on : 05/06/2017, 23:25:46
    Author     : andersonfrare
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/cabecalho.jsp" %>
<%= session.getAttribute("user") %>
                        
            <h1 class="${class}">${mensagem}</h1>
            <br><a href='indexx.jsp'>voltar</a>
            </main>
            
      <script src="js/jquery.min.js"></script>
      <script src="bootstrap/js/bootstrap.min.js"></script>
    </body>
</html>
