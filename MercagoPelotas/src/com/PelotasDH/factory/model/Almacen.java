package com.PelotasDH.factory.model;

import java.util.ArrayList;
import java.util.List;

public class Almacen {

    private List<Producto> productos;


    public Almacen(){
        productos = new ArrayList<Producto>();

    }

    public  void agregarProductos(String codigo)  {
        //a lista le quiero agregar un objeto de tipo producto
        //Por eso uso factory con productos determinados
        //Al crear motodos en Static puedo acceder a ellos

        try {
            productos.add(ProductoFacktory.getInstance().crearProducto(codigo));
        }
        catch (ProductoFactoryException e){
            e.printStackTrace();
        }

    }


    public  Double calcularEspacioNecesario(){
        Double espacioNecesario = 0.0;

        for (Producto p: productos)

            espacioNecesario += p.calcularEspacio();

        return espacioNecesario;
    }


    public Double calcularEspacioCajas() {

        Double espacioNecesario = null;
        for (Producto p : productos) {
            espacioNecesario = 0.0;
            if (p instanceof Caja)
                espacioNecesario += p.calcularEspacio();
        }
        return espacioNecesario;
    }
}
