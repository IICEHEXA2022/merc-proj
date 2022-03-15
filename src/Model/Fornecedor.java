/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author SALA 02 - 1º AUTO
 */
public class Fornecedor {
    private int Cod_For;
    private String Nome;
    private int Contato; 

    public int getCod_For() {
        return Cod_For;
    }

    public void setCod_For(int Cod_For) {
        this.Cod_For = Cod_For;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getContato() {
        return Contato;
    }

    public void setContato(int Contato) {
        this.Contato = Contato;
    }
    }

