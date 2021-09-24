package com.algaworks.ecommerce.model;

import com.algaworks.ecommerce.enums.StatusPagamento;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "nota_fiscal")
public class NotaFiscal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;

    @Column(name = "pedido_id")
    private Integer pedidoId;

    private String xml;

    @Column(name = "data_emissao")
    private Date dataEmissao;

}
