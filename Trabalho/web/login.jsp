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
    <script>
      window.fbAsyncInit = function () {
        FB.init({
          appId: '348438355613072',
          autoLogAppEvents: true,
          xfbml: true,
          version: 'v2.10'
        });
        FB.getLoginStatus(function (response) {
          if (response.status === 'connected') {
            console.log('Logged in.');
          } else {

          }
        });
        FB.AppEvents.logPageView();
      };

      (function (d, s, id) {
        var js, fjs = d.getElementsByTagName(s)[0];
        if (d.getElementById(id)) {
          return;
        }
        js = d.createElement(s);
        js.id = id;
        js.src = "//connect.facebook.net/en_US/sdk.js";
        fjs.parentNode.insertBefore(js, fjs);
      }(document, 'script', 'facebook-jssdk'));
    </script>
    <div id="fb-root"></div>
    <script>(function (d, s, id) {
        var js, fjs = d.getElementsByTagName(s)[0];
        if (d.getElementById(id))
          return;
        js = d.createElement(s);
        js.id = id;
        js.src = "//connect.facebook.net/pt_BR/sdk.js#xfbml=1&version=v2.10&appId=138179123462896";
        fjs.parentNode.insertBefore(js, fjs);
      }(document, 'script', 'facebook-jssdk'));
    </script>
    <br><br>

    <form action="UsuarioLoginServlet" method="post" class="form-horizontal">
      <div class="form-group">
        <label for="nome" class="col-md-2 col-sm-2 control-label"></label>
        <div class="col-md-6 col-sm-6">
          <div class="fb-login-button" data-max-rows="1" data-size="large" data-button-type="continue_with" data-show-faces="true" data-auto-logout-link="true" data-use-continue-as="false"></div>
        </div>
      </div>      
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
        <input id="btnLogar" type="submit" class="btn btn-lg btn-primary btn-block btn-login" value="Logar" />
        <a href="recuperaSenha.jsp">Esqueceu a senha?</a>
      </div>
    </form>
  </div>


  <div class="col-md-4 col-sm-4">
    <h3>Não é cadastrado?</h3>
    <div class="col-sm-offset-1 col-md-2 col-sm-2">
      <form action="CadastroUsuario.jsp" method="get">
        <input class="btn btn-success btn-cadasto" type="submit" value="Criar novo Usuario" />
      </form>
    </div>
  </div>
  <%@include file="/rodape.jsp" %>   
