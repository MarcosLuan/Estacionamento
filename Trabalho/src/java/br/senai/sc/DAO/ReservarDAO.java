/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.DAO;

import br.senai.sc.conexao1.Conexao;
import br.senai.sc.entity.Reservas;
import br.senai.sc.entity.Usuario;

/**
 *
 * @author andersonfrare
 */
public class ReservarDAO {

    public void insert(Reservas reserva) throws Exception {

        String sql = "insert into Reservas (Rcod,Rocupada) values(?,?);
        java.sql.PreparedStatement sqlPrep = Conexao.getConnection().prepareStatement(sql);

        sqlPrep.setString(1, reserva.getRcod());
        sqlPrep.setInt(2, reserva.getRocupada());

        sqlPrep.execute();

    }

    public void update(Reservas reserva) throws Exception {

        String sql = "UPDATE `Estacionamento`.`Reservas`"
                + "SET `Rocupada` = " + reserva.getRocupada()
                + " WHERE `Rcod` ='" + reserva.getRcod() + "' ";

        java.sql.PreparedStatement sqlPrep = Conexao.getConnection().prepareStatement(sql);

        System.out.println(sqlPrep);

        sqlPrep.execute();
    }
    
    public void verificarTamanho(){
        String sql = "SUM()"
    }

}
