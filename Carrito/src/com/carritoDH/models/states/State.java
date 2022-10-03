package com.carritoDH.models.states;

public interface State {

    State agregarProducto(Producto p);

   State cancelarCarrito();

    State volverAnterior();

    State pasarEstado();


}
