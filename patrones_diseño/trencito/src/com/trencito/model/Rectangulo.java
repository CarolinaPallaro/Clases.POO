package com.trencito.model;

public class Rectangulo implements VagonCompuesto{

    private Double altura;
    private Double base;

    public Rectangulo(Double altura, Double base) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public Double calcularSuperficieTotal() {
        return base*altura;
    }
}
