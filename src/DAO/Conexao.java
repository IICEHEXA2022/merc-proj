package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    private static Connection conexao = null;

    public static void abrirConexao() {
        try {
            Class.forName("con.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/mercantil";
            Conexao.conexao = DriverManager.getConnection(url, "root", "");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void fecharConexao(){
        try {
            Conexao.conexao.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
