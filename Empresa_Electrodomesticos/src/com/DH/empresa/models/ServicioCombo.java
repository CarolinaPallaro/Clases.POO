package com.DH.empresa.models;

import java.util.ArrayList;
import java.util.List;

public class ServicioCombo extends Servicio {
    private Integer descuento;
    private List<Servicio> servicios;

    public ServicioCombo(String nombre, String descripcion, Integer descuento) {
        super(nombre, descripcion);
        this.descuento = descuento;
        this.servicios = new ArrayList<>();
    }

    public void agregarServicios(Servicio servicio){
        servicios.add(servicio);
    }


    @Override
    public Double calcularPrecio() {
        Double precioTotal = 0.0;
        for (Servicio s: servicios) {
            precioTotal += s.calcularPrecio();
        }
        return precioTotal - (precioTotal * descuento/100);
    }
}
