package com.Vehiculos.clases;

public abstract class Vehiculo {
    Duenio duenio;
    private Integer fechaAdquisicion;
    private Double cotizacion;
    private String marca;
    private String patente;

    public Vehiculo(Duenio duenio, Integer fechaAdquisicion, Double cotizacion, String marca, String patente) {
        this.duenio = duenio;
        this.fechaAdquisicion = fechaAdquisicion;
        this.cotizacion = cotizacion;
        this.marca = marca;
        this.patente = patente;
    }

    public boolean esNacional(){
        return true;
    }
}
