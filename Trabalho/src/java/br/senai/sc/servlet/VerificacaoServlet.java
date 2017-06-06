/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.servlet;

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
 * @author Marcos_Laís
 */
@WebServlet(name = "VerificacaoServlet", urlPatterns = {"/VerificacaoServlet,/verificarlogin"})
public class VerificacaoServlet extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");
        
        HttpSession session = request.getSession();
        
        /*Receber os dados do usuário e consultar do banco*/
        
        
        session.setAttribute("user", "Marcos");
        session.setAttribute("fullname", "Marcos Luan");
        
    }

}
