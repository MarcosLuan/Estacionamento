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
    $('.btn').on('click',function(){ // Abre modal
        $('#modalVaga').modal('show');
    });
    $('.btn').on('click',function(){ // Abre modal
        $('#modalSenha').modal('show');
    });
    
    $('#btnres01').on('click', function() {
        
        console.log(this.id);
        var botao = $('#btnres01');
        //botao.text('Ocupada ');
        
        botao.addClass('btn-danger');
        botao.addClass('btn-sm');
        
        $.ajax({
           url:'VagaEntradaServlet',//é o servelt
           type:'POST',
           data:{
               Vreservada: this.id
           },
           
           success: function(response){//retorna uma resposta
                $('#btnres01').text('Ocupada  '+response);
           }
        });
    });
        
        $('#btnres02').on('click', function() {
        console.log(this.id);
        var botao = $('#btnres02');
        //botao.text('Ocupada ');
        
        botao.addClass('btn-danger');
        botao.addClass('btn-sm');
        
        $.ajax({
           url:'VagaEntradaServlet',//é o servelt
           type:'POST',
           data:{
               Vreservada: this.id
           },
           
           success: function(response){//retorna uma resposta
                $('#btnres02').text('Ocupada  '+response);
           }
        });
    });
        
        $('#btnres03').on('click', function() {
        
        var botao = $('#btnres03');
        //botao.text('Ocupada ');
        botao.removeClass('btn-success');
        botao.addClass('btn-danger');
        botao.addClass('btn-sm');
        
        $.ajax({
           url:'VagaEntradaServlet',//é o servelt
           type:'POST',       //é o método GET
           data:{
               Vreservada: this.id
           },
           
           success: function(response){//retorna uma resposta
                $('#btnres03').text('Ocupada  '+response);
           }
        });
    });
        
        $('#btnres04').on('click', function() {
        
        var botao = $('#btnres04');
        //botao.text('Ocupada ');
        botao.removeClass('btn-success');
        botao.addClass('btn-danger');
        botao.addClass('btn-sm');
        
        $.ajax({
           url:'VagaEntradaServlet',//é o servelt
           type:'POST',       //é o método GET
           data:{
               Vreservada: this.id
           },
           
           success: function(response){//retorna uma resposta
                $('#btnres04').text('Ocupada  '+response);
           }
        });
    });
    
    $('#btnres05').on('click', function() {
        
        var botao = $('#btnres05');
        //botao.text('Ocupada ');
        botao.removeClass('btn-success');
        botao.addClass('btn-danger');
        botao.addClass('btn-sm');
        
        $.ajax({
           url:'VagaEntradaServlet',//é o servelt
           type:'POST',       //é o método GET
           data:{
               Vreservada: this.id
           },
           
           success: function(response){//retorna uma resposta
                $('#btnres05').text('Ocupada  '+response);
           }
        });
    });
    
    $('#btnres06').on('click', function() {
        
        var botao = $('#btnres06');
        //botao.text('Ocupada ');
        botao.removeClass('btn-success');
        botao.addClass('btn-danger');
        botao.addClass('btn-sm');
        
        $.ajax({
           url:'VagaEntradaServlet',//é o servelt
           type:'POST',       //é o método GET
           data:{
               Vreservada: this.id
           },
           
           success: function(response){//retorna uma resposta
                $('#btnres06').text('Ocupada  '+response);
           }
        });
    });
    
    $('#btnres07').on('click', function() {
        
        var botao = $('#btnres07');
        //botao.text('Ocupada ');
        botao.removeClass('btn-success');
        botao.addClass('btn-danger');
        botao.addClass('btn-sm');
        
        $.ajax({
           url:'VagaEntradaServlet',//é o servelt
           type:'POST',       //é o método GET
           data:{
               Vreservada: this.id
           },
           
           success: function(response){//retorna uma resposta
                $('#btnres07').text('Ocupada  '+response);
           }
        });
    });
    
    $('#btnres08').on('click', function() {
        
        var botao = $('#btnres08');
        //botao.text('Ocupada ');
        botao.removeClass('btn-success');
        botao.addClass('btn-danger');
        botao.addClass('btn-sm');
        
        $.ajax({
           url:'VagaEntradaServlet',//é o servelt
           type:'POST',       //é o método GET
           data:{
               Vreservada: this.id
           },
           
           success: function(response){//retorna uma resposta
                $('#btnres08').text('Ocupada  '+response);
           }
        });
    });
    
    $('#btnres09').on('click', function() {
        
        var botao = $('#btnres09');
        //botao.text('Ocupada ');
        botao.removeClass('btn-success');
        botao.addClass('btn-danger');
        botao.addClass('btn-sm');
        
        $.ajax({
           url:'VagaEntradaServlet',//é o servelt
           type:'POST',       //é o método GET
           data:{
               Vreservada: this.id
           },
           
           success: function(response){//retorna uma resposta
                $('#btnres09').text('Ocupada  '+response);
           }
        });
    });
    
    $('#btnres10').on('click', function() {
        
        var botao = $('#btnres10');
        //botao.text('Ocupada ');
        botao.removeClass('btn-success');
        botao.addClass('btn-danger');
        botao.addClass('btn-sm');
        
        $.ajax({
           url:'VagaEntradaServlet',//é o servelt
           type:'POST',       //é o método GET
           data:{
               Vreservada: this.id
           },
           
           success: function(response){//retorna uma resposta
                $('#btnres10').text('Ocupada  '+response);
           }
        });
    });
    
    $('#btnres11').on('click', function() {
        
        var botao = $('#btnres11');
        //botao.text('Ocupada ');
        botao.removeClass('btn-success');
        botao.addClass('btn-danger');
        botao.addClass('btn-sm');
        
        $.ajax({
           url:'VagaEntradaServlet',//é o servelt
           type:'POST',       //é o método GET
           data:{
               Vreservada: this.id
           },
           
           success: function(response){//retorna uma resposta
                $('#btnres11').text('Ocupada  '+response);
           }
        });
    });
    
    $('#btnres12').on('click', function() {
        
        var botao = $('#btnres12');
        //botao.text('Ocupada ');
        botao.removeClass('btn-success');
        botao.addClass('btn-danger');
        botao.addClass('btn-sm');
        
        $.ajax({
           url:'VagaEntradaServlet',//é o servelt
           type:'POST',       //é o método GET
           data:{
               Vreservada: this.id
           },
           
           success: function(response){//retorna uma resposta
                $('#btnres12').text('Ocupada  '+response);
           }
        });
    });
    
    $('#btnres13').on('click', function() {
        
        var botao = $('#btnres13');
        //botao.text('Ocupada ');
        botao.removeClass('btn-success');
        botao.addClass('btn-danger');
        botao.addClass('btn-sm');
        
        $.ajax({
           url:'VagaEntradaServlet',//é o servelt
           type:'POST',       //é o método GET
           data:{
               Vreservada: this.id
           },
           
           success: function(response){//retorna uma resposta
                $('#btnres13').text('Ocupada  '+response);
           }
        });
    });
    
    $('#btnres14').on('click', function() {
        
        var botao = $('#btnres14');
        //botao.text('Ocupada ');
        botao.removeClass('btn-success');
        botao.addClass('btn-danger');
        botao.addClass('btn-sm');
        
        $.ajax({
           url:'VagaEntradaServlet',//é o servelt
           type:'POST',       //é o método GET
           data:{
               Vreservada: this.id
           },
           
           success: function(response){//retorna uma resposta
                $('#btnres14').text('Ocupada  '+response);
           }
        });
    });