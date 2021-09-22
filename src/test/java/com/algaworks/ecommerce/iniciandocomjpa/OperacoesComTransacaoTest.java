package com.algaworks.ecommerce.iniciandocomjpa;

import com.algaworks.ecommerce.EntityManagerTest;
import com.algaworks.ecommerce.model.Produto;
import org.junit.Test;



public class OperacoesComTransacaoTest extends EntityManagerTest {

    @Test
    public void abrirEFecharATransacao(){

        Produto produto = new Produto();

        entityManager.getTransaction().begin();

//        entityManager.persist();
//        entityManager.merge();
//        entityManager.remove();


        entityManager.getTransaction().commit();

    }
}
