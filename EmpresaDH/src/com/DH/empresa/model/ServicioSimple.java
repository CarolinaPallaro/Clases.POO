package com.DH.empresa.model;

public class ServicioSimple extends TipoServicios{

    private Double precioBase;
    private Boolean incluyeColocacion;

    public ServicioSimple(String nombre, String descripcion, Double precioBase, Boolean incluyeColocacion) {
        super(nombre, descripcion);
        this.precioBase = precioBase;
        this.incluyeColocacion = incluyeColocacion;
    }


    @Override
    public Double calcularPrecio() {

        if (incluyeColocacion) {
            return precioBase * 1.1;
        }

        return precioBase;

    }
}
