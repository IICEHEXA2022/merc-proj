package DAO;

import java.sql.*;
import Modelo.Funcionarios;
import java.util.ArrayList;

public class FuncionariosDAO {

    public ArrayList<Funcionarios> consultarFuncionarios() {
        Conexao.abrirConexao();

        ArrayList<Funcionarios> funcionarios = new ArrayList();

        try {
            PreparedStatement stmt = Conexao.getConexao().prepareStatement("SELECT * FROM funcionarios");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                Funcionarios f = new Funcionarios();
                f.setId(res.getInt("Cod_Fun"));
                f.setContato(res.getInt("Contato"));
                f.setSalario(res.getDouble("Salario"));
                f.setNome(res.getString("Nome"));
                f.setLogin(res.getString("Login"));
                f.setSenha(res.getString("Senha"));
                funcionarios.add(f);
                System.out.println(f);
            }
            Conexao.fecharConexao();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return funcionarios;
    }

    public static void main(String[] args) {
        System.out.println("Lista de Funcionários: ");
        FuncionariosDAO fDAO = new FuncionariosDAO();
        
        fDAO.consultarFuncionarios();
    }
}
