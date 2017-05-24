/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.DAO;

import br.senai.sc.entity.Vagas;
import br.senai.sc.conexao1.Conexao;

/**
 *
 * @author Marcos_Laís
 */
public class VagaDAO {
    public void insert (Vagas vagas)throws Exception {
        String sql = "insert into vaga (VCod, VFileira, VPosicao, VStatus, Vdisp) values (?,?,?,?)";
        
        //prepara a instrução para ser enviada ao banco de dados
        java.sql.PreparedStatement sqlPrep = Conexao.getConnection().prepareStatement(sql);
        //passa todos os valores para o DAO fazer os ajustes e jogar para o banco de dados
        //Executa o MYSQL
        sqlPrep.setString(1, vagas.getCodigo());
        sqlPrep.setString(2, vagas.getFileira());
        sqlPrep.setString(3, vagas.getPosicao());
        sqlPrep.setString(4, vagas.getDisp());
        
        sqlPrep.execute();
    }    
    
}
