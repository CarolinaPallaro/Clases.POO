package com.DH.empresa.model;

import com.DH.empresa.exception.TipoServicioFactoryException;

public class TipoServicioFactory {

    private static TipoServicioFactory instance;

    public static final String CODIGO_VENTA_AIRE_ACONDICIONADO = "Servicio-Venta";
    public static final String CODIGO_COLOCACION_AIRE_ACONDICIONADO = "Servicio-Colocacion";
    public static final String CODIGO_FULL_AIRE_ACONDICIONADO = "Servicio-full";


    private TipoServicioFactory(){

    }

    public static TipoServicioFactory getInstance(){
        if(instance == null)
            instance = new TipoServicioFactory();
        return instance;
    }

    public TipoServicios generarServicios(String codigo) throws TipoServicioFactoryException {
        switch (codigo){
            case CODIGO_VENTA_AIRE_ACONDICIONADO:
                return new ServicioSimple("Venta de aire acondicionado", "Es un servicio simple", 65000.0, Boolean.FALSE);

            case CODIGO_COLOCACION_AIRE_ACONDICIONADO:
                return new ServicioSimple("Colocacion de aire acondicionado", "colocacion", 10000.0, Boolean.TRUE);

            case CODIGO_FULL_AIRE_ACONDICIONADO:
                ServicioCombinado servicioFull = new ServicioCombinado("Full aire aconodicionado", "Servicio Full", 10);
                servicioFull.agregarServicio(generarServicios(CODIGO_VENTA_AIRE_ACONDICIONADO));
                servicioFull.agregarServicio(generarServicios(CODIGO_COLOCACION_AIRE_ACONDICIONADO));
                return servicioFull;

            default:
                throw new TipoServicioFactoryException(codigo + " no es un codigo de servicio valido");
        }

    }








}
