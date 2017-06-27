/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.DAO;

import br.senai.sc.conexao1.Conexao;
import br.senai.sc.entity.Reservas;
import br.senai.sc.entity.Usuario;
import java.sql.ResultSet;

/**
 *
 * @author andersonfrare
 */
public class ReservarDAO {

    public void insert(Reservas reserva) throws Exception {

        String sql = "insert into Reservas (Rcod,Rocupada,Rplaca) values(?,?,?)";
        java.sql.PreparedStatement sqlPrep = Conexao.getConnection().prepareStatement(sql);

        sqlPrep.setString(1, reserva.getRcod());
        sqlPrep.setInt(2, reserva.getRocupada());
        sqlPrep.setString(3, reserva.getRplaca());


        sqlPrep.execute();

    }

    public void update(Reservas reserva) throws Exception {

        String sql = "UPDATE `Estacionamento`.`Reservas`"
                + "SET `Rocupada` = " + reserva.getRocupada()+", "
                + "`Rplaca` = '" + reserva.getRplaca()+"'"
                + " WHERE `Rcod` ='" + reserva.getRcod() + "' ";

        java.sql.PreparedStatement sqlPrep = Conexao.getConnection().prepareStatement(sql);

        System.out.println(sqlPrep);

        sqlPrep.execute();
    }
    public Reservas BuscarReservasbyCodigo(String Rcod ) throws Exception{
        String sql = "select * from Reservas where  Rcod= '" + Rcod + "'";
        java.sql.PreparedStatement sqlPrep = Conexao.getConnection().prepareStatement(sql);
        ResultSet rs = sqlPrep.executeQuery();
        
       if( rs.first()){

        Reservas reserva = new Reservas(rs.getString("Rcod"),
                rs.getInt("Rocupada"),
                rs.getString("Rplaca")
                );
        

        
        return reserva;
       
       }
          return null;
        
    }
    
    public void verificarTamanho(){
        String sql = "SUM()";
    }

}
