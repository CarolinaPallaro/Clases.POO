package com.DH.almacen;

import com.DH.almacen.factory.ProductoFactory;
import com.DH.almacen.model.Almacen;

public class Main {
    public static void main(String[] args) {

        Almacen almacen = new Almacen();

        almacen.agregarProductos(ProductoFactory.CAJA10X10);
        almacen.agregarProductos(ProductoFactory.CAJA10X10);
        almacen.agregarProductos(ProductoFactory.PELOTAFUTBOL);
        almacen.agregarProductos(ProductoFactory.PELOTAFUTBOL);
        almacen.agregarProductos(ProductoFactory.PELOTATENNIS);
        almacen.agregarProductos("cualquiercosa");
        almacen.agregarProductos(ProductoFactory.CAJA5X5);
        System.out.println("espacio necesario= " + almacen.calcularEspacioNecesario() + "cm3");
        System.out.println("espacio necesario para cajas= " + almacen.calcularEspacioCajas() + "cm3");

    }
}
