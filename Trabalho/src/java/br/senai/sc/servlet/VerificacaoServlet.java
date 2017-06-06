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

        String email = request.getParameter("email");
        String senha = request.getParameter("senha");

        UsuarioDAO uDAO = new UsuarioDAO();

        try {
            Usuario usuario = uDAO.BuscarUsuario(email, senha);
            if (usuario == null) {
                String mensagem = "Usuario ou senha nao encontrado";
                request.setAttribute("mensagem", mensagem);
                request.setAttribute("class", "alert-danger");
                
            }else{
                //usuario.logarUsuario(usuario.getEmail());
                HttpSession session = request.getSession();

            /*Receber os dados do usuário e consultar do banco*/
            session.setAttribute("user", usuario.getEmail());
            
                String mensagem = "Usuario "+usuario.getEmail() + " logado com sucesso!!";
                request.setAttribute("mensagem", mensagem);
                request.setAttribute("class", "alert-success");
            
            //session.setAttribute("fullname", "Marcos Luan");
                
            }

            request.getRequestDispatcher("teste.jsp").forward(request, response);
            
        } catch (Exception ex) {
            Logger.getLogger(VerificacaoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
