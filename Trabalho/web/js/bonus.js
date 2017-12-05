$(document).ready(function(){
  $.ajax({
    url: 'Pontuacao', 
    type: 'POST',
    data: {
    },
    success: function (data) {
      var usuario = data[0];
      $('#bonus').text(usuario.bonus);
      $('#tempo').text(usuario.tempo);
      $('.progress-bar').css('width',usuario.progresso+'%');
      $('#progress_info').text(Math.floor(usuario.progresso));
    }
  });

  
  
});