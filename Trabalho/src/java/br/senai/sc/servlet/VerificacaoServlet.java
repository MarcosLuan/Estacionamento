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

/**
 *
 * @author Marcos_Laís
 */
@WebServlet(name = "VerificacaoServlet", urlPatterns = {"/VerificacaoServlet"})
public class VerificacaoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        
        HttpSession session = request.getSession();
        
            if(session.getAttribute("user") != null){
                
                String user = (String) session.getAttribute("user");
                String nome = (String) session.getAttribute("nome");
                

                response.setContentType("text/plain");
                response.getWriter().write("<li class='dropdown'>");
                response.getWriter().write("<a href='#' class='dropdown-toggle' data-toggle='dropdown' role='button' aria-haspopup='true' aria-expanded='false'>"+nome+" <span class='caret'></span></a>"); 
                response.getWriter().write("<ul  class='dropdown-menu'>");
                response.getWriter().write("<li>"+ user+ "</li>");
                response.getWriter().write("<li><a href='UsuarioBuscaServlet'>Atualizar dados</a></li>");
                response.getWriter().write("<li role='separator' class='divider'></li>");
                response.getWriter().write("<li><a href='UsuarioDeslogaServlet'>deslogar</a></li>");
                
                response.getWriter().write("</ul>");
                response.getWriter().write("</li>");
            }else{
                response.setContentType("text/plain");
                response.getWriter().write("<a href='login.jsp'>Login</a>");
            }
        }
    }


