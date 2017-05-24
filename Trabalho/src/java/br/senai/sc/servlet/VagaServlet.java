/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.servlet;

import br.senai.sc.DAO.VagaDAO;
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
@WebServlet(name = "VagaServlet", urlPatterns = {"/VagaServlet"})
public class VagaServlet extends HttpServlet {

    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    String codigo = request.getParameter("codigo");
    String fileira = request.getParameter("fileira");
    String posicao = request.getParameter("posicao");
    String disp = request.getParameter("disp");
    
    Vagas v = new Vagas(codigo, fileira, posicao, disp);
    
    VagaDAO vdao = new VagaDAO();
    
    try {
        vdao.insert(v);
        request.getRequestDispatcher("Cadastradas.jsp").forward(request, response);
        
    } catch (Exception ex){
        request.setAttribute("erro", ex.getMessage());
        request.getRequestDispatcher("erro.jsp").forward(request, response);
        
    }
    
    }

}
