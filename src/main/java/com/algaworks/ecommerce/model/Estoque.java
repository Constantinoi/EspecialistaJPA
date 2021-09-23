package com.algaworks.ecommerce.model;

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
public class Estoque implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private Integer id;

    private Integer produtoId;

    private Integer quantidade;

}
