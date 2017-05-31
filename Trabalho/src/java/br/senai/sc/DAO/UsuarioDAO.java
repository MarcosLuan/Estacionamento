/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.DAO;

import br.senai.sc.conexao1.Conexao;
import br.senai.sc.entity.Usuario;
import java.sql.ResultSet;

/**
 *
 * @author andersonfrare
 */
public class UsuarioDAO {
    
    public void insert(Usuario usuario) throws Exception{
        String sql = "insert into usuario(VPlaca,VNome,VHentrada) values (?,?, current_timestamp)";
        java.sql.PreparedStatement sqlPrep = Conexao.getConnection().prepareStatement(sql);
        
        sqlPrep.setString(1,usuario.getVPlaca());
        sqlPrep.setString(2,usuario.getVNome());
        
        sqlPrep.execute();

    }
   public void update(String VPlaca) throws Exception{
        
<<<<<<< HEAD
        String sql = "UPDATE usuario SET VHsaida=current_timestamp, "
                + "tempo = timestampdiff(minute, VHentrada, VHsaida)  "
                + "where VPlaca='" + VPlaca+"'";
=======
        String sql = "UPDATE usuario SET VHsaida=current_timestamp where VPlaca='" + VPlaca+"'";
>>>>>>> parent of 6b9a421... calcula tempo
        java.sql.PreparedStatement sqlPrep = Conexao.getConnection().prepareStatement(sql);        
        
        System.out.println(sqlPrep);
        
        sqlPrep.execute();
      }
   public Usuario buscarById(String placa) throws Exception {

        String sql = "select * from usuario where VPlaca='" + placa+"'";
        java.sql.PreparedStatement sqlPrep = Conexao.getConnection().prepareStatement(sql);
        ResultSet rs = sqlPrep.executeQuery();

 
       
          
              Usuario usuario =  new Usuario(rs.getString("VPlaca") , 
                      rs.getString("VNome"),
                      rs.getString("VHentrada"),
                      rs.getString("VHsaida")
                      ,rs.getInt("tempo"));
                      

            

       

        return usuario;
    }   
}
