package com.DH.empresa.model;

import java.util.ArrayList;
import java.util.List;

public class ServicioCombinado extends TipoServicios{

    private List<TipoServicios> servicios;
    private double descuento;

    public ServicioCombinado(String nombre, String descripcion, Integer descuento1) {
        super(nombre, descripcion);
        this.servicios = new ArrayList<TipoServicios>();
        this.descuento = descuento1; // / 100;
    }

    public void agregarServicio(TipoServicios servicio){
        servicios.add(servicio);
    }





    @Override
    public Double calcularPrecio() {
        Double sumaPrecios = 0.0;
        for(TipoServicios ts : servicios) {
            sumaPrecios += ts.calcularPrecio();
        }
        //return sumaPrecios * (1 - descuento);

        return sumaPrecios * (1 - (descuento / 100));




    }
}
