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
import javax.servlet.http.HttpSession;

/**
 *
 * @author andersonfrare
 */
@WebServlet(name = "VagaAtualizarServlet", urlPatterns = {"/VagaAtualizarServlet"})
public class VagaAtualizarServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      HttpSession session = request.getSession(); 
      //valida Sessao
       if (session.getAttribute("user") == null) {
        request.getRequestDispatcher("login.jsp").forward(request, response);
        }

      ReservarDAO rDAO = new ReservarDAO();
        try {
            if(rDAO.verificarTamanho() >= 14){
                request.getRequestDispatcher("cheio.jsp").forward(request, response);
                
                
            }
        } catch (Exception ex) {
            Logger.getLogger(VagaAtualizarServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 1; i < 15; i++) {
            String botao = "btnres0" + i;
            System.out.println("botao: " + botao);
            try {
                if (i < 10) {
                Reservas reserva = rDAO.BuscarReservasbyCodigo(botao);
                
                    if (reserva.getRocupada() == 1) {
                        String classBotao = "btn-danger";
                        request.setAttribute("classBotao" + i, classBotao);
                        request.setAttribute("btnres0" + i, "Ocupada "+reserva.getRplaca());

                    } else {
                        String classBotao = "btn-success";
                        String mensagem = "Reservar " + i;
                        request.setAttribute("classBotao" + i, classBotao);
                        request.setAttribute("btnres0" + i, mensagem);
                    }
                } else {// tira o 0
                    
                    botao = "btnres" + i;
                    Reservas reserva = rDAO.BuscarReservasbyCodigo(botao);
                    
                    if (reserva.getRocupada() == 1) {
                        String classBotao = "btn-danger";
                        request.setAttribute("classBotao" + i, classBotao);
                        request.setAttribute("btnres" + i,"Ocupada "+reserva.getRplaca());

                    } else {
                        String classBotao = "btn-success";
                        String mensagem = "Reservar " + i;
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
