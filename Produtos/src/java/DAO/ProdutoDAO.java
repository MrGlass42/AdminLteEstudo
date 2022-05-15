/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Produto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author mrglass
 */
public class ProdutoDAO {
    
    private Connection conexao;
    
    public ProdutoDAO() {
        this.conexao = ConexaoFactory.getConexao();
    }
    
    public ArrayList<Produto> ConsultarProdutos() throws ClassNotFoundException, SQLException {
        
        ArrayList<Produto> produtos = new ArrayList();

        String sql = "SELECT * FROM Produto;";

        PreparedStatement pst = conexao.prepareStatement(sql);

        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            int id = rs.getInt("Id");
            String nome = rs.getString("Nome");
            double preco = rs.getDouble("Preco");
            LocalDate data = rs.getDate("Data").toLocalDate();
           
            Produto produto = new Produto(nome, preco, data, id);

            produtos.add(produto);
        }
        
        conexao.close();
        return produtos;
    }
}
