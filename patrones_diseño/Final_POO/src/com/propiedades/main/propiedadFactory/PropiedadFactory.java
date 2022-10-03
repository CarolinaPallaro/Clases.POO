package com.propiedades.main.propiedadFactory;

import com.propiedades.main.models.BarrioCerrado;
import com.propiedades.main.models.Casa;
import com.propiedades.main.models.Propiedad;
import com.propiedades.main.propiedadFactoryException.PropiedadException;

public class PropiedadFactory {

    public static final String CASA1 = "Casa soltero";
    public static final String CASA2 = "Casa familiar";
    public static final String BARRIO = "Barrio Cerrado";
    private  PropiedadFactory(){};

    private static PropiedadFactory instance;

    public static PropiedadFactory getInstance(){
        if (instance == null)
            instance = new PropiedadFactory();
        return instance;
    }

    public Propiedad crearPropiedades(String codigo) throws PropiedadException{
        switch (codigo){
            case CASA1:
                return new Casa("Av. San Martin", 2,500.0);
            case CASA2:
                return  new Casa("Mitre", 233, 700.0);
            case BARRIO:
                BarrioCerrado barrioCheto = new BarrioCerrado("Gutierres", 330, 2500.0,2.0);
                barrioCheto.agregarPropiedades(crearPropiedades(CASA1));
                barrioCheto.agregarPropiedades(crearPropiedades(CASA2));
                return barrioCheto;
            default: throw new PropiedadException(codigo + " no esta disponible");
        }
    }



}
