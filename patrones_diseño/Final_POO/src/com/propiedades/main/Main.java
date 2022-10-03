package com.propiedades.main;

import com.propiedades.main.models.Municipalidad;
import com.propiedades.main.models.Propiedad;
import com.propiedades.main.propiedadFactory.PropiedadFactory;

public class Main {
    public static void main(String[] args) {

        Municipalidad muni = new Municipalidad();

        muni.agregarPropiedades(PropiedadFactory.CASA1);
        muni.agregarPropiedades(PropiedadFactory.CASA2);
        muni.agregarPropiedades(PropiedadFactory.BARRIO);
        muni.agregarPropiedades("Barrio publico");
        muni.mostrarPropiedades();

    }
}
