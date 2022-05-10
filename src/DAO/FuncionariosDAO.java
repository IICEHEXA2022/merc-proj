
package DAO;

import java.sql.*;
import Modelo.Funcionarios;

public class FuncionariosDAO extends ExecuteSQL {
    
    public FuncionariosDAO (Connection con) {
      super (con);
}
    public boolean Logar (String login, String senha) {
        boolean finalResult = false;
       
        try {
            String consulta = "select Login, Senha from funcionarios " + "where Login = '" + login + "' and Senha = '" + senha + "'";
            PreparedStatement ps = getCon().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Funcionarios a = new Funcionarios();
                    a.setLogin(rs.getString(1));
                    a.setSenha(rs.getInt(2));
                    finalResult = true;
                }
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return finalResult;
    }
}