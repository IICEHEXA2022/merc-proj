/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author SALA 02 - 1º AUTO
 */
public class Funcionarios {
    private int id;
    private String nome;
    private double salario;
    private int contato;
    private String senha;
    private String login;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getContato() {
        return contato;
    }

    public void setContato(int contato) {
        this.contato = contato;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "Funcionarios{" + "id=" + id + ", nome=" + nome + ", salario=" + salario + ", contato=" + contato + ", senha=" + senha + ", login=" + login + '}';
    }

    
}
