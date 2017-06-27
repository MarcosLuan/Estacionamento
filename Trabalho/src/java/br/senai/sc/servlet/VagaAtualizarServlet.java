/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.servlet;

import br.senai.sc.DAO.ReservarDAO;
import br.senai.sc.entity.Reservas;
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
@WebServlet(name = "VagaAtualizarServlet", urlPatterns = {"/VagaAtualizarServlet"})
public class VagaAtualizarServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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

        ReservarDAO rDAO = new ReservarDAO();
        for (int i = 1; i < 15; i++) {
            String botao = "btnres0" + i;
            System.out.println("botao: " + botao);
            try {
                if (i < 10) {
                Reservas reserva = rDAO.BuscarReservasbyCodigo(botao);
                
                    if (reserva.getRocupada() == 1) {
                        String classBotao = "btn-danger";
                        request.setAttribute("classBotao" + i, classBotao);
                        request.setAttribute("btnres0" + i, botao);

                    } else {
                        String classBotao = "btn-success";
                        String mensagem = "Reservar" + i;
                        request.setAttribute("classBotao" + i, classBotao);
                        request.setAttribute("btnres0" + i, mensagem);
                    }
                } else {// tira o 0
                    
                    botao = "btnres" + i;
                    Reservas reserva = rDAO.BuscarReservasbyCodigo(botao);
                    
                    if (reserva.getRocupada() == 1) {
                        String classBotao = "btn-danger";
                        request.setAttribute("classBotao" + i, classBotao);
                        request.setAttribute("btnres" + i, botao);

                    } else {
                        String classBotao = "btn-success";
                        String mensagem = "Reservar" + i;
                        request.setAttribute("classBotao" + i, classBotao);
                        request.setAttribute("btnres" + i, mensagem);

                    }

                }

            } catch (Exception ex) {
                Logger.getLogger(VagaAtualizarServlet.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        request.getRequestDispatcher("VerVagas.jsp").forward(request, response);

    }

}
