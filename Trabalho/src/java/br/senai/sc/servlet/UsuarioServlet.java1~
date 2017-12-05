/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.servlet;

import br.senai.sc.DAO.UsuarioDAO;
import br.senai.sc.entity.Usuario;
import br.senai.sc.entity.Vagas;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Marcos_Laís
 */
@WebServlet(name = "UsuarioServlet", urlPatterns = {"/UsuarioServlet"})
public class UsuarioServlet extends HttpServlet {

    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    String nome = request.getParameter("nome");
    String email = request.getParameter("email");
    String senha = request.getParameter("senha");
    String placacar = request.getParameter("placacar");
    String modelocar = request.getParameter("modelocar");
    
    Usuario u = new Usuario(nome, email, senha, placacar, modelocar);
    
    UsuarioDAO udao = new UsuarioDAO();
    
    try {
        udao.insert(u);
        request.getRequestDispatcher("Cadastradas.jsp").forward(request, response);
        
    } catch (Exception ex){
        request.setAttribute("erro", ex.getMessage());
        request.getRequestDispatcher("erro.jsp").forward(request, response);
        
    }
    
    }

}
