/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.servlet;

import br.senai.sc.DAO.UsuarioDAO;
import br.senai.sc.DAO.VagasDAO;
import br.senai.sc.entity.Usuario;
import br.senai.sc.entity.Vagas;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
@WebServlet(name = "VagaConsUsuServlet", urlPatterns = {"/VagaConsUsuServlet"})
public class VagaConsUsuServlet extends HttpServlet {

        @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        UsuarioDAO uDAO = new UsuarioDAO();
        VagasDAO vDAO = new VagasDAO();
        String email = (String) session.getAttribute("user");
       
        try {
            
            Usuario usuario = uDAO.BuscarUsuariobyEmail(email);
            List<Vagas> lista = vDAO.getListUsu(usuario);
            request.setAttribute("lista", lista);
            

            request.getRequestDispatcher("historicoReservas.jsp").
                    forward(request, response);
        
        } catch (Exception ex) {
            Logger.getLogger(VagaConsUsuServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}