<%-- 
    Document   : VerVagas
    Created on : 14/06/2017, 19:47:59
    Author     : andersonfrare
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/cabecalho.jsp" %>
<ol class="breadcrumb">
  <li><a href="indexx.jsp">Home</a></li>
  <li><a href="VagaAtualizarServlet">Vagas</a></li>
  <li class="active">Vagas Diponíveis</li>
</ol>


    <h1>Vagas Disponíveis</h1>
    <!-- Modal -->
  <div class="modal fade" id="modalVaga" role="dialog">
    <div class="modal-dialog modal-sm">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Mensagem</h4>
        </div>
        <div class="modal-body">
          <p class="alert alert-success reserva" >Vaga reservada!</p>
          <p class="loader">Aguarde...</p>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
    </div>
  </div>
</div>

    <div class="row">
        <div class="col-xs-12 ">
            <div id="planta-baixa">

                <p>.</p>
                
  
                
                <button id="btnres01" class="btn btn-sm ${classBotao1}">${btnres01}</button>

                <button id="btnres02" class="btn btn-sm ${classBotao2}">${btnres02}</button>

                <button id="btnres03" class="btn btn-sm ${classBotao3}">${btnres03}</button>

                <button id="btnres04" class="btn btn-sm ${classBotao4}">${btnres04}</button>

                <button id="btnres05" class="btn btn-sm ${classBotao5}">${btnres05}</button>

                <button id="btnres06" class="btn btn-sm ${classBotao6}">${btnres06}</button>
                
                <button id="btnres07" class="btn btn-sm ${classBotao7}">${btnres07}</button>
                
                <button id="btnres08" class="btn btn-sm ${classBotao8}">${btnres08}</button>
                
                <button id="btnres09" class="btn btn-sm ${classBotao9}">${btnres09}</button>
                
                <button id="btnres10" class="btn btn-sm ${classBotao10}">${btnres10}</button>
                
                <button id="btnres11" class="btn btn-sm ${classBotao11}">${btnres11}</button>
                
                <button id="btnres12" class="btn btn-sm ${classBotao12}">${btnres12}</button>
                
                <button id="btnres13" class="btn btn-sm ${classBotao13}">${btnres13}</button>
                
                <button id="btnres14" class="btn btn-sm ${classBotao14}">${btnres14}</button>
                <p>.</p>
            </div>  
        
    </div>
    <%@include file="/rodape.jsp" %>
