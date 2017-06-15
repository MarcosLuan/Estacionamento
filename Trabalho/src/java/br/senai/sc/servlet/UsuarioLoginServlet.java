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
 * @author andersonfrare
 */
@WebServlet(name = "UsuarioLoginServlet", urlPatterns = {"/UsuarioLoginServlet"})
public class UsuarioLoginServlet extends HttpServlet {

    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
     String email = request.getParameter("email");
        String senha = request.getParameter("senha");

        UsuarioDAO uDAO = new UsuarioDAO();
        HttpSession session = request.getSession();
        
        
            Usuario usuario;
        try {
            usuario = uDAO.BuscarUsuario(email, senha);
            if (usuario == null) {
                String mensagem = "Usuario ou senha nao encontrado";
                request.setAttribute("mensagem", mensagem);
                request.setAttribute("class", "alert-danger");
                
            }else{

            /*Receber os dados do usuário e consultar do banco*/
            session.setAttribute("user", usuario.getEmail());
            session.setAttribute("placa", usuario.getPlacacar());
            session.setAttribute("nome", usuario.getNome());
            

            String mensagem = "Usuario "+usuario.getEmail() + " logado com sucesso!!";
                request.setAttribute("mensagem", mensagem);
                request.setAttribute("class", "alert-success");
                
            request.getRequestDispatcher("indexx.jsp").forward(request, response);

            }
        } catch (Exception ex) {
            Logger.getLogger(UsuarioLoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }            
    }
}



