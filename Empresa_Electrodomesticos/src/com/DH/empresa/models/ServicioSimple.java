package com.DH.empresa.models;

public class ServicioSimple extends Servicio{
    private Double precioBase;
    private Boolean tieneColocacion;

    public ServicioSimple(String nombre, String descripcion, Double precioBase, Boolean tieneColocacion) {
        super(nombre, descripcion);
        this.precioBase = precioBase;
        this.tieneColocacion = tieneColocacion;
    }

    @Override
    public Double calcularPrecio() {
        if(tieneColocacion){
            return precioBase * 1.1;
        }
        return precioBase;
    }
}
