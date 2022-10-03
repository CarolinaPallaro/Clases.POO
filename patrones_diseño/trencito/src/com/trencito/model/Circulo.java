package com.trencito.model;

public class Circulo implements VagonCompuesto{

    private Double radio;

    public Circulo(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double calcularSuperficieTotal() {
        return radio*Math.PI*radio;
    }
}
