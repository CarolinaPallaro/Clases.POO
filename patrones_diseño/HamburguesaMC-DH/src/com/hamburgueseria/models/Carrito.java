package com.hamburgueseria.models;

import java.util.ArrayList;
import java.util.List;

public class Carrito implements Comprable{

    private List<Comprable> itemsCarrito;

    public Carrito(){
        itemsCarrito = new ArrayList<Comprable>();
    }

    public  void  agregarItem(Comprable comprable){
        itemsCarrito.add(comprable);
    }


    public  Double calcularPrecioCarrito(){
        Double precioTotal = 0.0;
        for (Comprable c: itemsCarrito){

            precioTotal += c.calcularPrecio();
        }

        return  precioTotal;
    }

    @Override
    public Double calcularPrecio() {
        return null;
    }


}
