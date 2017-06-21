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
    });
        
        //$('#div1').text("Testando o JQuery"); //Exemplo
    });
    
    $('#btnres01').on('click', function() {
        
        var botao = $('#btnres01');
        //botao.text('Ocupado');
        botao.removeClass('btn-success');
        botao.addClass('btn-danger');
        botao.addClass('btn-sm');
        
        $.ajax({
           url:'VagaEntradaServlet',//é o servelt
           type:'POST',       //é o método GET
           
           success: function(response){//retorna uma resposta
                $('#btnres01').text('Ocupado '+response);
           }
        });
    });
        
        $('#btnres02').on('click', function() {
        
        var botao = $('#btnres02');
        //botao.text('Ocupado');
        botao.removeClass('btn-success');
        botao.addClass('btn-danger');
        botao.addClass('btn-sm');
        
        $.ajax({
           url:'VagaEntradaServlet',//é o servelt
           type:'POST',       //é o método GET
           
           success: function(response){//retorna uma resposta
                $('#btnres02').text('Ocupado '+response);
           }
        });
    });
        
        $('#btnres03').on('click', function() {
        
        var botao = $('#btnres03');
        //botao.text('Ocupado');
        botao.removeClass('btn-success');
        botao.addClass('btn-danger');
        botao.addClass('btn-sm');
        
        $.ajax({
           url:'VagaEntradaServlet',//é o servelt
           type:'POST',       //é o método GET
           
           success: function(response){//retorna uma resposta
                $('#btnres03').text('Ocupado '+response);
           }
        });
    });
        
        $('#btnres04').on('click', function() {
        
        var botao = $('#btnres04');
        //botao.text('Ocupado');
        botao.removeClass('btn-success');
        botao.addClass('btn-danger');
        botao.addClass('btn-sm');
        
        $.ajax({
           url:'VagaEntradaServlet',//é o servelt
           type:'POST',       //é o método GET
           
           success: function(response){//retorna uma resposta
                $('#btnres04').text('Ocupado '+response);
           }
        });
    });
    
    $('#btnres05').on('click', function() {
        
        var botao = $('#btnres05');
        //botao.text('Ocupado');
        botao.removeClass('btn-success');
        botao.addClass('btn-danger');
        botao.addClass('btn-sm');
        
        $.ajax({
           url:'VagaEntradaServlet',//é o servelt
           type:'POST',       //é o método GET
           
           success: function(response){//retorna uma resposta
                $('#btnres05').text('Ocupado '+response);
           }
        });
    });
    
    $('#btnres06').on('click', function() {
        
        var botao = $('#btnres06');
        //botao.text('Ocupado');
        botao.removeClass('btn-success');
        botao.addClass('btn-danger');
        botao.addClass('btn-sm');
        
        $.ajax({
           url:'VagaEntradaServlet',//é o servelt
           type:'POST',       //é o método GET
           
           success: function(response){//retorna uma resposta
                $('#btnres06').text('Ocupado '+response);
           }
        });
    });
    
    $('#btnres07').on('click', function() {
        
        var botao = $('#btnres07');
        //botao.text('Ocupado');
        botao.removeClass('btn-success');
        botao.addClass('btn-danger');
        botao.addClass('btn-sm');
        
        $.ajax({
           url:'VagaEntradaServlet',//é o servelt
           type:'POST',       //é o método GET
           
           success: function(response){//retorna uma resposta
                $('#btnres07').text('Ocupado '+response);
           }
        });
    });
    
    $('#btnres08').on('click', function() {
        
        var botao = $('#btnres08');
        //botao.text('Ocupado');
        botao.removeClass('btn-success');
        botao.addClass('btn-danger');
        botao.addClass('btn-sm');
        
        $.ajax({
           url:'VagaEntradaServlet',//é o servelt
           type:'POST',       //é o método GET
           
           success: function(response){//retorna uma resposta
                $('#btnres08').text('Ocupado '+response);
           }
        });
    });
    
    $('#btnres09').on('click', function() {
        
        var botao = $('#btnres09');
        //botao.text('Ocupado');
        botao.removeClass('btn-success');
        botao.addClass('btn-danger');
        botao.addClass('btn-sm');
        
        $.ajax({
           url:'VagaEntradaServlet',//é o servelt
           type:'POST',       //é o método GET
           
           success: function(response){//retorna uma resposta
                $('#btnres09').text('Ocupado '+response);
           }
        });
    });
    
    $('#btnres10').on('click', function() {
        
        var botao = $('#btnres10');
        //botao.text('Ocupado');
        botao.removeClass('btn-success');
        botao.addClass('btn-danger');
        botao.addClass('btn-sm');
        
        $.ajax({
           url:'VagaEntradaServlet',//é o servelt
           type:'POST',       //é o método GET
           
           success: function(response){//retorna uma resposta
                $('#btnres10').text('Ocupado '+response);
           }
        });
    });
    
    $('#btnres11').on('click', function() {
        
        var botao = $('#btnres11');
        //botao.text('Ocupado');
        botao.removeClass('btn-success');
        botao.addClass('btn-danger');
        botao.addClass('btn-sm');
        
        $.ajax({
           url:'VagaEntradaServlet',//é o servelt
           type:'POST',       //é o método GET
           
           success: function(response){//retorna uma resposta
                $('#btnres11').text('Ocupado '+response);
           }
        });
    });
    
    $('#btnres12').on('click', function() {
        
        var botao = $('#btnres12');
        //botao.text('Ocupado');
        botao.removeClass('btn-success');
        botao.addClass('btn-danger');
        botao.addClass('btn-sm');
        
        $.ajax({
           url:'VagaEntradaServlet',//é o servelt
           type:'POST',       //é o método GET
           
           success: function(response){//retorna uma resposta
                $('#btnres12').text('Ocupado '+response);
           }
        });
    });
    
    $('#btnres13').on('click', function() {
        
        var botao = $('#btnres13');
        //botao.text('Ocupado');
        botao.removeClass('btn-success');
        botao.addClass('btn-danger');
        botao.addClass('btn-sm');
        
        $.ajax({
           url:'VagaEntradaServlet',//é o servelt
           type:'POST',       //é o método GET
           
           success: function(response){//retorna uma resposta
                $('#btnres13').text('Ocupado '+response);
           }
        });
    });
    
    $('#btnres14').on('click', function() {
        
        var botao = $('#btnres14');
        //botao.text('Ocupado');
        botao.removeClass('btn-success');
        botao.addClass('btn-danger');
        botao.addClass('btn-sm');
        
        $.ajax({
           url:'VagaEntradaServlet',//é o servelt
           type:'POST',       //é o método GET
           
           success: function(response){//retorna uma resposta
                $('#btnres14').text('Ocupado '+response);
           }
        });
    });