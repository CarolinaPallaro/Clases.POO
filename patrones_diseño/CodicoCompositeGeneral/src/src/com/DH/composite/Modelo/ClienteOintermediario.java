package com.DH.composite.Modelo;

import java.util.ArrayList;
import java.util.List;

public class ClienteOintermediario {

    private List<ComponenteComun> listadoDeLosComponentes;

    public ClienteOintermediario(){
        listadoDeLosComponentes = new ArrayList<ComponenteComun>();
    }

    public void agregarComponentes(ComponenteComun cc){
        // Los componentes que vaya a crear más adelante, los puedo agregar con este método al
        // carrito/intermediario/cliente
        listadoDeLosComponentes.add(cc);

    }

    public Double calculoPrecioTotalDeComponentesAgregados(){
        Double acumuladorDelTotal = 0.0;

        for (ComponenteComun cc: listadoDeLosComponentes) {
            acumuladorDelTotal += cc.calcularPrecio();
        }

        return acumuladorDelTotal;
    }

}
