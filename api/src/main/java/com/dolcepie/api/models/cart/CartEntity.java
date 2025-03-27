package com.dolcepie.api.models.cart;


import java.io.Serializable;
import org.springframework.data.annotation.Id;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "Cart")
public class CartEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "cliente_id")
    private String cliente_id;

    @Column(name = "produto_id")
    private String produto_id;

    @Column(name = "quantidade")
    private String quantidade;
    
    @Column(name = "preço_unitario")
    private String preço_unitario;

    @Column(name = "total")
    private String total;

    @Column(name = "criado_em")
    private String criado_em;

    @Column(name = "atualizado_em")
    private String atualizado_em;



    public CartEntity() {
    }
    public CartEntity(long id, String cliente_id, String produto_id, String quantidade, String preço_unitario, String total,String criado_em, String atualizado_em) {
        this.id= id;
        this.cliente_id = cliente_id;
        this.produto_id = produto_id;
        this.quantidade = quantidade;
        this.preço_unitario= preço_unitario;
        this.total = total;
        this.criado_em = criado_em;
        this.atualizado_em = atualizado_em;
        
}
}