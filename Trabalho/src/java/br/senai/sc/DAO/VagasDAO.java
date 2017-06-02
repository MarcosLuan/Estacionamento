/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.DAO;

import br.senai.sc.conexao1.Conexao;
import br.senai.sc.entity.Vagas;
import java.sql.ResultSet;

/**
 *
 * @author andersonfrare
 */
public class VagasDAO {
    
    public void insert(Vagas vagas) throws Exception{
        String sql = "insert into vagas(VPlaca,VNome,VHentrada) values (?,?, current_timestamp)";
        java.sql.PreparedStatement sqlPrep = Conexao.getConnection().prepareStatement(sql);
        
        sqlPrep.setString(1,vagas.getVPlaca());
        sqlPrep.setString(2,vagas.getVNome());
        
        sqlPrep.execute();

    }
   public void update(String VPlaca) throws Exception{
        
        String sql = "UPDATE vagas SET VHsaida=current_timestamp, tempo = timestampdiff(minute, VHentrada, VHsaida)"
                + "  where VPlaca='" + VPlaca+"'";

        java.sql.PreparedStatement sqlPrep = Conexao.getConnection().prepareStatement(sql);        
        
        System.out.println(sqlPrep);
        
        sqlPrep.execute();
      }
   public Vagas buscarById(String placa) throws Exception {

        String sql = "select * from vagas where VPlaca=cast('" + placa+"' as char(8))";
        java.sql.PreparedStatement sqlPrep = Conexao.getConnection().prepareStatement(sql);
        System.out.println(sql);
        ResultSet rs = sqlPrep.executeQuery();

 
       
          
              Vagas vaga =  new Vagas(rs.getString("VPlaca") , 
                      rs.getString("VNome"),
                      rs.getString("VHentrada"),
                      rs.getString("VHsaida"),
                      rs.getInt("tempo"));
        return vaga;
    }   
}
