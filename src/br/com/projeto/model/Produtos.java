package br.com.projeto.model;

public class Produtos {

    private int id;
    private String descricao;
    private double preco;
    private int qtdEsoque;

    private Fornecedores fornecedor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdEsoque() {
        return qtdEsoque;
    }

    public void setQtdEsoque(int qtdEsoque) {
        this.qtdEsoque = qtdEsoque;
    }

    public Fornecedores getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedores fornecedor) {
        this.fornecedor = fornecedor;
    }

}
