<%-- 
    Document   : recuperaSenha
    Created on : 28/06/2017, 09:04:39
    Author     : andersonfrare
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/cabecalho.jsp" %>
 
<!-- Modal -->
  <div class="modal fade" id="modalSenha" role="dialog">
    <div class="modal-dialog modal-sm">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Mensagem</h4>
        </div>
        <div class="modal-body">
          <p class="alert alert-success" >Sucesso, verifique seu e-mail!</p>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
    </div>
  </div>
</div>


<h1 class="text-center">Recuperar senha</h1>
            
    <label for="email">Digite seu E-mail: </label><br>
    <input type="email" class="form-control" id="email" name="email"required/>
    <br>
            <button class="btn btn-primary">enviar</button>

 <%@include file="/rodape.jsp" %>
