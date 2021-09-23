package com.algaworks.ecommerce.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class ItemPedido implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private Integer id;

    private Integer pedidoId;

    private Integer ProdutoId;

    private BigDecimal precoProduto;

    private Integer quantidade;

}
