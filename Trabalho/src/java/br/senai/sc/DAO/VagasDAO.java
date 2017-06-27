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
        String sql = "insert into vagas(VPlaca,VNome,VHentrada,Vreservada) values (?,?, current_timestamp,?)";
        java.sql.PreparedStatement sqlPrep = Conexao.getConnection().prepareStatement(sql);
        
        sqlPrep.setString(1,vagas.getVPlaca());
        sqlPrep.setString(2,vagas.getVNome());
        sqlPrep.setString(3,vagas.getVreservada());

        
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

        String sql = "select * from vagas where VPlaca = '" + placa+"'";
        java.sql.PreparedStatement sqlPrep = Conexao.getConnection().prepareStatement(sql);
        ResultSet rs = sqlPrep.executeQuery();

 
        rs.first();
                
          
              Vagas vaga =  new Vagas(rs.getString("VPlaca") , 
                      rs.getString("VNome"),
                      rs.getString("VHentrada"),
                      rs.getString("VHsaida"),
                      rs.getInt("tempo"),
                      rs.getString("Vreservada"));
        return vaga;
    }
public void updateCusto(Vagas vaga) throws Exception{
      
        String sql = "UPDATE vagas SET VHcusto= "+ vaga.getVHcusto()
                + "  where VPlaca='" + vaga.getVPlaca()+"'";

        java.sql.PreparedStatement sqlPrep = Conexao.getConnection().prepareStatement(sql);        
        
        System.out.println(sqlPrep);
        
        sqlPrep.execute();
    
}   
}
