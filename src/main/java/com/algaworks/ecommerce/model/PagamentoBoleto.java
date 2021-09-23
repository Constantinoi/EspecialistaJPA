package com.algaworks.ecommerce.model;

import com.algaworks.ecommerce.enums.StatusPagamento;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class PagamentoBoleto implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private Integer id;

    private Integer pedidoId;

    private StatusPagamento precoProduto;

    private String codigoBarras;

}
