package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    private static Connection con;

 
    public static Connection abrirConexao(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/mercantil";
            Conexao.con = DriverManager.getConnection(url, "root", "");
        }catch(ClassNotFoundException e){
            System.err.println("ClassNotFound: " + e.getMessage());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        return Conexao.con;
    }
    
     public static Connection getConexao() {
        return Conexao.con;
    }
    public static void fecharConexao(){
        try {
            Conexao.con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
