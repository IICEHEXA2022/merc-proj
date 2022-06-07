/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author SALA 02 - 1º AUTO
 */

public class Adm {

    private int Cod_Admin;
    private String Nome;
    private int Senha;

    public int getCod_Admin() {
        return Cod_Admin;
    }

    public void setCod_Admin(int Cod_Admin) {
        this.Cod_Admin = Cod_Admin;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getSenha() {
        return Senha;
    }

    public void setSenha(int Senha) {
        this.Senha = Senha;
    }
}
