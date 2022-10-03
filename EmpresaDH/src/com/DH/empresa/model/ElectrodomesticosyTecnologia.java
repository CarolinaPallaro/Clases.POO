package com.DH.empresa.model;

import com.DH.empresa.exception.TipoServicioFactoryException;

import java.util.ArrayList;
import java.util.List;

public class ElectrodomesticosyTecnologia {

    private String razonSocial;

    private List<TipoServicios> servicios;

    public ElectrodomesticosyTecnologia() {
        this.razonSocial = razonSocial;
        this.servicios = new ArrayList<TipoServicios>();
    }


    public void agregarServicios(String codigo){
        try {
            servicios.add(TipoServicioFactory.getInstance().generarServicios (codigo));
        } catch (TipoServicioFactoryException e) {
            e.printStackTrace();
        }
    }

    public void generarInforme(){
        for(TipoServicios ts : servicios) {
            System.out.println("nombre: " + ts.getNombre() + " precio: $" + ts.calcularPrecio());
        }
    }

}




