package com.model;

import java.util.ArrayList;

public class Cliente {

    private String nombre;
    private Integer telefono;
    private String domicilio;
    private ArrayList<Pedido> pedidos;

    public Cliente(String nombre, Integer telefono, String domicilio, ArrayList<Pedido> pedidos) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.domicilio = domicilio;
        pedidos = new ArrayList<Pedido>(pedidos);

    }

    public void realizarPedido(Pedido pedido){

        pedidos.add(pedido);
    }
}
