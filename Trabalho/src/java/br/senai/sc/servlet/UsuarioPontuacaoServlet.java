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

/**
 *
 * @author Marcos_Laís
 */
@WebServlet(name = "Pontuacao", urlPatterns = {"/Pontuacao"})
public class UsuarioPontuacaoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String turista = request.getParameter("turista");
        String viajante = request.getParameter("viajante");
        String visitante = request.getParameter("visitante");
        String decasa = request.getParameter("decasa");
        String morador = request.getParameter("morador");
        String aposentado = request.getParameter("aposentado");
        String rei = request.getParameter("rei");
        
    }
}
