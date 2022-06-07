/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Produtos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProdutosDAO {

    public static boolean Inserir_Produto(Produtos a) {
        Connection con = Conexao.abrirConexao();
        String sql = "insert into produtos(Cod_Prod, Descrição) value(?, ?)";

        try {

            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);

            ps.setInt(1, a.getCod_Prod());
            ps.setString(2, a.getDescricao());
            ps.execute();
            return true;

        } catch (SQLException e) {
            e.getMessage();
        }
        return false;
    }

    public List<Produtos> getLista() {
        List<Produtos> produtos = new ArrayList<Produtos>();

        try {
            Connection con = Conexao.abrirConexao();
            PreparedStatement stmt = con.prepareStatement("select * from produtos");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Produtos p = new Produtos();
                p.setCod_Prod(rs.getInt("Cod_Prod"));
                p.setDescricao(rs.getString("Descrição"));
                produtos.add(p);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return produtos;
    }

    public static void main(String[] args) {
        ProdutosDAO dao = new ProdutosDAO();
        for (Produtos p : dao.getLista()) {
            System.out.println(p);
        }
    }

    public static void excluir(Produtos produtos) {
        Conexao.abrirConexao();
        String sql = "DELETE FROM produtos WHERE Cod_Prod = ?";

        try {
            PreparedStatement ps = (PreparedStatement) Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, produtos.getCod_Prod());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Produto Excluído Com Sucesso");

        } catch (SQLException ex) {
           
            Logger.getLogger(ProdutosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
