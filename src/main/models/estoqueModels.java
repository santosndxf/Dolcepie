package dolcepie.com.dolcepie.models;

import java.util.Date;

public class estoqueModels {
    private int id_produtofronecedor;
    private String nome_produto;
    private String descricao_produto;
    private int quantidade_estoque;
    private double preco_unitario;
    private String categoria_produto;
    private Date data_entrada;
    private Date data_validade;
    private String fornecedor;
    private String status_produto;

    public estoqueModels() {}

    public estoqueModels(int id_produtofronecedor, String nome_produto, String descricao_produto, int quantidade_estoque,
                         double preco_unitario, String categoria_produto, Date data_entrada, Date data_validade,
                         String fornecedor, String status_produto) {
        this.id_produtofronecedor = id_produtofronecedor;
        this.nome_produto = nome_produto;
        this.descricao_produto = descricao_produto;
        this.quantidade_estoque = quantidade_estoque;
        this.preco_unitario = preco_unitario;
        this.categoria_produto = categoria_produto;
        this.data_entrada = data_entrada;
        this.data_validade = data_validade;
        this.fornecedor = fornecedor;
        this.status_produto = status_produto;
    }

    public int getId_produtofronecedor() {
        return id_produtofronecedor;
    }

    public void setId_produtofronecedor(int id_produtofronecedor) {
        this.id_produtofronecedor = id_produtofronecedor;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public String getDescricao_produto() {
        return descricao_produto;
    }

    public void setDescricao_produto(String descricao_produto) {
        this.descricao_produto = descricao_produto;
    }

    public int getQuantidade_estoque() {
        return quantidade_estoque;
    }

    public void setQuantidade_estoque(int quantidade_estoque) {
        this.quantidade_estoque = quantidade_estoque;
    }

    public double getPreco_unitario() {
        return preco_unitario;
    }

    public void setPreco_unitario(double preco_unitario) {
        this.preco_unitario = preco_unitario;
    }

    public String getCategoria_produto() {
        return categoria_produto;
    }

    public void setCategoria_produto(String categoria_produto) {
        this.categoria_produto = categoria_produto;
    }

    public Date getData_entrada() {
        return data_entrada;
    }

    public void setData_entrada(Date data_entrada) {
        this.data_entrada = data_entrada;
    }

    public Date getData_validade() {
        return data_validade;
    }

    public void setData_validade(Date data_validade) {
        this.data_validade = data_validade;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getStatus_produto() {
        return status_produto;
    }

    public void setStatus_produto(String status_produto) {
        this.status_produto = status_produto;
    }
}