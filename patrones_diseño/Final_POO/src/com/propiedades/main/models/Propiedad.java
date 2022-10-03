package com.propiedades.main.models;

public abstract class Propiedad {

    private String calle;
    private Integer numeroCasa;

    public Propiedad(String calle, Integer numeroCasa) {
        this.calle = calle;
        this.numeroCasa = numeroCasa;
    }


    public abstract Double calcularImpuesto();

    public String getCalle() {
        return calle;
    }

    public Integer getNumeroCasa() {
        return numeroCasa;
    }
}
