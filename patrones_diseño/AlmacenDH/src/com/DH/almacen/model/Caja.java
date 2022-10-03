package com.DH.almacen.model;

public class Caja extends Producto{

    private Double longitud;
    private Double ancho;
    private Double alto;

    public Caja(Double peso, Double longitud, Double ancho, Double alto) {
        super(peso);
        this.longitud = longitud;
        this.ancho = ancho;
        this.alto = alto;
    }


    @Override
    public Double calcularEspacio() {
        return longitud*ancho*alto;
    }
}
