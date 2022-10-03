package com.carritoDH.models.states;

import java.util.List;

public class Carrito {


//    Cancelar el carrito (vuelve a estar vacío).
//            ● Volver al punto anterior ( salvo que esté cerrado).
//            ● Pasar al siguiente estado (en el caso de estar cerrado, vuelve a estar vacío).
    private  State estadoCarrito;

//    private List<Producto> productos;


    public Carrito(State estadoCarrito){
        this.estadoCarrito = estadoCarrito;
    }

    public void carritoVacio(){
    return carritoVacio();
    }


}
