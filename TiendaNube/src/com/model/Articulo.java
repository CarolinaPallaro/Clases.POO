package com.model;

public class Articulo {
    private String nombre;
    private Double precio;
    private Integer stock;

    public Articulo(String nombre, Double precio, Integer stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
}
