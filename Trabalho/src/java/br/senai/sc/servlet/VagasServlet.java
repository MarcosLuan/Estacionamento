/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.servlet;

import br.senai.sc.DAO.VagasDAO;
import br.senai.sc.entity.Vagas;
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
@WebServlet(name = "VagasServlet", urlPatterns = {"/VagasServlet"})
public class VagasServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String placa = request.getParameter("placa");
        String nome = request.getParameter("nome");
        
        Vagas vagas = new Vagas(placa,nome);
        VagasDAO vDAO = new VagasDAO();
        
        try{
            vDAO.insert(vagas);
            request.getRequestDispatcher("Inicial1.html").forward(request, response);
            
        } catch (Exception ex) {
            System.out.println("Erro: "+ex);
        }
   }
}
