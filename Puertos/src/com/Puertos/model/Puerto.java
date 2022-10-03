package com.Puertos.model;

import java.util.ArrayList;
import java.util.List;

public class Puerto {
    private List <Contenedor> contenedor;

    public Puerto(List<Contenedor> contenedor) {

        this.contenedor = new ArrayList<Contenedor>();
    }

    public void agregarContenedores(Contenedor cont){

        this.contenedor.add(cont);

    }

    public ArrayList<Contenedor> contenedoresOrdenadosEnPuerto(){


        ArrayList<Contenedor> ordenadosPorId = new ArrayList<Contenedor>();

        for(Contenedor c: contenedor) {
            ordenadosPorId.add(c);

        }
       ordenadosPorId.sort(Contenedor::compareTo);

        return ordenadosPorId;
    }



}
