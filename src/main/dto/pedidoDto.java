package dolcepie.com.dolcepie.dto;

import java.util.Date;

public class pedidoDto {
    private Long id;
    private Long idUsuario;
    private Date dataPedido;
    private Double totalPedido;

    public pedidoDto() {}

    public pedidoDto(Long id, Long idUsuario, Date dataPedido, Double totalPedido) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.dataPedido = dataPedido;
        this.totalPedido = totalPedido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Double getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(Double totalPedido) {
        this.totalPedido = totalPedido;
    }
}