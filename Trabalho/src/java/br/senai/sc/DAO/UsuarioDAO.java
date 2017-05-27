/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.DAO;

import br.senai.sc.conexao1.Conexao;
import br.senai.sc.entity.Usuario;

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
        
        String sql = "UPDATE usuario SET VHsaida=current_timestamp where VPlaca='" + VPlaca+"'";
        java.sql.PreparedStatement sqlPrep = Conexao.getConnection().prepareStatement(sql);        
        
        System.out.println(sqlPrep);
        
        sqlPrep.execute();
      }
}