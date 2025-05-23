package dolcepie.com.dolcepie.dto;

public class payDto {
    private Long idPagamento;
    private Long idProduto;
    private Long idCliente;
    private Double valorTotal;
    private String metodoPagamento;
    private String statusPagamento;
    private String codigoTransacao;

    public payDto() {}

    public payDto(Long idPagamento, Long idProduto, Long idCliente, Double valorTotal, String metodoPagamento, String statusPagamento, String codigoTransacao) {
        this.idPagamento = idPagamento;
        this.idProduto = idProduto;
        this.idCliente = idCliente;
        this.valorTotal = valorTotal;
        this.metodoPagamento = metodoPagamento;
        this.statusPagamento = statusPagamento;
        this.codigoTransacao = codigoTransacao;
    }

    public Long getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(Long idPagamento) {
        this.idPagamento = idPagamento;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public String getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(String statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public String getCodigoTransacao() {
        return codigoTransacao;
    }

    public void setCodigoTransacao(String codigoTransacao) {
        this.codigoTransacao = codigoTransacao;
    }
}