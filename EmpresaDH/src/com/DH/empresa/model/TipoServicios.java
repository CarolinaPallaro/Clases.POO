package com.DH.empresa.model;

public abstract class TipoServicios {
    private String nombre;
    private String descripcion;

    public TipoServicios(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract Double calcularPrecio();

    public String getNombre() {
        return nombre;
    }
}
