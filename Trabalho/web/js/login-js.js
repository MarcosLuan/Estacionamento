
$(document).ready(function () {
    //alert("JS funcionando legal!!!");//Exemplo
    //$('#btnLogar').click(function () {

        $.ajax({
            url: 'VerificacaoServlet', //é o servelt
            type: 'POST', //é o método GET
            data: {//vai as variáveis do projeto
                email: $('#email').val(),
                senha: $('#senha').val()
            },
            success: function (response) {//retorna uma resposta
                $('#Login').text(response);
            }
        });
   // });
});
