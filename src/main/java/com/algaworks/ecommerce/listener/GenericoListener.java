package com.algaworks.ecommerce.listener;

public class GenericoListener {

    public void logar(Object obj) {
        System.out.println("Entidade " + obj.getClass().getSimpleName() + " foi carregada.");
    }
}
