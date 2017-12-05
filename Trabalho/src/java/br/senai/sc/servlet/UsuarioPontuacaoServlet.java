/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.servlet;

import br.senai.sc.DAO.UsuarioDAO;
import br.senai.sc.entity.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Marcos_Laís
 */
@WebServlet(name = "Pontuacao", urlPatterns = {"/Pontuacao"})
public class UsuarioPontuacaoServlet extends HttpServlet {

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {

    String turista = request.getParameter("turista");
    String viajante = request.getParameter("viajante");
    String visitante = request.getParameter("visitante");
    String decasa = request.getParameter("decasa");
    String morador = request.getParameter("morador");
    String aposentado = request.getParameter("aposentado");
    String rei = request.getParameter("rei");
    HttpSession session = request.getSession();
    String email = (String) session.getAttribute("user");
    int bonus = 0;

    Usuario usuario = new Usuario();
    UsuarioDAO uDao = new UsuarioDAO();
    try {
      usuario = uDao.BuscarUsuariobyEmail(email);
    } catch (Exception ex) {
      Logger.getLogger(UsuarioPontuacaoServlet.class.getName()).log(Level.SEVERE, null, ex);
    }
    int tempoUsuario = usuario.getTempo();
    double progresso = 0 ;
    if (tempoUsuario >= 10000) {
      bonus = 300;
      progresso = 100d;
    } else if (tempoUsuario >= 7000) {
      bonus = 180;
      progresso = (tempoUsuario /10000d) * 100; 
    } else if (tempoUsuario >= 5000) {
      bonus = 120;
      progresso = (tempoUsuario /7000d) * 100;
    } else if (tempoUsuario >= 3250) {
      bonus = 90;
      progresso = (tempoUsuario /5000d) * 100;
    } else if (tempoUsuario >= 2750) {
      bonus = 60;
      progresso = (tempoUsuario /3250d) * 100;
    } else if (tempoUsuario >= 1250) {
      bonus = 45;
      progresso = (tempoUsuario /2750d) * 100;
    } else if (tempoUsuario >= 500) {
      progresso = (tempoUsuario /1250d) * 100;
      bonus = 30;
    }
       try {  
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    response.setContentType("application/json");
    JSONArray json = new JSONArray();
    JSONObject jsonObject = new JSONObject();
    jsonObject.put("bonus", bonus);
    jsonObject.put("tempo", tempoUsuario);
    jsonObject.put("progresso",progresso);
    json.put(jsonObject);
    PrintWriter out = response.getWriter();

    out.print(json);
    } catch (JSONException e) {  
                     e.printStackTrace();  
                }  

//    response.setContentType("text/plain");
    //Integer.toString(bonus);
//    response.getWriter().write(""+bonus);
  }
}
