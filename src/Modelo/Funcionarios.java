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
    private int Cod_Fun;
    private String Nome;
    private double Salario;
    private int Contato;

    public int getCod_Fun() {
        return Cod_Fun;
    }

    public void setCod_Fun(int Cod_Fun) {
        this.Cod_Fun = Cod_Fun;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public int getContato() {
        return Contato;
    }

    public void setContato(int Contato) {
        this.Contato = Contato;
    }
    
}
