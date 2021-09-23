package com.algaworks.ecommerce.model;

import com.algaworks.ecommerce.enums.SexoCliente;
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
public class Categoria implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private Integer id;

    private String nome;

    private Integer categoriaPaiId;

}
