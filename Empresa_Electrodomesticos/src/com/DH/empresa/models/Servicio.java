package com.DH.empresa.models;

public abstract class Servicio {
    private String nombre;
    private String descripcion;

    public Servicio(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract Double calcularPrecio();
}
