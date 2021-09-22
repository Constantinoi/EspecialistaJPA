package com.algaworks.ecommerce.util;

import com.algaworks.ecommerce.model.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class IniciarUnidadeDePersistencia {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Ecommerce-PU");
        EntityManager em = emf.createEntityManager();

        ///Faça seus Testes aqui

        Produto produto = em.find(Produto.class, 1);

        System.out.println(produto.getNome());


        em.close();
        emf.close();
    }
}
