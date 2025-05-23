package dolcepie.com.dolcepie.models;

import java.util.Date;

public class carrinhoModels {
    private int id;
    private int cliente_id;
    private int produto_id;
    private int quantidade;
    private double preco_unitario;
    private Date criado_em;
    private Date atualizado_em;

    public carrinhoModels() {}

    public carrinhoModels(int id, int cliente_id, int produto_id, int quantidade, double preco_unitario, Date criado_em, Date atualizado_em) {
        this.id = id;
        this.cliente_id = cliente_id;
        this.produto_id = produto_id;
        this.quantidade = quantidade;
        this.preco_unitario = preco_unitario;
        this.criado_em = criado_em;
        this.atualizado_em = atualizado_em;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public int getProduto_id() {
        return produto_id;
    }

    public void setProduto_id(int produto_id) {
        this.produto_id = produto_id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco_unitario() {
        return preco_unitario;
    }

    public void setPreco_unitario(double preco_unitario) {
        this.preco_unitario = preco_unitario;
    }

    public Date getCriado_em() {
        return criado_em;
    }

    public void setCriado_em(Date criado_em) {
        this.criado_em = criado_em;
    }

    public Date getAtualizado_em() {
        return atualizado_em;
    }

    public void setAtualizado_em(Date atualizado_em) {
        this.atualizado_em = atualizado_em;
    }
}