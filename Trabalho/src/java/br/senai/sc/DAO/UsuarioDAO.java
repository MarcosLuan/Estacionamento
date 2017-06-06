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
 * @author Marcos_Laís
 */
public class UsuarioDAO {
    public void insert (Usuario usuario)throws Exception {
        String sql = "insert into usuario (nome, email, senha, placacar, modelocar) values (?,?,?,?,?)";
        
        //prepara a instrução para ser enviada ao banco de dados
        java.sql.PreparedStatement sqlPrep = Conexao.getConnection().prepareStatement(sql);
        //passa todos os valores para o DAO fazer os ajustes e jogar para o banco de dados
        //Executa o MYSQL
        sqlPrep.setString(1, usuario.getNome());
        sqlPrep.setString(2, usuario.getEmail());
        sqlPrep.setString(3, usuario.getSenha());
        sqlPrep.setString(4, usuario.getPlacacar());
        sqlPrep.setString(5, usuario.getModelocar());
        
        sqlPrep.execute();
    }    
    public Usuario Logar(String email) throws Exception {

        String sql = "select * from usuario where e-mail = '" +email +"'";
        java.sql.PreparedStatement sqlPrep = Conexao.getConnection().prepareStatement(sql);
        ResultSet rs = sqlPrep.executeQuery();

 
        rs.first();
                
          
              Vagas vaga =  new Vagas(rs.getString("VPlaca") , 
                      rs.getString("VNome"),
                      rs.getString("VHentrada"),
                      rs.getString("VHsaida"),
                      rs.getInt("tempo"));
        return vaga;
    }   
}
    
}
