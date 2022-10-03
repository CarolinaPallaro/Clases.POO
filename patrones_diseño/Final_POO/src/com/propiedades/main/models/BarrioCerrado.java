package com.propiedades.main.models;

import java.util.ArrayList;
import java.util.List;

public class BarrioCerrado extends Propiedad{
    private Double descuento;

    private Double factorMultiplicador;

    private List<Propiedad> propiedades;

    public BarrioCerrado(String calle, Integer numeroCasa, Double descuento, Double factorMultiplicador) {
        super(calle, numeroCasa);
        this.descuento = descuento;
        this.factorMultiplicador = factorMultiplicador;
        this.propiedades = new ArrayList<>();
    }

    public void  agregarPropiedades(Propiedad propiedad){
        propiedades.add(propiedad);
    }

    @Override
    public Double calcularImpuesto() {
      ;Double sumarPrecio = 0.0;

        for (Propiedad prop: propiedades) {

            sumarPrecio += prop.calcularImpuesto() * factorMultiplicador;
        }
        return sumarPrecio;
    }
}
