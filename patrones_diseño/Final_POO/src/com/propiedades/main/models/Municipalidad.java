package com.propiedades.main.models;

import com.propiedades.main.propiedadFactory.PropiedadFactory;
import com.propiedades.main.propiedadFactoryException.PropiedadException;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.PatternSyntaxException;

public class Municipalidad {

    private List<Propiedad> propiedades;

    public Municipalidad() {
        this.propiedades = new ArrayList<>();
    }

    public void agregarPropiedades(String codigo){
        try {
            propiedades.add(PropiedadFactory.getInstance().crearPropiedades(codigo));
        } catch (PropiedadException e){
            e.printStackTrace();
        }
    }

    public void mostrarPropiedades(){
        for (Propiedad prop: propiedades) {
            System.out.println("Esta propiedad en " + prop.getCalle() + " con numero:  " + prop.getNumeroCasa() + " tiene un impuesto de $  " + prop.calcularImpuesto());
        }
    }

}
