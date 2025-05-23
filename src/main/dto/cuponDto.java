package dolcepie.com.dolcepie.dto;

import java.util.Date;

public class cuponDto {
    private Long idCupom;
    private String codigo;
    private Double descontoPercentual;
    private Date dataValidade;

    public cuponDto() {}

    public cuponDto(Long idCupom, String codigo, Double descontoPercentual, Date dataValidade) {
        this.idCupom = idCupom;
        this.codigo = codigo;
        this.descontoPercentual = descontoPercentual;
        this.dataValidade = dataValidade;
    }

    public Long getIdCupom() {
        return idCupom;
    }

    public void setIdCupom(Long idCupom) {
        this.idCupom = idCupom;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getDescontoPercentual() {
        return descontoPercentual;
    }

    public void setDescontoPercentual(Double descontoPercentual) {
        this.descontoPercentual = descontoPercentual;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }
}
