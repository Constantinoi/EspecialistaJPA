package com.algaworks.ecommerce.model;

import com.algaworks.ecommerce.enums.StatusPagamento;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "pagamento_boleto")
public class PagamentoBoleto implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private Integer id;

    @Column(name = "pedido_id")
    private Integer pedidoId;

    @Column(name = "preco_produto")
    private StatusPagamento precoProduto;

    @Column(name = "codigo_barras")
    private String codigoBarras;

}
