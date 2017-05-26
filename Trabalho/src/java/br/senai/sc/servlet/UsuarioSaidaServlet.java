/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.servlet;

import br.senai.sc.DAO.UsuarioDAO;
import br.senai.sc.DAO.VagaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author andersonfrare
 */
@WebServlet(name = "UsuarioSaidaServlet", urlPatterns = {"/UsuarioSaidaServlet"})
public class UsuarioSaidaServlet extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

       String placa = request.getParameter("placa");
        UsuarioDAO uDAO = new UsuarioDAO();
        
        try {
            uDAO.update(placa);
        } catch (Exception ex) {
            Logger.getLogger(UsuarioSaidaServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

   

}
