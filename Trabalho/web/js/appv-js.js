    /* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function () {
    //alert("JS funcionando legal!!!");//Exemplo
    $('#btn1').click(function (){
        
        $.ajax({
           url:'VagasSaidaServlet',//é o servelt
           type:'GET',       //é o método GET
           
           success: function(response){//retorna uma resposta
                $('#div1').text(response);
           }
        });
        
        //$('#div1').text("Testando o JQuery"); //Exemplo
    });
    
    $('#btnres01').on('click', function() {
        
        var botao = $('#btnres01');
        botao.text('Ocupado');
        botao.removeClass('btn-success');
        botao.addClass('btn-danger');
        botao.addClass('btn-sm');
        
        $.ajax({
           url:'VagaEntradaServlet',//é o servelt
           type:'POST',       //é o método GET
           
           success: function(response){//retorna uma resposta
                $('#btn01').text('Ocupado '+response);
           }
        });
        

        
    })
});