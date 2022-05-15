/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mrglass
 */
public class ConexaoFactory {
    
    public static Connection getConexao() {
        Connection conexao = null;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://192.168.0.118:3306/Produtos", "root", "root!");
        } catch (ClassNotFoundException e) {
            System.out.println("Erro (Banco): " + e);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return conexao;
    }
}
