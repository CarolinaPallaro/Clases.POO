package com.propiedades.main.models;

public class Casa extends Propiedad{

    private Double precioBase;

    public Casa(String calle, Integer numeroCasa, Double precioBase) {
        super(calle, numeroCasa);
        this.precioBase = precioBase;
    }

    @Override
    public Double calcularImpuesto() {
        if (this.getCalle().equals("Av. San Martin")){
            return precioBase * 1.1;

        } return precioBase;
    }
}
