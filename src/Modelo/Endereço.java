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
public class Endereço {
    private int Cod_End;
    private String País;  
    private String Estado;
    private String Cidade;
    private String Distrito;
    private String Rua;

    public int getCod_End() {
        return Cod_End;
    }

    public void setCod_End(int Cod_End) {
        this.Cod_End = Cod_End;
    }

    public String getPaís() {
        return País;
    }

    public void setPaís(String País) {
        this.País = País;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getDistrito() {
        return Distrito;
    }

    public void setDistrito(String Distrito) {
        this.Distrito = Distrito;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }
}
