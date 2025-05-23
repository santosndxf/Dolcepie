package dolcepie.com.dolcepie.models;

import java.util.Date;

public class cuponModels {
    private int id_cupom;
    private String codigo;
    private double desconto_percentual;
    private Date data_validade;

    public cuponModels() {}

    public cuponModels(int id_cupom, String codigo, double desconto_percentual, Date data_validade) {
        this.id_cupom = id_cupom;
        this.codigo = codigo;
        this.desconto_percentual = desconto_percentual;
        this.data_validade = data_validade;
    }

    public int getId_cupom() {
        return id_cupom;
    }

    public void setId_cupom(int id_cupom) {
        this.id_cupom = id_cupom;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getDesconto_percentual() {
        return desconto_percentual;
    }

    public void setDesconto_percentual(double desconto_percentual) {
        this.desconto_percentual = desconto_percentual;
    }

    public Date getData_validade() {
        return data_validade;
    }

    public void setData_validade(Date data_validade) {
        this.data_validade = data_validade;
    }
}