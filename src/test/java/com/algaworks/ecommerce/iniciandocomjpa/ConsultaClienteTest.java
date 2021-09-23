package com.algaworks.ecommerce.iniciandocomjpa;

import com.algaworks.ecommerce.EntityManagerTest;
import com.algaworks.ecommerce.model.Cliente;
import org.junit.Test;

public class ConsultaClienteTest extends EntityManagerTest {

    @Test
    public void inserirCliente(){

        Cliente cliente = new Cliente();

        cliente.setId(3);
        cliente.setNome("Ivanilde");

        entityManager.getTransaction().begin();

        entityManager.persist(cliente);

        entityManager.getTransaction().commit();

        entityManager.clear();

        entityManager.find(Cliente.class, cliente.getId());

        System.out.println(cliente.getNome());
    }

    @Test
    public void editarCliente(){

        Cliente cliente = entityManager.find(Cliente.class,2);

        entityManager.getTransaction().begin();

        cliente.setNome("Jessica Nascimento");

        entityManager.merge(cliente);

        entityManager.getTransaction().commit();

        entityManager.clear();


        entityManager.find(Cliente.class, cliente.getId());

        System.out.println(cliente.getNome());
    }

    @Test
    public void deletarCliente(){
       Cliente cliente = entityManager.find(Cliente.class,1);

        entityManager.getTransaction().begin();

        entityManager.remove(cliente);

        entityManager.getTransaction().commit();
    }

    @Test
    public void searchCliente(){

        Cliente cliente = entityManager.find(Cliente.class,1);

        System.out.println(cliente.getNome());
    }
}
