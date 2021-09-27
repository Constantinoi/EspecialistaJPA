package com.algaworks.ecommerce.relacionamentoteste;

import com.algaworks.ecommerce.EntityManagerTest;
import com.algaworks.ecommerce.model.Categoria;
import com.algaworks.ecommerce.model.Pedido;
import org.junit.Assert;
import org.junit.Test;

public class RemovendoEntidadesReferenciadasTest extends EntityManagerTest {

    @Test
    public void removerPedido() {

        Pedido pedido = entityManager.find(Pedido.class, 1);
        Assert.assertFalse(pedido.getItensPedido().isEmpty());


        entityManager.getTransaction().begin();

        pedido.getItensPedido().forEach(i -> entityManager.remove(i));
        entityManager.remove(pedido);

        entityManager.getTransaction().commit();

        entityManager.clear();

        Pedido pedidoVerificacao = entityManager.find(Pedido.class, pedido.getId());
        Assert.assertNull(pedidoVerificacao);
    }
}
