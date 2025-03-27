package com.dolcepie.api.models.pay;

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
@Table(name = "pay")
public class PayEntity implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pagamento")
    private long id_pagamento;

    @Column(name = "id_produto")
    private String id_produto;

    @Column(name = "id_cliente")
    private String id_cliente;

    @Column(name = "valor_total")
    private String valor_total;
    
    @Column(name = "metodo_pagamento")
    private String metodo_pagamento;

    @Column(name = "status_pagamento")
    private String status_pagamento;

    @Column(name = "codigo_transaçao")
    private String codigo_transaçao;

    public PayEntity() {
    }
    public PayEntity(long id_pagamento, String id_produto, String id_cliente, String valor_total, String metodo_pagamento, String status_pagamento,String codigo_transaçao) {
        this.id_pagamento= id_pagamento;
        this.id_produto = id_produto;
        this.id_cliente = id_cliente;
        this.valor_total = valor_total;
        this.metodo_pagamento = metodo_pagamento;
        this.status_pagamento = status_pagamento;
        this.codigo_transaçao = codigo_transaçao;
        
    
    }
}
    