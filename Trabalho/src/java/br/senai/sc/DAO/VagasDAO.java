/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.DAO;

import br.senai.sc.conexao1.Conexao;
import br.senai.sc.entity.Usuario;
import br.senai.sc.entity.Vagas;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andersonfrare
 */
public class VagasDAO {

    public void insert(Vagas vagas) throws Exception {
        String sql = "insert into vagas(VPlaca,VNome,VHentrada,Vreservada, Pago) values (?,?, current_timestamp,?,?)";
        java.sql.PreparedStatement sqlPrep = Conexao.getConnection().prepareStatement(sql);

        sqlPrep.setString(1, vagas.getVPlaca());
        sqlPrep.setString(2, vagas.getVNome());
        sqlPrep.setString(3, vagas.getVreservada());
        sqlPrep.setInt(4, vagas.getPago());
        

        sqlPrep.execute();

    }

    public void update(String VPlaca) throws Exception {

        String sql = "UPDATE vagas SET VHsaida=current_timestamp, tempo = timestampdiff(minute, VHentrada, VHsaida)"
                + "  where VPlaca='" + VPlaca + "'and Pago=null";

        java.sql.PreparedStatement sqlPrep = Conexao.getConnection().prepareStatement(sql);

        System.out.println(sqlPrep);

        sqlPrep.execute();
    }

    public Vagas buscarById(String placa) throws Exception {

        String sql = "select * from vagas where VPlaca = '" + placa + "'";
        java.sql.PreparedStatement sqlPrep = Conexao.getConnection().prepareStatement(sql);
        ResultSet rs = sqlPrep.executeQuery();

        rs.first();

        Vagas vaga = new Vagas(rs.getString("VPlaca"),
                    rs.getString("VNome"),
                    rs.getString("VHentrada"),
                    rs.getString("VHsaida"),
                    rs.getDouble("VHcusto"),
                    rs.getInt("tempo"),
                    rs.getString("Vreservada"),
                    rs.getInt("Pago")
        );
        return vaga;
    }

    public void updateCusto(Vagas vaga) throws Exception {

        String sql = "UPDATE vagas SET VHcusto= " + vaga.getVHcusto()
                + " ,Pago=1 where VPlaca='" + vaga.getVPlaca() + "'"+"and Pago=null";

        java.sql.PreparedStatement sqlPrep = Conexao.getConnection().prepareStatement(sql);
            
        System.out.println(sql);
        System.out.println("Oiiiiiiii");

        sqlPrep.execute();

    }

    public List getList() throws Exception {

        String sql = "select * from vagas";
        java.sql.PreparedStatement sqlPrep = Conexao.getConnection().prepareStatement(sql);
        ResultSet rs = sqlPrep.executeQuery();

        List<Vagas> list = new ArrayList<Vagas>();

        //rs.first();
        //if (rs.getRow() > 0) {
        //  do {
        
    /*private String VPlaca;
    private String VNome;
    private String VHentrada;
    private String VHsaida;
    private double VHcusto;
    private int tempo;*/
    
        while (rs.next()) {
            list.add(new Vagas(rs.getString("VPlaca"),
                    rs.getString("VNome"),
                    rs.getString("VHentrada"),
                    rs.getString("VHsaida"),
                    rs.getDouble("VHcusto"),
                    rs.getInt("tempo"),
                    rs.getString("Vreservada"),
                    rs.getInt("Pago")
                    ));

        }

        //}
        return list;

    }
    
    public List getListUsu(Usuario usuario) throws Exception {

        String sql = "select * from vagas where Vplaca= '" + usuario.getPlacacar()+"'";
        java.sql.PreparedStatement sqlPrep = Conexao.getConnection().prepareStatement(sql);
        ResultSet rs = sqlPrep.executeQuery();

        List<Vagas> list = new ArrayList<Vagas>();

         while (rs.next()) {
            list.add(new Vagas(rs.getString("VPlaca"),
                    rs.getString("VNome"),
                    rs.getString("VHentrada"),
                    rs.getString("VHsaida"),
                    rs.getDouble("VHcusto"),
                    rs.getInt("tempo"),
                    rs.getString("Vreservada"),
                    rs.getInt("Pago")
                    ));

        }

        //}
        return list;

    }
}
