package com.DH.empresa.models;

import com.DH.empresa.exception.ServicioFactoryException;

public class ServicioFactory {

    public static final String VENTA_AIRE_ACONDICIONADO = "venta de aire";
    public static final String COLOCACION_AIRE_ACONDICIONADO = "colocacion de aire";
    public static final String FULL_AIRE_ACONDICIONADO = "combo de aire";
    private static ServicioFactory instance;
    private ServicioFactory(){}

    public static ServicioFactory getInstance(){
        if(instance == null)
            instance = new ServicioFactory();
        return instance;
    }

    public Servicio crearServicio(String codigo) throws ServicioFactoryException {
        switch (codigo){
            case VENTA_AIRE_ACONDICIONADO:
                return new ServicioSimple("venta","venta de aire", 65000.0,false);
            case COLOCACION_AIRE_ACONDICIONADO:
                return new ServicioSimple("colocacion", "te lo coloco", 10000.0,true);
            case FULL_AIRE_ACONDICIONADO:
                ServicioCombo combito = new ServicioCombo("comboloco", "te lo coloco loco", 10);
                combito.agregarServicios(crearServicio(VENTA_AIRE_ACONDICIONADO));
                combito.agregarServicios(crearServicio(COLOCACION_AIRE_ACONDICIONADO));
                return combito;
            default:
                throw new ServicioFactoryException(codigo + " esa no te la coloco");
        }
    }
}
