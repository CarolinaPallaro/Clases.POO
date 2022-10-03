package com.DH.empresa.models;

import com.DH.empresa.exception.ServicioFactoryException;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String razonSocial;
    private List<Servicio> servicios;

    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;
        this.servicios = new ArrayList<>();
    }

    public void agregarServicio(String codigo){
        try {
            servicios.add(ServicioFactory.getInstance().crearServicio(codigo));
        } catch (ServicioFactoryException e) {
            e.printStackTrace();
        }
    }

    public void mostrarServicios(){
        for (Servicio s: servicios) {
            System.out.println(s.getNombre() + " $" + s.calcularPrecio());
        }
    }
}
