package dolcepie.com.dolcepie.models;

import java.util.Date;

public class pedidosModels {
    private int id_pedido;
    private int id_usuarios;
    private Date data_pedido;
    private double total_pedido;

    public pedidosModels() {}

    public pedidosModels(int id_pedido, int id_usuarios, Date data_pedido, double total_pedido) {
        this.id_pedido = id_pedido;
        this.id_usuarios = id_usuarios;
        this.data_pedido = data_pedido;
        this.total_pedido = total_pedido;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getId_usuarios() {
        return id_usuarios;
    }

    public void setId_usuarios(int id_usuarios) {
        this.id_usuarios = id_usuarios;
    }

    public Date getData_pedido() {
        return data_pedido;
    }

    public void setData_pedido(Date data_pedido) {
        this.data_pedido = data_pedido;
    }

    public double getTotal_pedido() {
        return total_pedido;
    }

    public void setTotal_pedido(double total_pedido) {
        this.total_pedido = total_pedido;
    }
}