package com.DH.empresa;

import com.DH.empresa.model.ElectrodomesticosyTecnologia;
import com.DH.empresa.model.TipoServicioFactory;

public class Main {

    public static void main(String[] args) {

       ElectrodomesticosyTecnologia DH = new ElectrodomesticosyTecnologia ();

        DH.agregarServicios(TipoServicioFactory.CODIGO_VENTA_AIRE_ACONDICIONADO);
        DH.agregarServicios(TipoServicioFactory.CODIGO_COLOCACION_AIRE_ACONDICIONADO);
        DH.agregarServicios(TipoServicioFactory.CODIGO_FULL_AIRE_ACONDICIONADO);

        DH.agregarServicios("Venta de telefonos");
        DH.generarInforme();

    }



    }

