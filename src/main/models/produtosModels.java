package dolcepie.com.dolcepie.models;

public class produtosModels {
    private int id_produto;
    private String nome_produto;
    private String descricao_produto;
    private double preco_unitario;
    private int estoque_produto;
    private String categoria_produto;
    private boolean promocao_produto;

    public produtosModels() {}

    public produtosModels(int id_produto, String nome_produto, String descricao_produto, double preco_unitario, int estoque_produto, String categoria_produto, boolean promocao_produto) {
        this.id_produto = id_produto;
        this.nome_produto = nome_produto;
        this.descricao_produto = descricao_produto;
        this.preco_unitario = preco_unitario;
        this.estoque_produto = estoque_produto;
        this.categoria_produto = categoria_produto;
        this.promocao_produto = promocao_produto;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
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

    public double getPreco_unitario() {
        return preco_unitario;
    }

    public void setPreco_unitario(double preco_unitario) {
        this.preco_unitario = preco_unitario;
    }

    public int getEstoque_produto() {
        return estoque_produto;
    }

    public void setEstoque_produto(int estoque_produto) {
        this.estoque_produto = estoque_produto;
    }

    public String getCategoria_produto() {
        return categoria_produto;
    }

    public void setCategoria_produto(String categoria_produto) {
        this.categoria_produto = categoria_produto;
    }

    public boolean isPromocao_produto() {
        return promocao_produto;
    }

    public void setPromocao_produto(boolean promocao_produto) {
        this.promocao_produto = promocao_produto;
    }
}