package dolcepie.com.dolcepie.models;

public class payModels {
    private int id_pagamento;
    private int id_produto;
    private int id_cliente;
    private double valor_total;
    private String metodo_pagamento;
    private String status_pagamento;
    private String codigo_transacao;

    public payModels() {}

    public payModels(int id_pagamento, int id_produto, int id_cliente, double valor_total, String metodo_pagamento, String status_pagamento, String codigo_transacao) {
        this.id_pagamento = id_pagamento;
        this.id_produto = id_produto;
        this.id_cliente = id_cliente;
        this.valor_total = valor_total;
        this.metodo_pagamento = metodo_pagamento;
        this.status_pagamento = status_pagamento;
        this.codigo_transacao = codigo_transacao;
    }

    public int getId_pagamento() {
        return id_pagamento;
    }

    public void setId_pagamento(int id_pagamento) {
        this.id_pagamento = id_pagamento;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public String getMetodo_pagamento() {
        return metodo_pagamento;
    }

    public void setMetodo_pagamento(String metodo_pagamento) {
        this.metodo_pagamento = metodo_pagamento;
    }

    public String getStatus_pagamento() {
        return status_pagamento;
    }

    public void setStatus_pagamento(String status_pagamento) {
        this.status_pagamento = status_pagamento;
    }

    public String getCodigo_transacao() {
        return codigo_transacao;
    }

    public void setCodigo_transacao(String codigo_transacao) {
        this.codigo_transacao = codigo_transacao;
    }
}