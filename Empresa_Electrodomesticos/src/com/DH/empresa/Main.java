package com.DH.empresa;

import com.DH.empresa.models.Empresa;
import com.DH.empresa.models.ServicioFactory;

public class Main {
    public static void main(String[] args) {

        Empresa microsoftAire = new Empresa("Micro Aires");

        microsoftAire.agregarServicio(ServicioFactory.COLOCACION_AIRE_ACONDICIONADO);
        microsoftAire.agregarServicio(ServicioFactory.VENTA_AIRE_ACONDICIONADO);
        microsoftAire.agregarServicio(ServicioFactory.FULL_AIRE_ACONDICIONADO);
        microsoftAire.agregarServicio("Reparacion");

        microsoftAire.mostrarServicios();
    }
}
