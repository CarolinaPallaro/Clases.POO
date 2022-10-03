package Almacen2.models;

import java.util.List;

public abstract class Producto {

    private Double precio;
    private String nombre;

    public Producto(Double precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }


}
