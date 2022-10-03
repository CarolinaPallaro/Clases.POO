package com.DH.almacen.model;

import com.DH.almacen.exception.ProductoFactoryException;
import com.DH.almacen.factory.ProductoFactory;

import java.util.ArrayList;
import java.util.List;

public class Almacen {

    private List<Producto> productos;

    public Almacen() {
        productos = new ArrayList<Producto>();
    }

    public void agregarProductos(String codigo){

        try {
            productos.add(ProductoFactory.getInstance().crearProducto(codigo));
        }
        catch(ProductoFactoryException e){
            e.printStackTrace();
        }
    }

    public Double calcularEspacioNecesario(){
        Double espacioNecesario = 0.0;
        for(Producto p : productos)
            espacioNecesario += p.calcularEspacio();
        return espacioNecesario;
    }

    public Double calcularEspacioCajas(){
        Double espacioNecesario = 0.0;
        for (Producto p : productos) {
            if(p instanceof Caja)
                espacioNecesario += p.calcularEspacio();
        }
        return espacioNecesario;
    }
}
