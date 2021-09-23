package com.algaworks.ecommerce.iniciandocomjpa;

import com.algaworks.ecommerce.EntityManagerTest;
import com.algaworks.ecommerce.model.Produto;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;


public class OperacoesComTransacaoTest extends EntityManagerTest {

    @Test
    public void diferencaEntrePersistenceMerge(){
        Produto produtoPersistence = new Produto();

        produtoPersistence.setId(5);
        produtoPersistence.setNome("Iphone 18");
        produtoPersistence.setDescricao("trava quando lançar o 19");
        produtoPersistence.setPreco(new BigDecimal(15000));

        entityManager.getTransaction().begin();

        entityManager.persist(produtoPersistence);

        entityManager.getTransaction().commit();

        Produto produtoMerge = new Produto();

        produtoMerge.setId(6);
        produtoMerge.setNome("Iphone 19");
        produtoMerge.setDescricao("trava quando lançar o 20");
        produtoMerge.setPreco(new BigDecimal(17000));

        entityManager.getTransaction().begin();

        entityManager.merge(produtoMerge);

        entityManager.getTransaction().commit();

    }



    @Test
    public void inserirObjetoComMerge(){
        Produto produto = new Produto();

        produto.setId(4);
        produto.setNome("Câmera Canon 2030");
        produto.setDescricao("A melhor definicao para suas fotos.2x mais rapido");
        produto.setPreco(new BigDecimal(1000));

        entityManager.getTransaction().begin();

        entityManager.merge(produto);

        entityManager.getTransaction().commit();

        Produto produtoVerificacao = entityManager.find(Produto.class,produto.getId());
        Assert.assertNotNull(produtoVerificacao);
    }

    @Test
    public void atualizarOBjetoGerenciado(){
        Produto produto = entityManager.find(Produto.class,1);

        entityManager.getTransaction().begin();

        produto.setNome("Kindle Paper 2");

        entityManager.getTransaction().commit();

        entityManager.clear();

        Produto produtoVerificacao = entityManager.find(Produto.class,produto.getId());
        Assert.assertNotNull(produtoVerificacao);

    }



    @Test
    public void atualizarOBjeto(){
        Produto produto = new Produto();

        produto.setId(1);
        produto.setNome("Kindle Paper");
        produto.setDescricao("Novo Kindle.");
        produto.setPreco(new BigDecimal(599));


        entityManager.getTransaction().begin();

        entityManager.merge(produto);

        entityManager.getTransaction().commit();

        entityManager.clear();

        Produto produtoVerificacao = entityManager.find(Produto.class,produto.getId());
        Assert.assertNotNull(produtoVerificacao);

    }

    @Test
    public void removerOBjeto(){
        Produto produto = entityManager.find(Produto.class,3);


        entityManager.getTransaction().begin();

        entityManager.remove(produto);

        entityManager.getTransaction().commit();

        Produto produtoVerificacao = entityManager.find(Produto.class,3);
        Assert.assertNull(produtoVerificacao);
    }

    @Test
    public void inserirOPrimeiroObjeto(){
        Produto produto = new Produto();

        produto.setId(2);
        produto.setNome("Câmera Canon");
        produto.setDescricao("A melhor definicao para suas fotos.");
        produto.setPreco(new BigDecimal(5000));

        entityManager.getTransaction().begin();

        entityManager.persist(produto);

        entityManager.getTransaction().commit();
    }


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
