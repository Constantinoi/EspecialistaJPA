package com.algaworks.ecommerce.relacionamentoteste;

import com.algaworks.ecommerce.EntityManagerTest;
import com.algaworks.ecommerce.enums.StatusPedido;
import com.algaworks.ecommerce.model.Cliente;
import com.algaworks.ecommerce.model.ItemPedido;
import com.algaworks.ecommerce.model.Pedido;
import com.algaworks.ecommerce.model.Produto;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class RelacionamentoManyToOneTest extends EntityManagerTest {

//    @Test
//    public void verificarRelacionamento(){
//        Cliente cliente = entityManager.find(Cliente.class,1);
//        Produto produto = entityManager.find(Produto.class,1);
//
//        Pedido pedido = new Pedido();
//        pedido.setStatus(StatusPedido.AGUARDANDO);
//        pedido.setDataCriacao(LocalDateTime.now());
//        pedido.setTotal(BigDecimal.TEN);
//        pedido.setCliente(cliente);
//
//        ItemPedido itemPedido = new ItemPedido();
//        itemPedido.setPrecoProduto(produto.getPreco());
//        itemPedido.setQuantidade(1);
//        itemPedido.setPedido(pedido);
//        itemPedido.setProduto(produto);
//
//
//        entityManager.getTransaction().begin();
//
//        entityManager.persist(pedido);
//        entityManager.persist(itemPedido);
//
//        entityManager.getTransaction().commit();
//
//        entityManager.clear();
//
//        ItemPedido itemPedidoVerificacao = entityManager.find(ItemPedido.class,itemPedido.getId());
//        Assert.assertNotNull(itemPedidoVerificacao.getPedido());
//        Assert.assertNotNull(itemPedidoVerificacao.getProduto());
//
//
//    }
}
