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
@WebServlet(name = "UsuarioBuscaServlet", urlPatterns = {"/UsuarioBuscaServlet"})
public class UsuarioBuscaServlet extends HttpServlet {


    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        String email = (String) session.getAttribute("user");

        UsuarioDAO uDAO = new UsuarioDAO();
        try {
            Usuario usuario = uDAO.BuscarUsuariobyEmail(email);
            request.setAttribute("usuario", usuario);
            
        request.getRequestDispatcher("atualizarUsuario.jsp").forward(request, response);

        } catch (Exception ex) {
            System.out.println("Erro: " + ex);
        }
        
    }

}