<%-- 
    Document   : login
    Created on : 07/06/2017, 21:09:35
    Author     : Marcos_Laís
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@include file="/cabecalho.jsp" %>

<h1 class="text-center">Login</h1>
<c:if test="${mensagem != ''}">
  <p class="${class}" style="text-align: center;">${mensagem}</p>
</c:if>

<div class="col-md-6 col-sm-12">

  <div class="row">
    <!-- Facebook -->
    <div class="fb-login-button" data-max-rows="1" data-size="large" data-button-type="continue_with" data-show-faces="false" data-auto-logout-link="true" data-use-continue-as="false"></div>
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
        if (d.getElementById(id))
          return;
        js = d.createElement(s);
        js.id = id;
        js.src = "//connect.facebook.net/pt_BR/sdk.js#xfbml=1&version=v2.10";
        fjs.parentNode.insertBefore(js, fjs);
      }(document, 'script', 'facebook-jssdk'));
    </script>
    <!-- Fim Facebook -->
    
    <br><br>
    
  </div>
  <div class="row">
    <!-- Google -->
    <div class="g-signin2" data-onsuccess="onSignIn" data-theme="dark"></div>
    <script>
      function onSignIn(googleUser) {
        var profile = googleUser.getBasicProfile();
        console.log("ID: " + profile.getId());
        console.log('Full Name: ' + profile.getName());
        console.log('Given Name: ' + profile.getGivenName());
        console.log('Family Name: ' + profile.getFamilyName());
        console.log("Image URL: " + profile.getImageUrl());
        console.log("Email: " + profile.getEmail());

        // The ID token you need to pass to your backend:
        var id_token = googleUser.getAuthResponse().id_token;
        console.log("ID Token: " + id_token);
      }
      ;
    </script>
    <!-- Fim Google -->
    
    <br>
    
  </div>
  <div class="row">
    <!-- LinkedIn -->
    <script type="in/Login"></script>
    <script type="text/javascript" src="//platform.linkedin.com/in.js">
    api_key: 78nr4vm07lxnb9
    authorize: true
    onLoad: onLinkedInLoad
</script>

<script type="text/javascript">
    
    // Setup an event listener to make an API call once auth is complete
    function onLinkedInLoad() {
        IN.Event.on(IN, "auth", getProfileData);
    }

    // Handle the successful return from the API call
    function onSuccess(data) {
        console.log(data);
    }

    // Handle an error response from the API call
    function onError(error) {
        console.log(error);
    }

    // Use the API call wrapper to request the member's basic profile data
    function getProfileData() {
        IN.API.Raw("/people/~").result(onSuccess).error(onError);
    }

</script>
    <!-- Fim LinkedIn -->
  </div>
  
  <br>

  <div class="row">
    <!-- Formulario -->
    <form action="UsuarioLoginServlet" method="post" class="form-horizontal">
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
    <!-- Fim Formulario -->
  </div>
</div>

<!------------------------------- Lado direito -->
<div class="col-md-6 col-sm-12 ladodir">
  <div class="row">
    <h3>Não é cadastrado?</h3>
    <div class="col-sm-offset-1 col-md-2 col-sm-2">
      <form action="CadastroUsuario.jsp" method="get">
        <input class="btn btn-success btn-cadasto" type="submit" value="Criar novo Usuario" />
      </form>
    </div>
  </div>

  <br>

  <div class="row">
    <div id="fb-root"></div>
    <script>(function (d, s, id) {
        var js, fjs = d.getElementsByTagName(s)[0];
        if (d.getElementById(id))
          return;
        js = d.createElement(s);
        js.id = id;
        js.src = "//connect.facebook.net/pt_BR/sdk.js#xfbml=1&version=v2.10";
        fjs.parentNode.insertBefore(js, fjs);
      }(document, 'script', 'facebook-jssdk'));</script>
    <div class="fb-share-button" data-href="https://developers.facebook.com/docs/plugins/" data-layout="button" data-size="large" data-mobile-iframe="true"><a class="fb-xfbml-parse-ignore" target="_blank" href="https://www.facebook.com/sharer/sharer.php?u=https%3A%2F%2Fdevelopers.facebook.com%2Fdocs%2Fplugins%2F&amp;src=sdkpreparse">Compartilhar</a>
    </div>
  </div>

  <br>

  <div class="row">
    <script src="//platform.linkedin.com/in.js" type="text/javascript"> lang: pt_BR</script>
    <script type="IN/Share" data-counter="right"></script>
  </div>

  <br>

  <div class="row">
    <a href="https://twitter.com/share" class="twitter-share-button" data-size="large">Tweet</a>
    <script>!function (d, s, id) {
        var js, fjs = d.getElementsByTagName(s)[0], p = /^http:/.test(d.location) ? 'http' : 'https';
        if (!d.getElementById(id)) {
          js = d.createElement(s);
          js.id = id;
          js.src = p + '://platform.twitter.com/widgets.js';
          fjs.parentNode.insertBefore(js, fjs);
        }
      }(document, 'script', 'twitter-wjs');
    </script>
  </div>
</div>
<!------------------------------- Fim Lado direito -->



<%@include file="/rodape.jsp" %>