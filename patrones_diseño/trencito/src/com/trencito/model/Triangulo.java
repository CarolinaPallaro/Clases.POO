package com.trencito.model;

public class Triangulo implements VagonCompuesto{

    private Double altura;
    private Double base;

    public Triangulo(Double altura, Double base) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public Double calcularSuperficieTotal() {
        return base*altura/2;
    }
}
