import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "pagamentos")
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String metodo;
    private String status;
    private Double valor;

    @OneToOne
    private Pedido pedido;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getMetodo() { return metodo; }
    public void setMetodo(String metodo) { this.metodo = metodo; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Double getValor() { return valor; }
    public void setValor(Double valor) { this.valor = valor; }

    public Pedido getPedido() { return pedido; }
    public void setPedido(Pedido pedido) { this.pedido = pedido; }
}
