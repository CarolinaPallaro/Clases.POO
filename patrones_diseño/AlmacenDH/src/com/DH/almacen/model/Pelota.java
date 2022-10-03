package com.DH.almacen.model;

public class Pelota extends Producto{

    private Double radio;

    public Pelota(Double peso, Double radio) {
        super(peso);
        this.radio = radio;
    }

    @Override
    public Double calcularEspacio() {

        return Math.PI * Math.pow(radio, 3.0) * 4/3;
    }
}
