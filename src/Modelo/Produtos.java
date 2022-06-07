/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Objects;

/**
 *
 * @author SALA 02 - 1º AUTO
 */
public class Produtos {

    private int Cod_Prod;
    private String Descricao;

    public Produtos() {
    }

    public Produtos(int Cod_Prod, String Descrição) {
        this.Cod_Prod = Cod_Prod;
        this.Descricao = Descrição;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + this.Cod_Prod;
        hash = 73 * hash + Objects.hashCode(this.Descricao);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produtos other = (Produtos) obj;
        if (this.Cod_Prod != other.Cod_Prod) {
            return false;
        }
        if (!Objects.equals(this.Descricao, other.Descricao)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Produtos{" + "Cod_Prod=" + Cod_Prod + ", Descri\u00e7\u00e3o=" + Descricao + '}';
    }

    public int getCod_Prod() {
        return Cod_Prod;
    }

    public void setCod_Prod(int Cod_Prod) {
        this.Cod_Prod = Cod_Prod;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descrição) {
        this.Descricao = Descrição;
    }
}
