package com.PelotasDH.factory.model;

import com.PelotasDH.factory.model.ProductoFacktory;
import com.PelotasDH.factory.model.Almacen;

public class Main {
    public static void main(String[] args) {

        Almacen almacen = new Almacen();

        //ALMACEN CREA LOS PRODUCTOS
        almacen.agregarProductos(ProductoFacktory.CAJA10X10);
        almacen.agregarProductos(ProductoFacktory.CAJA10X10);
        almacen.agregarProductos(ProductoFacktory.PELOTAFUTBOL);
        almacen.agregarProductos(ProductoFacktory.PELOTATENIS);
        almacen.agregarProductos("CUALQUIER_COSA");

        System.out.println("espacio necesario= "+ almacen.calcularEspacioNecesario());
    }


}
