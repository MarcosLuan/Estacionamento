/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.servlet;

import br.senai.sc.DAO.ReservarDAO;
import br.senai.sc.DAO.UsuarioDAO;
import br.senai.sc.DAO.VagasDAO;
import br.senai.sc.entity.Reservas;
import br.senai.sc.entity.Usuario;
import br.senai.sc.entity.Vagas;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
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
@WebServlet(name = "VagasSaidaServlet", urlPatterns = {"/VagasSaidaServlet"})
public class VagasSaidaServlet extends HttpServlet {

    
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/plain");
        
        response.getWriter().write("Pagamento efetuado com sucesso, clique em sair!");
    }
        
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        HttpSession session = request.getSession(); 
      String email = (String) session.getAttribute("user") ;

       String placa = request.getParameter("placa");
        VagasDAO vDAO = new VagasDAO();
        ReservarDAO rDAO = new ReservarDAO();
        
        
        try {
            vDAO.update(placa);
            Vagas vaga = vDAO.buscarById(placa);
            double valor = vaga.calcularValorPagamento();
            Usuario usuario = new Usuario();
            UsuarioDAO uDao = new UsuarioDAO();
            usuario = uDao.BuscarUsuariobyEmail(email);
            int tempoEstacionado = vaga.getTempo();
            int tempoUsuario = usuario.getTempo();
            tempoUsuario = tempoUsuario + tempoEstacionado;
            usuario.setTempo(tempoUsuario);
            uDao.updateTempo(usuario);
            
            
            BigDecimal valor1 = new BigDecimal(valor).setScale(2, RoundingMode.HALF_EVEN);
            valor = valor1.doubleValue();
            request.setAttribute("valor", valor);
            
           
            vaga.setVHcusto(valor);
            vDAO.updateCusto(vaga);//Atualiza custo
            Reservas reserva = new Reservas(vaga.getVreservada(),0,placa);
            rDAO.update(reserva);// Desocupa Vaga
            
            request.getRequestDispatcher("pagamento.jsp").forward(request, response);
            
        response.setContentType("text/plain");
        response.getWriter().write("Pagamento efetuado com sucesso, clique em sair");
            
        } catch (Exception ex) {
            Logger.getLogger(VagasSaidaServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
