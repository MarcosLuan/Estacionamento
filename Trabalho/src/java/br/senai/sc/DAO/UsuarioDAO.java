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
 * @author Marcos_Laís
 */
public class UsuarioDAO {

    public void insert(Usuario usuario) throws Exception {
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

    public Usuario BuscarUsuario(String email, String senha) throws Exception {

        String sql = "select * from usuario where email = '" + email + "'and senha = '" + senha + "'";
        java.sql.PreparedStatement sqlPrep = Conexao.getConnection().prepareStatement(sql);
        ResultSet rs = sqlPrep.executeQuery();
        
       if( rs.first()){

        Usuario usuario = new Usuario(rs.getString("nome"),
                rs.getString("email"),
                rs.getString("senha"),
                rs.getString("placacar"),
                rs.getString("modelocar"));
        //System.out.println("loooG: "+usuario.getNome());

        
        return usuario;
       
       }
        return null;
    }
}


