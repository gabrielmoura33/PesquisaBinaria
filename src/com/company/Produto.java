package com.company;

public class Produto {
    private String nome;
    private int codigoDeBarras;
    private  double preco;

    public Produto(String nome, int codigoDeBarras, double preco) {
        this.nome = nome;
        this.codigoDeBarras = codigoDeBarras;
        this.preco = preco;
    }

    public Produto () {

    }
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(int codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

}
