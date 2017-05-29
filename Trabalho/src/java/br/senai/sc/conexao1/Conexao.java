/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.conexao1;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Marcos_Laís
 */
public class Conexao {
    public static Connection getConnection() 
            throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Estacionamento","root","123");
        
        return con;
    }
    
}
