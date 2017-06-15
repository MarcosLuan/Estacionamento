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
@WebServlet(name = "VagaEntradaServlet", urlPatterns = {"/VagaEntradaServlet"})
public class VagaEntradaServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                HttpSession session = request.getSession();
        
                String placa = (String) session.getAttribute("placa");
                String nome = (String) session.getAttribute("nome");

                
                Vagas vagas = new Vagas(placa,nome);
        VagasDAO vDAO = new VagasDAO();
        
        try{
            vDAO.insert(vagas);
            
            
        } catch (Exception ex) {
            System.out.println("Erro: "+ex);
        }
        
                response.setContentType("text/plain");
                response.getWriter().write((String) placa);
        
        
        
    }

   
}
